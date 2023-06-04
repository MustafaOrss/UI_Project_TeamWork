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
    @FindBy(xpath = "/html[1]/body[1]/div[16]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[1]/a[1]")
    public WebElement facebookLinki;

    // Footer >> Facebook Linki >> Email
    @FindBy(id = "email")
    public WebElement facebookEmailButonu;

}
