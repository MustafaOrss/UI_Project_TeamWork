package tests.US_019;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserDashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.UserTestBaseRapor;

public class US_019_TC_04 extends UserTestBaseRapor {

    /*
        Tarayici acilir
       URL alanina https://qa.tripandway.com yazilir ve Enter tusuna basilir
      " Login" butonuna tiklanilir
     Login sayfasinin gorunur oldugunu dogrulayiniz
     */

    pages.UserDashboard UserDashboard = new UserDashboard();

    @Test

    public void TC_02() {

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
        extentTest.info("Login sayfasi dogrulandi");

    }
}
