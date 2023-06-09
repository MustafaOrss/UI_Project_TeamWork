package tests.US_009;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserHomepage;
import utilities.*;
public class US_009_TC_01 extends UserTestBaseRapor {
    UserHomepage userHomepage = new UserHomepage();
    @Test
    public void tc_01(){
        //1-Açılan browser https://qa.tripandway.com/adresini yazıp anasayfaya gidilir.
        extentTest=extentReports.createTest("TripandWay anasyfasındaki \"NewsLetter\" kutusunun aktiflik testi",
                "NewsLetter kutusu aktif olmalidir");
        extentTest.info("Ziyaretci "+ConfigReader.getProperty("tripAndWayUrl")+" anasayfasina gider");
        //2-Sayfada Newsletter bölümü görünene dek aşağı inilir
        JSUtilities.scrollToElement(Driver.getDriver(), userHomepage.newsletterEmailKutusu);
        ReusableMethods.wait(2);
        extentTest.info("Sayfa Newsletter bölümü görünene dek aşagi indirilir.");
        //3-mail haber grubu(newsletter) kısmındaki Email kutusunun aktifliği test edilir.
        Assert.assertTrue(userHomepage.footerEmailElementi.isEnabled());
        extentTest.pass("NewsLetter kutusunun aktif oldugu dogrulandi");
    }
}
