package tests.US_039;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboard;
import utilities.AdminTestBaseRapor;
import utilities.ConfigReader;

public class US_039_TC_01 extends AdminTestBaseRapor {

    AdminDashboard adminDashboard = new AdminDashboard();

    @Test
    public void adminSayfasininLoginTesti(){
        // 1- "https://qa.tripandway.com/admin/login" adresine gidilir
        extentTest = extentReports.createTest("Tripandway Admin Sayfasinin Login Testi",
                "Admin Login sayfasına gidip gecerli email ve password ile login olabilmeli.");

        extentTest.info("Admin " + ConfigReader.getProperty("tripAndWayAdminUrl") + " sayfasina gider");

        //2- "Email Address" kutusuna "admin29@tripandway.com", "Password" kutusuna "123123123" yazılır.
        adminDashboard.adminEmailKutusu.sendKeys(ConfigReader.getProperty("admin29Email"));
        extentTest.info("Gecerli Email Adresi girildi");

        adminDashboard.adminPasswordKutusu.sendKeys(ConfigReader.getProperty("adminPassword"));
        extentTest.info("Gecerli Password girildi");

        //3- "Login" butonuna tıklanılır.
        adminDashboard.adminLoginButonu.click();
        extentTest.info("Login butonu tiklandi");

        //4- Admin sayfasının açıldığı test edilir.
        Assert.assertTrue(adminDashboard.dashboardLocate.isDisplayed());
        extentTest.pass("Admin Dashbord sayfasi acildi");



    }

}
