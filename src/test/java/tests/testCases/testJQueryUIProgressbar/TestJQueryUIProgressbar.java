package tests.testCases.testJQueryUIProgressbar;

import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import tests.pageObject.jQueryUIProgressbar.JQueryUIProgressbar;
import tests.testCases.BaseTestCase;


public class TestJQueryUIProgressbar extends BaseTestCase {
    @Test
    public void TestJQueryUIProgressbar() {
        JQueryUIProgressbar jQueryUIProgressbar = new JQueryUIProgressbar(webDriver);
        PageFactory.initElements(webDriver,jQueryUIProgressbar);

        jQueryUIProgressbar.openChildPage();
        jQueryUIProgressbar.clickDownloadButton();

        jQueryUIProgressbar.waitDownloadToFinish();
        jQueryUIProgressbar.clickCloseButton();
    }
}
