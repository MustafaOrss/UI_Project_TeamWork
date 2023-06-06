package tests.US_035;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboard;
import utilities.*;

import javax.swing.*;
import java.io.IOException;

public class US_035_TC_03 extends AdminTestBaseRapor {
    AdminDashboard adminDashboard = new AdminDashboard();

    @Test
    public void TC_04() throws InterruptedException, IOException {
        extentTest = extentReports.createTest("Tripandway admin sayfasina gidis ve email giris testi",
                "Admin ana sayfaya gidip email ve password ile login olabilmeli.");

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


        //8-"Subscribers" seceneklerinden ilk sirada bulunan "All Subscribers" bolumune tiklayabilmeliyim.
        adminDashboard.allSubscriberButonu.click();
        extentTest.info("All Subscribers butonu tiklandi");

        //9-"All Subscribers" bolumunde oldumu dogrulayabilmeliyim.
        Assert.assertTrue(adminDashboard.bodyAllSubscribers.isDisplayed());
        extentTest.info("All Subscribers bolumunun goruntulenebilir oldugu dogrulandi");
        ReusableMethods.wait(3);

    }
}
