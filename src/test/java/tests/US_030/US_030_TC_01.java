package tests.US_030;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.AdminTestBaseRapor;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_030_TC_01 extends AdminTestBaseRapor {
    /*
    1-Browser'a gidilir.
    2-https://qa.tripandway.com/admin/login adresine gidilir.
    3-Anasayfaya ulasildigi dogrulanir
     */
    @Test
    public void US30TC01() {
        extentTest = extentReports.createTest("https://qa.tripandway.com/admin/login testi",
                "admin login yazisi görülmeli");
        // chorme browser'ina framework de utilities icinde driver üzerinden gidilir.
        // https://qa.tripandway.com/admin/login adresine gidilir.
        extentTest.info("Kullanici " + ConfigReader.getProperty("tripAndWayAdminUrl") + " sayfaya gider");

        ReusableMethods.wait(1);
        // Anasayfaya ulasildigi dogrulanir
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = ConfigReader.getProperty("expectedTitle");
        Assert.assertTrue(actualTitle.contains(expectedTitle));
        extentTest.pass("istenen" + expectedTitle + "istenen sayfa girisi basarili test gecti");
        ReusableMethods.wait(1);

    }
}
