package tests.US_034;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboard;
import utilities.AdminTestBaseRapor;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;




public class US_034_TC_04 extends AdminTestBaseRapor {

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

        adminDashboard.adminEmailKutusu.sendKeys(adminEmail); // Email kismina gerekli datalari yazildi.
        adminDashboard.adminPasswordKutusu.sendKeys(adminPassword); // Password kismina gerekli datalari yazildi.
        adminDashboard.adminLoginButonu.click(); // Admin Email'i ve Password'u ilgili kisimlara girildikten sonra login butonu click yapildi
        adminDashboard.anasayfaLocate.isDisplayed(); // Admin sayfasina ulastirildigimi dogrulandi.
        adminDashboard.orderButonuLocate.click(); // Order Butonu tiklandi
        adminDashboard.orderBodyLocate.isDisplayed(); // Order bolumunde oldugumu dogrulandi
        String ilkWindowHandle = Driver.getDriver().getWindowHandle(); // Invoice bolumune tiklandiginda yeni bir window'a yonlendirdigi icin
        // uzerinde olunan pencerenin window handle degeri alindi
        System.out.println(ilkWindowHandle);
        adminDashboard.invoiceButonuLocate.click(); // Invoice butonuna tiklandi

        String ikinciWindowWHD = "";
        Set<String> windowDegerlerSeti = Driver.getDriver().getWindowHandles();// windowlarin degerlerini alir(icinde 2 tane WHD var)

        for (String eachWHD : windowDegerlerSeti
        ) {
            if (!eachWHD.equals(ilkWindowHandle)) // ilk window'a esit olmayani ikinci window'a atayalim
                ikinciWindowWHD = eachWHD;
        }

        Driver.getDriver().switchTo().window(ikinciWindowWHD); // ikinci window'daki "Invoice" bolumune gecelim
        ReusableMethods.wait(3);
        Assert.assertTrue(adminDashboard.invoiceLocate.isDisplayed()); // ikinci window'daki "Invoice" bolumunde olundugu dogrulandi

        Assert.assertTrue(adminDashboard.invoiceAdress.isDisplayed()); // Faturanin goruntulenebilir oldugu test edildi

    }
}