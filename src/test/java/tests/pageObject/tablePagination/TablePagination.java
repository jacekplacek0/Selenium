package tests.pageObject.tablePagination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import tests.pageObject.BasePage;
// » «
public class TablePagination extends BasePage{
    @FindBy(xpath = "//ul[@id='myPager']/li/a[contains(text(),'«')]")
    private WebElement buttonPrev;

    @FindBy(xpath = "//ul[@id='myPager']/li/a[contains(text(),'1')]")
    private WebElement buttonOne;

    @FindBy(xpath = "//ul[@id='myPager']/li/a[contains(text(),'2')]")
    private WebElement buttonTwo;

    @FindBy(xpath = "//ul[@id='myPager']/li/a[contains(text(),'3')]")
    private WebElement buttonThree;

    @FindBy(xpath = "//ul[@id='myPager']/li/a[contains(text(),'»')]")
    private WebElement buttonNext;

    public TablePagination(WebDriver webDriver) {
        super(webDriver);
        childUrl = "table-pagination-demo.html";
    }

    public int countVisibleRecords(){
        return webDriver.findElements(By.xpath("//table[@class='table table-hover']/tbody/tr[@style='display: table-row;']")).size();
    }

    public void clickButtonOne(){
        buttonOne.click();
    }
    public void clickButtonTwo(){
        buttonTwo.click();
    }
    public void clickButtonThree(){
        buttonThree.click();
    }

    public boolean isPrevButtonVisible(){
        return buttonPrev.isDisplayed();
    }

    public boolean isNextButtonVisible() {
        return buttonNext.isDisplayed();
    }
}
