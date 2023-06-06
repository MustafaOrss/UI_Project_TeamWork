package tests.US_034;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.AdminDashboard;
import utilities.AdminTestBaseRapor;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import javax.swing.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.module.Configuration;
import java.util.Properties;

public class US_034_TC_01 extends AdminTestBaseRapor {


    AdminDashboard adminDashboard = new AdminDashboard();
    @Test
    public void TC_01() throws InterruptedException, IOException {
        extentTest=extentReports.createTest("Tripandway admin sayfasina gidis ve email giris testi",
                 "Admin ana sayfaya gidip email ve password ile login olabilmeli.");

        //1-Launch Browser
        //2-"https://qa.tripandway/com/admin/login" adresine gidebilmeliyim.

        extentTest.info("Admin " + ConfigReader.getProperty("tripAndWayAdminUrl")+ "Ana sayfasina gider");

        //3-Email kismina gerekli datalari yazabilmeliyim.
        adminDashboard.adminEmailKutusu.sendKeys(ConfigReader.getProperty("admin28Email"));
        extentTest.info("Email adres girildi.");

        //4-Password kismina gerekli datalari yazabilmeliyim.
        adminDashboard.adminPasswordKutusu.sendKeys(ConfigReader.getProperty("adminPassword"));
        extentTest.info("Password girildi");

        //5-Admin Email'i ve Password'u ilgili kisimlara girildikten sonra login butonuna click yapabilmeliyim.
        adminDashboard.adminLoginButonu.click();
        extentTest.info("Login butonu tiklandi");

        //6-Admin sayfasina ulastirildigimi dogruluyabilmeliyim.
        adminDashboard.dashboardLocate.isDisplayed();
        extentTest.info("Ana sayfaya ulasildigi dogrulandi");
        ReusableMethods.wait(1);


    }

}
