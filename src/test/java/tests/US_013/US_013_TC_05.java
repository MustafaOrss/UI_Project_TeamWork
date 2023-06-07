package tests.US_013;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserHomepage;
import utilities.*;

public class US_013_TC_05 extends UserTestBaseRapor {
    UserHomepage userHomepage = new UserHomepage();

    @Test
    public void test05() {
        extentTest = extentReports.createTest("Tripandway anasayfaya gidiş, Destinations'a giriş,Marrakesh,Morocco'ya giriş",
                "Kullanici anasayfaya ulasabilmeli, Destinitaions'a tiklayabilmeli,Marrakesh, Morocco'ya gidebilmeli");

        userHomepage.cookiesButonu.click();

        //1-Launch Browser
        // 2-Go to https://www.tripandway.com/
        extentTest.info("Kullanici " + ConfigReader.getProperty("tripAndWayUrl") + " sayfaya gider");

        // 3-Destinations'a tiklanir
        userHomepage.destinationsElementi.click();
        // 4-Marrakesh, Morocco'nun gorunurlugu ve aktifliği dogrulanir
        JSUtilities.scrollToElement(Driver.getDriver(), userHomepage.marrakeshElementi);
        ReusableMethods.waitForVisibility(userHomepage.marrakeshElementi,2);
        Assert.assertTrue(userHomepage.marrakeshElementi.isDisplayed());
        extentTest.pass("Marrakesh,Morocco'nun gorunurlugu test edildi");
      // Marrakesh,Morocco'ya tiklanir
        userHomepage.marrakeshElementi.click();
        // Marrakesh,Morocco'nun aktifliği test edilir
        Assert.assertTrue(userHomepage.marrakeshHomeElementi.isDisplayed());
        extentTest.pass("Marrakesh,Morocco sayfasina ulastigi test edildi");

    }
}