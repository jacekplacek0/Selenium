package tests.testSuits;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import tests.testCases.testSimpleFormDemo.TestSimpleFormDemo;
@RunWith(Suite.class)
@Suite.SuiteClasses({
    TestSimpleFormDemo.class,
})
public class SampleSuitTests {
}
