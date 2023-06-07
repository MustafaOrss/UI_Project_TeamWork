package tests.US_013;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserHomepage;
import utilities.*;

public class US_013_TC_06 extends UserTestBaseRapor {
    UserHomepage userHomepage = new UserHomepage();

    @Test
    public void test06() {
        extentTest = extentReports.createTest("Tripandway anasayfaya gidiş, Destinations'a giriş,Salina Island,Italy'e giriş",
                "Kullanici anasayfaya ulasabilmeli, Destinitaions'a tiklayabilmeli,Salina Island,Italy'e gidebilmeli");

        userHomepage.cookiesButonu.click();

        //1-Launch Browser
        // 2-Go to https://www.tripandway.com/
        extentTest.info("Kullanici " + ConfigReader.getProperty("tripAndWayUrl") + " sayfaya gider");

        // 3-Destinations'a tiklanir
        userHomepage.destinationsElementi.click();

        // 4-Salina Island,Italy'in gorunurlugu ve aktifliği dogrulanir
        JSUtilities.scrollToElement(Driver.getDriver(), userHomepage.salinaIslandElementi);
        ReusableMethods.waitForVisibility(userHomepage.salinaIslandElementi,2);
        Assert.assertTrue(userHomepage.salinaIslandElementi.isDisplayed());
        extentTest.pass("Salina Island,Italy'nin gorunurlugu test edildi");
        // Salina Island,Italy'e tiklanir
        userHomepage.salinaIslandElementi.click();
        // Salina Island,Italy'nin aktifliği test edilir
        Assert.assertTrue(userHomepage.salinaIslandHomeElementi.isDisplayed());
        extentTest.pass("Salina Island,Italy sayfasina ulastigi test edildi");

    }
}