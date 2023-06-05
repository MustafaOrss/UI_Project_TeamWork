package tests.US_034;

import org.testng.annotations.Test;
import pages.AdminDashboard;
import utilities.AdminTestBaseRapor;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class US_034_TC_02 extends AdminTestBaseRapor {
    @Test
    public void TC_02() throws InterruptedException, IOException {


        extentTest = extentReports.createTest("Tripandway admin sayfasina gidis, email giris ve order bolumune erisim",
                "Kullanici ana sayfaya gidip email girebilmeli ve order bolumune erisebilmeli");


        // "https://qa.tripandway/com/admin/login" adresine gidebilmeliyim." (adminTestBaseRapor class'ini extend ederek gidildi)
        AdminDashboard adminDashboard = new AdminDashboard();
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream("configuration.properties");
        properties.load(fileInputStream);
        String adminEmail = properties.getProperty("admin28Email");
        String adminPassword = properties.getProperty("adminPassword");

        adminDashboard.adminEmailKutusu.sendKeys(adminEmail); // Email kismina gerekli datalari yazabilmeliyim.
        adminDashboard.adminPasswordKutusu.sendKeys(adminPassword); // Password kismina gerekli datalari yazabilmeliyim.
        adminDashboard.adminLoginButonu.click(); // Admin Email'i ve Password'u ilgili kisimlara girildikten sonra login butonuna click yapabilmeliyim.
        adminDashboard.anasayfaLocate.isDisplayed(); // Admin sayfasina ulastirildigimi dogruluyabilmeliyim.
        adminDashboard.orderButonuLocate.click(); // Order Butonuna tiklayabilmeyim
        adminDashboard.orderBodyLocate.isDisplayed(); // Order bolumunde oldugumu dogrulayabilmeliyim.
        ReusableMethods.wait(1);
    }
}