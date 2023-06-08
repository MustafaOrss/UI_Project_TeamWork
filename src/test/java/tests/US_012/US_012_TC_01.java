package tests.US_012;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserHomepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.UserTestBaseRapor;

public class US_012_TC_01 extends UserTestBaseRapor {

    UserHomepage homepage=new UserHomepage();
    @Test
    public void tc_01(){
        extentTest=extentReports.createTest("hizmetler sayfasının görünürlüğü testi",
                "hizmetler sayfasının görünürlüğü test edildi");
       // 1-Açılan browser https://qa.tripandway.com/adresini yazıp anasayfaya erişilebilmelidir.
        String actualTitle = Driver.getDriver().getTitle();
        String expectedHomePageTitle = ConfigReader.getProperty("expectedHomePageTitle");
        Assert.assertTrue(actualTitle.contains(expectedHomePageTitle));
        extentTest.info("hizmetler sayfasına gidildi");
        //2-"SERVİCES" elementine tıklanır.
        homepage.servicespage.click();
        extentTest.pass("SERVİVES elementine tıklandı");

        // 3-"SERVİCESé sayfasının açıldığı test edilir
        String actualservicestitle = Driver.getDriver().getTitle();
        String expectedservicesTitle = ConfigReader.getProperty("expectedservicesTitle");
        Assert.assertTrue(actualservicestitle.contains(expectedservicesTitle));
        extentTest.pass("services sayfası doğrulandı");






    }
}
