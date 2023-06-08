package tests.US_013;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserHomepage;
import utilities.*;

public class US_013_TC_07 extends UserTestBaseRapor {
    UserHomepage userHomepage = new UserHomepage();

    @Test
    public void test07() {
        extentTest = extentReports.createTest("Tripandway anasayfaya gidiş, Destinations'a giriş,Istanbul,Turkey'e giriş",
                "Kullanici anasayfaya ulasabilmeli, Destinitaions'a tiklayabilmeli,Istanbul,Turkey'e gidebilmeli");

        userHomepage.cookiesButonu.click();

        //1-Launch Browser
        // 2-Go to https://www.tripandway.com/
        extentTest.info("Kullanici " + ConfigReader.getProperty("tripAndWayUrl") + " sayfaya gider");

        // 3-Destinations'a tiklanir
        userHomepage.destinationsElementi.click();


        // 4-Istanbul,Turkey'in gorunurlugu ve aktifliği dogrulanir
        JSUtilities.scrollToElement(Driver.getDriver(), userHomepage.ıstanbulElementi);
        ReusableMethods.waitForVisibility(userHomepage.ıstanbulElementi,2);
        Assert.assertTrue(userHomepage.ıstanbulElementi.isDisplayed());
        extentTest.pass("Istanbul,Turkey'in gorunurlugu test edildi");
        // Istanbul,Turkey'e tiklanir
        userHomepage.ıstanbulElementi.click();
        // Istanbul,Turkey'in aktifliği test edilir
        Assert.assertTrue(userHomepage.ıstanbulHomeElementi.isDisplayed());
        extentTest.pass("Istanbul,Turkey sayfasina ulaştığı test edildi");
    }
}