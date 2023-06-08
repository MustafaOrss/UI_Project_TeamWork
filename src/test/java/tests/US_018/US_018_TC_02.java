package tests.US_018;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserHomepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.UserTestBaseRapor;

public class US_018_TC_02 extends UserTestBaseRapor {

    // Browser acarak url kismina "https://qa.tripandway.com" yazarak adrese gidebilmesi
    //Anasayfa'nin yuklendigini dogrulamak icin sayfa'da yer alan title bolumunu dogrulayabilmesi

    UserHomepage kullaniciAnaSayfa = new UserHomepage();

    @Test

    public void TC_02() {

        // https://qa.tripandway.com url alanina gidilir
        extentTest = extentReports.createTest("https://qa.tripandway.com ", "url alanina gidilir");
        // cookies var ise kontrol edilir
        kullaniciAnaSayfa.cookiesButonu.click();
        // Title kontrol edilir
        extentTest.info(ConfigReader.getProperty("TripAndway"));
        String actualTitle = Driver.getDriver().getTitle();
        String expectedHomePageTitle = ConfigReader.getProperty("expectedHomePageTitle");

        Assert.assertTrue(actualTitle.contains(expectedHomePageTitle));
        extentTest.pass("title basariyla test edildi ");


    }
}
