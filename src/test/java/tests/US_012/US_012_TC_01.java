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
        extentTest.info("Kullanici " + ConfigReader.getProperty("tripAndWayUrl")+ "Ana sayfasina gider");
        String actualTitle = Driver.getDriver().getTitle();
        String expectedHomePageTitle = ConfigReader.getProperty("expectedHomePageTitle");
        Assert.assertTrue(actualTitle.contains(expectedHomePageTitle));
        extentTest.info("hizmetler sayfasına gidildi");
        //2-"Services" elementine tıklanır.
        homepage.servicesButon.click();
        extentTest.pass("Services elementine tıklandı");

        // 3-Services sayfasının açıldığı test edilir
        String actualservicestitle = Driver.getDriver().getTitle();
        String expectedservicesTitle = "Services";
        Assert.assertTrue(actualservicestitle.contains(expectedservicesTitle));
        extentTest.pass("services sayfası doğrulandı");






    }
}
