package CountryDropDown;

import Base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class CountryDropDownTests extends BaseTests {
    @Test

    public void testCountryDropdownSelection() {
        homePage.selectCountry("Avon");
        List<String> selected = homePage.getSelectedCountry();
        Assert.assertFalse(selected.isEmpty(), "Select a country");
        Assert.assertEquals(selected.get(0), "Avon", "No country selected");

    }

}

