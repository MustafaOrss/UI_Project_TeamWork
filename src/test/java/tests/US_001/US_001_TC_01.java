package tests.US_001;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.UserHomepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.UserTestBaseRapor;

public class US_001_TC_01 extends UserTestBaseRapor {
    //https://qa.tripandway.com/ sitesine girebilmeliyim.

    UserHomepage userHomepage = new UserHomepage();
  @Test
    public void tc_01(){
      extentTest = extentReports.createTest("https://qa.tripandway.com/ sitesine girebilmeliyim.",
              "Verilen url ye girilir");
      //cookie varsa kapatılır
      userHomepage.cookiesButonu.click();
      //doğru url adresine gidildiği onaylanır.
    String actualTitle = "https://qa.tripandway.com/";
    String expectedUrlTitle = ConfigReader.getProperty("tripAndWayUrl");
    Assert.assertTrue(expectedUrlTitle.contains(actualTitle));

    extentTest.pass("Söz konusu " + expectedUrlTitle + " url onaylandı");




  }
    }

