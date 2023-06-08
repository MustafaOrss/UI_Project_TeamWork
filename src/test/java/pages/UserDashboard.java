package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class UserDashboard {

    public UserDashboard() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
  
    //User Anasayfa ilk login butonu (Registration yanındaki)
    @FindBy(xpath = ("//*[text()='Login']"))
    public WebElement ilkLoginButonu;

    //User Anasayfa >> login
    @FindBy(xpath = "//button[@name='form1']")
    public WebElement loginButonu;

    //User Anasayfa >> E-mail Adress
    @FindBy(xpath = "(//input[@class='form-control'])[1]")
    public WebElement emailAddressButonu;

    //User Anasayfa >> Password
    @FindBy(xpath = "(//input[@class='form-control'])[2]")
    public WebElement passwordButonu;

    // Cookies butonu
    @FindBy(className = "wpcc-btn")
    public WebElement cookiesButonu;

    // User Dashbord >> 'Payment History' butonu
    @FindBy(xpath = "//*[text()='Payment History']")
    public WebElement paymentHistoryButonu;

    //User Dashboard >> 'Completed' butonu
    @FindBy(xpath = "(//*[text()='Completed'])[1]")
    public WebElement completedButonu;

    //User Dashboard >>'Update Password'butonu (kullanıcı login iken sifre yenileme icin)
    @FindBy(xpath = "//*[text()='Update Password']")
    public WebElement updatePasswordButonu;

    //User Dashboard >> New Password textbox kutusu
    @FindBy(xpath = "//input[@type='password']")
    public WebElement newPasswordKutusu;

    //User Dashboard >> payment hıstory >>Action
    @FindBy(xpath = "(//*[@class='btn btn-primary btn-xs'])[1]")
    public WebElement actionCalifornia;

    //User Dashboard >> 'Update'butonu (kullanıcı login iken sifre yenileme icin)
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement updateButonu;

    //User Dashboard >> 'Package' butonu
    @FindBy(xpath = "(//*[text()='Packages'])[2]")
    public WebElement packageButonu;

    //User Dashboard >> 'Dashboard' Logo butonu (Anasayfada yukarıda yazan logo)
    @FindBy(xpath = "(//*[text()='Dashboard'])[1]")
    public WebElement dashboardLogoButonu;

    //User Dashboard >> 'Dashboard' butonu (Ana sayfada yanında ev resmi olan)
    @FindBy(xpath = "(//*[text()='Dashboard'])[2]")
    public WebElement dashboardButonu;

    //User Dashboard >> '7 Days in Istanbul'
    @FindBy(xpath = "(//span[@class='fz_22'])[3]")
    public WebElement istanbulTuruButonu;

    //User Dashboard >> '3 Days in Buenos Aires'
    @FindBy(xpath = "(//span[@class='fz_22'])[1]")
    public WebElement buenosAiresTuruButonu;

    //User Dashboard >> '3 Days in Bangkok'
    @FindBy(xpath = "(//span[@class='fz_22'])[4]")
    public WebElement bangkokTuruButonu;

    //User Dashboard >> '7 days in Salina Island'
    @FindBy(xpath = "(//span[@class='fz_22'])[5]")
    public WebElement salinaIslandButonu;

    //User Dashboard  >> '5 Day CaLifornia'
    @FindBy(xpath = "(//span[@class='fz_22'])[6]")
    public WebElement californiaButonu;

    //User Dashboard  >> 'Book Your Seat' butonu
    @FindBy(xpath = "//button[@class='btn btn-info btn-lg']")
    public WebElement bookYourSeatButonu;

    //User Dashboard  >> 'pay with card 'butonu
    @FindBy(xpath = "//span[@style='display: block; min-height: 30px;']")
    public WebElement payWithCardButonu;

    //User Dashboard  >>Packages >> Payment >> Pay with Card  >> 'Card number' textbox kutusu
    @FindBy(xpath = "//input[@id='card_number']")
    public WebElement cardNumberKutusu;

    //User Dashboard  >>Packages >>Payment>>Pay with Card' >>Tarih(MM/YY) textbox kutusu
    @FindBy(xpath = "//*[@id='cc-exp']")
    public WebElement cardMMYYKutusu;

    //User Dashboard  >>Packages >> Payment>> Pay with Card >>'Güvenlik kodu (CVC)' textbox kutusu
    @FindBy(xpath = "//*[@id='cc-csc']")
    public WebElement cardCVCKutusu;

    //User Dashboard   >>'Pay 'butonu
    @FindBy(xpath = "//span[@class='iconTick']")
    public WebElement payButonu;

    //User Dashboard  >> Packages >>Payment>>Pay with Card >>iframe
    @FindBy(xpath = "//iframe[@name='stripe_checkout_app']")
    public WebElement iframeElementi;

    //User Dashboard >> logout butonu
    @FindBy(xpath = "//*[text()='Logout']")
    public WebElement logoutButonu;

    //User Dashboard  >> Odeme tamamlandı texti
    @FindBy(xpath = "//body[@style='overflow-x: hidden;']/script[5]")
    public WebElement odemeTamamlandıTexti;

    }
