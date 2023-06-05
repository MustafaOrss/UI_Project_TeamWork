package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdminDashboard {
    public AdminDashboard(){
        PageFactory.initElements(Driver.getDriver(),this);
    }



    // Admin Anasayfa >> Email Address
    @FindBy(id = "email")
    public WebElement emailAddressButonu;

    // Admin Anasayfa >> Password
    @FindBy(xpath = "//input[@type='password']")
    public WebElement passwordButonu;

    // Admin Anasayfa >> Login
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButonu;

    // Dashboard
    @FindBy(xpath = "//h1[text()='Dashboard']")
    public WebElement dashboardElementi;

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

}
