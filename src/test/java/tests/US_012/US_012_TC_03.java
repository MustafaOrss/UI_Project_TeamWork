package tests.US_012;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserHomepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.UserTestBaseRapor;

public class US_012_TC_03 extends UserTestBaseRapor {

    UserHomepage homepage=new UserHomepage();
    @Test
    public void tc_03(){
        extentTest=extentReports.createTest("AdventureTour ögesinin görünür ve aktif olduğu test",
                "sayfanın görünürlüğü ve aktifliği test edildi");
        // 1-Açılan browser https://qa.tripandway.com/adresini yazıp anasayfaya erişilebilmelidir.
        String actualTitle = Driver.getDriver().getTitle();
        String expectedHomePageTitle = ConfigReader.getProperty("expectedHomePageTitle");
        Assert.assertTrue(actualTitle.contains(expectedHomePageTitle));
        extentTest.info("hizmetler sayfasına gidildi");
        //2-"SERVİCES" elementine tıklanır.
        homepage.servicesButon.click();
        extentTest.pass("Services elementine tıklandı");

        // 3-"SERVİCES" sayfasının açıldığı test edilir
        String actualservicestitle = Driver.getDriver().getTitle();
        String expectedservicesTitle = "Services";
        Assert.assertTrue(actualservicestitle.contains(expectedservicesTitle));
        extentTest.pass("services sayfası doğrulandı");
        //4."AdventureTour" ögesinin görünür ve aktif olduğu test edilir.
        Assert.assertTrue(homepage.AdventureTourElementi.isDisplayed());
        homepage.AdventureTourElementi.click();
        Assert.assertTrue(homepage.Adventure_Tour.isDisplayed());
        extentTest.info("sayfanın görünürlüğü ve aktifliği test edildi");

    }
    }
