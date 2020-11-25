package DriverPractice;

import DriverFrameWork.BrowserTypes;
import DriverFrameWork.Browsers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DriverCF {
    private String driverLocated = System.getProperty("user.dir");
    private WebDriver driver;

    @BeforeClass
    public void methodA() {
        System.out.println("初始化dirver");
        System.setProperty("webdriver.chrome.driver", driverLocated +
                "\\Drivers\\" + "chromedriver.exe");
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--start-maximized");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    /*@BeforeClass
    public void methodA() {
        System.out.println("初始化dirver");
        System.setProperty("webdriver.gecko.driver", driverLocated +
                "\\Drivers\\" + "geckodriver.exe");
        System.setProperty("webdriver.firefox.bin", "C:\\Program Files\\Mozilla Firefox\\firefox.exe");
        driver = new FirefoxDriver();

    }*/

/*    @BeforeClass
    public void methodA() {
        System.out.println("初始化dirver");
        System.setProperty("webdriver.ie.driver", driverLocated +
                "\\Drivers\\" + "IEDriverServer.exe");
        driver = new InternetExplorerDriver();
    }*/

/*    @BeforeClass
    public void methodA() {
        Browsers browsers = new Browsers(BrowserTypes.chrome);
        driver = browsers.drivers;
    }*/

    @Test
    public void methodB() {
        System.out.println("用力执行体--打开百度页面");
        driver.get("Http://www.baidu.com");
    }

    @AfterMethod
    public void methodC() {
        System.out.println("关闭浏览器");
        driver.quit();
    }
}
