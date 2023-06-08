package tests.US_005;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserHomepage;
import utilities.*;

//Latest Packages bölümündeki 5 öğenin dinamik yolla çalıştığının kontrolü
// (Bu kısımdaki öğeler sürekli
// kullanıcılar tarafından değiştirildiği için dinamik yolla yapıldı tek test case'ye indirildi)
public class US_005_TC_01 extends UserTestBaseRapor {
    UserHomepage userHomepage = new UserHomepage();
    @Test
    public void tc_03() {
        extentTest = extentReports.createTest("Footer Recent Posts oge testi",
                "Kullanici Recent Posts ogelerine ulasabilmeli");
        userHomepage.cookiesButonu.click();
        // 1- Launch Browser
        // 2- Go to https://qa.tripandway.com/
        extentTest.info("Kullanici " + ConfigReader.getProperty("tripAndWayUrl") + " sayfaya gider");

        // 3- Anasayfaya erisildigi dogrulanmalidir
        String actualTitle = Driver.getDriver().getTitle();
        String expectedHomePageTitle = ConfigReader.getProperty("expectedHomePageTitle");

        Assert.assertTrue(actualTitle.contains(expectedHomePageTitle));
        extentTest.pass("Belirlenen " + expectedHomePageTitle + " aranacak title arama sonucunda expected icerik oldugu test edildi");

        // 4- Sayfayı asagi indirip Latest Packages gorunurlugu test edilmeli
        JSUtilities.scrollToElement(Driver.getDriver(), userHomepage.latestpackageselement);
        ReusableMethods.wait(2);
        extentTest.info("Sayfa footer bolumune indi");

        Assert.assertTrue(userHomepage.latestpackageselement.isDisplayed());
        extentTest.pass("latest packages gorunurlugu dogrulandi");

        // 5- latest packages sutunundaki ogelerin gorunurlugu ve aktifligi test edilmeli
        WebElement oge1 = latestpackagesOgeler(1);
        Assert.assertTrue(oge1.isDisplayed());
        extentTest.pass("Oge1 gorunurlugu dogrulandi");
        oge1.click();
        ReusableMethods.wait(2);
        Assert.assertTrue(userHomepage.searchKutusu.isDisplayed());
        extentTest.pass("Oge1 linkine tiklaninca acilan sayfa dogrulandi");


        Driver.getDriver().navigate().back();

        ReusableMethods.wait(8);
        WebElement oge2 = latestpackagesOgeler(2);
        Assert.assertTrue(oge2.isDisplayed());
        extentTest.pass("Oge2 gorunurlugu dogrulandi");
        oge2.click();
        ReusableMethods.wait(2);
        Assert.assertTrue(userHomepage.searchKutusu.isDisplayed());
        extentTest.pass("Oge2 linkine tiklaninca acilan sayfa dogrulandi");

        Driver.getDriver().navigate().back();

        ReusableMethods.wait(8);
        WebElement oge3 = latestpackagesOgeler(3);
        Assert.assertTrue(oge3.isDisplayed());
        extentTest.pass("Oge3 gorunurlugu dogrulandi");
        oge3.click();
        ReusableMethods.wait(2);
        Assert.assertTrue(userHomepage.searchKutusu.isDisplayed());
        extentTest.pass("Oge3 linkine tiklaninca acilan sayfa dogrulandi");

        Driver.getDriver().navigate().back();

        ReusableMethods.wait(8);
        WebElement oge4 = latestpackagesOgeler(4);
        Assert.assertTrue(oge4.isDisplayed());
        extentTest.pass("Oge3 gorunurlugu dogrulandi");
        oge4.click();
        ReusableMethods.wait(2);
        Assert.assertTrue(userHomepage.searchKutusu.isDisplayed());
        extentTest.pass("Oge4 linkine tiklaninca acilan sayfa dogrulandi");

        Driver.getDriver().navigate().back();

        ReusableMethods.wait(8);
        WebElement oge5 = latestpackagesOgeler(5);
        Assert.assertTrue(oge5.isDisplayed());
        extentTest.pass("Oge3 gorunurlugu dogrulandi");
        oge5.click();
        ReusableMethods.wait(2);
        Assert.assertTrue(userHomepage.searchKutusu.isDisplayed());
        extentTest.pass("Oge5 linkine tiklaninca acilan sayfa dogrulandi");
    }
    private WebElement latestpackagesOgeler(int ogeNo) {
        String dinamikXpath = "/html[1]/body[1]/div[16]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[" + ogeNo + "]/a[1]";
        WebElement istenenOge = Driver.getDriver().findElement(By.xpath(dinamikXpath));
        return istenenOge;
    }
}

