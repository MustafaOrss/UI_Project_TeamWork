package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class UserDashboard {
    public UserDashboard(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
