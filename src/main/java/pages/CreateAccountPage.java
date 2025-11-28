package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateAccountPage {
    private WebDriver driver;
    private By firstNameField = By.cssSelector("input[data-aid = 'CREATE_ACCOUNT_NAME_FIRST']");
    private By lastNameField = By.cssSelector("input[data-aid='CREATE_ACCOUNT_NAME_LAST']");
    private By emailField = By.cssSelector("input[data-aid='CREATE_ACCOUNT_EMAIL']");
    private By phoneField = By.cssSelector("input[data-aid='CREATE_ACCOUNT_PHONE']");
    private By createAccountButton = By.cssSelector("button[data-ux='ButtonPrimary']");
    private By signInLink = By.linkText("Sign in");

    public CreateAccountPage(WebDriver driver){
        this.driver = driver;
    }

    public CreateAccountPage enterFirstName(String firstName){
        driver.findElement(firstNameField).sendKeys(firstName);
        return this;
    }

    public CreateAccountPage enterLastName(String lastName){
        driver.findElement(lastNameField).sendKeys(lastName);
        return this;
    }

    public CreateAccountPage enterEmail(String email){
        driver.findElement(emailField).sendKeys(email);
        return this;
    }

    public CreateAccountPage enterPhone(String phone){
        driver.findElement(phoneField).sendKeys(phone);
        return this;
    }

    public CreateAccountPage clickCreateAccount(){
        driver.findElement(createAccountButton).click();
        return this;
    }

    public boolean isStillOnCreateAccountPage(){

        return driver.getPageSource().contains("Create Account");
    }
}

