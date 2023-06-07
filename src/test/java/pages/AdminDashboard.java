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

    // Blog Section Butonu
    @FindBy(xpath = "//span[text()='Blog Section']")
    public WebElement blogSectionButonu;

    @FindBy (xpath = "//a[text()='Blogs']")
    public WebElement blogsButonu;

    @FindBy (xpath = "//h1")
    public WebElement blogsWebElementi;

    //Dashboard >> Subscriber buton
    @FindBy(xpath = "(//*[@class='nav-link collapsed'])[6]")
    public WebElement subscriberButonu;

    //Subscribers >> All Subscriber buton
    @FindBy(xpath = "(//div[@class='bg-white py-2 collapse-inner rounded'])[6]")
    public WebElement allSubscriberButonu;

    // All Subscriber >> body
    @FindBy(xpath = "//div[@id='content']")
    public WebElement bodyAllSubscribers;

    //All Subscribers >> Wiew
    @FindBy(xpath = "//div[@class='dataTables_info']")
    public WebElement wiewAllSubscribers;

    // Blog Section >> Categories
    @FindBy(xpath = "//a[normalize-space()='Categories']")
    public WebElement blogSectionCategoriesLinki;

    // Blog Section >> Categories >> View Categories
    @FindBy(xpath = "//h6[@class='m-0 mt-2 font-weight-bold text-primary']")
    public WebElement viewCategoriesElementi;

    // Blog Section >> Categories >> +Add New
    @FindBy(xpath = "//a[@class='btn btn-primary btn-sm']")
    public WebElement categoriesAddNewLinki;

    // Blog Section >> Categories >> +Add New >> Add Category
    @FindBy(xpath = "//h1[@class='h3 mb-3 text-gray-800']")
    public WebElement categoriesAddCategoryElementi;

    // Blog Section >> Categories >> +Add New >> Category Name
    @FindBy(xpath = "//input[@name='category_name']")
    public WebElement categoriesAddCategoryCategoryName;

    // Blog Section >> Categories >> +Add New >> Category Slug
    @FindBy(xpath = "//input[@name='category_slug']")
    public WebElement categoriesAddCategoryCategorySlug;

    // Blog Section >> Categories >> +Add New >> Title
    @FindBy(xpath = "//input[@name='seo_title']")
    public WebElement categoriesSEOInformationTitle;

    // Blog Section >> Categories >> +Add New >> Meta Description
    @FindBy(xpath = "//textarea[@name='seo_meta_description']")
    public WebElement categoriesSEOMetaDescription;

    // Blog Section >> Categories >> +Add New >> Submit
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement categoriesSubmitButonu;

    // Blog Section >> Categories >> +Add New >> Dogrulama text
    @FindBy(xpath = "//body[@id='page-top']/script[4]")
    public WebElement categoriesDogrulama;


    // All Subscribers >> Send Email to Subscribers
    @FindBy(xpath = "//div[@class='float-right d-inline']")
    public WebElement sendEmailSubscribers;

    //Send email to Subscribers >> Section
    @FindBy(xpath = "//div[@class='container-fluid']")
    public WebElement sectionSendEmailSubscribers;

    // Subject Box
    @FindBy(xpath = "//input[@class='form-control']")
    public WebElement subjectBox;

    @FindBy(xpath = "//div[@class='toast-message']")
    public WebElement emailSentSuccessfully;

}

