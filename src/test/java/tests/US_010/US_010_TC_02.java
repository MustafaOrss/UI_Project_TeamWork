package tests.US_010;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserHomepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.UserTestBaseRapor;

public class US_010_TC_02 extends UserTestBaseRapor {
    UserHomepage userHomepage=new UserHomepage();
    @Test
    public void tc_02(){
        extentTest = extentReports.createTest("sayfanın şartlar ve koşullar sayfasının görünürlüğü testi",
                "Kullanici şartlar ve koşullar sayfasını görüntüleyebildiğini doğrulamalı");

        userHomepage.cookiesButonu.click();


        //1-Launch Browser

       // 2-Go to https://qa.tripandway.com/
       // 3- Anasayfaya erisildigi dogrulanmalidir
        String actualTitle = Driver.getDriver().getTitle();
        String expectedHomePageTitle = ConfigReader.getProperty("expectedHomePageTitle");
        Assert.assertTrue(actualTitle.contains(expectedHomePageTitle));

        //4-sayfanın görüntülendiği  kontrol edilmelidir
        Assert.assertTrue(userHomepage.footerAdresElementi.isDisplayed());

       // 5-sayfanın görüntülenebildiğini doğrulayabilmeliyim
        Assert.assertTrue(userHomepage.footerAdresElementi.isDisplayed());
        Assert.assertTrue(userHomepage.footerAdresElementi.isDisplayed());







    }


}
