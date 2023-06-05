package tests.US_034;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.AdminDashboard;
import utilities.AdminTestBaseRapor;
import utilities.Driver;
import utilities.ReusableMethods;

import javax.swing.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.module.Configuration;
import java.util.Properties;

public class US_034_TC_01 extends AdminTestBaseRapor {

    @Test
    public void TC_01() throws InterruptedException, IOException {
        extentTest=extentReports.createTest("Tripandway admin sayfasina gidis ve email giris testi",
                 "Kullanici ana sayfaya gidip email girebilmeli");


        // "https://qa.tripandway/com/admin/login" adresine gidebilmeliyim." (adminTestBaseRapor class'ini extend ederek gidildi.)
        AdminDashboard adminDashboard = new AdminDashboard();
        // Admin Email ve Password datalarini dinamik olarak kullanabilmek icin Properties dosyasindan obje olusturabilmeliyim.
        Properties properties = new Properties();
        // Properties kutuphanesini yuklemek icin FileInputStream objesi olusturabilmeliyim.
        FileInputStream fileInputStream = new FileInputStream("configuration.properties");
        // Properties ve FileInputStream dosyalarini iceri aktarabilmeliyim.
        properties.load(fileInputStream);
        // Class'da kullanmak icin Properties objesinden Email datasini bir degiskene atayabilmeliyim
        String adminEmail = properties.getProperty("admin28Email");
        // Class'da kullanmak icin Properties objesinden Password datasini bir degiskene atayabilmeliyim
        String adminPassword = properties.getProperty("adminPassword");

        // Email kismina gerekli datalari yazabilmeliyim.
        adminDashboard.adminEmailKutusu.sendKeys(adminEmail);
        // Password kismina gerekli datalari yazabilmeliyim.
        adminDashboard.adminPasswordKutusu.sendKeys(adminPassword);
        // Admin Email'i ve Password'u ilgili kisimlara girildikten sonra login butonuna click yapabilmeliyim.
        adminDashboard.adminLoginButonu.click();
        // Admin sayfasina ulastirildigimi dogruluyabilmeliyim.
        adminDashboard.dashboardLocate.isDisplayed();
        ReusableMethods.wait(1);


    }

}
