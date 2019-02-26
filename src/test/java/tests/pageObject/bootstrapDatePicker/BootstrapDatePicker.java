package tests.pageObject.bootstrapDatePicker;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import tests.pageObject.BasePage;

import java.util.Calendar;
import java.util.TimeZone;

public class BootstrapDatePicker extends BasePage {

    @FindBy(xpath = "//input[@placeholder='dd/mm/yyyy']")
    private WebElement dateField;
    @FindBy(xpath="//th[@class='today']")
    private WebElement todayButton;
    @FindBy(xpath="//th[@class='clear']")
    private WebElement clearButton;
    @FindBy(xpath="//input[@placeholder='Start date']")
    private WebElement startDateButton;
    @FindBy(xpath="//input[@placeholder='End date']")
    private WebElement endDateButton;
    @FindBy(xpath="//td[@class='day' and contains(text(),'26')]")
    private WebElement setUpCurrentDay;
    @FindBy(xpath="//td[@class='new day']")
    private WebElement setUpNextDay;

    public BootstrapDatePicker(WebDriver webDriver){
        super(webDriver);
        childUrl = "bootstrap-date-picker-demo.html";
    }

    public void clickDateField(){dateField.click();}

    public void clickTodayButton(){todayButton.click();}

    public void clickClearButton(){clearButton.click();}

    public void clickStartDateButton(){startDateButton.click();}
    public void setCurrentDay(){setUpCurrentDay.click();}
    public void clickEndDateButton(){endDateButton.click();}
    public void setNextDay(){setUpNextDay.click();}


}
