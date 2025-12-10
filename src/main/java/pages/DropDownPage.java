package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.nio.channels.spi.SelectorProvider;
import java.time.Duration;

public class DropDownPage {
    private WebDriver driver;

    private By countryDropdown = By.id("tCounty");


    public DropDownPage(WebDriver driver){
        this.driver = driver;
    }

   public void selectCountry(String countryName){

        driver.switchTo().frame("iframe-undefined12");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement dropdownElement = wait.until(ExpectedConditions.visibilityOfElementLocated(countryDropdown));
        Select select = new Select(dropdownElement);
        select.selectByVisibleText(countryName);

        driver.switchTo().defaultContent();
   }
   public String getCountry(){

       driver.switchTo().frame("iframe-undefined12");

       WebElement dropdownElement = driver.findElement(countryDropdown);
       Select select = new Select(dropdownElement);
       String selected= select.getFirstSelectedOption().getText();

       driver.switchTo().defaultContent();

       return selected;
   }

}
