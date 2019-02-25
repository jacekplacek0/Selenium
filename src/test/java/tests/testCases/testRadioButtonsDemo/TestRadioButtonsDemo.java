package tests.testCases.testRadioButtonsDemo;

import static org.junit.Assert.assertThat;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import tests.pageObject.radioButtonsDemo.RadioButtonsDemo;
import tests.testCases.BaseTestCase;

public class TestRadioButtonsDemo extends BaseTestCase {
        @Test
        public void testRadioButtonsDemo(){
            RadioButtonsDemo radioButtonsDemo = new RadioButtonsDemo(webDriver);
            PageFactory.initElements(webDriver,radioButtonsDemo);


            radioButtonsDemo.openChildPage();

            radioButtonsDemo.checkMaleAndClickButton();
            Assert.assertEquals(radioButtonsDemo.getCheckbuttonText() , "Radio button 'Male' is checked");
            radioButtonsDemo.checkFemaleAndClickButton();
            Assert.assertEquals(radioButtonsDemo.getCheckbuttonText() , "Radio button 'Female' is checked");


            String grander = "Male";
            String ageRange = "5 - 15";
            radioButtonsDemo.groupRadioButtonCheckAndClickButton(grander , ageRange);
            assertThat(radioButtonsDemo.getGroupCheckbuttonText(), CoreMatchers.containsString(grander));
            assertThat(radioButtonsDemo.getGroupCheckbuttonText(), CoreMatchers.containsString(ageRange));

        }
}
