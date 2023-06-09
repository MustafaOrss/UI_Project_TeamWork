package tests.US_030;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboard;
import utilities.AdminTestBaseRapor;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_030_TC_03 extends AdminTestBaseRapor {
    /*
    1-Browser'a gidilir.
    2-https://qa.tripandway.com/admin/login adresine gidilir.
    3-Mail ve Sifre girilir.
    4-Login click yapılır.
    5-Admin Panelin de bulunan Destinations butonuna tiklanir.
    6-Sayfanin sol ust kosesinde "Destinations"
    yazisinin oldugu dogrulanir.
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

        // Sayfanin sol ust kosesinde "Destinations"
        // yazisinin oldugu dogrulanir.
        Assert.assertTrue(adminDashboard.destinationDogrulama.isDisplayed());

        extentTest.pass("istenen" + adminDashboard.destinationDogrulama + "istenen sayfa girisi basarili test gecti");

    }
}
