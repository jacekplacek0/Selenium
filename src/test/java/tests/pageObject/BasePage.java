package tests.pageObject;


import tests.data.Data;

import org.openqa.selenium.By;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public abstract class BasePage {
   protected WebDriver webDriver;
   protected String childUrl;

   public BasePage(WebDriver webDriver) {this.webDriver = webDriver;}
   public BasePage() {newChromeDriver();}

   public void newChromeDriver(){
       System.setProperty("webdriver.chrome.webDriver",System.getProperty("user.dir") + "/webDriver/chromedriver.exe");
       webDriver = new ChromeDriver();
       webDriver.manage().timeouts().implicitlyWait(Data.defaultTimeOut, TimeUnit.SECONDS);
   }
    public String pageBody(){
        return webDriver.findElement(By.tagName("body")).getText();
    }

    public void openChildPage() throws InvalidArgumentException{
        if(childUrl != "" ){
            webDriver.get(Data.mainUrl + childUrl);
        }else{
            throw new IllegalArgumentException("nie ma childUrl");
        }
    }

    public void waitForElementStringToChange(WebElement element , int timeout) throws TimeoutException, InterruptedException{

        String loadingString = element.getText();
        do{
            timeout--;
            Thread.sleep(1);
        }while (timeout > 0 && element.getText().contains(loadingString) );

        if(timeout==0){
            throw new TimeoutException("timeout waiting for element " + element.toString());
        }

    }

    public WebDriver getDriver(){
        return this.webDriver;
    }

    public void closeDriver(){
        webDriver.close();
        webDriver.quit();
    }
}
