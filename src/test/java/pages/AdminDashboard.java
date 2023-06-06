package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.AdminTestBaseRapor;
import utilities.Driver;

public class AdminDashboard {
    public AdminDashboard(){
        PageFactory.initElements(Driver.getDriver(),this);
    }



    // Admin Anasayfa >> Email Address
    @FindBy(id = "email")
    public WebElement adminEmailKutusu;

    // Admin Anasayfa >> Password
    @FindBy(id = "password")
    public WebElement adminPasswordKutusu;

    // Admin Anasayfa >> Login
    @FindBy(xpath = "//button[@class='btn btn-primary btn-user btn-block']")
    public  WebElement adminLoginButonu;

    // Dashboard
    @FindBy(id = "content")
    public WebElement dashboardLocate;

    // Order Buton
    @FindBy(xpath = "(//*[@class='nav-link'])[6]")
    public WebElement orderButonuLocate;

    //Order Body
    @FindBy(xpath = "(//div[@class='row'])[2]")
    public WebElement orderBodyLocate;

    //Invoice Buton
    @FindBy(xpath = "(//*[text()='Invoice'])[1]")
    public WebElement invoiceButonuLocate;

    //Order Invoice Body
    @FindBy(xpath = "//div[@class='iv-right col-7 text-md-right']")
    public WebElement orderInvoiceLocate;

    // Invoice
    @FindBy(xpath = "//div[@class='invoice-address']")
    public WebElement invoiceAdress;

    // General Settings
    @FindBy(xpath = "//span[text()='General Settings']")
    public WebElement generalSettingsElementi;

    // Page Settings
    @FindBy(xpath = "//span[text()='Page Settings']")
    public WebElement pageSettingsElementi;

    // Payment Settings
    @FindBy(xpath = "//span[text()='Payment Settings']")
    public WebElement paymentSettingsElementi;

    // Dynamic Pages
    @FindBy(xpath = "//span[text()='Dynamic Pages']")
    public WebElement dynamicPagesElementi;

    // Language
    @FindBy(xpath = "//span[text()='Language']")
    public WebElement languageElementi;

    // Website Section
    @FindBy(xpath = "//span[text()='Website Section']")
    public WebElement websiteSectionElementi;

    // Email Template
    @FindBy(xpath = "//span[text()='Email Template']")
    public WebElement emailTemplateElementi;

    // Blog Section Butonu
    @FindBy(xpath = "//span[text()='Blog Section']")
    public WebElement blogSectionButonu;

    @FindBy(xpath = "(//*[@class='nav-link collapsed'])[6]")
    public WebElement subscriberButonu;


    @FindBy(xpath = "(//div[@class='bg-white py-2 collapse-inner rounded'])[6]")
    public WebElement allSubscriberButonu;

    @FindBy(xpath = "//div[@id='content']")
    public WebElement bodyAllSubscribers;
    @FindBy(xpath = "//div[@class='dataTables_info']")
    public WebElement wiewAllSubscribers;

}

