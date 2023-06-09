package tests.US_029;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboard;
import utilities.*;

public class US_029_TC_07 extends AdminTestBaseRapor {
    /*
    1-Browser'a gidilir.
    2-https://qa.tripandway.com/admin/login adresine gidilir.
    3-Mail ve Sifre girilir.
    4-Login click yapılır.
    5-Blok Section butonuna tiklanir.
    6-Blogs sayfasina click yapılır.
    7-Eklenen blog satirinda sil butonuna basilir
    8-Eklenen blog yazisinin silinebildigi dogrulanir.
     */
    AdminDashboard adminDashboard = new AdminDashboard();
    @Test
    public void US029TC07(){
        // raporlama yapılacaginda, case calismasi öncesinde rapor objesi olusturulur extend edilerek methot cekilir
        extentTest = extentReports.createTest("https://qa.tripandway.com/admin/login testi",
                "admin login yazisi görülmeli");
        // chorme browser'ina framework de utilities icinde driver üzerinden gidilir.

        // https://qa.tripandway.com/admin/login adresine gidilir.
        extentTest.info("Kullanici " + ConfigReader.getProperty("tripAndWayAdminUrl") + " sayfaya gider");

        // Mail ve Sifre girilir.
        adminDashboard.adminEmailKutusu.sendKeys(ConfigReader.getProperty("admin30Email"));
        adminDashboard.adminPasswordKutusu.sendKeys(ConfigReader.getProperty("adminPassword"));
        ReusableMethods.wait(2);
        adminDashboard.adminLoginButonu.click();
        ReusableMethods.wait(2);

        //Blok Section butonuna tiklanir.
        adminDashboard.blogSectionButonu.click();
        ReusableMethods.wait(2);

        // Blogs sayfasina click yapılır.
        adminDashboard.blogsButonu.click();
        ReusableMethods.wait(2);

        Assert.assertTrue(adminDashboard.blogsWebElementi.isDisplayed());
        extentTest.pass("istenen" + adminDashboard.blogsWebElementi + "istenen sayfa girisi basarili test gecti");

        // Eklenen blog satirinda sil butonuna basilir
        adminDashboard.blogDeleteButonu.click();
        ReusableMethods.wait(3);


/*
        // Eklenen blog yazisinin silinebildigi dogrulanir.
        // Silinebilir oldugu dogrulanir
        extentTest.info("Silme butonuna tiklandi");

        Driver.getDriver().switchTo().alert().accept();
        extentTest.info("Alert accept tiklandi");

        String actualBlogSilme = JSUtilities.getTextWithJS(Driver.getDriver(), adminDashboard.BlogDogrulama);
        String expectedBlogSilme = "\n" +
                "        toastr.success('Blog is deleted successfully!');\n" +
                "    ";
        Assert.assertEquals(expectedBlogSilme, actualBlogSilme);
        extentTest.pass("Blog silme dogrulandi");

 */


    }
}
