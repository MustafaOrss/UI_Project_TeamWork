package tests.US_018;

import org.testng.annotations.Test;
import pages.UserHomepage;
import utilities.Driver;
import utilities.UserTestBaseRapor;

public class US_018_TC_01 extends UserTestBaseRapor {


    // Browser acarak url kismina "https://qa.tripandway.com" yazarak adrese gidebilmesi

    @Test

    public void TC_01(){

        // https://qa.tripandway.com url alanina gidilir
        extentTest  = extentReports.createTest("https://qa.tripandway.com ","url alanina gidilir");
    }

}
