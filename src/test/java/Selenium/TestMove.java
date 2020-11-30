package Selenium;

import DriverFrameWork.BrowserTypes;
import DriverFrameWork.Browsers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestMove {
    private WebDriver driver;
    private String Url = "file:///C:/Users/AUTO/Desktop/BeyondSofter_HTML/" +
            "BeyondSofter_HTML/selenium_html/dragAndDrop.html";

    @BeforeClass
    public void methodA() {
        Browsers browsers = new Browsers(BrowserTypes.chrome);
        driver = browsers.drivers;
        driver.get(Url);
    }

    @Test
    public void methodB() throws InterruptedException {
        Thread.sleep(3000);
        WebElement elementA = driver.findElement(By.id("drag"));
        WebElement elementB = driver.findElement(By.xpath("//h1"));

        Actions actions = new Actions(driver);
        actions.dragAndDropBy(elementA, 400, 400).perform();
        Thread.sleep(3000);

        actions.dragAndDrop(elementA, elementB).perform();
        Thread.sleep(3000);
        Assert.assertEquals(1, 2);

/*        actions.clickAndHold(elementA).
                moveToElement(elementB).
                release(elementA).perform();*/
    }

    @AfterMethod
    public void methodC() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
