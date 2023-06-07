package tests.US_004;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserHomepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtilities;
import utilities.UserTestBaseRapor;

public class US_004_TC_02 extends UserTestBaseRapor {
    //10 days in Buenos Aires Butonunun varlını ve kullanılabildiğini kontrol
    UserHomepage userHomepage = new UserHomepage();

    @Test
    public void tc_02(){
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

        //3 days in Buenos Aires
        userHomepage.Buenos10Aires.click();
        extentTest.info("10 days in Buenos Aires  butonuna tiklandi");
        String expectetUrl = "https://qa.tripandway.com/package/10-days-in-buenos-aires";
        String actulaUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(expectetUrl.contains(actulaUrl));
        extentTest.pass("10 days in Buenos Aires linkine girildiği dogrulandi");


/*
    // Footer >> 10 days in Buenos Aires
    @FindBy(xpath ="(//div[@class='featured-text'])[2] ")
    public WebElement Buenos10Aires;
 */



    }}

