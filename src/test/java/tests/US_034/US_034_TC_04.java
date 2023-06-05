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

        // Email kismina gerekli datalari yazildi.
        adminDashboard.adminEmailKutusu.sendKeys(adminEmail);
        // Password kismina gerekli datalari yazildi.
        adminDashboard.adminPasswordKutusu.sendKeys(adminPassword);
        // Admin Email'i ve Password'u ilgili kisimlara girildikten sonra login butonu click yapildi
        adminDashboard.adminLoginButonu.click();
        // Admin sayfasina ulastirildigimi dogrulandi.
        adminDashboard.dashboardLocate.isDisplayed();
        // Order Butonu tiklandi
        adminDashboard.orderButonuLocate.click();
        // Order bolumunde oldugumu dogrulandi
        adminDashboard.orderBodyLocate.isDisplayed();
        // Invoice bolumune tiklandiginda yeni bir window'a yonlendirdigi icin
        // uzerinde olunan pencerenin window handle degeri alindi
        String ilkWindowHandle = Driver.getDriver().getWindowHandle();
        // Invoice butonuna tiklandi
        adminDashboard.invoiceButonuLocate.click();
        // Ikinci Window degerini atamak icin bos bir String degisken olusturmaliyiz.
        String ikinciWindowWHD = "";
        // windowlarin degerlerini alir(icinde 2 tane WHD var)
        Set<String> windowDegerlerSeti = Driver.getDriver().getWindowHandles();

        for (String eachWHD : windowDegerlerSeti
        ) {
            // ilk window'a esit olmayani ikinci window'a atayalim
            if (!eachWHD.equals(ilkWindowHandle))
                ikinciWindowWHD = eachWHD;
        }
        // ikinci window'daki "Invoice" bolumune gecelim
        Driver.getDriver().switchTo().window(ikinciWindowWHD);
        // Uc saniye bekleyelim
        ReusableMethods.wait(3);
        // ikinci window'daki "Invoice" bolumunde olundugu dogrulandi
        Assert.assertTrue(adminDashboard.orderInvoiceLocate.isDisplayed());

        // Faturanin goruntulenebilir oldugu test edildi
        Assert.assertTrue(adminDashboard.invoiceAdress.isDisplayed());

    }
}