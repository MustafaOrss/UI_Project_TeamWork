package tests.US_023;

import org.testng.annotations.Test;
import pages.UserDashboard;
import utilities.ConfigReader;
import utilities.UserTestBaseRapor;

public class US_023_TC_01 extends UserTestBaseRapor {
    UserDashboard userDashboard =new UserDashboard();
    @Test
    public void TC_01(){

       //1-launch browser
        //2-Go to https://qa.tripandway.com/traveller/login
        extentTest=extentReports.createTest("Tripandway anasayfa testi","Kullanici sayfaya ulasabilmeli");
        userDashboard.cookiesButonu.click();
        userDashboard.loginButonu.click();
        //3-Email kısmına ilgili data yazılır
         userDashboard.emailAddressButonu.sendKeys(ConfigReader.getProperty("userEmail"));
        //4-Password kısmına ilgili data yazılır
        userDashboard.passwordButonu.sendKeys(ConfigReader.getProperty("userPassword"));
        //5-Login butonuna tıklanır//
        userDashboard.loginButonu.click();
        extentTest.info("kullanıcı login olup anasayfaya ulastı");


















    }

}
