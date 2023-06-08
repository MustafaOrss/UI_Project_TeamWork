package tests.US_039;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboard;
import utilities.AdminTestBaseRapor;
import utilities.ConfigReader;
import utilities.Driver;

public class US_039_TC_02 extends AdminTestBaseRapor {


    AdminDashboard adminDashboard = new AdminDashboard();

    @Test
    public void adminSayfasininLoginTesti() {
        //1- "https://qa.tripandway.com/admin/login" adresine gidilir
        extentTest = extentReports.createTest("\"Change Photo\" Ekranini Goruntuleme Testi",
                "Admin, \"Change Photo\" ekranini goruntuleyebilmeli");

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

        //6- "Change Photo" elementi tıklanır
        adminDashboard.changePhotoElementi.click();
        extentTest.info("Acilan profil bilgilerini değiştirme ekranında 'Change Photo' elementi tiklandi");

        //7- "Change Photo" ekranının görüntülendiği test edilir.
        String actualChangePhotoPageUrl = Driver.getDriver().getCurrentUrl() ;
        String expectedChangePhotoPageUrl = ConfigReader.getProperty("expectedChangePhotoPageUrl");

        Assert.assertEquals(expectedChangePhotoPageUrl, actualChangePhotoPageUrl);
        extentTest.pass( "\""+actualChangePhotoPageUrl+"\"" +  " sayfasinin acildiği dogrulandi.");


    }

}
