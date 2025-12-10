package BritishComputerSociety;

import Base.BaseTests;
import org.testng.annotations.Test;
import pages.BritishComputerPage;
import pages.HomePage;

public class BritishComputerSocietyTests extends BaseTests {

    @Test
    public void testBritishComputer(){
        HomePage home = new HomePage(driver);
        String firstWindow = driver.getWindowHandle();
        home.clickBritishLink();
        for(String handle:driver.getWindowHandles()){
            if(!handle.equals(firstWindow)){
                driver.switchTo().window(handle);
            }
        }
        String currentUrl = driver.getCurrentUrl();
        System.out.println("Opened url:"+ currentUrl);
    }
}
