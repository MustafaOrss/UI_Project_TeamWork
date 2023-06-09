package tests.US_041;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.w3c.dom.stylesheets.LinkStyle;
import pages.AdminDashboard;
import utilities.AdminTestBaseRapor;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;

public class US_041_TC_03 extends AdminTestBaseRapor {


    AdminDashboard adminDashboard = new AdminDashboard();

    @Test
    public void adminSayfasininLoginTesti() {
        //1- "https://qa.tripandway.com/admin/login" adresine gidilir
        extentTest = extentReports.createTest("Admin Dashboard'dan Ciktiginda Anasayfaya Donme Testi",
                "Admin, Dashboard'dan cikis yapinca "+ConfigReader.getProperty("tripAndWayAdminUrl")
                         +" anasayfasina donebilmeli");

        extentTest.info("Admin \"" + ConfigReader.getProperty("tripAndWayAdminUrl") + "\" sayfasina gider");

        //2- "Email Address" kutusuna "admin29@tripandway.com", "Password" kutusuna "123123123" yazılır.
        adminDashboard.adminEmailKutusu.sendKeys(ConfigReader.getProperty("admin29Email"));
        extentTest.info("Gecerli Email Adresi girildi");

        adminDashboard.adminPasswordKutusu.sendKeys(ConfigReader.getProperty("adminPassword"));
        extentTest.info("Gecerli Password girildi");

        //3- "Login" butonuna tıklanılır.
        adminDashboard.adminLoginButonu.click();
        extentTest.info("Login butonu tiklandi");

        //4- Admin sayfası açılır.
        Assert.assertTrue(adminDashboard.dashboardLocate.isDisplayed());
        extentTest.info("Admin Dashbord sayfasi acildi");

        //5- Profil resmine tıklanılır.
        adminDashboard.profilResmi.click();
        extentTest.info("Sag ust kosedeki profil resmi tiklandi");

        //6- "Logout" elementi tıklanır ve Admin Dashboard'dan cikilir
        adminDashboard.logoutElementi.click();
        extentTest.info("Acilan profil bilgilerini değiştirme ekranında 'Logout' elementi tiklanip " +
                               "Admin Dashboard'dan cikildi");

        //7- Admin Dashboarddan anasayfaya gidilir
        String actualLoginUrl = Driver.getDriver().getCurrentUrl();
        String expectedTripAndWayAdminUrl = ConfigReader.getProperty("tripAndWayUrl");


        Assert.assertEquals(expectedTripAndWayAdminUrl, actualLoginUrl);
        extentTest.pass( "Admin Dashboard sayfasi kapatilip \""+ actualLoginUrl + "\" anasayfasinin acildigi dogrulandi.");





    }
}