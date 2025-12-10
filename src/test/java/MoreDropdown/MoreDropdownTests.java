package MoreDropdown;

import Base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DropDownPage;
import pages.HomePage;
import pages.MoreDropdownPage;

public class MoreDropdownTests extends BaseTests {
    @Test
    public void testMoreDropDown(){
        HomePage home = new HomePage(driver);

        MoreDropdownPage dropdownPage = home.clickDropdown("2FA Code Simulation");


    }
}
