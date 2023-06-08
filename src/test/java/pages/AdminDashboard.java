package pages;

import org.bouncycastle.jcajce.provider.asymmetric.X509;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdminDashboard {
    public AdminDashboard() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    // Admin Anasayfa >> Email Address
    @FindBy(id = "email")
    public WebElement adminEmailKutusu;

    // Admin Anasayfa >> Password
    @FindBy(id = "password")
    public WebElement adminPasswordKutusu;

    // Admin Anasayfa >> Login
    @FindBy(xpath = "//button[@class='btn btn-primary btn-user btn-block']")
    public WebElement adminLoginButonu;

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

    //Admin Panel
    @FindBy(xpath = "//*[@id=\"accordionSidebar\"]/a/div")
    public WebElement adminPanelElementi;

    // Blog Section Butonu
    @FindBy(xpath = "//span[text()='Blog Section']")
    public WebElement blogSectionButonu;

    @FindBy(xpath = "//a[text()='Blogs']")
    public WebElement blogsButonu;

    @FindBy(xpath = "//h1")
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

    // Profil Resmi Locate
    @FindBy(xpath = "//a[@id='userDropdown']")
    public WebElement profilResmi;

    // Profil Bilgilerini degistirme ekrani locate'i
    @FindBy(xpath = "//*[@aria-labelledby='userDropdown']")
    public WebElement profilBilgileriniDegistirmeEkrani;

    // Change Password elementinin locate'i
    @FindBy(xpath = "(//a[@class='dropdown-item'])[1]")
    public WebElement changePasswordElementi;

    // Change Password sayfasindaki "Edit Profil" yazisinin locate'i
    @FindBy(xpath = "//*[text()='Edit Profile']")
    public WebElement editProfilTexti;

    // Change Photo elementinin locate'i
    @FindBy(xpath = "(//a[@class='dropdown-item'])[2]")
    public WebElement changePhotoElementi;

    // Change Photo sayfasindaki "Change Photo" yazisinin locate'i
    @FindBy(xpath = "//*[text()='Change Photo *']")
    public WebElement changePhotoTexti;

    // Daraltma oku elementinin locate'i
    @FindBy(xpath = "(//*[@id='sidebarToggle'])[1]")
    public WebElement daraltmaOkuElementi;

    // Admin Dashboard'daki "ADMIN PANEL" yazisinin locate'i
    @FindBy(xpath = "//*[@class='sidebar-brand-text mx-3']")
    public WebElement adminPanelTexti;

    // Admin Dashboard'daki "Visit Website" butonu locate'i
    @FindBy(xpath = "//*[@target='_blank']")
    public WebElement visitWebsiteButonu;

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

    //Packages
    @FindBy(xpath = "(//*[text()='Packages'])[1]")
    public WebElement packagesButtonu;

    @FindBy(xpath = "//*[@class='btn btn-primary btn-sm']")
    public WebElement packagesAddNewButonu;

    @FindBy(xpath = "//*[@class='m-0 mt-2 font-weight-bold text-primary']")
    public WebElement addPackagesText;
    @FindBy(xpath = "//input[@name='p_name']")
    public WebElement packageName;

    @FindBy(xpath = "//input[@name='p_slug']")
    public WebElement packageSlug;
    @FindBy(xpath = "//input[@name='p_photo']")
    public WebElement packagePhoto;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[4]/div[1]/div[3]/div[2]")
    public WebElement packageDescription;

    @FindBy(xpath = "//textarea[@name='p_description_short']")
    public WebElement packageShortDescription;

    @FindBy(xpath = "//textarea[@name='p_location']")
    public WebElement packageLocation;

    @FindBy(xpath = "//input[@id='datepicker']")
    public WebElement packageStartDate;

    @FindBy(xpath = "//input[@id='datepicker1']")
    public WebElement packageEndDate;

    @FindBy(xpath = "//input[@id='datepicker2']")
    public WebElement packageLastBookingDate;

    @FindBy(xpath = "//textarea[@name='p_map']")
    public WebElement packageMap;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[11]/div[1]/div[3]/div[2]")
    public WebElement packageItinerary;

    @FindBy(xpath = "//input[@name='p_price']")
    public WebElement packagePrice;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[13]/div[1]/div[3]/div[2]")
    public WebElement packagePolicy;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[14]/div[1]/div[3]/div[2]")
    public WebElement packageTerms;

    @FindBy(xpath = "//select[@name='p_is_featured']")
    public WebElement packageIsFeatured;

    @FindBy(xpath = "//select[@name='destination_id']")
    public WebElement packageDestination;

    @FindBy(xpath = "//input[@name='seo_title']")
    public WebElement packageTitle;

    @FindBy(xpath = "//textarea[@name='seo_meta_description']")
    public WebElement packageMetaDescription;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement packageSubmit;

    @FindBy(xpath = "//div[@class='toast-message']")
    public WebElement packageDogrulama;

    //Order
    @FindBy(xpath = "(//*[@class='btn btn-primary btn-sm mt_10'])[1]")
    public WebElement seeDetailButtonu;

    // 2905_Blog elementi addBlog girisi
    @FindBy(xpath = "//a[@class='btn btn-primary btn-sm']")
    public WebElement blogsAddNewButonu;

    // 2905_Blog elementi addBlog text yazimi
    @FindBy(xpath = "//input[@type='text']")
    public WebElement addBlogTitleText;

    // 2905_Blog elementi addBlogContent text yazimi
    @FindBy (xpath = "//*[@role='textbox']")
    public WebElement addBlogContentText;

    // 2905_Blog elementi addShortContent text yazimi
    @FindBy (xpath = "//textarea[@name='blog_content_short']")
    public WebElement addBlogShortContentText;
    // 2905_addBlogDosya foto seçimi
    @FindBy (xpath = "//input[@name='blog_photo']")
    public WebElement addBlogDosyaSecimi;

    // 2905_addblog submit butonu
    @FindBy (xpath = "//button[@class='btn btn-success']")
    public WebElement AddBlogSubmitButonu;

    // 2905_addBlog yükleme başarılı
    @FindBy (xpath = "//*[@id='page-top']/script[4]")
    public WebElement accessSuccessfullyAlert;

}

