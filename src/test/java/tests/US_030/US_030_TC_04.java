package tests.US_030;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboard;
import utilities.AdminTestBaseRapor;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_030_TC_04 extends AdminTestBaseRapor {
    /*
    1-Browser'a gidilir.
    2-https://qa.tripandway.com/admin/login adresine gidilir.
    3-Mail ve Sifre girilir.
    4-Login click yapılır.
    5-Destinations butonuna basilir
    6- Destination sayfasinda sag ust bölgede bulunan
    "+Add New" butonuna basilir.
    7- Yeni Destination sayfasi acildigi ve sol ust kosede
    "Add Destination" yazisi dogrulanir
    8- İstenilen parametreler girilir.
    9-Submit Butonuna basilir
    10-"Destination is added successfully!" uyarisi görülür
     */

    @Test
    public void US030TC03() {
        // Browser'a gidilir.
        // https://qa.tripandway.com/admin/login adresine gidilir.
        extentTest = extentReports.createTest("https://qa.tripandway.com/admin/login testi",
                "admin login yazisi görülmeli");
        // chorme browser'ina framework de utilities icinde driver üzerinden gidilir.

        // https://qa.tripandway.com/admin/login adresine gidilir.
        extentTest.info("Kullanici " + ConfigReader.getProperty("tripAndWayAdminUrl") + " sayfaya gider");

        // Mail ve Sifre girilir.
        AdminDashboard adminDashboard = new AdminDashboard();
        adminDashboard.adminEmailKutusu.sendKeys(ConfigReader.getProperty("admin30Email"));
        ReusableMethods.wait(2);
        adminDashboard.adminPasswordKutusu.sendKeys(ConfigReader.getProperty("adminPassword"));
        ReusableMethods.wait(2);

        // Login click yapılır.
        adminDashboard.adminLoginButonu.click();
        ReusableMethods.wait(2);

        // Admin Panel sayfasinin oldugu dogrulanir.
        String actualTitle = Driver.getDriver().getTitle();
        String expectedAdminPanel = ConfigReader.getProperty("expectedAdminPanel");
        Assert.assertTrue(actualTitle.contains(expectedAdminPanel));
        extentTest.pass("istenen" + expectedAdminPanel + "istenen sayfa girisi basarili test gecti");

        // Admin Panelin de bulunan Destinations butonuna tiklanir.
        adminDashboard.destinationButonu.click();
        ReusableMethods.wait(3);

        // Destination sayfasinda sag ust bölgede bulunan "+Add New" butonuna basilir, "Add Destination" sayfası dorulanır
        adminDashboard.addDastionationButonu.click();
        extentTest.info("Add New linkine tiklandi");
        ReusableMethods.wait(2);

        Assert.assertTrue(adminDashboard.addDastionationButonu.isDisplayed());
        extentTest.pass("Add  elementi dogrulandi");

        // Add Destiantion bolumundeki "Name ", "Blog Photo" alt basliklari istenilen datalar doldurulur
        adminDashboard.addDestinationNameText.sendKeys(ConfigReader.getProperty("addDestinationNameText"));
        extentTest.info("addDestinationNameText yazildi");
        ReusableMethods.wait(2);

        adminDashboard.addDestinationDosyaSecimi.sendKeys(ConfigReader.getProperty("addDestinationDosyaSecimi"));
        extentTest.info("foto yüklendi");
        ReusableMethods.wait(5);
        // Submit butonuna tiklanir
        adminDashboard.addDestinationSubmitButonu.click();
        ReusableMethods.wait(5);
        extentTest.info(" Blog Submit Butonu tiklandi");



        // Submit Butonuna basilir "Destination is added successfully!" uyarisi görülür




    }
}
