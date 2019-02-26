package tests.testCases.testBootstrapProgressbar;

import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import tests.pageObject.bootstrapProgressbar.BootstrapProgressbar;
import tests.testCases.BaseTestCase;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestBootstrapProgressbar extends BaseTestCase{
	@Test
	public void testBootstrapProgressBarDialogDemo(){
		BootstrapProgressbar bootstrapProgressbar = new BootstrapProgressbar(webDriver);
		PageFactory.initElements(webDriver,bootstrapProgressbar);

		bootstrapProgressbar.openChildPage();

		bootstrapProgressbar.simpleDialogButtonClick();
		
		assertTrue(bootstrapProgressbar.isModalBackdropActive());


		bootstrapProgressbar.waitForModal();

		assertFalse(bootstrapProgressbar.isModalBackdropActive());


		bootstrapProgressbar.dialogMessageButtonClick();
		bootstrapProgressbar.waitForModal();
		
		assertFalse(bootstrapProgressbar.isModalBackdropActive());


		bootstrapProgressbar.dialogSettingsButtonClick();
		bootstrapProgressbar.waitForModal();
		bootstrapProgressbar.hiddenDialogRunScrypt();
		bootstrapProgressbar.waitForAlert();
		assertTrue(bootstrapProgressbar.isAlertActive());


		bootstrapProgressbar.closeHiddenAlert();

		assertFalse(bootstrapProgressbar.isAlertActive());
		
	}
}
