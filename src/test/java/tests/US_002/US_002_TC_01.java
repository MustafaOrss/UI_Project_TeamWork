package tests.US_002;

import com.aventstack.extentreports.ExtentTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserHomepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.UserTestBaseRapor;

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
