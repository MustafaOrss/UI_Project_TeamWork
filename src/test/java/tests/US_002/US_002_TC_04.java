package tests.US_002;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserHomepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.UserTestBaseRapor;

public class US_002_TC_04 extends UserTestBaseRapor {
    UserHomepage userHomepage = new UserHomepage();
    ///                        !!Header in sağ alt köşesindeki HOME,
    //      SERVICES, DESTINATIONS, PACKAGES, ABOUT US, FAQ, BLOG, CONTACT butonlarının varlığını kontrol !!!

    @Test
    public void tc_02(){
        extentTest = extentReports.createTest("Header elements testi",
                "Kullanici HOME, SERVICES, DESTINATIONS, PACKAGES, ABOUT US, FAQ, BLOG, CONTACT" +
                        " butonlarının varlığını ve aktifliğini kontrol etmeli");
        //userHomepage.cookiesButonu.click();
        // 1- Launch Browser
        // 2- Go to https://qa.tripandway.com/
        extentTest.info("Kullanici " + ConfigReader.getProperty("tripAndWayUrl") + " sayfaya gider");

        // 3- Anasayfaya erisildigi dogrulanmalidir
        String actualTitle = Driver.getDriver().getTitle();
        String expectedHomePageTitle = ConfigReader.getProperty("expectedHomePageTitle");

        Assert.assertTrue(actualTitle.contains(expectedHomePageTitle));
        extentTest.pass("Belirlenen " + expectedHomePageTitle + " aranacak title arama sonucunda expected icerik oldugu test edildi");




//Destinations3
        ReusableMethods.waitForVisibility(userHomepage.destinationsElementi,2);
        userHomepage.destinationsElementi.click();
        String destinationsElementieurl = "https://qa.tripandway.com/destination";
        String destinationsElementiaurl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(destinationsElementieurl.contains(destinationsElementiaurl));
        extentTest.pass("Destinations butonu çalıştığı onaylandı");
        Driver.getDriver().navigate().back();



    }
}