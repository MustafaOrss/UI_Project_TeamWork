package tests.US_007;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserHomepage;
import utilities.*;

public class US_007_TC_06 extends UserTestBaseRapor {
    UserHomepage userHomepage = new UserHomepage();
    @Test
    public void tc_06(){
        extentTest = extentReports.createTest("Footer Recent Posts testi",
                "Kullanici Pinterest'e ulasabilmeli");
        userHomepage.cookiesButonu.click();
        // 1- Launch Browser
        // 2- Go to https://qa.tripandway.com/
        extentTest.info("Kullanici " + ConfigReader.getProperty("tripAndWayUrl") + " sayfaya gider");

        // 3- Anasayfaya erisildigi dogrulanmalidir
        String actualTitle = Driver.getDriver().getTitle();
        String expectedHomePageTitle = ConfigReader.getProperty("expectedHomePageTitle");

        Assert.assertTrue(actualTitle.contains(expectedHomePageTitle));
        extentTest.pass("Belirlenen " + expectedHomePageTitle + " aranacak title arama sonucunda expected icerik oldugu test edildi");

        //  4- Sayfanın en altina inilmelidir ve test edilmelidir
        JSUtilities.scrollToElement(Driver.getDriver(), userHomepage.recentPostsElementi);
        ReusableMethods.wait(2);
        extentTest.info("Sayfa footer bolumune indi");

        Assert.assertTrue(userHomepage.recentPostsElementi.isDisplayed());

        //  5- Pinterest linkine tiklanir ve acilan sayfa dogrulanir
        userHomepage.pinterestLinki.click();
        extentTest.info("Pinterest linkine tiklandi");
        ReusableMethods.wait(3);

        ReusableMethods.switchToWindow("Pinterest - Türkiye");

        Assert.assertTrue(userHomepage.pinterestLogosu.isDisplayed());
        extentTest.pass("Pinterest sayfasi dogrulandi");
    }
}
