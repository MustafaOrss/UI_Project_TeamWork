package tests.US_020;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserDashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.UserTestBaseRapor;

public class US_020_TC_05 extends UserTestBaseRapor {

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
 11. Update Profil alaninda "Update Profile" textinin gorunur oldugunu dogrulayiniz
 12. Profili duzenlemek icin;
  isim, telefon , ulke , adres , bolge , sehir ve posta kodu gibi gerekli yerlere yeni degerler girilir
  14. Update butonuna tiklayiniz
 15. "Profile is update succesfully" textinin gorunur oldugunu dogrulayiniz
     */

    pages.UserDashboard UserDashboard = new UserDashboard();

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
        UserDashboard.ilkLoginButonu.isDisplayed();
        // Giris formu doldurulur
        UserDashboard.emailAddressButonu.click();
        UserDashboard.emailAddressButonu.sendKeys(ConfigReader.getProperty("Emailadressmehmet"));
        extentTest.info("Kullanici E-mail adresini girdi");
        UserDashboard.passwordButonu.click();
        UserDashboard.passwordButonu.sendKeys(ConfigReader.getProperty("passwordmehmet"));
        extentTest.info("Kullanici Parola girdi");
        UserDashboard.loginButonu.click();
        extentTest.info("Kullanici login butonuna tikladi");
        // Login isleminin basarili olmasi icin Gosterge paneli dogrulanir
        UserDashboard.dashboardLogoButonu.isDisplayed();
        // Profili goncellemek icin update profile gorunurlugu dogrulanir
        UserDashboard.updateProfileButonu.isDisplayed();
        // Profili guncellemek icin update profile butonuna tiklanilir
        UserDashboard.updateProfileButonu.click();
        extentTest.info("Kullanici Update profile butonuna tikladi");
        // Update Profile text'i dogrulanir
        UserDashboard.updateProfileButonu.isDisplayed();
        extentTest.info("Update Profile title Teset edildi");
        // Profili guncellemek icin gerekli yerler doldurulur0
        UserDashboard.updateProfilePhone.click();
        UserDashboard.updateProfilePhone.sendKeys(ConfigReader.getProperty("UpdateProfilePhone"));
        UserDashboard.updateProfileCountry.click();
        UserDashboard.updateProfileCountry.sendKeys(ConfigReader.getProperty("UpdateProfilecountry"));
        UserDashboard.updateProfileAddress.click();
        UserDashboard.updateProfileAddress.sendKeys(ConfigReader.getProperty("UpdateProfileAdress"));
        UserDashboard.updateProfileState.click();
        UserDashboard.updateProfileState.sendKeys(ConfigReader.getProperty("UpdateProfileState"));
        UserDashboard.updateProfileCity.click();
        UserDashboard.updateProfileCity.sendKeys(ConfigReader.getProperty("UpdateProfileCity"));
        UserDashboard.updateProfileZipcode.click();
        UserDashboard.updateProfileZipcode.sendKeys(ConfigReader.getProperty("UpdateProfileZipcode"));
        extentTest.info("Profili guncellemek icin gerekli bilgiler girildi");
        // Profili guncellemek icin Update butonuna tiklanmali
        UserDashboard.updateprofileButonu.submit();
        // Update is profile succesfully text'i gorunurlugu
        UserDashboard.profuleisupdatesuccesfully.isDisplayed();
        ReusableMethods.wait(3);
        extentTest.info("Profil basariyla guncellendi");












    }
}
