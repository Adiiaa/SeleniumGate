package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
    private By moreDropdown = By.cssSelector("a[data-aid=\"NAV_MORE\"]");
    private By britishLink = By.cssSelector("a[href='https://www.bcs.org/']");



    public HomePage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }

    public void clickBritishLink(){
        WebElement british = wait.until(ExpectedConditions.elementToBeClickable(britishLink));
        british.click();
    }
    public DropDownPage clickHomePage(){
        return new DropDownPage(driver);
    }

    public JoinUsPage clickJoinUsLink(){
        driver.findElement(JoisUsLink).click();
        return new JoinUsPage(driver);
    }

        public void openMoreDropdown(){
            WebElement more = wait.until(ExpectedConditions.visibilityOfElementLocated(moreDropdown));
            more.click();
        }
        public MoreDropdownPage clickDropdown(String linkText){
            openMoreDropdown();
            driver.findElement(By.xpath("//*[@id=\"more-68\"]/li[14]/a")).click();
            return new MoreDropdownPage(driver);


        }


    }


