package tests.testCases;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import tests.data.Data;
public abstract class BaseTestCase {
    protected WebDriver webDriver;
    @Before
    public void setUp() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver",Data.driverPath);
        webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(Data.defaultTimeOut, TimeUnit.SECONDS);
    }

    @After
    public void cleanUp() throws InterruptedException{
        webDriver.close();
        webDriver.quit();
    }
}