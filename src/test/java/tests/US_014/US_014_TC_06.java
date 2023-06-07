package tests.US_014;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserHomepage;
import utilities.*;

public class US_014_TC_06 extends UserTestBaseRapor {
    UserHomepage userHomepage = new UserHomepage();

    @Test
    public void tc_06() {
        extentTest = extentReports.createTest("Tripandway anasayfaya gidiş, Packages'a girebilmeli,7 days in Salina Island'a girebilmeli",
                "Kullanici anasayfaya ulasabilmeli,Packages'a tiklayabilmeli, 7 days in Salina Island'a tiklayabilmeli");
        userHomepage.cookiesButonu.click();
        // 1- Launch Browser
        // 2- Go to https://qa.tripandway.com/
        // TestBaseRapor'dan URL giris yapildi
        extentTest.info("Kullanici " + ConfigReader.getProperty("tripAndWayUrl") + " sayfaya gider");

        // 3-Packages'a tiklanir  //
        userHomepage.packagesElementi.click();

        // 4- 7 days in Salina Island 'in gorunurlugu ve aktifliği dogrulanir
        JSUtilities.scrollToElement(Driver.getDriver(), userHomepage.yediDaySalinaElementi);
        ReusableMethods.waitForVisibility(userHomepage.yediDaySalinaElementi,2);
        Assert.assertTrue(userHomepage.yediDaySalinaElementi.isDisplayed());
        extentTest.pass(" 7 days in Salina Island'ın gorunurlugu test edildi");

        userHomepage.yediDaySalinaElementi.click();
        Assert.assertTrue(userHomepage.yediDaysSalinaHomeElementi.isDisplayed());
        extentTest.pass(" 7 days in Salina Island sayfasina ulastigi test edildi");

    }



}
