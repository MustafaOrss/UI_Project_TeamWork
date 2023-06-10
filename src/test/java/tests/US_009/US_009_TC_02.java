package tests.US_009;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserHomepage;
import utilities.*;
public class US_009_TC_02 extends UserTestBaseRapor {
    UserHomepage userHomepage=new UserHomepage();
    @Test
    public void tc_02(){
        // 1-Açılan browser https://qa.tripandway.com/adresini yazıp anasayfaya erişilebilmelidir.
        extentTest = extentReports.createTest("\"Newsletter\" Grubuna Katilma Testi",
                "Ziyaretci \"Newsletter\" Grubuna Katilabilmelidir");
        extentTest.info("Ziyaretci "+ConfigReader.getProperty("tripAndWayUrl")+" anasayfasina gider");
        //2-sitenin footer bölümüne gitmeliyim.
        JSUtilities.scrollToElement(Driver.getDriver(), userHomepage.addressElementi);
        ReusableMethods.wait(2);
        extentTest.info("Footer bölümüne gidildi");
        //3-mail haber grubu(newsletter) kısmındaki Email kutusuna geçerli bir email adresi yazılır.
        userHomepage.newsletterEmailKutusu.sendKeys("dfga8567@gmail.com");
        extentTest.info("Gecerli bir email adresi girildi");
        //4- "Submit" butonuna tıklanır
        userHomepage.newsletterEmailKutusu.submit();
        extentTest.info("Submit'e tiklandi");
        // 5- "To activite your subscription please check your email and follow instruction there." yazısının göründüğü doğrulanır.
        Assert.assertTrue(userHomepage.toActivatePencereElementi.isDisplayed());
        extentTest.pass("\"To activite your subscription please check your email and follow instruction there.\" " +
                "yazisinin gorundugu doğrulandı");
        Driver.getDriver().get("https://accounts.google.com/AccountChooser/signinchooser?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&flowName=GlifWebSignIn&flowEntry=AccountChooser");
        extentTest.info("Gmail sayfasina gidildi");
        userHomepage.gmailEmail.sendKeys("dfga8567@gmail.com");
        extentTest.info("Gmail sayfasinda email yazildi");
        userHomepage.ileri.click();
        ReusableMethods.wait(4);
        userHomepage.gmailSifre.sendKeys("Yes_12345");
        extentTest.info("Gmail sayfasinda sifre yazildi");
        userHomepage.ileri.click();
        Assert.assertTrue(userHomepage.gmailLogosu.isDisplayed());
        extentTest.pass("Gmail sayfasina ulasildi");
        userHomepage.gmailSearchKutusu.sendKeys("Tripandway");
        userHomepage.gmailSearchKutusu.submit();
        extentTest.info("Arama kutusuna Tripandway yazildi ve enter'a basildi");
        ReusableMethods.wait(1);
        String actualMail = userHomepage.tripandwayMail.getText();
        String expectedMail = "Tripandway";

        Assert.assertEquals(expectedMail,actualMail);
        extentTest.info("Tripandway maili dogrulandi");



    }
}