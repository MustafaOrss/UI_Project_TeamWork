package tests.US_012;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserHomepage;
import utilities.*;

import javax.swing.*;

public class US_012_TC_05 extends UserTestBaseRapor {

    Actions actions = new Actions(Driver.getDriver());
    UserHomepage homepage=new UserHomepage();


    @Test

    public void tc_05(){
        extentTest=extentReports.createTest("  Bussiness Tour ögesinin görünür ve aktif olduğu testi",
                " sayfasının görünürlüğü  ve aktifliği test edildi");

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
        extentTest.pass("Services sayfası doğrulandı");
        ReusableMethods.wait(1);

        // 4."Bussiness Tour" ögesinin görünür ve aktif olduğu test edilir.
        JSUtilities.scrollToElement(Driver.getDriver(),homepage.clickBussiness);
        Assert.assertTrue(homepage.bussinessTour.isDisplayed());
        homepage.coverPhoto.click();
        actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
        ReusableMethods.wait(3);
        homepage.bussinessTitle.isDisplayed();

        extentTest.info("sayfanın görünürlüğü ve aktifliği test edildi");



    }
}
