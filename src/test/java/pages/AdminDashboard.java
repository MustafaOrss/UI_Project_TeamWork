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

    @FindBy(id = "email")
    public WebElement adminEmailKutusu; // admin email kutusu locate edildi
    @FindBy(id = "password")
    public WebElement adminPasswordKutusu; // admin password kutusu locate edildi
    @FindBy(xpath = "//button[@class='btn btn-primary btn-user btn-block']") // admin login butonu locate edildi
    public  WebElement adminLoginButonu;
    @FindBy(id = "content")
    public WebElement anasayfaLocate; // admin anasayfa locate edildi

    @FindBy(xpath = "(//*[@class='nav-link'])[6]")
    public WebElement orderButonuLocate;

    @FindBy(xpath = "(//div[@class='row'])[2]")
    public WebElement orderBodyLocate;

    @FindBy(xpath = "(//*[text()='Invoice'])[1]")
    public WebElement invoiceButonuLocate;



    @FindBy(xpath = "//div[@class='iv-right col-7 text-md-right']")
    public WebElement invoiceLocate;

    @FindBy(xpath = "//div[@class='invoice-address']")
    public WebElement invoiceAdress;

}

