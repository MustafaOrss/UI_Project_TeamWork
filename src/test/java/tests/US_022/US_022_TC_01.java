package tests.US_022;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserDashboard;
import pages.UserHomepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.UserTestBaseRapor;

public class US_022_TC_01 extends UserTestBaseRapor {
    @Test
    public void TC_01(){

        UserHomepage userHomepage=new UserHomepage();
        extentTest=extentReports.createTest("Tripandway anasayfa testi","Kullanici sayfaya ulasabilmeli");
        // 1- Launch Browser
        // 2- Go to https://qa.tripandway.com/
        //- TestBaseRapor'dan URL giris yapildi
        extentTest.info("Kullanıcı"+ ConfigReader.getProperty("tripAndWayUrl")+"anasayfaya gıder");

        // 3- Anasayfaya erisildigi dogrulanmalidir
        String actualTitle= Driver.getDriver().getTitle();
        String expectedHomePageTitle=ConfigReader.getProperty("expectedHomePageTitle");
        Assert.assertTrue(actualTitle.contains(expectedHomePageTitle));
        extentTest.pass("Belirlenen " + expectedHomePageTitle + " aranacak title arama sonucunda expected icerik oldugu test edildi");









    }

}
