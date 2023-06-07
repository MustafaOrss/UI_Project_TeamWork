package tests.US_025;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserDashboard;
import utilities.ConfigReader;
import utilities.ReusableMethods;
import utilities.UserTestBaseRapor;



public class US_025_TC_02 extends UserTestBaseRapor {

    UserDashboard userDashboard=new UserDashboard();

    @Test
    public void testC02(){


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
        ReusableMethods.wait(2);

        Assert.assertTrue(userDashboard.paymentHistoryButonu.isDisplayed());
        ReusableMethods.wait(2);

        //Payment Historyinin görünürlüğü doğrulanır

        Assert.assertTrue(userDashboard.paymentHistoryButonu.isDisplayed());

        //Payment History tıklanır
        userDashboard.paymentHistoryButonu.click();
        ReusableMethods.wait(2);

        //Completed buttonu görünürlüğü doğrulanır
            Assert.assertTrue(userDashboard.completedButonu.isDisplayed());

         //Action(ödeme bilgisi) butonu görüntülenir

        ReusableMethods.wait(2);

        Assert.assertTrue(userDashboard.actionCalifornia.isDisplayed());
        ReusableMethods.wait(2);

        userDashboard.actionCalifornia.click();
        ReusableMethods.wait(2);











    }

}
