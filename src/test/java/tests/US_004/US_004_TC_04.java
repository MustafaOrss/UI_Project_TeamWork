package tests.US_004;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserHomepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtilities;
import utilities.UserTestBaseRapor;

public class US_004_TC_04 extends UserTestBaseRapor {
   // 7 days in Salina Island Butonunun varlını ve kullanılabildiğini kontrol
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

      //7 days in Salina Island
      userHomepage.Salina7.click();
      extentTest.info("7 days in Salina Island  butonuna tiklandi");
      String expectetUrl = "https://qa.tripandway.com/package/7-days-in-salina-island";
      String actulaUrl = Driver.getDriver().getCurrentUrl();
      Assert.assertTrue(expectetUrl.contains(actulaUrl));
      extentTest.pass("7 days in Salina Island girildiği dogrulandi");


/*
      // Footer >> 7 days in Salina Island
    @FindBy(xpath ="(//div[@class='featured-text'])[4] ")
    public WebElement Salina7;
 */



   }}