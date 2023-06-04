package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class QAAdminPage {
    public QAAdminPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    // adminLoginButonu
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement AdminLoginButonu;
    // adminLoginemailKutusu
    @FindBy (xpath = "//*[@id='email']")
    public WebElement emailKutusu;
    // adminloginpassword kutusu
    @FindBy (xpath = "//*[@id='password']")
    public WebElement passwordKutusu;



}
