package tests.US_003;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserHomepage;
import utilities.*;

public class US_003_TC_02 extends UserTestBaseRapor {
    //DESTINATION kısmındaki Bangkok, Greenville, Argentina, Morocco, Italy, Turkey
    // Fonksiyonlarının varlığının ve aktifliğinin kontrolü.
    UserHomepage userHomepage = new UserHomepage();
    @Test
    public void tc_01(){
        extentTest=extentReports.createTest("Homepage Destinations butonları testi",
                "İlgili kullanıcı Bangkok, Greenville, Argentina, Morocco, Italy, Turkey" +
                        " Fonksiyonlarının varlığını kontrol edebilmeli ");
        userHomepage.cookiesButonu.click();
        extentTest.info("Kullanici " + ConfigReader.getProperty("tripAndWayUrl") + " sayfaya gider");
        //anasayfa kontrol
        String actualTitle = Driver.getDriver().getTitle();
        String expectedHomePageTitle = ConfigReader.getProperty("expectedHomePageTitle");
        Assert.assertTrue(actualTitle.contains(expectedHomePageTitle));
        extentTest.pass("Belirlenen " + expectedHomePageTitle + " aranacak title arama sonucunda expected icerik oldugu test edildi");


//Bangkok
        JSUtilities.scrollToElement(Driver.getDriver(), userHomepage.bangkokThailandElementi);
        ReusableMethods.waitForVisibility(userHomepage.bangkokThailandElementi,2);
        userHomepage.bangkokThailandElementi.click();
        String Bangkokexurl = "https://qa.tripandway.com/destination/bangkok-thailand";
        String Bangkokacurl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(Bangkokexurl.contains(Bangkokacurl));
        extentTest.pass("Bangkok gorunurlugu dogrulandi");
        Driver.getDriver().navigate().back();
        ReusableMethods.wait(2);

//Greenville
        JSUtilities.scrollToElement(Driver.getDriver(), userHomepage.greenVilleElementi);
        ReusableMethods.waitForVisibility(userHomepage.greenVilleElementi,2);
        userHomepage.greenVilleElementi.click();
        String greenVilleElementiexurl = "https://qa.tripandway.com/destination/greenville-south-carolina";
        String greenVilleElementiacurl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(Bangkokexurl.contains(Bangkokacurl));
        extentTest.pass("greenVilleElementi gorunurlugu dogrulandi");
        Driver.getDriver().navigate().back();
        ReusableMethods.wait(2);

//Argentina
        JSUtilities.scrollToElement(Driver.getDriver(), userHomepage.buenosAiresElementi);
        ReusableMethods.waitForVisibility(userHomepage.buenosAiresElementi,2);
        userHomepage.buenosAiresElementi.click();
        String buenosAiresElementiexurl = "https://qa.tripandway.com/destination/buenos-aires-argentina";
        String buenosAiresElementiacurl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(buenosAiresElementiexurl.contains(buenosAiresElementiacurl));
        extentTest.pass("Argentina gorunurlugu dogrulandi");
        Driver.getDriver().navigate().back();
        ReusableMethods.wait(2);

//Morocco
        JSUtilities.scrollToElement(Driver.getDriver(), userHomepage.marrakeshElementi);
        ReusableMethods.waitForVisibility(userHomepage.marrakeshElementi,2);
        userHomepage.marrakeshElementi.click();
        String marrakeshElementiexurl = "https://qa.tripandway.com/destination/marrakesh-morocco";
        String marrakeshElementiacurl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(buenosAiresElementiexurl.contains(buenosAiresElementiacurl));
        extentTest.pass("Morocco gorunurlugu dogrulandi");
        Driver.getDriver().navigate().back();
        ReusableMethods.wait(2);

//Italy
        JSUtilities.scrollToElement(Driver.getDriver(), userHomepage.salinaIslandElementi);
        ReusableMethods.waitForVisibility(userHomepage.salinaIslandElementi,2);
        userHomepage.salinaIslandElementi.click();
        String Italyexurl = "https://qa.tripandway.com/destination/salina-island-italy";
        String Italyacurl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(Italyexurl.contains(Italyacurl));
        extentTest.pass("Italy gorunurlugu dogrulandi");
        Driver.getDriver().navigate().back();
        ReusableMethods.wait(2);

//Turkey
        JSUtilities.scrollToElement(Driver.getDriver(), userHomepage.ıstanbulElementi);
        ReusableMethods.waitForVisibility(userHomepage.ıstanbulElementi,2);
        userHomepage.ıstanbulElementi.click();
        String Turkeyexurl = "https://qa.tripandway.com/destination/istanbul";
        String Turkeyacurl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(Turkeyexurl.contains(Turkeyacurl));
        extentTest.pass("Turkey gorunurlugu dogrulandi");
        Driver.getDriver().navigate().back();
        ReusableMethods.wait(2);
    }

}
/*
  //Bangkok butonu
    @FindBy(xpath ="(//div[@class='portfolio-text'])[1]  ")
    public WebElement Bangkok;

    //Greenville  butonu
    @FindBy(xpath ="(//div[@class='portfolio-text'])[2]  ")
    public WebElement Greenville;

    //Argentina butonu
    @FindBy(xpath ="(//div[@class='portfolio-text'])[3]  ")
    public WebElement Argentina;

    //Morocco butonu
    @FindBy(xpath ="(//div[@class='portfolio-text'])[4]  ")
    public WebElement Morocco;

    //Italy butonu
    @FindBy(xpath ="(//div[@class='portfolio-text'])[5]  ")
    public WebElement Italy;

    //Turkey butonu
    @FindBy(xpath ="(//div[@class='portfolio-text'])[6]  ")
    public WebElement Turkey;
 */