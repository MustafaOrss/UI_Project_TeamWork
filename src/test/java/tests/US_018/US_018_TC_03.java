package tests.US_018;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserDashboard;
import pages.UserHomepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.UserTestBaseRapor;

public class US_018_TC_03 extends UserTestBaseRapor {
    /* Browser acarak url kismina "https://qa.tripandway.com" yazarak adrese gidebilmesi
    Anasayfa'nin yuklendigini dogrulamak icin sayfa'da yer alan title bolumunu dogrulayabilmesi
     Kayit olmak icin Web site anasayfasi'nda bulunan Registration bolumune tiklanir
    */
    UserDashboard UserDashboard = new UserDashboard();
    UserHomepage UserHomePage = new UserHomepage();

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
        // Header kisminda Registration butonuna tiklanilir
        UserHomePage.registrationButonu.click();
        extentTest.pass("Ziyaretci kayit yapmak icin Registration Bolumune tikladi");
    }
}
