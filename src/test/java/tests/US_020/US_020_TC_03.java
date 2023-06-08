package tests.US_020;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserDashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.UserTestBaseRapor;

public class US_020_TC_03 extends UserTestBaseRapor {

    /*
    1. Tarayici acilir
 2. URL alanina https://qa.tripandway.com yazilir ve Enter tusuna basilir
 3. "Login" butonuna tiklanilir
 4. "Login" sayfasinin gorunur oldugunu dogrulayiniz
 5. Login isleminin yapilmasi icin daha once kayit yaptigimiz e-posta adresi ve sifre ilgili alanlara yazilir
 6. Login isleminin tamamlanmasi icin "Login" butonunun gorundugunu dogrulayiniz
 7. "Login" butonuna tiklanilir
 8. Profil sayfasinin gorunur oldugunu kontrol ediniz
 9. Profili duzenlemek icin "Update Profile" bolumunun gorunur oldugunu dogrulayiniz
 10. Update Profile bolumune tiklanilir
     */

    UserDashboard UserDashboard = new UserDashboard();

    @Test

    public void TC_03() {

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
        UserDashboard.ilkLoginButonu.isDisplayed();
        // Giris formu doldurulur
        UserDashboard.emailAddressButonu.click();
        UserDashboard.emailAddressButonu.sendKeys(ConfigReader.getProperty("Emailadressmehmet"));
        extentTest.info("Kullanici E-mail adresini girdi");
        UserDashboard.passwordButonu.click();
        UserDashboard.emailAddressButonu.sendKeys(ConfigReader.getProperty("passwordmehmet"));
        extentTest.info("Kullanici Parola girdi");
        UserDashboard.loginButonu.click();
        extentTest.info("Kullanici login butonuna tikladi");
        // Login isleminin basarili olmasi icin Gosterge paneli dogrulanir
        UserDashboard.dashboardLogoButonu.isDisplayed();
        // Profili goncellemek icin update profile gorunurlugu dogrulanir
        UserDashboard.updateProfileButonu.isDisplayed();
        // Profili guncellemek icin update profile butonuna tiklanilir
        UserDashboard.updateProfileButonu.click();


    }
}
