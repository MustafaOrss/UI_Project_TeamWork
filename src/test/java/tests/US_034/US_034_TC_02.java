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
        // Admin Email ve Password datalarini dinamik olarak kullanabilmek icin Properties dosyasindan obje olusturabilmeliyim.
        Properties properties = new Properties();
        // Properties ve FileInputStream dosyalarini iceri aktarabilmeliyim.
        FileInputStream fileInputStream = new FileInputStream("configuration.properties");
        // Class'da kullanmak icin Properties objesinden Email datasini bir degiskene atayabilmeliyim
        properties.load(fileInputStream);
        String adminEmail = properties.getProperty("admin28Email");
        String adminPassword = properties.getProperty("adminPassword");

        // Email kismina gerekli datalari yazabilmeliyim.
        adminDashboard.adminEmailKutusu.sendKeys(adminEmail);
        // Password kismina gerekli datalari yazabilmeliyim.
        adminDashboard.adminPasswordKutusu.sendKeys(adminPassword);
        // Admin Email'i ve Password'u ilgili kisimlara girildikten sonra login butonuna click yapabilmeliyim.
        adminDashboard.adminLoginButonu.click();
        // Admin sayfasina ulastirildigimi dogruluyabilmeliyim.
        adminDashboard.dashboardLocate.isDisplayed();
        // Order Butonuna tiklayabilmeyim
        adminDashboard.orderButonuLocate.click();
        // Order bolumunde oldugumu dogrulayabilmeliyim.
        adminDashboard.orderBodyLocate.isDisplayed();
        ReusableMethods.wait(1);
    }
}