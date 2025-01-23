package tests;

import org.testng.annotations.*;

public class PrePostConditions {
// changes after push
    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before Method");
    }

    @Test
    public void test1() {
        System.out.println("This is a Test 1");
    }

    @Test
    public void test2() {
        System.out.println("This is a Test 2");
    }

    @Test
    public void test3() {
        System.out.println("This is a Test 3");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After Method");
    }
}
