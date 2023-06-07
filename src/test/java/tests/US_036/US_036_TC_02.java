package tests.US_036;

import org.testng.annotations.Test;
import pages.AdminDashboard;
import utilities.AdminTestBaseRapor;
import utilities.ConfigReader;
import utilities.ReusableMethods;

import java.io.IOException;

public class US_036_TC_02 extends AdminTestBaseRapor {

    AdminDashboard adminDashboard = new AdminDashboard();


    @Test
    public void TC_02() throws InterruptedException, IOException {
        extentTest = extentReports.createTest("Subscribers bölümüne erisim saglanabilmesi.",
                "Kullanici Subscribers bölümüne erisim saglayabilmeli.");

        //1-Launch Browser
        //2-"https://qa.tripandway/com/admin/login" adresine gidebilmeliyim.

        extentTest.info("Admin " + ConfigReader.getProperty("tripAndWayAdminUrl") + "Ana sayfasina gider");

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



        //7-Acilan ekranda "Subscribers" bolumune tiklayabilmeliyim.
        adminDashboard.subscriberButonu.click();
        extentTest.info("Subscribers butonu tiklandi");



        ReusableMethods.wait(3);


    }
}
