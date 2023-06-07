package tests.US_015;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserHomepage;
import utilities.*;

public class US_015_TC_02 extends UserTestBaseRapor {

    UserHomepage userHomepage = new UserHomepage();

    @Test
    public void tc_02() {
        extentTest = extentReports.createTest("Tripandway anasayfaya gidiş, About Us'a giriş yapabilmeli",
                "Kullanici anasayfaya ulasabilmeli, About Us'in icerigini gorebilmeli");
        userHomepage.cookiesButonu.click();
        // 1- Launch Browser
        // 2- Go to https://qa.tripandway.com/
        // TestBaseRapor'dan URL giris yapildi
        extentTest.info("Kullanici " + ConfigReader.getProperty("tripAndWayUrl") + " sayfaya gider");
        // 3- About Us tiklanir
        userHomepage.aboutUsElementi.click();
        // 4- Sayfadaki tum ogelerin gorulebilir oldugu dogrulanir//
        JSUtilities.scrollToElement(Driver.getDriver(), userHomepage.aboutUsHomeElementi);
        ReusableMethods.waitForVisibility(userHomepage.aboutUsHomeElementi,3);
        Assert.assertTrue(userHomepage.aboutUsHomeElementi.isDisplayed());
        extentTest.pass("About Us'un gorunurlugu test edildi");

    }
}