package tests.US_029;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboard;
import utilities.*;

import java.util.List;

public class US_029_TC_05  extends AdminTestBaseRapor{
    /*
    1-Browser'a gidilir.
    2-https://qa.tripandway.com/admin/login adresine gidilir.
    3-Mail ve Sifre girilir.
    4-Login click yapılır.
    5-Blok Section butonuna tiklanir.
    6-Blogs sayfasina click yapılır.
    7-Blogs sayfasinin sag ust kosesinde "+Add New" click yapilir.
    8-yeni sayfanin acildigi gorulur.
    9-ilgili bolumler doldurularak blog yazisinin eklendigi gorulur
     */
    AdminDashboard adminDashboard = new AdminDashboard();
    @Test
    public void US029TC05 () {


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

        // blogs sayfasinin sag ust kosesinde "+Add New" tiklanir ve dogrulanir
        adminDashboard.blogsAddNewButonu.click();
        extentTest.info("Add New linkine tiklandi");
        ReusableMethods.wait(2);

        Assert.assertTrue(adminDashboard.blogsAddNewButonu.isDisplayed());
        extentTest.pass("Add  elementi dogrulandi");

        // Add Blog bolumundeki "blog Title", "Blog Content ", "Blog Short Content", "Blog Photo" kutularina bir text yazilir
        adminDashboard.addBlogTitleText.sendKeys(ConfigReader.getProperty("addBlogTitleText"));
        extentTest.info("Add Blog Title yazildi");
        ReusableMethods.wait(2);
        adminDashboard.addBlogContentText.sendKeys(ConfigReader.getProperty("addBlogContentText"));
        extentTest.info("Text yazildi");
        ReusableMethods.wait(2);
        adminDashboard.addBlogShortContentText.sendKeys(ConfigReader.getProperty("addBlogShortContentText"));
        extentTest.info("Text yazildi");
        ReusableMethods.wait(2);
        adminDashboard.addBlogDosyaSecimi.sendKeys(ConfigReader.getProperty("addBlogDosyaSecimi"));
        extentTest.info("foto yüklendi");
        ReusableMethods.wait(5);
        // Submit butonuna tiklanir
        adminDashboard.AddBlogSubmitButonu.click();
        ReusableMethods.wait(5);
        extentTest.info(" Blog Submit Butonu tiklandi");
/*
        // Eklendigi dogrulanir
        String actualBlogYukleme = JSUtilities.getTextWithJS(Driver.getDriver(), adminDashboard.accessSuccessfullyAlert);
        String expectedBlogYukleme = " " +
                "        toastr.success('Category is added successfully!'); " +
                "    ";
        Assert.assertEquals(expectedBlogYukleme, actualBlogYukleme);
        extentTest.pass("Blog yukleme dogrulandi");
/*
        // Duzenlebilir oldugu dogrulanir
        WebElement table = Driver.getDriver().findElement(By.tagName("table"));
        List<WebElement> rows = table.findElements(By.tagName("tr"));
        WebElement lastRow = rows.get(rows.size() - 1);
        String satir = lastRow.getText().replaceAll("\\D", "");
        duzenlenmeLinki(satir).click();
        extentTest.info("Duzenlenme linkine tiklandi");
        adminDashboard.categoriesAddCategoryCategoryName.clear();
        extentTest.info("Category Name silindi");
        adminDashboard.categoriesAddCategoryCategoryName.sendKeys(ConfigReader.getProperty("categoryDuzenlemeName"));
        extentTest.info("Category Name'a yeni yazi yazildi");

        adminDashboard.categoriesSubmitButonu.click();
        extentTest.info("Submit butonuna tiklandi");

        String actualCategoriesDuzenleme = JSUtilities.getTextWithJS(Driver.getDriver(), adminDashboard.categoriesDogrulama);
        String expectedCategorisDuzenleme = "\n" +
                "        toastr.success('Category is updated successfully!');\n" +
                "    ";
        Assert.assertEquals(expectedCategorisDuzenleme, actualCategoriesDuzenleme);
        extentTest.pass("Categories duzenleme dogrulandi");



         */

    }
}
