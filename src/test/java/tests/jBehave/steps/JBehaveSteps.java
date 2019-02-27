package tests.jBehave.steps;

import java.util.concurrent.TimeUnit;

import org.jbehave.core.annotations.AfterStory;
import org.jbehave.core.annotations.BeforeStory;
import org.jbehave.core.embedder.Embedder;
import org.jbehave.core.io.StoryFinder;
import org.jbehave.core.steps.Steps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import tests.data.Data;

public abstract class JBehaveSteps extends Steps {
	protected WebDriver webDriver;
	@BeforeStory
	 public void setUp() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver",Data.driverPath);
		webDriver = new ChromeDriver();
		webDriver.manage().timeouts().implicitlyWait(Data.defaultTimeOut, TimeUnit.SECONDS);
	}

	@AfterStory
	public void cleanUp() throws InterruptedException{
		webDriver.close();
		webDriver.quit();
	}
}
