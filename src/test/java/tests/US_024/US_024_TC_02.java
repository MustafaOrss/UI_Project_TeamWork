package tests.US_024;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserDashboard;
import utilities.*;

public class US_024_TC_02 extends UserTestBaseRapor {
    @Test
    public void TC_02() throws InterruptedException {
        UserDashboard userDashboard =new UserDashboard();
        extentTest=extentReports.createTest("Payment History testi","Kullanıcı sectigi turun ödeme geçmişine ulaşabilmeli");
        //1-launch browser
        //2-Go to https://qa.tripandway.com/traveller/login
        extentTest.info("Kullanıcı"+ ConfigReader.getProperty("tripAndWayUrl")+"anasayfaya gıder");
        userDashboard.cookiesButonu.click();
        userDashboard.ilkLoginButonu.click();
        //3-Email kısmına ilgili data yazılır
//1.hata !!!!!!!!!!!!----------------------------------------------------------------------------------------------
        userDashboard.emailAddressButonu.click();
        userDashboard.emailAddressButonu.sendKeys(ConfigReader.getProperty("userEmail1"));
        //4-Password kısmına ilgili data yazılır
//2.hata!!!!!!!!!!!---------------------------------------------------------------------------------------------------
        userDashboard.passwordButonu.click();
        userDashboard.passwordButonu.sendKeys(ConfigReader.getProperty("userPassword1"));
        //5-Login butonuna tıklanır
        userDashboard.loginButonu.click();
        //6-"Package" butonuna tıklanır
        userDashboard.packageButonu.click();
        //7-Available olan turlardan bır tanesı secılır
        JSUtilities.scrollToElement(Driver.getDriver(), userDashboard.istanbulTuruButonu);
        ReusableMethods.wait(2);
        JSUtilities.clickWithJS(Driver.getDriver(), userDashboard.istanbulTuruButonu);
        ReusableMethods.wait(2);
        extentTest.info("istenen tur secildi");
        //8-"Book Your Seat" butonunun gorunurlugu dogrulanır
             Assert.assertTrue(userDashboard.bookYourSeatButonu.isDisplayed());

         //9-"Book Your Seat" butonu tıklanır
        JSUtilities.scrollToElement(Driver.getDriver(), userDashboard.bookYourSeatButonu);
        ReusableMethods.wait(2);
        JSUtilities.clickWithJS(Driver.getDriver(), userDashboard.bookYourSeatButonu);
        extentTest.info("Book Your Seat butonuna tıklandı");
    //10-"Pay with Card" butonu gorunurlugu dogrulanır
    Assert.assertTrue(userDashboard.payWithCardButonu.isDisplayed());
   //11-"Pay with Card" butonu tıklanır
        JSUtilities.scrollToElement(Driver.getDriver(), userDashboard.payWithCardButonu);
        ReusableMethods.wait(2);
        JSUtilities.clickWithJS(Driver.getDriver(), userDashboard.payWithCardButonu);
        ReusableMethods.wait(3);
        extentTest.info("Pay with Card butonuna tıklandı");
     //12-Card number textbox' gorunurlugu dogrulanır
       Driver.getDriver().switchTo().frame(userDashboard.iframeElementi);
       ReusableMethods.wait(3);
      Assert.assertTrue(userDashboard.cardNumberKutusu.isDisplayed());
      extentTest.info("Card number textbox' ı gorundu ");
//3.hata!!!!!!!!!!!!!----------------------------------------------------------------------------------
    //13-Card number textbox ına card numarası gırılır
        ReusableMethods.wait(3);
       // userDashboard.cardNumberKutusu.click();
        userDashboard.cardNumberKutusu.sendKeys(ConfigReader.getProperty("cardNumber"));
        userDashboard.cardNumberKutusu.sendKeys(ConfigReader.getProperty("cardNumber"));
        userDashboard.cardNumberKutusu.sendKeys(ConfigReader.getProperty("cardNumber"));
        userDashboard.cardNumberKutusu.sendKeys(ConfigReader.getProperty("cardNumber"));

       extentTest.info("Card number textbox' ına card number girildi ");

    //14-Tarih textbox 'ının gorunurlugu dogrulanır
        Assert.assertTrue(userDashboard.cardMMYYKutusu.isDisplayed());
        extentTest.info("-Tarih textbox 'ı gorundu ");
        //        //15-Tarih textbox'ına tarih girilir
//4.hata!!!!!!!!!!!!!!!!--------------------------------------------------------------------------------------
        userDashboard.cardMMYYKutusu.click();
      userDashboard.cardMMYYKutusu.sendKeys(ConfigReader.getProperty("cardMMYY"));
        userDashboard.cardMMYYKutusu.sendKeys(ConfigReader.getProperty("cardMMYY1"));
        ReusableMethods.wait(3);
      extentTest.info("-Tarih textbox 'ına tarih girildi ");

    //16-CVC textbox 'ının gorunurlugu dogrulanır
      Assert.assertTrue(userDashboard.cardCVCKutusu.isDisplayed());
    //17-CvC textbox ına  guvenlık kodu gırılır
        userDashboard.cardCVCKutusu.click();
     userDashboard.cardCVCKutusu.sendKeys(ConfigReader.getProperty("cardCVC"));
     extentTest.info("CvC textbox ına  guvenlık kodu gırıldi");
    //18-"Pay" butonu gorunurlugu dogrulanır
   Assert.assertTrue(userDashboard.payButonu.isDisplayed());
   extentTest.info("'Pay' butonu gorundu");
   userDashboard.payButonu.click();

        ReusableMethods.wait(3);
        //        //19-"Payment is successfull!" yazısının gorunurlugu test edılır

















    }

}
