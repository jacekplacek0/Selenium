package tests.pageObject.dynamicDataLoading;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import tests.pageObject.BasePage;

import java.util.concurrent.TimeoutException;

public class DynamicDataLoading extends BasePage{

	@FindBy(xpath = "//button[@id='save']")
	private WebElement buttonNewUser;


	@FindBy(xpath = "//div[@id='loading']")
	private WebElement replyData;

	@FindBy(xpath = "//div[@id='loading']//img")
	private WebElement replyDataImageUrl;

	public DynamicDataLoading(WebDriver webDriver) {
		super(webDriver);
		childUrl = "dynamic-data-loading-demo.html";
	}
	
	
	//loop till message change or 
	public void waitForDataChange(int timeout) throws  TimeoutException, InterruptedException{
		waitForElementStringToChange(replyData , timeout);
	}
	
	public void clickButtonNewUser(){
		buttonNewUser.click();
	}
	public String getReplyData(){
			return replyData.getText();
	}
	
	public String getReplyDataImageUrl(){
		return replyDataImageUrl.getAttribute("src");
	}
	
}
