package tests.testCases.testDynamicDataLoading;

import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import tests.data.Data;
import tests.pageObject.dynamicDataLoading.DynamicDataLoading;
import tests.testCases.BaseTestCase;

import java.util.concurrent.TimeoutException;

import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;

public class TestDynamicDataLoading extends BaseTestCase{
	@Test
	public void testDynamicDataLoadingDemo() throws InterruptedException, TimeoutException{
		DynamicDataLoading dynamicDataLoading = new DynamicDataLoading(webDriver);
		PageFactory.initElements(webDriver,dynamicDataLoading);

		dynamicDataLoading.openChildPage();
		
		String prevFirstNameAndLastName = "";
		String PrevImageUrl = "";
		
		for(int i = 0 ; i < 10 ; i++){
			dynamicDataLoading.clickButtonNewUser();
			dynamicDataLoading.waitForAllConnectionToClose();
			dynamicDataLoading.waitForDataChange(Data.defaultMaximumWaitingTime);

			assertThat(prevFirstNameAndLastName, not(dynamicDataLoading.getReplyData()));
			prevFirstNameAndLastName = dynamicDataLoading.getReplyData();

			assertThat(PrevImageUrl, not(dynamicDataLoading.getReplyDataImageUrl()));
			PrevImageUrl = dynamicDataLoading.getReplyDataImageUrl();
			
		}
	
	}

}
