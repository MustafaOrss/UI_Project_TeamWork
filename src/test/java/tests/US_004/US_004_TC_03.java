package tests.US_004;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserHomepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtilities;
import utilities.UserTestBaseRapor;

public class US_004_TC_03 extends UserTestBaseRapor {
    //3 days in Bangkok Butonunun varlını ve kullanılabildiğini kontrol
    UserHomepage userHomepage = new UserHomepage();
    @Test
    public void tc_03(){
        extentTest=extentReports.createTest("Homepage Featured Packages butonları testi");

        userHomepage.cookiesButonu.click();
        extentTest.info("Kullanici " + ConfigReader.getProperty("tripAndWayUrl") + " sayfaya gider");
        //anasayfa kontrol
        String actualTitle = Driver.getDriver().getTitle();
        String expectedHomePageTitle = ConfigReader.getProperty("expectedHomePageTitle");
        Assert.assertTrue(actualTitle.contains(expectedHomePageTitle));
        extentTest.pass("Belirlenen " + expectedHomePageTitle + " aranacak title arama sonucunda expected icerik oldugu test edildi");


        JSUtilities.scrollToElement(Driver.getDriver(), userHomepage.Buenos_Aires);
        extentTest.info("Sayfa FEATURED PACKAGES bolumune indi");

        //3 days in Bangkok
        userHomepage.Bangkok3.click();
        extentTest.info("3 days in Bangkok  butonuna tiklandi");
        String expectetUrl = "https://qa.tripandway.com/package/3-days-in-bangkok";
        String actulaUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(expectetUrl.contains(actulaUrl));
        extentTest.pass("3 days in Bangkok linkine girildiği dogrulandi");


/*
     // Footer >> 3 days in Bangkok
    @FindBy(xpath ="(//div[@class='featured-text'])[3] ")
    public WebElement Bangkok3;
 */



    }}
