package tests.US_013;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserHomepage;
import utilities.*;

public class US_013_TC_02 extends UserTestBaseRapor {
    UserHomepage userHomepage = new UserHomepage();


    @Test
    public void test02()  {
        extentTest = extentReports.createTest("Tripandway anasayfaya gidiş, Destinations'a giriş,Bangkok,Thailand'a giriş",
                "Kullanici anasayfaya ulasabilmeli, Destinitaions'a tiklayabilmeli, Bangkok,Thailand'a gidebilmeli");

        userHomepage.cookiesButonu.click();

        //1-Launch Browser
        // 2-Go to https://www.tripandway.com/
        extentTest.info("Kullanici " + ConfigReader.getProperty("tripAndWayUrl") + " sayfaya gider");

        // 3-Destinations'a tiklanir
        userHomepage.destinationsElementi.click();
        // 4-Bangkok,Thailand'in gorunurlugu ve aktif oldugu dogrulanir
        JSUtilities.scrollToElement(Driver.getDriver(), userHomepage.bangkokThailandElementi);
        ReusableMethods.waitForVisibility(userHomepage.bangkokThailandElementi,2);
        Assert.assertTrue(userHomepage.bangkokThailandElementi.isDisplayed());
        extentTest.pass("Bangkok,Thailand'in gorunurlugu test edildi");

        userHomepage.bangkokThailandElementi.click();
        Assert.assertTrue(userHomepage.bangkokThailandHomeElementi.isDisplayed());
        extentTest.pass("Bangkok,Thailand sayfasina ulastigi test edildi");



    }
}