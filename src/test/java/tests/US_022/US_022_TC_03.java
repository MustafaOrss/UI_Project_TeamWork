package tests.US_022;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.UserDashboard;
import pages.UserHomepage;
import utilities.*;

public class US_022_TC_03 extends UserTestBaseRapor {
    UserDashboard userDashboard=new UserDashboard();
    UserHomepage userHomepage =new UserHomepage();
    @Test
    public void TC_03(){
        //1-launch browser
        //2-Go to https://qa.tripandway.com/traveller/login
        extentTest=extentReports.createTest("Forget password testi ","Kullanıcı şifresini yenileyebilmeli");
        userDashboard.cookiesButonu.click();
        userDashboard.ilkLoginButonu.click();
        //3-Email kısmına ilgili data yazılır
        userDashboard.emailAddressButonu.sendKeys(ConfigReader.getProperty("userEmail"));
        //4-Password kısmına ilgili data yazılır
        userDashboard.passwordButonu.sendKeys(ConfigReader.getProperty("userPassword"));
        //5-Login butonuna tıklanır
        userDashboard.loginButonu.click();
        extentTest.info("kullanıcı anasayfaya giriş sagladı");
        ReusableMethods.wait(2);

        //6-logout sayfadan çıkış yapılır
        userDashboard.logoutButonu.click();
        extentTest.info("kullanıcı anasayfadan cıktı");
        //-"Forget Password" butonun gorunurlugu dogrulanmalı
        Assert.assertTrue(userHomepage.forgetPasswordButonu.isDisplayed());
        extentTest.info("'Forget Password'butonu goruldu");
        //6-"Forget Password" butonuna tıklanmalı
        userHomepage.forgetPasswordButonu.click();
        extentTest.info("Forget Password butonuna tıklandı");
        //7-Email Address 'ın textbox 'ına mail adresi girilmeli
        userHomepage.emailAdressReset.sendKeys(ConfigReader.getProperty("userEmail"));
        extentTest.info("Sıfreyi resetlemek ıcın email adresi girildi");
        //8-"Submit" butonu gorunur oldugu dogrulanmalı
        ReusableMethods.wait(2);
        Assert.assertTrue(userHomepage.submitButonuReset.isDisplayed());
        extentTest.info("Submit butonu görüldü");
        //9-"Submit" butonuna tıklanmalı
        userHomepage.submitButonuReset.click();
        extentTest.info("Submit butonuna tıklandı");
        //10-"Please check your email to get password reset
        //information" yazısının gorunurlugu test edılmelı//

        //10-"Please check your email to get password reset
        //information" yazısının gorunurlugu test edılmelı//
        String expectedforgtto="Please check your email to get password reset information";
        String actualforgetto= JSUtilities.getTextWithJS(Driver.getDriver(),userHomepage.maileYeniSıfreGondermeTexti);
        Assert.assertEquals(expectedforgtto,actualforgetto);

        extentTest.pass("Please check your email to get password reset information yazısı goruldu,sıfrenız yenılendı");
    }

















    }

