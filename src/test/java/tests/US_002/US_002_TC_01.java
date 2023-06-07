package tests.US_002;

<<<<<<< HEAD:src/test/java/tests/US_002/US_002_TC01.java
//mport com.aventstack.extentreports.ExtentTest;
//mport org.testng.Assert;
//mport org.testng.annotations.Test;
//mport pages.UserHomepage;
//mport utilities.*;

//ublic class US_002_TC02 extends UserTestBaseRapor {
//   //Header in sağ alt köşesindeki HOME, SERVICES, DESTINATIONS, PACKAGES, ABOUT US, FAQ, BLOG, CONTACT
//   // butonlarının varlığını kontrol edip eğer varsa aktif olduğunu kontrol etmeliyim.
//   UserHomepage userHomepage = new UserHomepage();

//   @Test
//   public void test02() {
//       ExtentTest extentTest = extentReports.createTest("Footer Recent Posts testi",
//               "Kullanici Recent Posts ulasabilmeli");
//       userHomepage.cookiesButonu.click();
//       // 1- Launch Browser
//       // 2- Go to https://qa.tripandway.com/
//       extentTest.info("Kullanici " + ConfigReader.getProperty("tripAndWayUrl") + " sayfaya gider");
=======
import com.aventstack.extentreports.ExtentTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserHomepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.UserTestBaseRapor;

public class US_002_TC_01 extends UserTestBaseRapor {

    UserHomepage userHomepage = new UserHomepage();
    ///                     !!Header in sağ üst köşesindeki Registration ve login butonlarının varlığını kontrol!!
    @Test
    public void test01() {
        ExtentTest extentTest = extentReports.createTest("Footer Recent Posts testi",
                "Kullanici Recent Posts ulasabilmeli");
        userHomepage.cookiesButonu.click();
        // 1- Launch Browser
        // 2- Go to https://qa.tripandway.com/
        extentTest.info("Kullanici " + ConfigReader.getProperty("tripAndWayUrl") + " sayfaya gider");
>>>>>>> 06e83e62d874234fc73db1e249d59f85729401fe:src/test/java/tests/US_002/US_002_TC_01.java

//       // 3- Anasayfaya erisildigi dogrulanmalidir
//       String actualTitle = Driver.getDriver().getTitle();
//       String expectedHomePageTitle = ConfigReader.getProperty("expectedHomePageTitle");
//       Assert.assertTrue(actualTitle.contains(expectedHomePageTitle));
//       extentTest.pass("Belirlenen " + expectedHomePageTitle + " aranacak title arama sonucunda expected icerik oldugu test edildi");

<<<<<<< HEAD:src/test/java/tests/US_002/US_002_TC01.java
//       //Header in sağ alt köşesindeki HOME, SERVICES, DESTINATIONS, PACKAGES, ABOUT US, FAQ, BLOG, CONTACT
//       // butonlarının varlığını kontrol
=======

>>>>>>> 06e83e62d874234fc73db1e249d59f85729401fe:src/test/java/tests/US_002/US_002_TC_01.java

//       //4-
//     //  Assert.assertTrue(userHomepage.RegistrationAndlogin.isDisplayed());
//       extentTest.pass("RegistrationAndlogin gorunurlugu dogrulandi");
//   }
//

<<<<<<< HEAD:src/test/java/tests/US_002/US_002_TC01.java

//*
// //Header Registration ve login alanı
//   @FindBy(xpath =" //div[@class='top-header-right']")
//   public WebElement  RegistrationAndlogin;
 //*/

=======
/*
  //Header Registration ve login alanı
    @FindBy(xpath =" //div[@class='top-header-right']")
    public WebElement  RegistrationAndlogin;
 */
>>>>>>> 06e83e62d874234fc73db1e249d59f85729401fe:src/test/java/tests/US_002/US_002_TC_01.java
