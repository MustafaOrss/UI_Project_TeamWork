package tests.US_040;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboard;
import utilities.*;

public class US_040_TC_03 extends AdminTestBaseRapor {


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

        //5- "Visit Website" butonu tıklanır
        adminDashboard.visitWebsiteButonu.click();

        //6- Yeni açilan sekme tiklanir
        ReusableMethods.switchToWindow("Tripandway");
        extentTest.info("Yeni acilan sekme tiklandi");

        //7- "https://qa.tripandway.com/" anasayfasının açıldığı test edilir
        String actualHomePageTitle = Driver.getDriver().getTitle();
        String expectedHomePageTitle = ConfigReader.getProperty("expectedHomePageTitle");

        Assert.assertTrue(actualHomePageTitle.contains(expectedHomePageTitle));
        extentTest.pass("Acilan yeni sekmenin title'inin "+actualHomePageTitle+" oldugu goruldu");





    }
}
