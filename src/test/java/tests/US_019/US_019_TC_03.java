package tests.US_019;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserDashboard;
import pages.UserHomepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.UserTestBaseRapor;

public class US_019_TC_03 extends UserTestBaseRapor {

    /*
    Tarayici acilir
    URL alanina https://qa.tripandway.com yazilir ve Enter tusuna basilir
    Web site anasayfasinda Header bolumunde Login butonun gorunur oldugunu dogrulayiniz
     */

    UserDashboard UserDashboard = new UserDashboard();

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
        //Login butonu gorunur oldugu test edilir
        UserDashboard.ilkLoginButonu.isDisplayed();
        extentTest.info("Login butonu gorunurlugu test edildi");



    }
}

