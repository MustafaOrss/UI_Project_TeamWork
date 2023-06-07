package tests.US_014;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserHomepage;
import utilities.*;

public class US_014_TC_05 extends UserTestBaseRapor {
    UserHomepage userHomepage = new UserHomepage();

    @Test
    public void tc_05() {
        extentTest = extentReports.createTest("Tripandway anasayfaya gidiş, Packages'a girebilmeli, 3 days in Bangkok'a girebilmeli",
                "Kullanici anasayfaya ulasabilmeli,Packages'a tiklayabilmeli, 3 days in Bangkok'a tiklayabilmeli");
        userHomepage.cookiesButonu.click();
        // 1- Launch Browser
        // 2- Go to https://qa.tripandway.com/
        // TestBaseRapor'dan URL giris yapildi
        extentTest.info("Kullanici " + ConfigReader.getProperty("tripAndWayUrl") + " sayfaya gider");

        // 3-Packages'a tiklanir  //
        userHomepage.packagesElementi.click();

        // 4- 3 days in Bangkok  gorunurlugu ve aktifliği dogrulanir
        JSUtilities.scrollToElement(Driver.getDriver(), userHomepage.ucDaysBangkokElementi);
        ReusableMethods.waitForVisibility(userHomepage.ucDaysBangkokElementi,2);
        Assert.assertTrue(userHomepage.ucDaysBangkokElementi.isDisplayed());
        extentTest.pass(" 3 days in Bangkok'un gorunurlugu test edildi");

        userHomepage.ucDaysBangkokElementi.click();
        Assert.assertTrue(userHomepage.ucDaysBangkokHomeElementi.isDisplayed());
        extentTest.pass(" 3 days in Bangkok sayfasina ulastigi test edildi");

    }



}
