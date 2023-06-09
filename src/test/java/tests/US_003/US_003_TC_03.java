package tests.US_003;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserHomepage;
import utilities.*;

public class US_003_TC_03 extends UserTestBaseRapor {
    UserHomepage userHomepage = new UserHomepage();
    @Test
    public void tc_03(){
        extentTest=extentReports.createTest("Homepage Body Bölümü Testi",
                "İlgili kullanıcı body bölümündeki Explore the word , Salina Island , The word is so beautiful" +
                        "kısmındaki READ MORE butonuna tıklayabilmeli");
        //userHomepage.cookiesButonu.click();
        extentTest.info("Kullanici " + ConfigReader.getProperty("tripAndWayUrl") + " sayfaya gider");
        //anasayfa kontrol
        String actualTitle = Driver.getDriver().getTitle();
        String expectedHomePageTitle = ConfigReader.getProperty("expectedHomePageTitle");
        Assert.assertTrue(actualTitle.contains(expectedHomePageTitle));
        extentTest.pass("Belirlenen " + expectedHomePageTitle + " aranacak title arama sonucunda expected icerik oldugu test edildi");
/*
----------------------------!!!!!!!!!!!!!BUG!!!!!!!!!!!-----------------------------
//EXPLORE_THE_WORD SAYFASINA GELİNDİĞİNDEN EMİN OLUNMALI
        ReusableMethods.waitForVisibility(userHomepage.EXPLORE_THE_WORD,15);
//EXPLORE_THE_WORD SAYFASINDA READ MORE TIKLANMALI
        userHomepage.READ_MORE_EXPLORE.click();
        String READ_MOREexurl = "https://tripandway.com/package/3-days-in-bangkok";
        String READ_MOREacurl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(READ_MOREexurl.contains(READ_MOREacurl));
        extentTest.pass("EXPLORE THE WORLD kısmı READ MORE butonuna tıklandığı onaylandı");
        Driver.getDriver().navigate().back();
        ReusableMethods.wait(2);
------------------------!!!!!!!!!!BUG!!!!!!!!!!!!!!!!------------------------------------
*/


//WORD_IS_BEAUTIFUL SAYFASINA GELİNDİĞİNDEN EMİN OLUNMALI
        userHomepage.SAG_TIK.click();
        ReusableMethods.waitForVisibility(userHomepage.WORD_IS_BEAUTIFUL,20);
//WORD_IS_BEAUTIFUL SAYFASINDA READ MORE TIKLANMALI
        userHomepage.READ_MORE_WORD.click();
        String WORD_IS_BEAUTIFULexurl = "https://tripandway.com/package/7-days-in-istanbul";
        String WORD_IS_BEAUTIFULacurl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(WORD_IS_BEAUTIFULexurl.contains(WORD_IS_BEAUTIFULacurl));
        extentTest.pass("WORD_IS BEAUTIFUL kısmı READ MORE butonuna tıklandığı onaylandı");
        Driver.getDriver().navigate().back();
        ReusableMethods.wait(2);



//SALINA_ISLAND SAYFASINA GELİNDİĞİNDEN EMİN OLUNMALI
        userHomepage.SAG_TIK.click();
        ReusableMethods.waitForVisibility(userHomepage.WORD_IS_BEAUTIFUL,15);
        userHomepage.SAG_TIK.click();
        ReusableMethods.waitForVisibility(userHomepage.READ_MORE_SALINA,30);
//SALINA_ISLAND SAYFASINDA READ MORE TIKLANMALI
        userHomepage.READ_MORE_SALINA.click();
        String SALINA_ISLANDexurl = "https://tripandway.com/package/7-days-in-salina-island";
        String SALINA_ISLANDacurl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(SALINA_ISLANDexurl.contains(SALINA_ISLANDacurl));
        extentTest.pass("SALINA ISLAND kısmı READ MORE butonuna tıklandığı onaylandı");





    }}
