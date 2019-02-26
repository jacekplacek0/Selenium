package tests.testCases.testBootstrapDatePicker;

import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import tests.pageObject.bootstrapDatePicker.BootstrapDatePicker;
import tests.testCases.BaseTestCase;


public class TestBootstrapDatePicker extends BaseTestCase {
    @Test
    public void TestBootstrapDatePicker(){
        BootstrapDatePicker bootstrapDatePicker = new BootstrapDatePicker(webDriver);
        PageFactory.initElements(webDriver,bootstrapDatePicker);

        bootstrapDatePicker.openChildPage();
        bootstrapDatePicker.clickDateField();
        bootstrapDatePicker.clickTodayButton();
        bootstrapDatePicker.clickDateField();
        bootstrapDatePicker.clickClearButton();

        bootstrapDatePicker.clickStartDateButton();
        bootstrapDatePicker.setCurrentDay();
        bootstrapDatePicker.clickEndDateButton();
        bootstrapDatePicker.setNextDay();
    }
}
