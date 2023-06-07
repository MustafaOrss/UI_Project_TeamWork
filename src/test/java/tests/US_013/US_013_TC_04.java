package tests.US_013;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserHomepage;
import utilities.*;


public class US_013_TC_04 extends UserTestBaseRapor {
    UserHomepage userHomepage = new UserHomepage();

    @Test
    public void test04() {
        extentTest = extentReports.createTest("Tripandway anasayfaya gidiş, Destinations'a giriş,Buenos Aires,Argentina'e giriş",
                "Kullanici anasayfaya ulasabilmeli, Destinitaions'a tiklayabilmeli, Buenos Aires,Argentina'e gidebilmeli");

        userHomepage.cookiesButonu.click();

        //1-Launch Browser
        // 2-Go to https://www.tripandway.com/
        extentTest.info("Kullanici " + ConfigReader.getProperty("tripAndWayUrl") + " sayfaya gider");

        // 3-Destinations'a tiklanir
        userHomepage.destinationsElementi.click();

        // 4-Buenos Aires, Argentina'in gorunurlugu ve aktifliği  dogrulanir
        JSUtilities.scrollToElement(Driver.getDriver(), userHomepage.buenosAiresElementi);
        ReusableMethods.waitForVisibility(userHomepage.buenosAiresElementi,2);
        Assert.assertTrue(userHomepage.buenosAiresElementi.isDisplayed());
        extentTest.pass("Buenos Aires, Argentina'in gorunurlugu test edildi");
        // Buenos Aires'a tiklanir
        userHomepage.buenosAiresElementi.click();
        // Buenos Aires'in aktifliği test edilir
        Assert.assertTrue(userHomepage.buenosAiresHomeElementi.isDisplayed());
        extentTest.pass("Buenos Aires, Argentina sayfasina ulastigi test edildi");


    }
}