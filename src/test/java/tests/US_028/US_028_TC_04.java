package tests.US_028;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboard;
import utilities.*;

import java.util.List;

public class US_028_TC_04 extends AdminTestBaseRapor {
    AdminDashboard adminDashboard = new AdminDashboard();

    @Test
    public void tc_04() {
        extentTest = extentReports.createTest("Tripandway admin Categories testi",
                "Admin Categories ekleme,duzenleme ve silme yapabilmeli");
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

        // 6- Acilan sayfa test edilir
        Assert.assertTrue(adminDashboard.dashboardLocate.isDisplayed());
        extentTest.pass("Admin Dashboard sayfasi dogrulandi");

        // 7- Blog Section goruntulenir ve tiklanir
        Assert.assertTrue(adminDashboard.blogSectionButonu.isDisplayed());
        extentTest.pass("Blog Section gorunurlugu dogrulandi");

        adminDashboard.blogSectionButonu.click();
        extentTest.info("Blog Section tiklandi");

        //  8- Categories goruntulenir ve tiklanir
        Assert.assertTrue(adminDashboard.blogSectionCategoriesLinki.isDisplayed());
        extentTest.pass("Castegories gorunurlugu dogrulandi");


        adminDashboard.blogSectionCategoriesLinki.click();
        extentTest.info("Categories tiklandi");
        ReusableMethods.wait(2);

        Assert.assertTrue(adminDashboard.viewCategoriesElementi.isDisplayed());
        extentTest.pass("View Categories elementi goruldu");

        // 9- Categories sayfasinin sag ust kosesinde "+Add New" tiklanir ve dogrulanir
        adminDashboard.categoriesAddNewLinki.click();
        extentTest.info("Add New linkine tiklandi");
        ReusableMethods.wait(2);

        Assert.assertTrue(adminDashboard.categoriesAddCategoryElementi.isDisplayed());
        extentTest.pass("Add Category elementi dogrulandi");

        // 10- Add Category bolumundeki "Category Name", "Category Slug" kutularina bir text yazilir
        adminDashboard.categoriesAddCategoryCategoryName.sendKeys(ConfigReader.getProperty("categoryName"));
        extentTest.info("Add Category'de Category Name yazildi");
        adminDashboard.categoriesAddCategoryCategorySlug.sendKeys(ConfigReader.getProperty("categorySlug"));
        extentTest.info("Add Category'de Category Slug yazildi");

        // 11- SEO Information bolumundeki "Title", "Meta Description" kutularina bir text yazilir
        adminDashboard.categoriesSEOInformationTitle.sendKeys(ConfigReader.getProperty("categoryTitle"));
        extentTest.info("Add Category'de Title yazildi");
        adminDashboard.categoriesSEOMetaDescription.sendKeys(ConfigReader.getProperty("categoryMetaDescription"));

        // 12- Submit butonuna tiklanir
        adminDashboard.categoriesSubmitButonu.click();
        ReusableMethods.wait(5);
        extentTest.info("Categories Submit Butonu tiklandi");

        // 13- Eklendigi dogrulanir
        String actualCategoriesYukleme = JSUtilities.getTextWithJS(Driver.getDriver(), adminDashboard.categoriesDogrulama);
        String expectedCategoriesYukleme = "\n" +
                "        toastr.success('Category is added successfully!');\n" +
                "    ";
        Assert.assertEquals(expectedCategoriesYukleme, actualCategoriesYukleme);
        extentTest.pass("Categories yukleme dogrulandi");

        // 14-Duzenlebilir oldugu dogrulanir
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

        // 15- Silinebilir oldugu dogrulanir
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

    }

    public WebElement duzenlenmeLinki(String satir) {
        String degiskenXpath = "//tbody/tr[" + satir + "]/td[4]/a[1]/i[1]";
        WebElement sonEklenenDuzenleme = Driver.getDriver().findElement(By.xpath(degiskenXpath));
        return sonEklenenDuzenleme;
    }

    public WebElement silmeLinki(String satir) {
        String degiskenXpath = "//tbody/tr[" + satir + "]/td[4]/a[2]/i[1]";
        WebElement sonEklenenSilme = Driver.getDriver().findElement(By.xpath(degiskenXpath));
        return sonEklenenSilme;
    }

}
