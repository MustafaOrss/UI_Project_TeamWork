package tests.US_012;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserHomepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.UserTestBaseRapor;

public class US_012_TC_04 extends UserTestBaseRapor {
    UserHomepage homepage=new UserHomepage();
    @Test
    public void tc_04(){
        extentTest=extentReports.createTest("culture ture ögesinin görünür ve aktif olduğu testi",
                "sayfanın görünürlüğü ve aktifliği test edildi");
        // 1-Açılan browser https://qa.tripandway.com/adresini yazıp anasayfaya erişilebilmelidir.
        String actualTitle = Driver.getDriver().getTitle();
        String expectedHomePageTitle = ConfigReader.getProperty("expectedHomePageTitle");
        Assert.assertTrue(actualTitle.contains(expectedHomePageTitle));
        extentTest.info("hizmetler sayfasına gidildi");
        //2-"SERVİCES" elementine tıklanır.
        homepage.servicesButon.click();
        extentTest.pass("Services elementine tıklandı");

        // 3-"SERVİCESé sayfasının açıldığı test edilir
        String actualservicestitle = Driver.getDriver().getTitle();
        String expectedservicesTitle = "Services";
        Assert.assertTrue(actualservicestitle.contains(expectedservicesTitle));
        extentTest.pass("services sayfası doğrulandı");
        //4."culture ture" ögesinin görünür ve aktif olduğu test edilir.
        homepage.cultureTourElementi.isDisplayed();
        homepage.cultureTourElementi.click();
        homepage.cultureTourTitle.isDisplayed();
        ReusableMethods.wait(2);
        extentTest.info("sayfanın görünürlüğü ve aktifliği test edildi");


    }

    }

