package tests.US_003;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserHomepage;
import utilities.*;

public class US_003_TC_01 extends UserTestBaseRapor {
    //OUR SERVICES kısmındaki International Tour, Adventure Tour, Culture Tour,
    // Business Tour, Health Tour, Regious Tour Fonksiyonlarının varlığının
    // ve aktifliğinin kontrolü.

 UserHomepage userHomepage = new UserHomepage();

 @Test
 public void tc_01(){
  extentTest=extentReports.createTest("Homepage Our Services butonları testi",
          "İlgili kullanıcı International Tour, Adventure Tour, Culture Tour,\n" +
                  "    // Business Tour, Health Tour, Regious Tour Fonksiyonlarının varlığını kontrol edebilmeli ");
  userHomepage.cookiesButonu.click();
  extentTest.info("Kullanici " + ConfigReader.getProperty("tripAndWayUrl") + " sayfaya gider");
  //anasayfa kontrol
  String actualTitle = Driver.getDriver().getTitle();
  String expectedHomePageTitle = ConfigReader.getProperty("expectedHomePageTitle");
  Assert.assertTrue(actualTitle.contains(expectedHomePageTitle));
  extentTest.pass("Belirlenen " + expectedHomePageTitle + " aranacak title arama sonucunda expected icerik oldugu test edildi");


  JSUtilities.scrollToElement(Driver.getDriver(), userHomepage.International_tour);
  extentTest.info("Sayfa Our services bolumune indi");


//International Tour1
  JSUtilities.scrollToElement(Driver.getDriver(), userHomepage.International_tour);
  ReusableMethods.waitForVisibility(userHomepage.International_tour,2);
  userHomepage.International_tour.click();
  String Internatıonalexurl = "https://qa.tripandway.com/service/international-tour";
  String Internatıonalacurl = Driver.getDriver().getCurrentUrl();
  Assert.assertTrue(Internatıonalacurl.contains(Internatıonalexurl));
  extentTest.pass("International_tour gorunurlugu dogrulandi");
  Driver.getDriver().navigate().back();
  ReusableMethods.wait(2);

  //Adventure Tour2
  JSUtilities.scrollToElement(Driver.getDriver(), userHomepage.Adventure_Tour);
  ReusableMethods.waitForVisibility(userHomepage.Adventure_Tour,2);
  userHomepage.Adventure_Tour.click();
  String Adventureexurl = "https://qa.tripandway.com/service/adventure-tour";
  String Adventureacurl = Driver.getDriver().getCurrentUrl();
  Assert.assertTrue(Adventureexurl.contains(Adventureacurl));
  extentTest.pass("Adventure_Tour gorunurlugu dogrulandi");
  Driver.getDriver().navigate().back();
  ReusableMethods.wait(2);

  //Culture Tour3
  JSUtilities.scrollToElement(Driver.getDriver(), userHomepage.Culture_tour);
  ReusableMethods.waitForVisibility(userHomepage.Culture_tour,2);
  userHomepage.Culture_tour.click();
  String Culture_tourexurl = "https://qa.tripandway.com/service/culture-tour";
  String Culture_touracurl = Driver.getDriver().getCurrentUrl();
  Assert.assertTrue(Culture_touracurl.contains(Culture_tourexurl));
  extentTest.pass("Culture_tour gorunurlugu dogrulandi");
  Driver.getDriver().navigate().back();
  ReusableMethods.wait(2);

  //Business Tour4
  JSUtilities.scrollToElement(Driver.getDriver(), userHomepage.Bussiness_Tour);
  ReusableMethods.waitForVisibility(userHomepage.Bussiness_Tour,2);
  userHomepage.Bussiness_Tour.click();
  String Bussiness_Tourexurl = "https://qa.tripandway.com/service/bussiness-tour";
  String Bussiness_Touracurl = Driver.getDriver().getCurrentUrl();
  Assert.assertTrue(Bussiness_Touracurl.contains(Bussiness_Tourexurl));
  extentTest.pass("Adventure_Tour gorunurlugu dogrulandi");
  Driver.getDriver().navigate().back();
  ReusableMethods.wait(2);

  //Health Tour5
  ReusableMethods.waitForVisibility(userHomepage.Health_Tour,2);
  JSUtilities.scrollToElement(Driver.getDriver(), userHomepage.Health_Tour);
  userHomepage.Health_Tour.click();
  String Health_Tourexurl = "https://qa.tripandway.com/service/health-tour";
  String Health_Touracurl = Driver.getDriver().getCurrentUrl();
  Assert.assertTrue(Health_Touracurl.contains(Health_Tourexurl));
  extentTest.pass("Health_Tour gorunurlugu dogrulandi");
  Driver.getDriver().navigate().back();
  ReusableMethods.wait(2);

  //Regious Tour6
  JSUtilities.scrollToElement(Driver.getDriver(), userHomepage.Religious_Tour);
  ReusableMethods.waitForVisibility(userHomepage.Religious_Tour,2);
  userHomepage.Religious_Tour.click();
  String Religious_Tourexurl = "https://qa.tripandway.com/service/religious-tour";
  String AReligious_Touracurl = Driver.getDriver().getCurrentUrl();
  Assert.assertTrue(AReligious_Touracurl.contains(Religious_Tourexurl));
  extentTest.pass("Religious_Tour gorunurlugu dogrulandi");
  ReusableMethods.wait(2);
  Driver.getDriver().navigate().back();
  ReusableMethods.wait(2);




 }

}
/*
   //International Tour
    @FindBy(xpath ="(//div[@class='ser-text'])[1]")
    public WebElement International_tour;

    //Adventure Tour butonu
    @FindBy(xpath ="(//*[text()='Contact'])[2] ")
    public WebElement Adventure_Tour;

    //Culture Tour butonu
    @FindBy(xpath ="(//div[@class='ser-text'])[3] ")
    public WebElement Culture_tour;


    //Bussiness Tour butonu
    @FindBy(xpath ="(//div[@class='ser-text'])[4] ")
    public WebElement Bussiness_Tour;


    //Health Tour butonu
    @FindBy(xpath ="(//*[text()='Contact'])[5] ")
    public WebElement Health_Tour;


    //Religious Tour butonu
    @FindBy(xpath ="(//*[text()='Contact'])[6] ")
    public WebElement Religious_Tour;
 */