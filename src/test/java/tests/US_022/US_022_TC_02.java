package tests.US_022;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.UserDashboard;
import utilities.*;

import java.time.Duration;

public class US_022_TC_02 extends UserTestBaseRapor {
    @Test
    public void TC_02() throws InterruptedException {
       UserDashboard userDashboard =new UserDashboard();
     extentTest=extentReports.createTest("Uptade Password testi","Kullanıcı login iken şife degiştirebilmeli");
        //1-launch browser
        //2-Go to https://qa.tripandway.com/traveller/login
        extentTest.info("kullanıcı"+ ConfigReader.getProperty("tripAndWayUrl")+"anasayfaya gider");
        userDashboard.cookiesButonu.click();
        userDashboard.ilkLoginButonu.click();
        //3-Email kısmına ilgili data yazılır
         userDashboard.emailAddressButonu.sendKeys(ConfigReader.getProperty("userEmail"));
         extentTest.info("kullanıcı mail adresini girdi");
        //4-Password kısmına ilgili data yazılır
        userDashboard.passwordButonu.sendKeys(ConfigReader.getProperty("userPassword"));
        extentTest.info("kullanıcı sıfre gırdı");
        //5-Login butonuna tıklanır
        userDashboard.loginButonu.click();
        extentTest.info("login butonuna tıklanır");
        //6-"Uptade Password" butonunun gorunurlugu
        // dogrulanmalı
        Assert.assertTrue(userDashboard.updatePasswordButonu.isDisplayed());
        extentTest.info("Uptade Password butonu göründü");
        ReusableMethods.wait(3);
        //7-"Uptade Password " butonuna tıkla
        userDashboard.updatePasswordButonu.click();
        extentTest.info("Uptade Password butonu tıklandı");
        //8-new password 'un textbox 'ının gorunurlugunu dogrulanmalı
        Thread.sleep(2000);
         Assert.assertTrue(userDashboard.newPasswordKutusu.isDisplayed());
         extentTest.info("new password textbox kutusu göründü");
        //9-new password 'un textbox 'ına yenı sıfre gır
        userDashboard.newPasswordKutusu.sendKeys(ConfigReader.getProperty("newPassword"));
        extentTest.info("new password textbox kutusuna yenı dıfre yazıldı");
        ReusableMethods.wait(3);
        //10-"Uptade" butonunun gorunurlugunu dogrula
        Assert.assertTrue(userDashboard.updateButonu.isDisplayed());
        extentTest.info("Uptade butonu gorundu");
        ReusableMethods.wait(3);
        //11-"Uptade"butonuna tıkla
        userDashboard.updateButonu.click();
        extentTest.info("Uptade butonu tıklandı");
        ReusableMethods.wait(3);
        //12-Password is updated successfully yazısının
        //gorunurlugu dogrulanmalı//


        String expectedsıfre="\n" +
                "        toastr.success('Password is updated successfully');\n" +
                "    ";
        String actualsıfre= JSUtilities.getTextWithJS(Driver.getDriver(),userDashboard.odemeTamamlandıTexti);
        Assert.assertEquals(expectedsıfre,actualsıfre);
        extentTest.pass("Password is updated successfull! yazısı goruldu,sıfre basarıyla resetlendı tamamlandı");

        ReusableMethods.wait(3);









    }
}
