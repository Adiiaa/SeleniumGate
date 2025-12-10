package pages;

import org.openqa.selenium.WebDriver;

public class BritishComputerPage {
    private WebDriver driver;
    public BritishComputerPage(WebDriver driver){
        this.driver = driver;

    }
    public String getCurrentURL(){
        return driver.getCurrentUrl();
    }
}
