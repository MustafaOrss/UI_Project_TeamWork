package tests.US_007;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserHomepage;
import utilities.*;

public class US_007_TC_07 extends UserTestBaseRapor {
    UserHomepage userHomepage = new UserHomepage();
    @Test
    public void tc_07(){
        extentTest = extentReports.createTest("Footer Recent Posts testi",
                "Kullanici Instagram'a ulasabilmeli");
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

       // 5- Instagram linkine tiklanir ve acilan sayfa dogrulanir
        userHomepage.instagramLinki.click();
        extentTest.info("Instagram linkine tiklandi");
        ReusableMethods.wait(3);

        ReusableMethods.switchToWindow("Instagram");

        Assert.assertTrue(userHomepage.instagramEmailButonu.isDisplayed());
        extentTest.pass("Instagram sayfasi dogrulandi");
    }
}
