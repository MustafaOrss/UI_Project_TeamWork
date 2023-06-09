package tests.US_029;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboard;
import utilities.AdminTestBaseRapor;
import utilities.ConfigReader;
import utilities.ReusableMethods;

public class US_029_TC_06 extends AdminTestBaseRapor {

    /*
    1-Browser'a gidilir.
    2-https://qa.tripandway.com/admin/login adresine gidilir.
    3-Mail ve Sifre girilir.
    4-Login click yapılır.
    5-Blok Section butonuna tiklanir.
    6-Blogs sayfasina click yapılır.
    7-Eklenen blog satirinda düzenle butonuna basilir
    8-Eklenen blog sayfasinda
    Update butonunun clickable olduğu test edilir
     */
    AdminDashboard adminDashboard = new AdminDashboard();
    @Test
    public void US029TC06 (){
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

        // Eklenen blog satirinda düzenle butonuna basilir
        adminDashboard.addBlogEdit.click();
        ReusableMethods.wait(2);

        // Eklenen blog sayfasinda
        // Update butonunun clickable olduğu test edilir
        adminDashboard.addBlogTitleText.clear();
        adminDashboard.addBlogTitleText.sendKeys(ConfigReader.getProperty("addBlogTitleText"));
        extentTest.info("Add Blog Title yazildi");
        ReusableMethods.wait(2);
        adminDashboard.addBlogContentText.clear();
        adminDashboard.addBlogContentText.sendKeys(ConfigReader.getProperty("addBlogContentText"));
        extentTest.info("Text yazildi");
        ReusableMethods.wait(2);
        adminDashboard.addBlogShortContentText.clear();
        adminDashboard.addBlogShortContentText.sendKeys(ConfigReader.getProperty("addBlogShortContentText"));
        extentTest.info("Text yazildi");
        ReusableMethods.wait(2);
        adminDashboard.addBlogUpdateButonu.click();
        ReusableMethods.wait(2);




    }

}
