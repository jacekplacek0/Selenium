package tests.testCases.testBootstrapAlerts;

import java.util.concurrent.TimeoutException;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import tests.data.Data;
import tests.pageObject.bootstrapAlerts.BootstrapAlerts;
import tests.testCases.BaseTestCase;

public class TestBootstrapAlerts extends BaseTestCase{
    @Test
    public void testBootstrapAlerts() throws TimeoutException {
        BootstrapAlerts bootstrapAlerts = new BootstrapAlerts(webDriver);
        PageFactory.initElements(webDriver,bootstrapAlerts);

        bootstrapAlerts.openChildPage();

        Assert.assertFalse(bootstrapAlerts.isAnyReplyMessageVisible());
        bootstrapAlerts.clickAllMessage();

        Assert.assertTrue(bootstrapAlerts.isAllReplyMessageVisible());
        Assert.assertTrue(bootstrapAlerts.isAllAutoclosableButtonDisabled());
        bootstrapAlerts.closeAllNormalReply();
        bootstrapAlerts.waitForAutoclosableReplyToDisappear(Data.defaultMaximumWaitingTime);
        Assert.assertFalse(bootstrapAlerts.isAnyReplyMessageVisible());
    }
}
