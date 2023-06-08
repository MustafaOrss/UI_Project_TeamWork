package tests.US_024;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.UserTestBaseRapor;

public class US_024_TC_01 extends UserTestBaseRapor {


    UserDashboard userDashboard=new UserDashboard();
    @Test
    public void TC_01(){

        //1-launch browser
        //2-Go to https://qa.tripandway.com/traveller/login
        extentTest=extentReports.createTest("Tripandway anasayfa testi","Kullanıcı ana sayfaya ulasabılmelı");

        //3-Email kısmına ilgili data yazılır
        userDashboard.emailAddressButonu.sendKeys(ConfigReader.getProperty("userEmail"));
        //4-Password kısmına ilgili data yazılır
        userDashboard.passwordButonu.sendKeys(ConfigReader.getProperty("userPassword"));
        //5-Login butonuna tıklanır//
        userDashboard.loginButonu.click();
        extentTest.info("kullanıcı anasayfaya erişim sagladı");















    }
}
