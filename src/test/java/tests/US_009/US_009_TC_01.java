package tests.US_009;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserHomepage;
import utilities.*;

public class US_009_TC_01 extends UserTestBaseRapor {


    UserHomepage userHomepage = new UserHomepage();

    @Test
    public void tc_01(){
        //1-Açılan browser https://qa.tripandway.com/adresini yazıp anasayfaya erişilebilmelidir.
        //2-anasayfaya ulaşıldığı doğrulanmalıdır.
        String actualTitle = Driver.getDriver().getTitle();
        String expectedHomePageTitle = ConfigReader.getProperty("expectedHomePageTitle");
        Assert.assertTrue(actualTitle.contains(expectedHomePageTitle));
        //3-sitenin footer bölümüne gitmeliyim.
        JSUtilities.scrollToElement(Driver.getDriver(), userHomepage.addressElementi);
        ReusableMethods.wait(2);


        //4-mail haber grubu(newsletter) kısmındaki Email kutusunun aktifliği test edilir.

        userHomepage.footerEmailElementi.click();
        extentTest=extentReports.createTest("TripandWay anasyfasındaki NewsLetter kutusunun aktiflik testi",
                "NewsLetter kutusu aktif olmalı");







    }




}
