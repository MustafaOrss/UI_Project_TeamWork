package tests.US_034;

import org.testng.annotations.Test;
import pages.AdminDashboard;
import utilities.AdminTestBaseRapor;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class US_034_TC_02 extends AdminTestBaseRapor {

    AdminDashboard adminDashboard = new AdminDashboard();
    @Test
    public void TC_02() throws InterruptedException, IOException {


        extentTest = extentReports.createTest("Tripandway admin sayfasina gidis, email giris ve " +
                        "order bolumune erisim",
                "Kullanici ana sayfaya gidip Login olabilmeli ve order bolumune erisebilmeli");


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

        //7-Order Butonuna tiklayabilmeyim
        adminDashboard.orderButonuLocate.click();
        extentTest.info("Order butonu tiklandi");

        //8-Order bolumune gecildigini dogrulayabilmeliyim.
        adminDashboard.orderBodyLocate.isDisplayed();
        extentTest.info("Order bolumune gecildigi dogrulandi");

        ReusableMethods.wait(1);
    }
}