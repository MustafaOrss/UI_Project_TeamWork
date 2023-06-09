package tests.US_023;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserDashboard;
import pages.UserHomepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.UserTestBaseRapor;

public class US_023_TC_02 extends UserTestBaseRapor {
UserDashboard userDashboard=new UserDashboard();
        UserHomepage userHomepage=new UserHomepage();
    @Test
    public void TC_02(){
        //1-launch browser
        //2-Go to https://qa.tripandway.com/traveller/login
        extentTest=extentReports.createTest("Tripandway anasayfa testi","anasayfaya ulasabılmelı");
        //login butonuna tıkla
        userDashboard.cookiesButonu.click();
        userDashboard.ilkLoginButonu.click();
        //3-Email kısmına ilgili data yazılır
        userDashboard.emailAddressButonu.sendKeys(ConfigReader.getProperty("userEmail"));
        //4-Password kısmına ilgili data yazılır
        userDashboard.passwordButonu.sendKeys(ConfigReader.getProperty("userPassword"));
        //5-Login butonuna tıklanır
        userDashboard.loginButonu.click();
        extentTest.info("anasayfaya gırıs yapıldı");
        ReusableMethods.wait(2);
        //6-"logout" butonunun gorunurlugu dogrulanmalıdır
           Assert.assertTrue(userDashboard.logoutButonu.isDisplayed());
        ReusableMethods.wait(3);
        userDashboard.logoutButonu.click();
        //7-"Registration"butonunun  gorunurlugunu
        // test edılmelı//
        ReusableMethods.wait(3);
        Assert.assertTrue(userHomepage.registrationButonu.isDisplayed());
        extentTest.pass("Registration butonu goruldu basarı ıle çıkıs yapılmıstır");















    }
}
