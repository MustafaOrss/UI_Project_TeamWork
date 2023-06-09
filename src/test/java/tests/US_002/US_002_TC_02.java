package tests.US_002;

import com.aventstack.extentreports.ExtentTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserHomepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.UserTestBaseRapor;

public class US_002_TC_02 extends UserTestBaseRapor {
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

//Home1
        ReusableMethods.waitForVisibility(userHomepage.home,2);
        userHomepage.home.click();
        ReusableMethods.wait(2);
        String homeexurl = "https://qa.tripandway.com/";
        String homeacurl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(homeexurl.contains(homeacurl));
        extentTest.pass("Home butonu çalıştığı onaylandı");
        Driver.getDriver().navigate().back();




    }
}

