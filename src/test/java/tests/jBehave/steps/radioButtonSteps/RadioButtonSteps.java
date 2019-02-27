package tests.jBehave.steps.radioButtonSteps;

import static org.junit.Assert.assertThat;

import org.hamcrest.CoreMatchers;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import tests.jBehave.steps.JBehaveSteps;
import tests.pageObject.radioButtonsDemo.RadioButtonsDemo;
public class RadioButtonSteps extends JBehaveSteps{
		RadioButtonsDemo page;
	 
	 @Given("open RadioButtonDemo page")
	 public void theGameIsRunning() {
			page = new RadioButtonsDemo(webDriver);
			PageFactory.initElements(webDriver,page);
			page.openChildPage();
	 }
	 
	 @When("check $grander and click check value")
	 public void checkGrander(String grander){
		 	 
		 if(grander.matches("Male")){
			 page.checkMaleAndClickButton();
		 }else if(grander.matches("Female")){
			 page.checkFemaleAndClickButton();
		 }else{
			 throw new IllegalArgumentException("wrong grander");
		 }
		 
	 }

	 @When("check $grander and age $age")
	 public void checkGrander(String grander,int age ){
		 if(0 <= age && age < 5)
			page.groupRadioButtonCheckAndClickButton(grander , "0 - 5");
		 else if(5 <= age && age < 15)
			page.groupRadioButtonCheckAndClickButton(grander , "5 - 15");
		 else if(15 <= age && age <= 50)
			page.groupRadioButtonCheckAndClickButton(grander , "5 - 15");
		 else
			 throw new IllegalArgumentException("wrong age group");
			 
	 }
	 @Then("You should see $reply")
	 public void radioButtonReply(String reply){
			Assert.assertEquals(page.getCheckbuttonText() , reply );
	 }
	 
	 @Then("You should get $grander and $ageGroup")
	 public void groupRadioButtonReply(String grander , String ageGroup){
			assertThat(page.getGroupCheckbuttonText(), CoreMatchers.containsString(grander));
			assertThat(page.getGroupCheckbuttonText(), CoreMatchers.containsString(ageGroup));
	 }
	
}
