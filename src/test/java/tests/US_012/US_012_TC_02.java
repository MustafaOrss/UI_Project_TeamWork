package tests.US_012;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserHomepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.UserTestBaseRapor;

public class US_012_TC_02 extends UserTestBaseRapor {

    UserHomepage homepage =new UserHomepage();
    @Test
    public void tc_02(){
        extentTest=extentReports.createTest("International Tour ögesinin görünür ve aktif olduğu testi",
                "turun görünür ve aktif oldugu test edildi");
        // 1-Açılan browser https://qa.tripandway.com/adresini yazıp anasayfaya erişilebilmelidir.
        String actualTitle = Driver.getDriver().getTitle();
        String expectedHomePageTitle = ConfigReader.getProperty("expectedHomePageTitle");
        Assert.assertTrue(actualTitle.contains(expectedHomePageTitle));
        extentTest.info("hizmetler sayfasına gidildi");
        //2-"SERVİCES" elementine tıklanır.
        homepage.servicesButon.click();
        extentTest.pass("SERVİVES elementine tıklandı");

        // 3-""SERVİCES" sayfasının açıldığı test edilir
        String actualservicestitle = Driver.getDriver().getTitle();
        String expectedservicesTitle = "Services";
        Assert.assertTrue(actualservicestitle.contains(expectedservicesTitle));
        extentTest.pass("services sayfası doğrulandı");
        //4."International Tour" ögesinin görünür ve aktif olduğu test edilir.
        homepage.InternationalTourElementi.isDisplayed();
        homepage.InternationalTourElementi.click();
        homepage.InternationalTourTitle.isDisplayed();
        ReusableMethods.wait(2);
        extentTest.info("sayfanın görünürlüğü ve aktifliği test edildi");








    }





    }