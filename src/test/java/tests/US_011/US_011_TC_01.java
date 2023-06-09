package tests.US_011;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserHomepage;
import utilities.*;
public class US_011_TC_01 extends UserTestBaseRapor {
    UserHomepage userHomepage=new UserHomepage();
    @Test
    public void tc_01(){
        //1-Açılan browser https://qa.tripandway.com/adresini yazıp anasayfaya gidilir.
        extentTest=extentReports.createTest("\"Privacy Policy\" sayfasını görüntüleme testi",
                "Ziyaretçi, sitenin \"Privacy Policy\" sayfasını görüntüleyebilmeli");
        extentTest.info("Ziyaretci "+ConfigReader.getProperty("tripAndWayUrl")+" anasayfasina gider");
        // 2-Sayfa 'Privacy Policy' yazisi görünene dek asagi indirilir
        JSUtilities.scrollToElement(Driver.getDriver(), userHomepage.termsAndConditionElementi);
        ReusableMethods.wait(2);
        extentTest.info("Sayfa 'Privacy Policy' yazisi görünene dek asagi indirilir");
        // 3- Cookies icin Accept'e tiklanir
        userHomepage.cookiesButonu.click();
        extentTest.info("Cookies icin Accept tiklanir");
        // 4- 'Terms and Conditions' bölümüne tıklanilir
        userHomepage.privacyPolicyElementi.click();
        extentTest.info("sitenin \"Privacy Policy\" böümüne tiklanilir");
        // 5- 'Privacy Policy' sayfasinin acildigi dogrulanir
        String actualPrivacyPolicyTitle=Driver.getDriver().getTitle();
        String expectedTermsAndConditionsTitle= ConfigReader.getProperty("expectedPrivacyPolicyTitle");
        Assert.assertTrue(actualPrivacyPolicyTitle.contains(expectedTermsAndConditionsTitle));
        extentTest.pass(actualPrivacyPolicyTitle+" sayfasnin acildigi dogrulandi");
    }
}
