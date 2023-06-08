package tests.US_038;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboard;
import utilities.AdminTestBaseRapor;
import utilities.ConfigReader;
import utilities.Driver;

public class US_038_TC_02 extends AdminTestBaseRapor {


    AdminDashboard adminDashboard = new AdminDashboard();

    @Test
    public void adminSayfasininLoginTesti() {
        //1- "https://qa.tripandway.com/admin/login" adresine gidilir
        extentTest = extentReports.createTest("\"Change Password\" Ekranini Goruntuleme Testi",
                "Admin, \"Change Password\" ekranini goruntuleyebilmeli");

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

        //5- Profil resmine tıklanılır.
        adminDashboard.profilResmi.click();
        extentTest.info("Sag ust kosedeki profil resmi tiklandi");

        //6- "Change Password" elementi tıklanır
        adminDashboard.changePasswordElementi.click();
        extentTest.info("Acilan profil bilgilerini değiştirme ekranında 'Change Password' elementi tiklandi");

        //7- "Change Password" Ekranının görüntülendiği test edilir.
        String actualChangePasswordUrl =Driver.getDriver().getCurrentUrl() ;
        String expectedChangePasswordPageUrl = ConfigReader.getProperty("expectedChangePasswordPageUrl");

        Assert.assertEquals(expectedChangePasswordPageUrl, actualChangePasswordUrl);
        extentTest.pass( "\""+actualChangePasswordUrl +"\""+  " sayfasinin acildigi dogrulandi.");




    }


}
