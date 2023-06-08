package tests.US_017;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserHomepage;
import utilities.*;

public class US_017_TC_02 extends UserTestBaseRapor {

    UserHomepage userHomepage = new UserHomepage();

    @Test
    public void tc_02() {
        extentTest = extentReports.createTest("Tripandway anasayfaya gidiş, Contact'a giriş testi",
                "Kullanici anasayfaya ulasabilmeli, Contact'a tiklayabilmeli");
        userHomepage.cookiesButonu.click();
        // 1- Launch Browser
        // 2- Go to https://qa.tripandway.com/
        // TestBaseRapor'dan URL giris yapildi
        extentTest.info("Kullanici " + ConfigReader.getProperty("tripAndWayUrl") + " sayfaya gider");

        // 3- CONTACT tiklanir
        userHomepage.contactElementi.click();
        // 4- Sayfadaki tum ogelerin gorulebilir oldugu dogrulanir//
        JSUtilities.scrollToElement(Driver.getDriver(), userHomepage.contactHomeElementi);
        ReusableMethods.waitForVisibility(userHomepage.contactHomeElementi,3);
        Assert.assertTrue(userHomepage.contactHomeElementi.isDisplayed());
        extentTest.pass("Contact'in sayfa iceriginin gorunurlugu test edildi");
    }
}



