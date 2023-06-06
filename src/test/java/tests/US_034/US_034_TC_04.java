package tests.US_034;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboard;
import utilities.AdminTestBaseRapor;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;




public class US_034_TC_04 extends AdminTestBaseRapor {

    AdminDashboard adminDashboard = new AdminDashboard();
    @Test
    public void TC_02() throws InterruptedException, IOException {

        extentTest = extentReports.createTest("Tripandway admin sayfasina gidis," +
                        " email giris, order ve invoice bolumune erisim, fatura goruntulenebilirligi",
                "Kullanici ana sayfaya gidip email ve password ile login olabilmeli," +
                        " order ve invoice bolumune erisebilmeli, faturanin goruntulenebilir oldugunu test edebilmeli");

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
        //7-Order Butonuna tiklayabilmeliyim
        adminDashboard.orderButonuLocate.click();
        extentTest.info("Order butonu tiklandi");

        //8-Order bolumune gecildigini dogrulayabilmeliyim.
        adminDashboard.orderBodyLocate.isDisplayed();
        extentTest.info("Order bolumune gecildigi dogrulandi");
        //Invoice bolumune tiklandiginda yeni bir window'a yonlendirdigi icin
        String ilkWindowHandle = Driver.getDriver().getWindowHandle();
        // uzerinde olunan pencerenin window handle degeri alindi
        // uzerinde olunan pencerenin window handle degeri alindi
        System.out.println(ilkWindowHandle);
        //9- Invoice butonuna tiklayabilmeliyim
        adminDashboard.invoiceButonuLocate.click();
        extentTest.info("Invoice butonu tiklandi");

        String ikinciWindowWHD = "";
        // windowlarin degerlerini alir(icinde 2 tane WHD var)
        Set<String> windowDegerlerSeti = Driver.getDriver().getWindowHandles();
        extentTest.info("Butun pencerelerin window handle degerleri alindi");

        for (String eachWHD : windowDegerlerSeti
        ) {
            // ilk window'a esit olmayan ikinci window'a atanir
            if (!eachWHD.equals(ilkWindowHandle))
                ikinciWindowWHD = eachWHD;
            extentTest.info("ilk window'a esit olmayan window handle degeri ikinci window'a atandi");
        }

        //10-ikinci window'daki "Invoice" bolumune gecebilmeliyim
        Driver.getDriver().switchTo().window(ikinciWindowWHD);
        extentTest.info("Invoice bolumune gecildi");
        ReusableMethods.wait(3);
        //11-ikinci window'daki "Invoice" bolumune gecildigini dogrulayabilmeliyim.
        Assert.assertTrue(adminDashboard.orderInvoiceLocate.isDisplayed());
        extentTest.info("Invoice bolumune gecildigi dogrulandi");
        //12-Faturanin goruntulenebilir oldugunu dogrulayabilmeliyim
        Assert.assertTrue(adminDashboard.invoiceAdress.isDisplayed());
        extentTest.info("Fatura goruntulenebilir oldugu dogrulandi");
    }
}