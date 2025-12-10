package CountryDropDown;

import Base.BaseTests;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DropDownPage;

import java.util.List;

public class CountryDropdownTests extends BaseTests {
    @Test

    public void testCountryDropdownSelection() {
        DropDownPage dropDown = new DropDownPage(driver);
            dropDown.selectCountry("India");

            String selected = dropDown.getCountry();
            Assert.assertEquals(selected, "India", "No selected country");

    }

}

