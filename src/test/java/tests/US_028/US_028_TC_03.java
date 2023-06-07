package tests.US_028;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboard;
import utilities.AdminTestBaseRapor;
import utilities.ConfigReader;
import utilities.ReusableMethods;

public class US_028_TC_03 extends AdminTestBaseRapor {
    AdminDashboard adminDashboard = new AdminDashboard();
    @Test
    public void tc_03(){
        extentTest = extentReports.createTest("Tripandway admin Categories testi",
                "Admin Categories ulasabilmeli");
        // 1- Launch Browser
        // 2- Go to https://qa.tripandway.com/admin/login
        extentTest.info("Admin " + ConfigReader.getProperty("tripAndWayAdminUrl") + " sayfaya gider");

        // 3- Email kismina ilgili data yazilir
        adminDashboard.adminEmailKutusu.sendKeys(ConfigReader.getProperty("admin28Email"));
        extentTest.info("Email address yazildi");

        // 4- Password kismina ilgili data yazilir
        adminDashboard.adminPasswordKutusu.sendKeys(ConfigReader.getProperty("adminPassword"));
        extentTest.info("Password yazildi");

        // 5- Login butonuna tiklanir
        adminDashboard.adminLoginButonu.click();
        extentTest.info("Login butonuna tiklandi");

        // 6- Acilan sayfa test edilir
        Assert.assertTrue(adminDashboard.dashboardLocate.isDisplayed());
        extentTest.pass("Admin Dashboard sayfasi dogrulandi");

        // 7- Blog Section goruntulenir ve tiklanir
        Assert.assertTrue(adminDashboard.blogSectionButonu.isDisplayed());
        extentTest.pass("Blog Section gorunurlugu dogrulandi");

        adminDashboard.blogSectionButonu.click();
        extentTest.info("Blog Section tiklandi");

        //  8- Categories goruntulenir ve tiklanir
        Assert.assertTrue(adminDashboard.blogSectionCategoriesLinki.isDisplayed());
        extentTest.pass("Castegories gorunurlugu dogrulandi");


        adminDashboard.blogSectionCategoriesLinki.click();
        extentTest.info("Categories tiklandi");
        ReusableMethods.wait(2);

        Assert.assertTrue(adminDashboard.viewCategoriesElementi.isDisplayed());
        extentTest.pass("View Categories elementi goruldu");
    }
}