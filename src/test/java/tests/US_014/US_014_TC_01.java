package tests.US_014;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserHomepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.UserTestBaseRapor;

public class US_014_TC_01 extends UserTestBaseRapor {

    UserHomepage userHomepage = new UserHomepage();

    @Test
    public void tc_01() {
        extentTest = extentReports.createTest("Tripandway anasayfaya gidiş, Packages'a giriş testi",
                "Kullanici anasayfaya ulasabilmeli,Packages'a tiklayabilmeli");
        userHomepage.cookiesButonu.click();
        // 1- Launch Browser
        // 2- Go to https://qa.tripandway.com/
        // TestBaseRapor'dan URL giris yapildi
        extentTest.info("Kullanici " + ConfigReader.getProperty("tripAndWayUrl") + " sayfaya gider");

        // 3- Anasayfaya erisildigi dogrulanmalidir
        String actualTitle = Driver.getDriver().getTitle();
        String expectedHomePageTitle = ConfigReader.getProperty("expectedHomePageTitle");

        Assert.assertTrue(actualTitle.contains(expectedHomePageTitle));
        extentTest.pass("Belirlenen " + expectedHomePageTitle + " aranacak title arama sonucunda expected icerik oldugu test edildi");

        // 3-Packages'a tiklanir  //
        userHomepage.packagesElementi.click();
    }
}