package tests.US_012;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserHomepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.UserTestBaseRapor;

import javax.swing.*;

public class US_012_TC_07 extends UserTestBaseRapor {

    Actions actions = new Actions(Driver.getDriver());
    UserHomepage homepage=new UserHomepage();
    @Test
    public void tc_06(){
        extentTest=extentReports.createTest("Religious Tour ögesinin görünür ve aktif olduğu testi",
                "sayfasının görünürlüğü ve aktifliği test edildi");
        // 1-Açılan browser https://qa.tripandway.com/adresini yazıp anasayfaya erişilebilmelidir.
        String actualTitle = Driver.getDriver().getTitle();
        String expectedHomePageTitle = ConfigReader.getProperty("expectedHomePageTitle");
        Assert.assertTrue(actualTitle.contains(expectedHomePageTitle));
        extentTest.info("hizmetler sayfasına gidildi");
        //2-"SERVİCES" elementine tıklanır.
        homepage.servicesButon.click();
        extentTest.pass("Services elementine tıklandı");

        // 3-"Services sayfasının açıldığı test edilir
        String actualservicestitle = Driver.getDriver().getTitle();
        String expectedservicesTitle = "Services";
        Assert.assertTrue(actualservicestitle.contains(expectedservicesTitle));
        extentTest.pass("services sayfası doğrulandı");
        //4." Religious Tour" ögesinin görünür ve aktif olduğu test edilir.
        Assert.assertTrue(homepage.ReligiousTourElementi.isDisplayed());
        homepage.coverPhoto.click();
        actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER).perform();
        Assert.assertTrue(homepage.ReligiousTourTitle.isDisplayed());
        extentTest.info("sayfanın görünürlüğü ve aktifliği test edildi");
        ReusableMethods.wait(4);
    }


}
