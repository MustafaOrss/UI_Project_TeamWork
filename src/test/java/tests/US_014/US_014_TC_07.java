package tests.US_014;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserHomepage;
import utilities.*;

public class US_014_TC_07 extends UserTestBaseRapor {
    UserHomepage userHomepage = new UserHomepage();

    @Test
    public void tc_07() {
        extentTest = extentReports.createTest("Tripandway anasayfaya gidiş, Packages'a girebilmeli,5 day California'a girebilmeli",
                "Kullanici anasayfaya ulasabilmeli,Packages'a tiklayabilmeli, 5 day California'a tiklayabilmeli");
        userHomepage.cookiesButonu.click();
        // 1- Launch Browser
        // 2- Go to https://qa.tripandway.com/
        // TestBaseRapor'dan URL giris yapildi
        extentTest.info("Kullanici " + ConfigReader.getProperty("tripAndWayUrl") + " sayfaya gider");

        // 3-Packages'a tiklanir  //
        userHomepage.packagesElementi.click();

        // 4-  5 day California 'nin gorunurlugu ve aktifliği dogrulanir
        JSUtilities.scrollToElement(Driver.getDriver(), userHomepage.besDayCaliforniaElementi);
        ReusableMethods.waitForVisibility(userHomepage.besDayCaliforniaElementi,2);
        Assert.assertTrue(userHomepage.besDayCaliforniaElementi.isDisplayed());
        extentTest.pass(" 5 day California'nın gorunurlugu test edildi");

        userHomepage.besDayCaliforniaElementi.click();
        Assert.assertTrue(userHomepage.besDayCaliforniaHomeElementi.isDisplayed());
        extentTest.pass(" 5 day California sayfasina ulastigi test edildi");

    }



}
