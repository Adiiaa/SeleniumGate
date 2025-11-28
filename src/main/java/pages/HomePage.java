package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

public class HomePage {
    private WebDriver driver;
    private WebDriverWait wait;

    private By JoisUsLink = By.linkText("JOIN US");
    private By countryDropdown = By.id("tCounty");


    public HomePage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }
    public void selectCountry(String countryName){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement dropdownOfCountry = wait.until(ExpectedConditions.visibilityOfElementLocated(countryDropdown));
        Select country = new Select(dropdownOfCountry);
        country.selectByVisibleText(countryName);

    }
    public List<String> getSelectedCountry() {
        Select country = new Select(driver.findElement(countryDropdown));
        List<WebElement> selectedOptions = country.getAllSelectedOptions();
        return selectedOptions.stream().map(WebElement::getText).collect(Collectors.toList());
    }


    public JoinUsPage clickJoinUsLink(){
        driver.findElement(JoisUsLink).click();
        return new JoinUsPage(driver);
    }


    }


