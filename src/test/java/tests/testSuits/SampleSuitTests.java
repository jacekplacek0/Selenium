package tests.testSuits;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import tests.testCases.testSimpleFormDemo.TestSimpleFormDemo;
import tests.testCases.testCheckBoxDemo.TestCheckBoxDemo;
import tests.testCases.testRadioButtonsDemo.TestRadioButtonsDemo;

@RunWith(Suite.class)
@Suite.SuiteClasses({
    TestSimpleFormDemo.class,
    TestCheckBoxDemo.class,
    TestRadioButtonsDemo.class,
})
public class SampleSuitTests {
}
