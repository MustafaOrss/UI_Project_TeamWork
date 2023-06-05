package tests.US_027;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboard;
import utilities.AdminTestBaseRapor;
import utilities.ConfigReader;

public class US_027_TC_08 extends AdminTestBaseRapor {
    AdminDashboard adminDashboard = new AdminDashboard();
    @Test
    public void tc_08(){
        extentTest = extentReports.createTest("Tripandway admin panel testi",
                "Kullanici Email Template ulasabilmeli");
        // 1- Launch Browser
        // 2- Go to https://qa.tripandway.com/admin/login
        extentTest.info("Kullanici " + ConfigReader.getProperty("tripAndWayAdminUrl") + " sayfaya gider");

        // 3- Email kismina ilgili data yazilir
        adminDashboard.emailAddressButonu.sendKeys(ConfigReader.getProperty("admin28Email"));
        extentTest.info("Email address yazildi");

        // 4- Password kismina ilgili data yazilir
        adminDashboard.passwordButonu.sendKeys(ConfigReader.getProperty("adminPassword"));
        extentTest.info("Password yazildi");

        // 5- Login butonuna tiklanir
        adminDashboard.loginButonu.click();
        extentTest.info("Login butonuna tiklandi");

        //6- Acilan sayfa test edilir
        Assert.assertTrue(adminDashboard.dashboardElementi.isDisplayed());
        extentTest.pass("Admin Dashboard sayfasi dogrulandi");

        //  7- Admin sayfasinda "Email Template" gorunurlugu dogrulanır
        Assert.assertTrue(adminDashboard.emailTemplateElementi.isDisplayed());
        extentTest.pass("Email Template elementi gorunurlugu test edildi");
    }
}
