package tests.US_010;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserHomepage;
import utilities.*;
public class US_010_TC_01 extends UserTestBaseRapor {
    UserHomepage userHomepage=new UserHomepage();
    @Test
    public void tc_01(){
        //1-Açılan browser https://qa.tripandway.com/adresini yazıp anasayfaya gidilir.
        extentTest=extentReports.createTest("\"Terms and Conditions\" sayfasını görüntüleme testi",
                "Ziyaretçi, sitenin \"Terms and Conditions\" sayfasını görüntüleyebilmeli");
        extentTest.info("Ziyaretci "+ConfigReader.getProperty("tripAndWayUrl")+" anasayfasina gider");
        // 2-Sayfa 'Terms and Conditions' yazisi görünene dek asagi indirilir
        JSUtilities.scrollToElement(Driver.getDriver(), userHomepage.termsAndConditionElementi);
        ReusableMethods.wait(2);
        extentTest.info("Sayfa 'Terms and Conditions' yazisi görünene dek asagi indirilir");
        // 3- Cookies icin Accept'e tiklanir
        userHomepage.cookiesButonu.click();
        extentTest.info("Cookies icin Accept tiklanir");
        // 4- 'Terms and Conditions' bölümüne tıklanilir
        userHomepage.termsAndConditionElementi.click();
        extentTest.info("sitenin \"Terms and Conditions\" böümüne tiklanilir");
        // 5- 'Terms and Conditions' sayfasinin acildigi dogrulanir
        String actualTermsAndConditionsTitle=Driver.getDriver().getTitle();
        String expectedTermsAndConditionsTitle= ConfigReader.getProperty("expectedTermsAndConditionsTitle");
        Assert.assertTrue(actualTermsAndConditionsTitle.contains(expectedTermsAndConditionsTitle));
        extentTest.pass(actualTermsAndConditionsTitle+" sayfasnin acildigi dogrulandi");
    }
}