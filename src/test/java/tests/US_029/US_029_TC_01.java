package tests.US_029;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class US_029_TC_01 {

    /*
    1-Browser'a gidilir.
    2-https://qa.tripandway.com/admin/login adresine gidilir.
    3-Anasayfaya ulasildigi dogrulanir
     */
    @Test
    public void US029TC01(){
        // chorme browser'ina framework de utilities icinde driver üzerinden gidilir.
        Driver.getDriver().get(ConfigReader.getProperty("tripAndWayAdminUrl"));

        // Anasayfaya ulasildigi dogrulanir
        WebElement adminLoginElmenti = Driver.getDriver().findElement(By.xpath("//h1[text()='Admin Login']"));
        String expectedIcerik = "Admin Login";
        String actualYazi = adminLoginElmenti.getText();
        Assert.assertTrue(actualYazi.contains(expectedIcerik));
        System.out.println(actualYazi);

        Driver.closeDriver();
    }


}
