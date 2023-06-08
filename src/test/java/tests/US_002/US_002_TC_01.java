package tests.US_002;

import com.aventstack.extentreports.ExtentTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserHomepage;
import utilities.*;

public class US_002_TC_01 extends UserTestBaseRapor {

    UserHomepage userHomepage = new UserHomepage();
    ///                     !!Header in sağ üst köşesindeki Registration ve login butonlarının varlığını kontrol!!
    @Test
    public void test01() {
        ExtentTest extentTest = extentReports.createTest("Footer Recent Posts testi",
                "Kullanici Recent Posts ulasabilmeli");
        userHomepage.cookiesButonu.click();
        // 1- Launch Browser
        // 2- Go to https://qa.tripandway.com/.
        extentTest.info("Kullanici " + ConfigReader.getProperty("tripAndWayUrl") + " sayfaya gider");

        // 3- Anasayfaya erisildigi dogrulanmalidir.
        String actualTitle = Driver.getDriver().getTitle();
        String expectedHomePageTitle = ConfigReader.getProperty("expectedHomePageTitle");
        Assert.assertTrue(actualTitle.contains(expectedHomePageTitle));
        extentTest.pass("Belirlenen " + expectedHomePageTitle + " aranacak title arama sonucunda expected icerik oldugu test edildi");


//Registration

        ReusableMethods.waitForVisibility(userHomepage.registrationButonu,2);
        userHomepage.registrationButonu.click();
        String registrationButonuexurl = "https://qa.tripandway.com/traveller/register";
        String registrationButonuacurl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(registrationButonuexurl.contains(registrationButonuacurl));
        extentTest.pass("Registration butonu çalıştığı onaylandı");
        Driver.getDriver().navigate().back();
        ReusableMethods.wait(2);


//login

        ReusableMethods.waitForVisibility(userHomepage.login,2);
        userHomepage.login.click();
        String loginexurl = "https://qa.tripandway.com/traveller/login";
        String loginacurl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(loginexurl.contains(loginacurl));
        extentTest.pass("Login butonuna girilebildiği onaylandı");
        Driver.getDriver().navigate().back();
        ReusableMethods.wait(2);


    }
}


