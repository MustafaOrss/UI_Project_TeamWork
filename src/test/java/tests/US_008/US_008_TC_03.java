package tests.US_008;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserHomepage;
import utilities.*;

public class US_008_TC_03 extends UserTestBaseRapor {
    UserHomepage userHomepage = new UserHomepage();
    @Test
    public void tc_03(){
        extentTest = extentReports.createTest("Firma Iletisim Bilgileri testi",
                "Kullanici footer'da email adresine ulasabilmeli");
        userHomepage.cookiesButonu.click();
        // 1- Launch Browser
        // 2- Go to https://qa.tripandway.com/
        // TestBaseRapor'dan URL giris yapildi
        extentTest.info("Kullanici " + ConfigReader.getProperty("tripAndWayUrl") + " sayfaya gider");

        // 3- Anasayfaya erisildigi dogrulanmalidir
        String actualTitle = Driver.getDriver().getTitle();
        String expectedHomePageTitle = ConfigReader.getProperty("expectedHomePageTitle");

        Assert.assertTrue(actualTitle.contains(expectedHomePageTitle));
        extentTest.pass("Belirlenen " + expectedHomePageTitle + " aranacak title arama sonucunda expected icerik oldugu test edildi");

        //  4- Sayfanin en altina inilmelidir ve firma illetisim bilgileri test edilmelidir
        JSUtilities.scrollToElement(Driver.getDriver(), userHomepage.addressElementi);
        ReusableMethods.wait(2);
        extentTest.info("Sayfa footer bolumune indi");

        Assert.assertTrue(userHomepage.addressElementi.isDisplayed());
        extentTest.pass("Footer'da Address gorundu");

        // 5- "Adres" gorunurlugu test edilmelidir
        Assert.assertTrue(userHomepage.footerAdresElementi.isDisplayed());
        extentTest.pass("Footer'da adres bulundu");

    }
}
