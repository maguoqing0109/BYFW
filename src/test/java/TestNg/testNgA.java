package TestNg;

import org.testng.annotations.*;

public class testNgA {
    @BeforeClass      // Beforeclass
    public void methodA() {
        System.out.println("这是测试执行");
    }

    @Test
    public void methodB() {
        System.out.println("这是测试体B");
    }

/*    @Test
    public void methodC() {
        System.out.println("这是测试体C");
    }*/

    @AfterClass
    public void methodE() {
        System.out.println("测试结束清理环境");
    }
}
