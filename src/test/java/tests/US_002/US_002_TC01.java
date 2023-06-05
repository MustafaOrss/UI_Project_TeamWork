package tests.US_002;

import com.aventstack.extentreports.ExtentTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserHomepage;
import utilities.*;

public class US_002_TC02 extends UserTestBaseRapor {
    //Header in sağ alt köşesindeki HOME, SERVICES, DESTINATIONS, PACKAGES, ABOUT US, FAQ, BLOG, CONTACT
    // butonlarının varlığını kontrol edip eğer varsa aktif olduğunu kontrol etmeliyim.
    UserHomepage userHomepage = new UserHomepage();

    @Test
    public void test02() {
        ExtentTest extentTest = extentReports.createTest("Footer Recent Posts testi",
                "Kullanici Recent Posts ulasabilmeli");
        userHomepage.cookiesButonu.click();
        // 1- Launch Browser
        // 2- Go to https://qa.tripandway.com/
        extentTest.info("Kullanici " + ConfigReader.getProperty("tripAndWayUrl") + " sayfaya gider");

        // 3- Anasayfaya erisildigi dogrulanmalidir
        String actualTitle = Driver.getDriver().getTitle();
        String expectedHomePageTitle = ConfigReader.getProperty("expectedHomePageTitle");
        Assert.assertTrue(actualTitle.contains(expectedHomePageTitle));
        extentTest.pass("Belirlenen " + expectedHomePageTitle + " aranacak title arama sonucunda expected icerik oldugu test edildi");

        //Header in sağ alt köşesindeki HOME, SERVICES, DESTINATIONS, PACKAGES, ABOUT US, FAQ, BLOG, CONTACT
        // butonlarının varlığını kontrol

        //4-
        Assert.assertTrue(userHomepage.RegistrationAndlogin.isDisplayed());
        extentTest.pass("RegistrationAndlogin gorunurlugu dogrulandi");
    }
}


/*
  //Header Registration ve login alanı
    @FindBy(xpath =" //div[@class='top-header-right']")
    public WebElement  RegistrationAndlogin;
 */

