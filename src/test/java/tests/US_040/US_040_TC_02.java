package tests.US_040;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboard;
import utilities.*;

public class US_040_TC_02 extends AdminTestBaseRapor {


    AdminDashboard adminDashboard = new AdminDashboard();

    @Test
    public void adminSayfasininLoginTesti() {
        //1- "https://qa.tripandway.com/admin/login" adresine gidilir
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

        //4- Admin sayfası açılır.
        Assert.assertTrue(adminDashboard.dashboardLocate.isDisplayed());
        extentTest.info("Admin Dashbord sayfasi acildi");

        //5- Sayfa aşağıya iner
        JSUtilities.scrollToElement(Driver.getDriver(), adminDashboard.daraltmaOkuElementi);
        ReusableMethods.wait(2);
        extentTest.info("Sayfa aşağıya indi");

        //6- Daraltma oku tıklanır tıklanır
        adminDashboard.daraltmaOkuElementi.click();
        extentTest.info("Daraltma oku tiklandi");

        //7- Menünün daraldığı test edilir
        Assert.assertFalse(adminDashboard.adminPanelTexti.isDisplayed());
        extentTest.pass("Menünün daraldigi goruldu");




    }

}
