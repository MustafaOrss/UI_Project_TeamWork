package tests.US_026;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboard;
import utilities.AdminTestBaseRapor;
import utilities.ConfigReader;
import utilities.ReusableMethods;

public class US_026_TC_02 extends AdminTestBaseRapor {

    AdminDashboard adminDashboard=new AdminDashboard();

    @Test
    public void testC01(){

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

        ReusableMethods.wait(2);

        //6- Acilan sayfa test edilir
        Assert.assertTrue(adminDashboard.dashboardLocate.isDisplayed());
        extentTest.pass("Admin Dashboard sayfasi dogrulandi");

        //7-Yönetim panelinin görüntülenebildiğini doğrulamalıyım

        Assert.assertTrue(adminDashboard.adminPanelElementi.isDisplayed());
        ReusableMethods.wait(2);
        adminDashboard.adminPanelElementi.click();
        ReusableMethods.wait(2);

    }
}
