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



  
    // footer>> şartlar ve koşullar
    @FindBy(xpath =" //h1[text()='Terms and Conditions']")
    public WebElement şartlarvekoşullaradresElementi ;
  
    // footer>> gizlilikPolitikasıElementi
    @FindBy(xpath =" //h1[text()='Privacy Policy']")
    public WebElement  gizlilikPolitikasıElementi;

    // Services
    @FindBy(xpath = "(//a[@href='https://qa.tripandway.com/services'])[2]")
    public WebElement servicesButon;
  
    // services>> International Tour
    @FindBy(xpath = "(//div[@class='service-item mt_30'])[1]")
    public WebElement InternationalTourElementi ;

    // services>> International Tour
    @FindBy(xpath = "//h1[text()='International Tour']")
    public WebElement InternationalTourTitle;
  

  
    // services>> Adventure Tour
    @FindBy(xpath = "(//div[@class='service-item mt_30'])[2]")
    public WebElement AdventureTourElementi;
  
    // services>> Culture Tour
    @FindBy(xpath = "//h1[text()='Culture Tour']")
    public WebElement cultureTourTitle;

    // services>> Culture Tour
    @FindBy(xpath = "(//div[@class='service-item mt_30'])[3]")
    public WebElement cultureTourElementi;

    // Services >> cover photo
    @FindBy (xpath = "//div[@class='banner-text']")
    public  WebElement coverPhoto;

    // services>> Bussiness Tour
    @FindBy(xpath = "//div[@class='col-md-4 col-xs-6 clear-three wow fadeIn'][4]")
    public WebElement bussinessTour;

    // Bussiness >> Title
    @FindBy(xpath = "(//*[text()='Bussiness Tour'])[2]")
    public WebElement bussinessTitle;

    @FindBy(xpath = "//*[@class='fa fa-handshake']")
    public WebElement clickBussiness;

    // services>> Health Tour
    @FindBy(xpath = "(//div[@class='col-md-4 col-xs-6 clear-three wow fadeIn'])[5]")
    public WebElement healthTourElementi;
  
    // services>> Health Tour
    @FindBy(xpath = "//*[text()='Health Tour']")
    public WebElement  HealthTourTitle;
  
    // services>> Religious Tour
    @FindBy(xpath = "(//div[@class='col-md-4 col-xs-6 clear-three wow fadeIn'])[6]")
    public WebElement ReligiousTourElementi;

    // services>> Religious Tour
    @FindBy(xpath = "//h1[text()='Religious Tour']")
    public WebElement  ReligiousTourTitle;

    // Header >>  login alanı
    @FindBy(xpath =" //*[text()='Login']")
    public WebElement login;

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

    //Header  >>Registration
    @FindBy(xpath = "//*[text()='Registration']")
    public  WebElement registrationButonu;

   // Home >> Destinations
    @FindBy(xpath = "(//*[text()='Destinations'])[2]")
    public WebElement destinationsElementi;

    // Home >> Destinations >> Bangkok, Thailand
    @FindBy (xpath = "//*[text()='Bangkok, Thailand']")
    public WebElement bangkokThailandElementi;

    // Home>> Destinations >> Bangkok, Thaliand >> Bangkok, Thailand Home
    @FindBy (xpath = "//*[h1='Bangkok, Thailand']")
    public WebElement bangkokThailandHomeElementi;

    // Home>> Destinations >> Greenville,South Carolina
    @FindBy (xpath = "//*[text()='Greenville, South Carolina']")
    public WebElement greenVilleElementi;

    // Home >> Destinations >> Greenville, South Carolina Home
    @FindBy (xpath = "//*[h2='Greenville Tours & Vacations']")
    public WebElement greenVilleHomeElementi;

    // Home >> Destinations >> Buenos Aires, Argentina
    @FindBy (xpath = "//*[text()='Buenos Aires, Argentina']")
    public WebElement buenosAiresElementi;

    // Home >> Destinations >> Buenos Aires, Argentina Home
    @FindBy (xpath = "//*[h2='Buenos Aires Tours & Vacations']")
    public WebElement buenosAiresHomeElementi;

    // Home >> Destinations >> Marrakesh,Morocco
    @FindBy (xpath = "//*[text()='Marrakesh, Morocco']")
    public WebElement marrakeshElementi;

    // Home >> Destinations >> Marrakesh, Morocco Home
    @FindBy (xpath = "//*[h2='Marrakesh Tours & Vacations']")
    public WebElement marrakeshHomeElementi;

    // Home >> Destinations >> Salina Island, Italy
    @FindBy (xpath = "//*[text()='Salina Island, Italy']")
    public WebElement salinaIslandElementi;

    // Home >> Destinations >> Salina Island, Italy Home
    @FindBy (xpath = "//*[h2='Salina Island Tours & Vacations']")
    public WebElement salinaIslandHomeElementi;

    // Home >> Destinations >> Istanbul ,Turkey
    @FindBy (xpath = "//*[text()='Istanbul, Turkey']")
    public WebElement ıstanbulElementi;

    // Home >> Destinations >> Istanbul, Turkey Home
    @FindBy (xpath = "//*[h2='Istanbul, Turkey'][1]")
    public WebElement ıstanbulHomeElementi;

    // Home >> Destinations >> California , USA
    @FindBy (xpath = "//*[text()='California, USA']")
    public WebElement californiaElementi;

    // Home >> Destinations >> California ,USA Home
    @FindBy (xpath = "(//div[@class='row'])[3]")
    public WebElement californiaHomeElementi;

    // Home >> Packages
    @FindBy (xpath = "(//*[text()='Packages'])[2]")
    public WebElement packagesElementi;

    // Home >> Packages >> 3 days in Buenos Aires
    @FindBy(xpath = "(//div[@class='photo-title'])[1]")
    public WebElement ucDaysBuenosElementi;

    // Home >> Packages >> 3 days in Buenos Aires >> 3 days in Buenos Aires Home
    @FindBy(xpath = "//*[h4='Tour Dates']")
    public WebElement ucDaysBuenosHomeElementi;

    // Home >> Packages >> 10 days in Buenos Aires
    @FindBy (xpath = "(//div[@class='photo-title'])[2]")
    public WebElement onDaysBuenosElementi;

    // Home >> Packages >> 10 days in Buenos Aires >> 10 days in Buenos Aires Home
    @FindBy (xpath = "//h4[text()='Tour Dates']")
    public WebElement onDaysBuenosHomeElementi;

    // Home >> Packages >> 7 days in Istanbul
    @FindBy (xpath = "(//div[@class='photo-title'])[3]")
    public WebElement yediDaysIstanbulElementi;

    // Home >> Packages >> 7 days in Istanbul >> 7 days in Istabul Home
    @FindBy (xpath = "//h4[text()='Tour Dates']")
    public WebElement yediDaysIstanbulHomeElementi;

    // Home >> Packages >>  3 days in Bangkok
    @FindBy (xpath = "(//div[@class='photo-title'])[4]")
    public WebElement ucDaysBangkokElementi;

    // Home >> Packages >> 3 days in Bangkok >> 3 days in Bangkok Home
    @FindBy (xpath = "//h4[text()='Tour Dates']")
    public WebElement ucDaysBangkokHomeElementi;

    // Home >> Packages >> 7 day in Salina Island
    @FindBy (xpath = "(//div[@class='photo-title'])[5]")
    public WebElement yediDaySalinaElementi;

    // Home >> Packages>> 7 day in Salina Island >> 7 day in Salina Island Home
    @FindBy (xpath = "//h4[text()='Tour Dates']")
    public WebElement yediDaysSalinaHomeElementi;


    // Home >> Packages >> 5 day California
    @FindBy (xpath = "(//div[@class='photo-title'])[6]")
    public WebElement besDayCaliforniaElementi;

    // Home >> Packages >> 5 day California >> 5 day California Home
    @FindBy (xpath = "//h4[text()='Tour Dates']")
    public WebElement besDayCaliforniaHomeElementi;

    // Home >> About Us
    @FindBy (xpath = "(//*[text()='About Us'])[2]")
    public WebElement aboutUsElementi;

    //Home >> About Us >> About Us Home
    @FindBy (xpath = "//div[@class='about-text mt_30']")
    public WebElement aboutUsHomeElementi;

    // Home >> FAQ
    @FindBy (xpath = "(//*[text()='FAQ'])[2]")
    public WebElement faqElementi;

    // Home >> FAQ >> FAQ Home
    @FindBy (xpath = "(//*[@type='button'])[2]")
    public WebElement faqHomeElementi;

    // Home >> Contact
    @FindBy (xpath = "(//*[text()='Contact'])[2]")
    public WebElement contactElementi;

    // Home >> Contact >> Contact Home
    @FindBy (xpath = "//*[text()='Contact Form']")
    public WebElement contactHomeElementi;

    //body >>Forget Password
    @FindBy(xpath = "//*[@class='forget-password-link']")
    public WebElement forgetPasswordButonu;

    //body>> Forget Password >>RESET PASSWORD
    @FindBy(xpath = "//input[@class='form-control']")
    public WebElement emailAdressReset;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitButonuReset;

    //International Tour
    @FindBy(xpath ="(//div[@class='ser-text'])[1]")
    public WebElement International_tour;

    //Adventure Tour butonu
    @FindBy(xpath ="(//*[text()='Adventure Tour'])[2]")
    public WebElement Adventure_Tour;

    //Culture Tour butonu
    @FindBy(xpath ="(//div[@class='ser-text'])[3] ")
    public WebElement Culture_tour;

    //Bussiness Tour butonu
    @FindBy(xpath ="(//div[@class='ser-text'])[4] ")
    public WebElement Bussiness_Tour;

    //body >>  resetleme dogrulama texti
    @FindBy(xpath = "//div[@class='toast-message']")
    public WebElement maileYeniSıfreGondermeTexti;

    //Health Tour butonu
    @FindBy(xpath ="(//div[@class='ser-text'])[5] ")
    public WebElement Health_Tour;

    //Religious Tour butonu
    @FindBy(xpath ="(//div[@class='ser-text'])[6]")
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

    // Footer >> 3 days in Buenos Aires
    @FindBy(xpath ="(//div[@class='featured-text'])[1] ")
    public WebElement Buenos_Aires;

    // Footer >> 10 days in Buenos Aires
    @FindBy(xpath ="(//div[@class='featured-text'])[2] ")
    public WebElement Buenos10Aires;

    // Footer >> 3 days in Bangkok
    @FindBy(xpath ="(//div[@class='featured-text'])[3] ")
    public WebElement Bangkok3;

    // Footer >> 7 days in Salina Island
    @FindBy(xpath ="(//div[@class='featured-text'])[4] ")
    public WebElement Salina7;

    // Footer >> Latest Packages Elementi
    @FindBy(xpath = "//h3[text()='Recent Posts']")
    public WebElement latestpackageselement;

    // Header >> Home
    @FindBy (xpath = "(//*[text()='Home'])[2]")
    public WebElement home;

    // Header >> Services
    @FindBy (xpath = "(//*[text()='Services'])[2]")
    public WebElement services;

    // Header >> Packages
    @FindBy (xpath = "(//*[text()='Packages'])[2]")
    public WebElement Packages;

    // Header >> About_us
    @FindBy (xpath = "(//*[text()='About Us'])[2]")
    public WebElement About_us;




}