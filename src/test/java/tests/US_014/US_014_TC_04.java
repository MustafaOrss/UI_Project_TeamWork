package tests.US_014;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserHomepage;
import utilities.*;

public class US_014_TC_04 extends UserTestBaseRapor {
    UserHomepage userHomepage = new UserHomepage();

    @Test
    public void tc_04() {
        extentTest = extentReports.createTest("Tripandway anasayfaya gidiş, Packages'a girebilmeli, 7 days in Istanbul'a girebilmeli",
                "Kullanici anasayfaya ulasabilmeli,Packages'a tiklayabilmeli, 7 days in Istanbul'a tiklayabilmeli");
        userHomepage.cookiesButonu.click();
        // 1- Launch Browser
        // 2- Go to https://qa.tripandway.com/
        // TestBaseRapor'dan URL giris yapildi
        extentTest.info("Kullanici " + ConfigReader.getProperty("tripAndWayUrl") + " sayfaya gider");

        // 3-Packages'a tiklanir  //
        userHomepage.packagesElementi.click();

        // 4-7 days in Istanbul'un gorunurlugu ve aktifliği dogrulanir
        JSUtilities.scrollToElement(Driver.getDriver(), userHomepage.yediDaysIstanbulElementi);
        ReusableMethods.waitForVisibility(userHomepage.yediDaysIstanbulElementi,2);
        Assert.assertTrue(userHomepage.yediDaysIstanbulElementi.isDisplayed());
        extentTest.pass("7 days in Istanbul'un gorunurlugu test edildi");

        userHomepage.yediDaysIstanbulElementi.click();
        Assert.assertTrue(userHomepage.yediDaysIstanbulHomeElementi.isDisplayed());
        extentTest.pass("7 days in Istanbul sayfasina ulastigi test edildi");

    }

}
