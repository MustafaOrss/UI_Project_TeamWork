package tests.US_013;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserHomepage;
import utilities.*;

public class US_013_TC_08 extends UserTestBaseRapor {
    UserHomepage userHomepage = new UserHomepage();

    @Test
    public void test08() {
        extentTest = extentReports.createTest("Tripandway anasayfaya gidiş, Destinations'a giriş,California,USA'e giriş",
                "Kullanici anasayfaya ulasabilmeli, Destinitaions'a tiklayabilmeli,California,USA'e gidebilmeli");

        userHomepage.cookiesButonu.click();

        //1-Launch Browser
        // 2-Go to https://www.tripandway.com/
        extentTest.info("Kullanici " + ConfigReader.getProperty("tripAndWayUrl") + " sayfaya gider");

        // 3-Destinations'a tiklanir
        userHomepage.destinationsElementi.click();


        // 4-California,USA'in gorunurlugu ve aktifliği dogrulanir
        JSUtilities.scrollToElement(Driver.getDriver(), userHomepage.californiaElementi);
        ReusableMethods.waitForVisibility(userHomepage.californiaElementi,2);
        Assert.assertTrue(userHomepage.californiaElementi.isDisplayed());
        extentTest.pass("California,USA'in gorunurlugu test edildi");
        // California,USA'e tiklanir
        userHomepage.californiaElementi.click();
        // California,USA'in aktifliği test edilir
        Assert.assertTrue(userHomepage.californiaHomeElementi.isDisplayed());
        extentTest.pass("California,USA sayfasina ulaştığı test edildi");
    }
}