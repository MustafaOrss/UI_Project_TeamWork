package pages.US_010;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserHomepage;
import utilities.*;

public class US_010_TC_01 extends UserTestBaseRapor {

    UserHomepage userHomepage=new UserHomepage();
    @Test
    public void tc_01(){

        //1-Launch Browser
        // 2-Go to https://qa.tripandway.com/
        Driver.getDriver().get("https://qa.tripandway.com");
        //3- Anasayfaya erisildigi dogrulanmalidir
        String actualTitle=Driver.getDriver().getTitle();
        String expencedHomePagetitle= ConfigReader.getProperty("extentHomepageTitle");
        Assert.assertTrue(actualTitle.contains(expencedHomePagetitle));
        extentTest.info("sayfanın görünürlüğü test edildi");
        // 4-sayfadaki şartlar ve koşullar bölümüne tıklanmalıdır.

        userHomepage.şartlarvekoşullaradresElementi.click();
        extentTest.info("sitenin şartlar ve koşullar böümüne girildi");

    }

}

