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

}

