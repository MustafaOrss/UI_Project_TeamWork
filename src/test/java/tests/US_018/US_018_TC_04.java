package tests.US_018;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserHomepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.UserTestBaseRapor;

public class US_018_TC_04 extends UserTestBaseRapor {

    /*
     Browser acarak url kismina "https://qa.tripandway.com" yazarak adrese gidebilmesi
    Anasayfa'nin yuklendigini dogrulamak icin sayfa'da yer alan title bolumunu dogrulayabilmesi
     Kayit olmak icin Web site anasayfasi'nda bulunan Registration bolumune tiklanir
     Registration bolumunun aktifligi test edilir
     */

    UserHomepage kullaniciAnaSayfa = new UserHomepage();

    @Test

    public void TC_04() {

        // https://qa.tripandway.com url alanina gidilir
        extentTest = extentReports.createTest("https://qa.tripandway.com ", "url alanina gidilir");
        // cookies var ise kontrol edilir
        kullaniciAnaSayfa.cookiesButonu.click();
        // Title kontrol edilir
        extentTest.info(ConfigReader.getProperty("TripAndway"));
        String actualTitle = Driver.getDriver().getTitle();
        String expectedHomePageTitle = ConfigReader.getProperty("expectedHomePageTitle");

        Assert.assertTrue(actualTitle.contains(expectedHomePageTitle));
        extentTest.pass("title basariyla test edildi ");
        // Header kisminda Registration butonuna tiklanilir
        Driver.getDriver().findElement(By.xpath("//*[text()='Registration']")).click();
        // Registration bolumunun aktifligi test edilir
        String registrationTitle = Driver.getDriver().getTitle();
        if (registrationTitle.equals("Registration")) {
            System.out.println("Registration sayfasi dogrulandi.");
        } else {
            System.out.println("Registration sayfasi acilirken hata olustu.");


        }
    }
}

