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

    // Header >> Registration ve login alanı
    @FindBy(xpath =" //div[@class='top-header-right']")
    public WebElement RegistrationAndlogin;

    //Header >> HOME butonu
    @FindBy(xpath ="(//*[text()='Home'])[2] ")
    public WebElement HOME;

    //Header >> SERVICES butonu
    @FindBy(xpath =" (//*[text()='Services'])[2] ")
    public WebElement SERVICES;

    //Header >> DESTINATIONS butonu
    @FindBy(xpath ="(//*[text()='Destinations'])[2] ")
    public WebElement DESTINATIONS;

    //Header >> PACKAGES butonu
    @FindBy(xpath ="(//*[text()='Packages'])[2] ")
    public WebElement PACKAGES;

    //Header >> ABOUT US butonu
    @FindBy(xpath ="(//*[text()='About Us'])[2]")
    public WebElement ABOUT_US;

    //Header >> FAQ butonu
    @FindBy(xpath ="(//*[text()='FAQ'])[2] ")
    public WebElement FAQ;

    //Header >> BLOG butonu
    @FindBy(xpath =" (//*[text()='Blog'])[2]")
    public WebElement BLOG;

    //Header >> CONTACT butonu
    @FindBy(xpath ="(//*[text()='Contact'])[2] ")
    public WebElement CONTACT;



















    //International Tour
    @FindBy(xpath ="(//div[@class='ser-text'])[1]")
    public WebElement International_tour;

    //Adventure Tour butonu
    @FindBy(xpath ="(//*[text()='Contact'])[2] ")
    public WebElement Adventure_Tour;

    //Culture Tour butonu
    @FindBy(xpath ="(//div[@class='ser-text'])[3] ")
    public WebElement Culture_tour;


    //Bussiness Tour butonu
    @FindBy(xpath ="(//div[@class='ser-text'])[4] ")
    public WebElement Bussiness_Tour;


    //Health Tour butonu
    @FindBy(xpath ="(//*[text()='Contact'])[5] ")
    public WebElement Health_Tour;


    //Religious Tour butonu
    @FindBy(xpath ="(//*[text()='Contact'])[6] ")
    public WebElement Religious_Tour;

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


}
