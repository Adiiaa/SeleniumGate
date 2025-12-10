package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import pages.PopupModal;

public class BaseTests {
    protected WebDriver driver;
    protected HomePage homePage;
    protected PopupModal popupModal;


    @BeforeMethod
    public void setUp(){
//        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://candymapper.com/");
        homePage = new HomePage(driver);
        popupModal = new PopupModal(driver);
        popupModal.closeModalVisible();

    }
 @AfterMethod
        public void closeTheChrome(){
            if(driver!=null){
                  driver.quit();
       }
   }
}
