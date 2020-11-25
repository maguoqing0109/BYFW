package TestNg;

import org.testng.annotations.*;

public class TestNgB {

    @DataProvider(name = "dataA")
    public Object[][] dataMethod() {
        return new Object[][] {
            {"用户名a", "密码b", "断言c"},
            {"用户名d", "密码e", "断言f"},
            {"用户名g", "密码h", "断言k"}
        };
    }

    @Test(dataProvider = "dataA")
    public void methodA(String name, String pwd, String ast) {
        System.out.println("输入用户名：" +name);
        System.out.println("输入密码：" +pwd);
        System.out.println("点击登录按钮.");
        System.out.println("断言：" + ast);
        System.out.println("=======================================");
    }
}
