package tests.US_001;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserHomepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.UserTestBaseRapor;

public class US_001_TC_02 extends UserTestBaseRapor {
    UserHomepage userHomepage = new UserHomepage();
    //Sitemizin tittle kısmının "Tripandway" içerdiğini onaylamalıyım.
    @Test
    public void tc_03() {
        extentTest = extentReports.createTest("Tittle testi",
                "Kullanici tittle nin doğru olduğundan emin olabilmeli");
        userHomepage.cookiesButonu.click();
        extentTest.info("Kullanici " + ConfigReader.getProperty("tripAndWayUrl") + " sayfaya gider");
        String actualTitle = Driver.getDriver().getTitle();
        String expectedHomePageTitle = ConfigReader.getProperty("expectedHomePageTitle");

        Assert.assertTrue(actualTitle.contains(expectedHomePageTitle));
        extentTest.pass("Belirlenen " + expectedHomePageTitle + " Tittle testi başarılı oldu");
    }}
