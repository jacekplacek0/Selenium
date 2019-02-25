package tests.testSuits;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import tests.testCases.testSimpleFormDemo.TestSimpleFormDemo;
import tests.testCases.testCheckBoxDemo.TestCheckBoxDemo;
import tests.testCases.testRadioButtonsDemo.TestRadioButtonsDemo;
import tests.testCases.testAjaxFormSubmit.TestAjaxFormSubmit;
import tests.testCases.testTablePagination.TestTablePagination;
import tests.testCases.testBootstrapAlerts.TestBootstrapAlerts;

@RunWith(Suite.class)
@Suite.SuiteClasses({
    TestSimpleFormDemo.class,
    TestCheckBoxDemo.class,
    TestRadioButtonsDemo.class,
    TestAjaxFormSubmit.class,
    TestTablePagination.class,
    TestBootstrapAlerts.class,
})
public class SampleSuitTests {
}
