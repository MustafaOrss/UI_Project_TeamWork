package tests.US_021;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserDashboard;
import utilities.ConfigReader;
import utilities.UserTestBaseRapor;

public class US_021_TC_02 extends UserTestBaseRapor {

    UserDashboard userDashboard =new UserDashboard();

    @Test
    public void TC_02(){
        extentTest=extentReports.createTest(" Payment History testi","Kullanıcı View All Payments tablosuna ulasabılmelı" );
            userDashboard.cookiesButonu.click();
        // 1- Launch Browser
        // 2- Go to https://qa.tripandway.com/
        extentTest.info("Kullanici " + ConfigReader.getProperty("tripAndWayUrl") + " sayfaya gider");
        //Kullanıcı sayfasındaki login butonuna tıklanıp  anasayfaya ulaşılabilinmelidir
        userDashboard.cookiesButonu.click();
        userDashboard.ilkLoginButonu.click();
        extentTest.info(" ilk login butonuna click yapar");
        //3-Email kısmına ilgili data yazılır
        userDashboard.emailAddressButonu.sendKeys(ConfigReader.getProperty("userEmail"));
        extentTest.info("kullanıcı mail adresını gırdı");
        //4-Password kısmına ilgili data yazılır
        userDashboard.passwordButonu.sendKeys(ConfigReader.getProperty("userPassword"));
        extentTest.info("kullanıcı şifre girdi");
        //5-login butonuna tıklar
      userDashboard.loginButonu.click();
      extentTest.info("login butonuna tıklandı");
      //7-"Payment History" butonu gorunurlugu dogrulanır ,tıklanır
        Assert.assertTrue(userDashboard.paymentHistoryButonu.isDisplayed());
        extentTest.info("Payment History butonu gorundu");
        userDashboard.paymentHistoryButonu.click();
        extentTest.info("Payment History butonu tıklandı");
       //8-"Completed " butonunun gorunurlugu test edılır
        Assert.assertTrue(userDashboard.completedButonu.isDisplayed());
        extentTest.pass("Payment History goruntulendiği dogrulandı");






    }
}
