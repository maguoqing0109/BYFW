package DriverFrameWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browsers {
    private String driverLocated = System.getProperty("user.dir");
    public static WebDriver drivers;
    public Browsers(BrowserTypes browserTypes) {
        switch (browserTypes) {
            case chrome:
                System.out.println("初始化dirver: " + browserTypes);
                System.setProperty("webdriver.chrome.driver", driverLocated +
                        "\\Drivers\\" + "chromedriver.exe");
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--start-maximized");
                drivers = new ChromeDriver(options);
                break;

            case firefox:
                System.out.println("初始化dirver: " + browserTypes);
                System.setProperty("webdriver.gecko.driver", driverLocated +
                        "\\Drivers\\" + "geckodriver.exe");
                System.setProperty("webdriver.firefox.bin", "C:\\Program Files\\Mozilla Firefox\\firefox.exe");
                drivers = new FirefoxDriver();
                break;

            case ie:
                System.out.println("初始化dirver: " + browserTypes);
                System.setProperty("webdriver.ie.driver", driverLocated +
                        "\\Drivers\\" + "IEDriverServer.exe");
                drivers = new InternetExplorerDriver();
                break;
        }
    }

/*    public static void main(String[] args) {
        WebDriver driver;
        Browsers browsers = new Browsers(BrowserTypes.chrome);
        driver = browsers.drivers;
        driver.get("http://www.baidu.com/");
        driver.quit();
    }*/
}
