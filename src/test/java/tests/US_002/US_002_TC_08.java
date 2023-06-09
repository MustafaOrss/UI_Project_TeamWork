package tests.US_002;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserHomepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.UserTestBaseRapor;

public class US_002_TC_08 extends UserTestBaseRapor {
    UserHomepage userHomepage = new UserHomepage();
    ///                        !!Header in sağ alt köşesindeki HOME,
    //      SERVICES, DESTINATIONS, PACKAGES, ABOUT US, FAQ, BLOG, CONTACT butonlarının varlığını kontrol !!!

    @Test
    public void tc_02(){
        extentTest = extentReports.createTest("Header elements testi",
                "Kullanici HOME, SERVICES, DESTINATIONS, PACKAGES, ABOUT US, FAQ, BLOG, CONTACT" +
                        " butonlarının varlığını ve aktifliğini kontrol etmeli");
       // userHomepage.cookiesButonu.click();
        // 1- Launch Browser
        // 2- Go to https://qa.tripandway.com/
        extentTest.info("Kullanici " + ConfigReader.getProperty("tripAndWayUrl") + " sayfaya gider");

        // 3- Anasayfaya erisildigi dogrulanmalidir
        String actualTitle = Driver.getDriver().getTitle();
        String expectedHomePageTitle = ConfigReader.getProperty("expectedHomePageTitle");

        Assert.assertTrue(actualTitle.contains(expectedHomePageTitle));
        extentTest.pass("Belirlenen " + expectedHomePageTitle + " aranacak title arama sonucunda expected icerik oldugu test edildi");



        //BLOG7
        ReusableMethods.waitForVisibility(userHomepage.BLOG,2);
        userHomepage.BLOG.click();
        String BLOGeurl = "https://qa.tripandway.com/blog";
        String BLOGaurl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(BLOGeurl.contains(BLOGaurl));
        extentTest.pass("BLOG butonu çalıştığı onaylandı");
        Driver.getDriver().navigate().back();
        ReusableMethods.wait(2);

//CONTACT8
        ReusableMethods.waitForVisibility(userHomepage.CONTACT,2);
        userHomepage.CONTACT.click();
        String CONTACTeurl = "https://qa.tripandway.com/contact";
        String CONTACTaurl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(CONTACTeurl.contains(CONTACTaurl));
        extentTest.pass("CONTACT butonu çalıştığı onaylandı");
        Driver.getDriver().navigate().back();

    }
}