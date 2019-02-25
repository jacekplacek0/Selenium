package tests.testCases.testCheckBoxDemo;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import tests.pageObject.checkBoxDemo.CheckBoxDemo;
import tests.testCases.BaseTestCase;

public class TestCheckBoxDemo extends BaseTestCase{
    @Test
    public void testCheckboxDemo() throws Exception {
        CheckBoxDemo checkboxDemo = new CheckBoxDemo(webDriver);
        PageFactory.initElements(webDriver,checkboxDemo);


        checkboxDemo.openChildPage();

        checkboxDemo.singleCheckboxClick();
        Assert.assertTrue(checkboxDemo.isSingleCheckboxMarked());
        checkboxDemo.singleCheckboxClick();
        Assert.assertFalse(checkboxDemo.isSingleCheckboxMarked());

        checkboxDemo.setCheckboxClick();
        Assert.assertEquals(checkboxDemo.setCheckboxButtonText() , "Uncheck All");
        checkboxDemo.setCheckboxByButton();
        Assert.assertEquals(checkboxDemo.setCheckboxButtonText() , "Check All");
    }
}
