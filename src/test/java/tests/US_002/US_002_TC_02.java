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
        userHomepage.cookiesButonu.click();
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


//services2
        ReusableMethods.waitForVisibility(userHomepage.services,2);
        userHomepage.services.click();
        ReusableMethods.wait(2);
        String serviceseurl = "https://qa.tripandway.com/services";
        String servicesaurl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(serviceseurl.contains(servicesaurl));
        extentTest.pass("Services butonu çalıştığı onaylandı");
        Driver.getDriver().navigate().back();


//Destinations3
       ReusableMethods.waitForVisibility(userHomepage.destinationsElementi,2);
        userHomepage.destinationsElementi.click();
        String destinationsElementieurl = "https://qa.tripandway.com/destination";
        String destinationsElementiaurl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(destinationsElementieurl.contains(destinationsElementiaurl));
        extentTest.pass("Destinations butonu çalıştığı onaylandı");
        Driver.getDriver().navigate().back();


//Packages4
       ReusableMethods.waitForVisibility(userHomepage.Packages,2);
        userHomepage.Packages.click();
        String Packageseurl = "https://qa.tripandway.com/package";
        String Packagesaurl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(destinationsElementieurl.contains(destinationsElementiaurl));
        extentTest.pass("Packages butonu çalıştığı onaylandı");
        Driver.getDriver().navigate().back();


//About_us5
       ReusableMethods.waitForVisibility(userHomepage.About_us,2);
        userHomepage.About_us.click();
        String About_useurl = "https://qa.tripandway.com/about";
        String About_usaurl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(About_useurl.contains(About_usaurl));
        extentTest.pass("About_us butonu çalıştığı onaylandı");
        Driver.getDriver().navigate().back();


//Faq6
      ReusableMethods.waitForVisibility(userHomepage.FAQ,2);
        userHomepage.FAQ.click();
        String FAQeurl = "https://qa.tripandway.com/faq";
        String FAQaurl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(FAQeurl.contains(FAQaurl));
        extentTest.pass("FAQ butonu çalıştığı onaylandı");
        Driver.getDriver().navigate().back();


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

