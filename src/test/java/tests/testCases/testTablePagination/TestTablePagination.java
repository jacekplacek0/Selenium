package tests.testCases.testTablePagination;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import tests.pageObject.tablePagination.TablePagination;
import tests.testCases.BaseTestCase;

public class TestTablePagination extends BaseTestCase{
    @Test
    public void testTablePaginationDemo() throws InterruptedException{
        TablePagination tablePagination = new TablePagination(webDriver);
        PageFactory.initElements(webDriver,tablePagination);

        tablePagination.openChildPage();

        assertTrue(tablePagination.isNextButtonVisible());
        assertFalse(tablePagination.isPrevButtonVisible());

        assertTrue("Too many records ", tablePagination.countVisibleRecords() <= 5	);
        tablePagination.clickButtonTwo();

        assertTrue("Too many records ", tablePagination.countVisibleRecords() <= 5	);
        assertTrue(tablePagination.isNextButtonVisible());
        assertTrue(tablePagination.isPrevButtonVisible());

        tablePagination.clickButtonThree();

        assertTrue("Too many records ", tablePagination.countVisibleRecords() <= 5	);
        assertFalse(tablePagination.isNextButtonVisible());
        assertTrue(tablePagination.isPrevButtonVisible());
    }
}
