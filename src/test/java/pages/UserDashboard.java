package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class UserDashboard {
    public UserDashboard(){
        PageFactory.initElements(Driver.getDriver(),this);
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


    //User Dashboard >>'Update Password' butonu
    @FindBy(xpath = "//*[text()='Update Password']")
    public WebElement updatePasswordButonu;

    //User Dashboard >> payment hıstory >>Action
    @FindBy(xpath ="(//*[@class='btn btn-primary btn-xs'])[1]" )
    public WebElement actionCalifornia;






}
