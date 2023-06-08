package pages.US_011;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserHomepage;
import utilities.*;

public class US_011_TC_01 extends UserTestBaseRapor {
    UserHomepage homepage=new UserHomepage();
    @Test
    public void tc_01(){
        extentTest=extentReports.createTest("sitenin gizlilik politikalrı testi",
                "kullanıcı sitenin gizlilik politikalrı bölümüne ulaşabilmeli");
        UserHomepage userHomepage=new UserHomepage();


        //  1-Launch Browser
        //  2-Go to https://qa.tripandway.com/
        //https://qa.tripandway.com/ sitesine girebilmeliyim.
        //  3- Anasayfaya erisildigi dogrulanmalidir
        String actualTitle = Driver.getDriver().getTitle();
        String expectedHomePageTitle = ConfigReader.getProperty("expectedHomePageTitle");

        Assert.assertTrue(actualTitle.contains(expectedHomePageTitle));
        extentTest.pass("anasayfaya ulaşıldı");

        // 4-sayfanın görüntülendiği  kontrol edilmelidir
        userHomepage.gizlilikPolitikasıElementi.isDisplayed();
        extentTest.pass(" gizlilik politikası sayfası gorunurlugu kontrol edildi ");


        //5-sayfanın görüntülenebildiğini doğrulayabilmeliyim
        userHomepage.gizlilikPolitikasıElementi.isDisplayed();
        Assert.assertTrue(userHomepage.gizlilikPolitikasıElementi.isDisplayed());

    }
}
