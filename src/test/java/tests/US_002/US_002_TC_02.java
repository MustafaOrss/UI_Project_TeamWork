package tests.US_002;

import com.aventstack.extentreports.ExtentTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserHomepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.UserTestBaseRapor;

public class US_002_TC_02 extends UserTestBaseRapor {
    UserHomepage userHomepage = new UserHomepage();
    ///                        !!Header in sağ alt köşesindeki HOME,
    //      SERVICES, DESTINATIONS, PACKAGES, ABOUT US, FAQ, BLOG, CONTACT butonlarının varlığını kontrol !!!

    @Test
    public void tc_02(){
        extentTest = extentReports.createTest("Header elements testi",
                "Kullanici HOME, SERVICES, DESTINATIONS, PACKAGES, ABOUT US, FAQ, BLOG, CONTACT butonlarının varlığını kontrol etmeli");
        userHomepage.cookiesButonu.click();
        // 1- Launch Browser
        // 2- Go to https://qa.tripandway.com/
        extentTest.info("Kullanici " + ConfigReader.getProperty("tripAndWayUrl") + " sayfaya gider");

        // 3- Anasayfaya erisildigi dogrulanmalidir
        String actualTitle = Driver.getDriver().getTitle();
        String expectedHomePageTitle = ConfigReader.getProperty("expectedHomePageTitle");

        Assert.assertTrue(actualTitle.contains(expectedHomePageTitle));
        extentTest.pass("Belirlenen " + expectedHomePageTitle + " aranacak title arama sonucunda expected icerik oldugu test edildi");


        Assert.assertTrue(userHomepage.HOME.isDisplayed());
        extentTest.pass("HOME gorundu");


        Assert.assertTrue(userHomepage.SERVICES.isDisplayed());
        extentTest.pass("SERVICES gorundu");


        Assert.assertTrue(userHomepage.DESTINATIONS.isDisplayed());
        extentTest.pass("DESTINATIONS gorundu");


        Assert.assertTrue(userHomepage.PACKAGES.isDisplayed());
        extentTest.pass("PACKAGES gorundu");


        Assert.assertTrue(userHomepage.ABOUT_US.isDisplayed());
        extentTest.pass("ABOUT US gorundu");


        Assert.assertTrue(userHomepage. FAQ.isDisplayed());
        extentTest.pass(" FAQ gorundu");


        Assert.assertTrue(userHomepage.BLOG.isDisplayed());
        extentTest.pass("BLOG gorundu");


        Assert.assertTrue(userHomepage. CONTACT.isDisplayed());
        extentTest.pass(" CONTACT gorundu");
    }
}
