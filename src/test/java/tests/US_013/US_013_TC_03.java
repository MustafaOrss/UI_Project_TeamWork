package tests.US_013;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserHomepage;
import utilities.*;

public class US_013_TC_03 extends UserTestBaseRapor {
    UserHomepage userHomepage = new UserHomepage();


    @Test
    public void test03() {
        extentTest = extentReports.createTest("Tripandway anasayfaya gidiş, Destinations'a giriş,Greenville,South Carolina'a giriş",
                "Kullanici anasayfaya ulasabilmeli, Destinitaions'a tiklayabilmeli, Greenville,South Carolina'a gidebilmeli");

        userHomepage.cookiesButonu.click();

        //1-Launch Browser
        // 2-Go to https://www.tripandway.com/
        extentTest.info("Kullanici " + ConfigReader.getProperty("tripAndWayUrl") + " sayfaya gider");

        // 3-Destinations'a tiklanir
        userHomepage.destinationsElementi.click();
        // 4-Greenville,South Carolina'in gorunurlugu ve aktifliği  dogrulanir
        JSUtilities.scrollToElement(Driver.getDriver(), userHomepage.greenVilleElementi);
        ReusableMethods.waitForVisibility(userHomepage.greenVilleElementi,2);
        Assert.assertTrue(userHomepage.greenVilleElementi.isDisplayed());
        extentTest.pass("Greenville, South Carolina'in gorunurlugu test edildi");

        userHomepage.greenVilleElementi.click();
        Assert.assertTrue(userHomepage.greenVilleHomeElementi.isDisplayed());
        extentTest.pass("Greenville, South Carolina sayfasina ulastigi test edildi");

    }
}