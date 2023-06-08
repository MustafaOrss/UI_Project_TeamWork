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
        /*
        // Categories sayfasinin sag ust kosesinde "+Add New" tiklanir ve dogrulanir
        adminDashboard.blogsAddNewLinki.click();
        extentTest.info("Add New linkine tiklandi");
        ReusableMethods.wait(2);

        Assert.assertTrue(adminDashboard.categoriesAddCategoryElementi.isDisplayed());
        extentTest.pass("Add Category elementi dogrulandi");

        // Add Category bolumundeki "Category Name", "Category Slug" kutularina bir text yazilir
        adminDashboard.categoriesAddCategoryCategoryName.sendKeys(ConfigReader.getProperty("categoryName"));
        extentTest.info("Add Category'de Category Name yazildi");
        adminDashboard.categoriesAddCategoryCategorySlug.sendKeys(ConfigReader.getProperty("categorySlug"));
        extentTest.info("Add Category'de Category Slug yazildi");

        // SEO Information bolumundeki "Title", "Meta Description" kutularina bir text yazilir
        adminDashboard.categoriesSEOInformationTitle.sendKeys(ConfigReader.getProperty("categoryTitle"));
        extentTest.info("Add Category'de Title yazildi");
        adminDashboard.categoriesSEOMetaDescription.sendKeys(ConfigReader.getProperty("categoryMetaDescription"));

        // Submit butonuna tiklanir
        adminDashboard.categoriesSubmitButonu.click();
        ReusableMethods.wait(5);
        extentTest.info("Categories Submit Butonu tiklandi");

        // Eklendigi dogrulanir
        String actualCategoriesYukleme = JSUtilities.getTextWithJS(Driver.getDriver(), adminDashboard.categoriesDogrulama);
        String expectedCategoriesYukleme = "\n" +
                "        toastr.success('Category is added successfully!');\n" +
                "    ";
        Assert.assertEquals(expectedCategoriesYukleme, actualCategoriesYukleme);
        extentTest.pass("Categories yukleme dogrulandi");

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

        // Silinebilir oldugu dogrulanir
        silmeLinki(satir).click();
        extentTest.info("Silme butonuna tiklandi");

        Driver.getDriver().switchTo().alert().accept();
        extentTest.info("Alert accept tiklandi");

        String actualCategoriesSilme = JSUtilities.getTextWithJS(Driver.getDriver(), adminDashboard.categoriesDogrulama);
        String expectedCategoriesSilme = "\n" +
                "        toastr.success('Category is deleted successfully!');\n" +
                "    ";
        Assert.assertEquals(expectedCategoriesSilme, actualCategoriesSilme);
        extentTest.pass("Categories silme dogrulandi");

         */

    }
}
