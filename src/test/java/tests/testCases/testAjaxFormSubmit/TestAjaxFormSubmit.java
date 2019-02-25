package tests.testCases.testAjaxFormSubmit;

import static org.junit.Assert.assertThat;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import tests.pageObject.ajaxFormSubmit.AjaxFormSubmit;
import tests.testCases.BaseTestCase;

public class TestAjaxFormSubmit extends BaseTestCase{
    @Test
    public void testAjaxFormSubmitDemo()throws Exception{
        AjaxFormSubmit ajaxFormSubmit = new AjaxFormSubmit(webDriver);
        PageFactory.initElements(webDriver,ajaxFormSubmit);

        ajaxFormSubmit.openChildPage();
        Assert.assertFalse(ajaxFormSubmit.isNameFieldColorRed());

        ajaxFormSubmit.clickSubmitButton();
        Assert.assertTrue(ajaxFormSubmit.isNameFieldColorRed());

        ajaxFormSubmit.setNameField("Subject: Selenium test");
        ajaxFormSubmit.setCommentField("Ajax form submit test.");
        ajaxFormSubmit.clickSubmitButton();
        assertThat(ajaxFormSubmit.getAjaxMessage(), CoreMatchers.containsString("Ajax Request is Processing!"));

        ajaxFormSubmit.waitForAjaxMessageToChange(1000);
        assertThat(ajaxFormSubmit.getAjaxMessage(), CoreMatchers.containsString("Form submited Successfully!"));

    }
}
