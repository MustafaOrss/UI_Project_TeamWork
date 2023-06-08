package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class UserHomepage {
    public UserHomepage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
  
    // Cookies butonu
    @FindBy(className = "wpcc-btn")
    public WebElement cookiesButonu;

    // Footer >> Recent Posts Elementi
    @FindBy(xpath = "//h3[text()='Recent Posts']")
    public WebElement recentPostsElementi;

    // Footer >> Recent Posts >> ogeLink >> Search Here
    @FindBy(name = "search_string")
    public WebElement searchKutusu;

    // Footer >> Facebok Linki
    @FindBy(xpath = "//div[@class='col-md-3 col-sm-6 wow fadeInRight']//li[1]//a[1]")
    public WebElement facebookLinki;

    // Footer >> Facebook Linki >> Email
    @FindBy(id = "email")
    public WebElement facebookEmailButonu;


    // Footer >> Twitter Linki
    @FindBy(xpath = "//div[@class='col-md-3 col-sm-6 wow fadeInRight']//li[2]//a[1]")
    public WebElement twitterLinki;

    // Footer >> Linkedin Linki
    @FindBy(xpath = "//div[@class='col-md-3 col-sm-6 wow fadeInRight']//li[3]//a[1]")
    public WebElement linkedinLinki;

    // Footer >> Linkedin Linki >> Email
    @FindBy(id = "session_key")
    public WebElement linkedinEmailButonu;

    // Footer >> Pinterest Linki
    @FindBy(xpath = "//div[@class='col-md-3 col-sm-6 wow fadeInRight']//li[4]//a[1]")
    public WebElement pinterestLinki;

    // Footer >> Pinterest Linki >> Pinterest Logosu
    @FindBy(xpath = "//h1[@class='lH1 dyH iFc H2s bwj c8S zDA']")
    public WebElement pinterestLogosu;

    // Footer >> Instagram Linki
    @FindBy(xpath = "//div[@class='col-md-3 col-sm-6 wow fadeInRight']//li[5]//a[1]")
    public WebElement instagramLinki;

    // Footer >> Instagram Linki >> Email
    @FindBy(xpath = "(//input[@autocorrect='off'])[1]")
    public WebElement instagramEmailButonu;

    // Footer >> Address
    @FindBy(xpath = "//h3[normalize-space()='Address']")
    public WebElement addressElementi;

    // Footer >> Adres
    @FindBy(xpath = "//div[@class='text']//p[text()='34, Edd Lane, NYC, 22335']")
    public WebElement footerAdresElementi;

    // Footer >> Telefon
    @FindBy(xpath = "//div[@class='text']//p[text()='202-456-3789']")
    public WebElement footerTelefonElementi;

    // Footer >> Email
    @FindBy(xpath = "//div[@class='text']//p[text()='info@tripandway.com']")
    public WebElement footerEmailElementi;

    // userhomepage >> services
    @FindBy(xpath = "//*[text()='Services'])[2]")
    public WebElement servicespage;
    // footer>> şartlar ve koşullar
    @FindBy(xpath =" //h1[text()='Terms and Conditions']")
    public WebElement şartlarvekoşullaradresElementi ;
    // footer>> gizlilikPolitikasıElementi
    @FindBy(xpath =" //h1[text()='Privacy Policy']")
    public WebElement  gizlilikPolitikasıElementi;
    // services>> International Tour
    @FindBy(xpath = "//h4[text()='International Tour']")
    public WebElement InternationalTourElementi ;

    // services>> International Tour
    @FindBy(xpath = "//h1[text()='International Tour']")
    public WebElement InternationalTourTitle;
    // services>> Adventure Tour
    @FindBy(xpath = "//h1[text()='Adventure Tour']")
    public WebElement AdventureTourTitle;
    // services>> Adventure Tour
    @FindBy(xpath = "//h4[text()='Adventure Tour']")
    public WebElement AdventureTourElementi;
    // services>> Culture Tour
    @FindBy(xpath = "//h1[text()='Culture Tour']")
    public WebElement cultureTourTitle;

    // services>> Culture Tour
    @FindBy(xpath = "//h1[text()='Culture Tour']")
    public WebElement cultureTourElementi;
    // services>> Bussiness Tour
    @FindBy(xpath = "//h1[text()='Bussiness Tour']")
    public WebElement BussinessTourElementi;
    // services>> Bussiness Tour
    @FindBy(xpath = "//h1[text()='Bussiness Tour']")
    public WebElement BussinessTourTitle;
    // services>> Health Tour
    @FindBy(xpath = "//h1[text()='Health Tour']")
    public WebElement HealthTourElementi;
    // services>> Health Tour
    @FindBy(xpath = "//h1[text()='Health Tour']")
    public WebElement  HealthTourTitle;
    // services>> Religious Tour
    @FindBy(xpath = "//h1[text()='Health Tour']")
    public WebElement ReligiousTourElementi;

    // services>> Religious Tour
    @FindBy(xpath = "//h1[text()='Religious Tour']")
    public WebElement  ReligiousTourTitle;






}
