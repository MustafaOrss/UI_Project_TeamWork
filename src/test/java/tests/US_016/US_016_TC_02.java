package tests.US_016;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserHomepage;
import utilities.*;

public class US_016_TC_02 extends UserTestBaseRapor {
    UserHomepage userHomepage = new UserHomepage();

    @Test
    public void tc_02() {
        extentTest = extentReports.createTest("Tripandway anasayfaya gidiş, FAQ'a giriş testi",
                "Kullanici anasayfaya ulasabilmeli, FAQ'a tiklayabilmeli");
        userHomepage.cookiesButonu.click();
        // 1- Launch Browser
        // 2- Go to https://qa.tripandway.com/
        // TestBaseRapor'dan URL giris yapildi
        extentTest.info("Kullanici " + ConfigReader.getProperty("tripAndWayUrl") + " sayfaya gider");
        // 3- FAQ tiklanir
        userHomepage.faqElementi.click();

        // 4- Sayfadaki tum ogelerin gorulebilir oldugu dogrulanir//
        JSUtilities.scrollToElement(Driver.getDriver(), userHomepage.faqHomeElementi);
        ReusableMethods.waitForVisibility(userHomepage.faqHomeElementi,3);
        Assert.assertTrue(userHomepage.faqHomeElementi.isDisplayed());
        extentTest.pass("FAQ'un iceriginin gorunurlugu test edildi");
    }
}