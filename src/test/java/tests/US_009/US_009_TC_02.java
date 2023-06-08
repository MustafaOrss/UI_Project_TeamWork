package tests.US_009;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserHomepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.UserTestBaseRapor;

public class US_009_TC_02 extends UserTestBaseRapor {
    UserHomepage userHomepage=new UserHomepage();
    @Test
    public void tc_01(){
        // 1-Açılan browser https://qa.tripandway.com/adresini yazıp anasayfaya erişilebilmelidir.
        extentTest.info("https://qa.tripandway.com/" +"anasayfasına girildi");

        String actualtitle= Driver.getDriver().getTitle();
        String expecHomePageTitle= ConfigReader.getProperty(" expecHomePageTitle");
        Assert.assertTrue(actualtitle.contains(expecHomePageTitle));
        //2-sitenin footer bölümüne gitmeliyim.
        userHomepage.footerAdresElementi.click();
        extentTest.info("footer bölümüne gidildi");
        //3-mail haber grubu(newsletter) kısmındaki Email kutusuna geçerli bir email adresi yazılır.
        userHomepage.footerEmailElementi.sendKeys("naz@.net");
        extentTest.pass("FAİLED");
        //4- "Submit" butonuna tıklanır
        userHomepage.footerEmailElementi.submit();
        extentTest.info("footerEmailElementine click yapıldı");
        // 5- "To activite your subscription please check your email and follow instruction there." yazısının göründüğü doğrulanır.
        userHomepage.footerEmailElementi.isDisplayed();
        String expectdTitle="To activite your subscription please check your email and follow instruction there";
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertTrue(actualtitle.contains(expectdTitle));
        extentTest.pass("yazının görünürlüğü doğrulandı");
    }
}
