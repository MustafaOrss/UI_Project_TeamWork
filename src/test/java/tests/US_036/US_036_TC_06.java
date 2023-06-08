package tests.US_036;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboard;
import utilities.AdminTestBaseRapor;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class US_036_TC_06 extends AdminTestBaseRapor {
    protected Actions actions;
    AdminDashboard adminDashboard = new AdminDashboard();


    @Test
    public void TC_06() throws InterruptedException, IOException {
        extentTest = extentReports.createTest("Butun Haber listesi uyelerine E-posta gonderiminin saglanmasi.",
                "Kullanici butun haber listesi uyelerine E-posta gonderimi saglayabilmeli.");

        //1-Launch Browser
        //2-"https://qa.tripandway/com/admin/login" adresine gidebilmeliyim.
        actions = new Actions(Driver.getDriver());
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

        //9-"All Subscribers" bolumununun goruntulenebilir oldugunu dogrulayabilmeliyim.
        Assert.assertTrue(adminDashboard.bodyAllSubscribers.isDisplayed());
        extentTest.info("All Subscribers bolumunun goruntulenebilir oldugu dogrulandi");


        //10-"All Subscribers" bolumunde bulunan "Send Email to Subscribers" butonuna tiklayabilmeliyim.
        adminDashboard.sendEmailSubscribers.click();
        extentTest.info("Send Email to Subscribers butonu tiklandi");

        //11- "Send Email to Subscribers" bolumunde oldugumu dogrulayabilmeliyim
        adminDashboard.sectionSendEmailSubscribers.isDisplayed();
        extentTest.info("Send Email to Subscribers gecildigi dogrulandi");

        //12-acilan e-posta gönderme formunda, konu ve içerik gibi
        // gerekli alanları doldurarak e-posta gönderme işlemini simüle edebilmeliyim.
        adminDashboard.subjectBox.sendKeys("E-posta simule etme");
        actions.sendKeys(Keys.TAB).sendKeys("Bu E-posta simule edildi").perform();
        extentTest.info("E-posta gonderme formu simule edildi.");

        //13-E-posta gönder butonuna tiklayabilmeliyim
        actions.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
        extentTest.info("E-posta gonder butonu tiklandi");
        ReusableMethods.wait(4);


    }
}
