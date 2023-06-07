package tests.US_025;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.UserDashboard;
import utilities.ConfigReader;
import utilities.UserTestBaseRapor;

public class US_025_TC_01 extends UserTestBaseRapor {

static UserDashboard userDashboard =new UserDashboard();

    @Test
    public static void testC01(){

        extentTest=extentReports.createTest("payment history testi","payment historiyden ödeme kontrol edilir");
        //"https://qa.tripandway.com/traveller/login adresine gidin
        extentTest = extentReports.createTest("Tripandway anasayfa testi",
                "Kullanici sayfaya ulasabilmeli");
        userDashboard.cookiesButonu.click();

       userDashboard.ilkLoginButonu.click();


        //email adres kutusuna "asd@tripandway.com"

        userDashboard.emailAddressButonu.sendKeys(ConfigReader.getProperty("userEmail1"));
       //password "asd123456" yazınız
        userDashboard.passwordButonu.sendKeys(ConfigReader.getProperty("userPassword1"));
       //login buttonuna tıklayınız
        userDashboard.loginButonu.click();
       //Sayfanın görünür olduğunu test edin
        Assert.assertTrue(userDashboard.paymentHistoryButonu.isDisplayed());

    }


}
