package tests.testCases.testSimpleFormDemo;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import tests.pageObject.simpleFormDemo.SimpleFormDemo;
import tests.testCases.BaseTestCase;

public class TestSimpleFormDemo extends BaseTestCase {
    @Test
    public void testBasicFirstFromDemo(){

        SimpleFormDemo simpleFormDemo = new SimpleFormDemo(webDriver);
        PageFactory.initElements(webDriver,simpleFormDemo);

        String messageTestString = "Selenium test nr.1";

        simpleFormDemo.openChildPage();

        simpleFormDemo.insertMessage(messageTestString);
        simpleFormDemo.clickMessageButton();

        Assert.assertEquals(messageTestString, simpleFormDemo.getInputMessageResponse());


        String a = "14";
        String b = "6";
        String expectedReply = "20";

        simpleFormDemo.insertSum(a,b);
        simpleFormDemo.clickGetTotal();
        Assert.assertEquals(expectedReply , simpleFormDemo.getTotalResponse());

    }
}
