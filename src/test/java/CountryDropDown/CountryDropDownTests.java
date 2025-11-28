package CountryDropDown;

import Base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CountryDropDownTests extends BaseTests {
    @Test

    public void testCountryDropdownSelection() {
        homePage.selectCountry("Avon");
        String selected = homePage.getSelectedCountry().get(0);
        Assert.assertEquals(selected, "Avon", "No country selected");

    }

}

