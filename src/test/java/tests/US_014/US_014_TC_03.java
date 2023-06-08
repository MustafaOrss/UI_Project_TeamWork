package tests.US_014;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserHomepage;
import utilities.*;

public class US_014_TC_03 extends UserTestBaseRapor {
    UserHomepage userHomepage = new UserHomepage();

    @Test
    public void tc_03() {
        extentTest = extentReports.createTest("Tripandway anasayfaya gidiş, Packages'a girebilmeli, 10 days in Buenos Aires'i girebilmeli",
                "Kullanici anasayfaya ulasabilmeli,Packages'a tiklayabilmeli,10 days in Buenos Aires'a tiklayabilmeli");
        userHomepage.cookiesButonu.click();
        // 1- Launch Browser
        // 2- Go to https://qa.tripandway.com/
        // TestBaseRapor'dan URL giris yapildi
        extentTest.info("Kullanici " + ConfigReader.getProperty("tripAndWayUrl") + " sayfaya gider");

        // 3-Packages'a tiklanir  //
        userHomepage.packagesElementi.click();

        // 4- 10 days in Buenos Aires'in gorunurlugu ve aktifliği dogrulanir
        JSUtilities.scrollToElement(Driver.getDriver(), userHomepage.onDaysBuenosElementi);
        ReusableMethods.waitForVisibility(userHomepage.onDaysBuenosElementi,2);
        Assert.assertTrue(userHomepage.onDaysBuenosElementi.isDisplayed());
        extentTest.pass("10 days in Buenos Aires'in gorunurlugu test edildi");

        userHomepage.onDaysBuenosElementi.click();
        Assert.assertTrue(userHomepage.onDaysBuenosHomeElementi.isDisplayed());
        extentTest.pass("10 days in Buenos Aires sayfasina ulastigi test edildi");

    }
}




