package tests.pageObject.jQueryUIProgressbar;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import tests.pageObject.BasePage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static tests.data.Data.defaultTimeOut;

public class JQueryUIProgressbar extends BasePage {

    @FindBy(xpath = "//button[@id='downloadButton']")
    private WebElement downloadButton;

    @FindBy(xpath = "//button[@type='button' and contains(., 'Close')]")
    private WebElement buttonClose;

    public JQueryUIProgressbar(WebDriver webDriver){
        super(webDriver);
        childUrl = "jquery-download-progress-bar-demo.html";
    }

    public void clickDownloadButton(){downloadButton.click();}

    public void waitDownloadToFinish(){
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        WebElement element = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='button' and contains(., 'Close')]")));

    }

    public void clickCloseButton(){buttonClose.click();}


}
