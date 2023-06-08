package tests.US_031;

import org.testng.Assert;
import pages.AdminDashboard;
import utilities.AdminTestBaseRapor;
import utilities.ConfigReader;
import utilities.ReusableMethods;

public class US_031_TC_03 extends AdminTestBaseRapor {

    AdminDashboard adminDashboard = new AdminDashboard();


    public void tc_03(){
        extentTest = extentReports.createTest("Tripandway admin anasayfa testi",
                "Admin sayfaya ulasabilmeli");
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
        //6- Acilan sayfa test edilir
        Assert.assertTrue(adminDashboard.dashboardLocate.isDisplayed());
        extentTest.pass("Admin Dashboard sayfasi dogrulandi");
        ReusableMethods.wait(2);
        // 7- Admin sayfasinda "Packages" gorunurlugu dogrulanır
        Assert.assertTrue(adminDashboard.packagesButtonu.isDisplayed());
        extentTest.pass("Packages elementi gorunurlugu test edildi");
        adminDashboard.packagesButtonu.click();
        ReusableMethods.wait(2);
        Assert.assertTrue(adminDashboard.packagesAddNewButonu.isDisplayed());
        extentTest.pass("Add New Butonu görüntülendi");
    }

}
