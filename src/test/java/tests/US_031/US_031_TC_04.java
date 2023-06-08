package tests.US_031;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboard;
import utilities.*;

public class US_031_TC_04 extends AdminTestBaseRapor {
    AdminDashboard adminDashboard = new AdminDashboard();
    @Test
    public void tc_04() {
        extentTest = extentReports.createTest("Tripandway admin anasayfa testi",
                "Admin sayfaya ulasabilmeli");
        // 1- Launch Browser
        // 2- Go to https://qa.tripandway.com/admin/login
        extentTest.info("Admin " + ConfigReader.getProperty("tripAndWayAdminUrl") + " sayfaya gider");
        // 3- Email kismina ilgili data yazilir
        adminDashboard.adminEmailKutusu.sendKeys(ConfigReader.getProperty("admin28Email"));
        extentTest.info("Email address yazildi");
        // 4- Password kismina ilgili data yazilir
        adminDashboard.adminPasswordKutusu.sendKeys(ConfigReader.getProperty("adminPassword"));
        extentTest.info("Password yazildi");
        // 5- Login butonuna tiklanir
        adminDashboard.adminLoginButonu.click();
        extentTest.info("Login butonuna tiklandi");
        //6- Acilan sayfa test edilir
        Assert.assertTrue(adminDashboard.dashboardLocate.isDisplayed());
        extentTest.pass("Admin Dashboard sayfasi dogrulandi");
        ReusableMethods.wait(2);
        // 7- Admin sayfasinda "Packages" gorunurlugu dogrulanır
        Assert.assertTrue(adminDashboard.packagesButtonu.isDisplayed());
        extentTest.pass("Packages elementi gorunurlugu test edildi");
        adminDashboard.packagesButtonu.click();
        ReusableMethods.wait(2);
        Assert.assertTrue(adminDashboard.packagesAddNewButonu.isDisplayed());
        extentTest.pass("Add New Butonu görüntülendi");
        adminDashboard.packagesAddNewButonu.click();
        //9-Add Pakage bölümündeki "Name","Slug"kutularına
        // bir text yazılır
        adminDashboard.packageName.sendKeys("Singapur");
        adminDashboard.packageSlug.sendKeys("Tour");
        String dosyaYoluDegisenKisim = System.getProperty("user.home");
        String dosyaYoluHerkesteAyniOlanKisim = "\\Desktop";
        String dosyaYolu = dosyaYoluDegisenKisim + dosyaYoluHerkesteAyniOlanKisim;
        adminDashboard.packagePhoto.sendKeys(dosyaYolu);
        adminDashboard.packageDescription.sendKeys("helloooo");
        adminDashboard.packageShortDescription.sendKeys("fsadas");
        adminDashboard.packageLocation.sendKeys("dsd");
        adminDashboard.packageStartDate.sendKeys("2023/06/08");
        adminDashboard.packageEndDate.sendKeys("2023/06/13");
        adminDashboard.packageLastBookingDate.sendKeys("2023/06/14");
        adminDashboard.packageMap.sendKeys("klfdsaka");
        adminDashboard.packageItinerary.sendKeys("gdfagd");
        adminDashboard.packagePrice.sendKeys("gdsga");
        adminDashboard.packagePolicy.sendKeys("dgaagags");
        adminDashboard.packageTerms.sendKeys("fadffa");
        ReusableMethods.selectByValue(adminDashboard.packageIsFeatured, "Yes");
        ReusableMethods.selectByValue(adminDashboard.packageDestination, "2");
        adminDashboard.packageTitle.sendKeys("gdsgd");
        adminDashboard.packageMetaDescription.sendKeys("sfaas");
        adminDashboard.packageSubmit.click();
        String expectedPackageDogrulama = "Package is added successfully!";
        String actualPackageDogrulama = JSUtilities.getTextWithJS(Driver.getDriver(), adminDashboard.packageDogrulama);
        Assert.assertEquals(expectedPackageDogrulama, actualPackageDogrulama);
    }

}
