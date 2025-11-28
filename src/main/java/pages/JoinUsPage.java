package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class JoinUsPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private By emailField = By.cssSelector("input[data-aid='MEMBERSHIP_SSO_LOGIN_EMAIL']");
    private By passwordField = By.cssSelector("input[data-aid='MEMBERSHIP_SSO_LOGIN_PASSWORD']");
    private By signinButton = By.cssSelector("button[data-aid='MEMBERSHIP_SSO_SUBMIT']");
    private By resetPasswordLink = By.linkText("Reset password");
    private By createAccountLink = By.linkText("Create account.");

    public JoinUsPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }
    public JoinUsPage enterEmail(String email){
        driver.findElement(emailField).sendKeys(email);
        return this;
    }

    public JoinUsPage enterPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
        return this;
    }

    public JoinUsPage clickSignIn(){
        driver.findElement(signinButton).click();
        return this;
    }

    public boolean isStillOnLoginPage(){
        return driver.getPageSource().contains("Account sign in");

    }

    public CreateAccountPage clickCreateAccount(){
        driver.findElement(createAccountLink).click();
        return new CreateAccountPage(driver);
    }
}


