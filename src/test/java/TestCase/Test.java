package TestCase;

import org.testng.annotations.BeforeTest;

public class Test {
    @org.testng.annotations.Test
    public void test(){
        System.out.println("这是成功的");
    }
    @BeforeTest
    public void befor(){
        System.out.println("提前执行");
    }
}
