package tests.US_029;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QAAdminPage;
import utilities.AdminTestBaseRapor;
import utilities.ConfigReader;
import utilities.Driver;

public class US_029_TC_02 extends AdminTestBaseRapor {

    @Test
    public void US_029_TC_02() throws InterruptedException {
        // 1-Browser'a gidilir.
        // 2-https://qa.tripandway.com/admin/login adresine gidilir.
        extentTest = extentReports.createTest("https://qa.tripandway.com/admin/login testi",
                "admin login yazisi görülmeli");
        // chorme browser'ina framework de utilities icinde driver üzerinden gidilir.

        // https://qa.tripandway.com/admin/login adresine gidilir.
        extentTest.info("Kullanici " + ConfigReader.getProperty("tripAndWayAdminUrl") + " sayfaya gider");

        // 3-Mail ve Sifre girilir.
        QAAdminPage qaAdminPage = new QAAdminPage();
        qaAdminPage.emailKutusu.sendKeys(ConfigReader.getProperty("admin30Email"));
        Thread.sleep(2000);
        qaAdminPage.passwordKutusu.sendKeys(ConfigReader.getProperty("adminPassword"));
        Thread.sleep(2000);

        // 4-Login click yapılır.
        qaAdminPage.AdminLoginButonu.click();
        Thread.sleep(2000);

        // 5-Admin Panel sayfasinin oldugu dogrulanir.
        String actualTitle = Driver.getDriver().getTitle();
        String expectedAdminPanel = ConfigReader.getProperty("expectedAdminPanel");
        Assert.assertTrue(actualTitle.contains(expectedAdminPanel));
        extentTest.pass("istenen" + expectedAdminPanel + "istenen sayfa girisi basarili test gecti");
    }


}
