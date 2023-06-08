package tests.US_012;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserHomepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.UserTestBaseRapor;

public class US_012_TC_06 extends UserTestBaseRapor {
    UserHomepage userHomepage=new UserHomepage();
    @Test
    public void tc_06(){
        extentTest=extentReports.createTest("Health Tour ögesinin görünür ve aktif olduğu testi",
                "sayfasının görünürlüğü ve aktifliği test edildi");
        // 1-Açılan browser https://qa.tripandway.com/adresini yazıp anasayfaya erişilebilmelidir.
        String actualTitle = Driver.getDriver().getTitle();
        String expectedHomePageTitle = ConfigReader.getProperty("expectedHomePageTitle");
        Assert.assertTrue(actualTitle.contains(expectedHomePageTitle));
        extentTest.info("hizmetler sayfasına gidildi");
        //2-"SERVİCES" elementine tıklanır.
        userHomepage.servicespage.click();
        extentTest.pass("SERVİVES elementine tıklandı");

        // 3-"SERVİCESé sayfasının açıldığı test edilir
        String actualservicestitle = Driver.getDriver().getTitle();
        String expectedservicesTitle = ConfigReader.getProperty("expectedservicesTitle");
        Assert.assertTrue(actualservicestitle.contains(expectedservicesTitle));
        extentTest.pass("services sayfası doğrulandı");
        //4."Health Tour" ögesinin görünür ve aktif olduğu test edilir.
        userHomepage.HealthTourElementi.isDisplayed();
        userHomepage.HealthTourElementi.click();
        userHomepage.HealthTourTitle.isDisplayed();
        extentTest.info("sayfanın görünürlüğü ve aktifliği test edildi");

    }
    }
