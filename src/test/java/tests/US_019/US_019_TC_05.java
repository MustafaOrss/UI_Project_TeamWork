package tests.US_019;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserDashboard;
import pages.UserHomepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.UserTestBaseRapor;

public class US_019_TC_05 extends UserTestBaseRapor {

     /*
         Tarayici acilir
         URL alanina https://qa.tripandway.com yazilir ve Enter tusuna basilir
         "Login" butonuna tiklanilir
         "Login" sayfasinin gorunur oldugunu dogrulayiniz
         Login isleminin yapilmasi icin daha once kayit yaptigimiz e-posta adresi ve sifre ilgili alanlara yazilir
         Kayit yapmak icin login butonuna tiklanir
     */

    UserDashboard UserDashboard = new UserDashboard();

    UserHomepage UserHomepage = new UserHomepage();

    @Test

    public void TC_05() {

        // https://qa.tripandway.com url alanina gidilir
        extentTest = extentReports.createTest("https://qa.tripandway.com ", "url alanina gidilir");
        // cookies var ise kontrol edilir
        UserDashboard.cookiesButonu.click();
        // Title kontrol edilir
        extentTest.info(ConfigReader.getProperty("TripAndway"));
        String actualTitle = Driver.getDriver().getTitle();
        String expectedHomePageTitle = ConfigReader.getProperty("expectedHomePageTitle");

        Assert.assertTrue(actualTitle.contains(expectedHomePageTitle));
        extentTest.pass("title basariyla test edildi ");
        //Login butonununa tiklanilir
        UserDashboard.ilkLoginButonu.click();
        extentTest.info("Header bolumunde Login bolumune tiklandi");
        // Login Sayfasi dogrulanir
        UserDashboard.loginButonu.isDisplayed();
        // Giris formu doldurulur
         UserDashboard.emailAddressButonu.click();
        UserDashboard.emailAddressButonu.sendKeys(ConfigReader.getProperty("Emailadressmehmet"));
         extentTest.info("Kullanici E-mail adresini girdi");
         UserDashboard.passwordButonu.click();
        UserDashboard.passwordButonu.sendKeys(ConfigReader.getProperty("passwordmehmet"));
        extentTest.info("Kullanici Parola girdi");
         UserDashboard.loginButonu.click();
         extentTest.info("Kullanici login butonuna tikladi");
         // Login olduktan sonra Kullanici anaysayfaya yonlendirilmeli
        ReusableMethods.waitForVisibility(UserHomepage.home,2);
        UserHomepage.home.click();
        extentTest.info("Kullanici basarili bir sekilde login olduktan sonra anasayfaya yonlendirildi");


    }
}
