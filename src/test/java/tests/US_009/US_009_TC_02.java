package tests.US_009;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserHomepage;
import utilities.*;
public class US_009_TC_02 extends UserTestBaseRapor {
    UserHomepage userHomepage=new UserHomepage();
    @Test
    public void tc_01(){
        // 1-Açılan browser https://qa.tripandway.com/adresini yazıp anasayfaya erişilebilmelidir.
        extentTest = extentReports.createTest("\"Newsletter\" Grubuna Katilma Testi",
                "Ziyaretci \"Newsletter\" Grubuna Katilabilmelidir");
        extentTest.info("Ziyaretci "+ConfigReader.getProperty("tripAndWayUrl")+" anasayfasina gider");
        //2-sitenin footer bölümüne gitmeliyim.
        JSUtilities.scrollToElement(Driver.getDriver(), userHomepage.addressElementi);
        ReusableMethods.wait(2);
        extentTest.info("Footer bölümüne gidildi");
        //3-mail haber grubu(newsletter) kısmındaki Email kutusuna geçerli bir email adresi yazılır.
        userHomepage.newsletterEmailKutusu.sendKeys("nazli1@gmail.net");
        extentTest.info("Gecerli bir email adresi girildi");
        //4- "Submit" butonuna tıklanır
        userHomepage.newsletterEmailKutusu.submit();
        extentTest.info("Submit'e tiklandi");
        // 5- "To activite your subscription please check your email and follow instruction there." yazısının göründüğü doğrulanır.
        Assert.assertTrue(userHomepage.toActivatePencereElementi.isDisplayed());
        extentTest.pass("\"To activite your subscription please check your email and follow instruction there.\" " +
                "yazisinin gorundugu doğrulandı");
    }
}