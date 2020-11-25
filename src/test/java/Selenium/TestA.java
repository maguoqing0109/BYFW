package Selenium;

import DriverFrameWork.BrowserTypes;
import DriverFrameWork.Browsers;
import org.openqa.selenium.*;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.awt.*;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class TestA {
    private WebDriver driver;
    private String URL = "file:///C:/Users/AUTO/Desktop/BeyondSofter_HTML" +
            "/BeyondSofter_HTML/selenium_html/index.html";
    @BeforeClass
    public void methodA() throws InterruptedException {
        Browsers browsers = new Browsers(BrowserTypes.chrome);
//        Browsers browsers = new Browsers(BrowserTypes.firefox);
        driver = browsers.drivers;

        // 打开网页方法
        driver.get(URL);
        Thread.sleep(3000);
    }

    @Test     // 浏览器的常规操作方法
    public void methodB() throws InterruptedException {
        // 浏览器设置指定窗口大小
        Dimension dimension = new Dimension(800, 800);
        driver.manage().window().setSize(dimension);
        sleep(3);

        // 最大化浏览器
        driver.manage().window().maximize();
        sleep(3);

        // 后退网页
        driver.navigate().back();
        sleep(3);

        // 前进网页
        driver.navigate().forward();
        sleep(3);

        // 刷新网页
        driver.navigate().refresh();
        sleep(3);
    }

    /*@Test
    public void methodC() throws InterruptedException {
        // 获取当前网页的 title 标题
        String titleText = driver.getTitle();
        System.out.println("当前网页的title: " + titleText);
        System.out.println("=====================================");
        sleep(3);

        // 获取当前网页 URL
        String Url = driver.getCurrentUrl();
        System.out.println("当前网页的url:" + Url);
        System.out.println("====================================");
        sleep(3);

        // 获取当前按钮 text 通过 ‘name’属性  【控件名称】
        WebElement elemnetA = driver.findElement(By.name("kj"));
        String textA = elemnetA.getText();
        System.out.println("====================================");
        System.out.println("当前元素的文本值：" + textA);

        // 获取元素对应属性值
        String textAttributeName = elemnetA.getAttribute("name");
        System.out.println("当前元素对应name 的属性值：" + textAttributeName);
    }*/

/*    @Test // 文本输入框的操作方法
    public void methodD() throws InterruptedException {
        // 定位输入框--清除--输入文本
        WebElement elementA = driver.findElement(By.id("user"));
        elementA.clear();
        sleep(2);
        elementA.sendKeys("BeyondSofter");
        System.out.println("============================");
        sleep(3);
    }*/

/*    @Test // 下拉选择框的处理
    public void methodE() throws InterruptedException {
        WebElement element = driver.findElement(By.xpath("//select[@id='moreSelect']"));
        Select select = new Select(element);
        // 通过索引定位元素
        select.selectByIndex(2);
        sleep(3);
        // 通过 Value 属性值定位元素
        select.selectByValue("xiaomi");
        sleep(3);
        // 通过text 文本值定位元素
        select.selectByVisibleText("huawei");
    }*/

/*    @Test // 单选框的处理
    public void methodF() throws InterruptedException {
        WebElement elementA = driver.findElement(By.className("OpelA"));
        elementA.click();
        sleep(3);

        Boolean isCheckA = elementA.isSelected();
        System.out.println("Opel单选框是否选中：" + isCheckA);
        sleep(2);
        Assert.assertTrue(isCheckA);
        System.out.println("==================================");

        WebElement elementB = driver.findElement(By.className("AudiA"));
        Boolean isCheckB = elementB.isSelected();
        System.out.println("Audi单选框是否被选中：" + isCheckB);
        Assert.assertFalse(isCheckB);
    }*/

/*    @Test // 复选框的处理
    public void methodG() throws InterruptedException {
        WebElement element = driver.findElement(By.name("checkboxC"));
        *//*element.click();
        sleep(3);*//*

        // 先判断复选框是否为选中状态，在进行点击
        if(!element.isSelected()) {
            element.click();
        }
    }*/

/*    @Test // Alert 警告弹窗的处理
    public void methodH() throws InterruptedException {
        WebElement element = driver.findElement(By.className("alertA"));
        element.click();
        sleep(2);
        // driver 控制权转交
        Alert alert = driver.switchTo().alert();
        sleep(2);
        // 打印弹窗文本
        System.out.println("弹窗文本值：" + alert.getText());
        alert.accept();
    }*/

/*    @Test
    public void methodJ() throws InterruptedException {
        WebElement element = driver.findElement(By.xpath("//div[@id='confirmA']/input"));
        element.click();
        sleep(2);
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
        sleep(3);
        alert.accept();
    }*/

/*    @Test // 警告输入框的处理
    public void methodK() throws InterruptedException {
        WebElement element = driver.findElement(By.xpath("//div[@id='promptA']/input"));
        element.click();
        sleep(2);
        Alert alert = driver.switchTo().alert();
        sleep(2);
        alert.sendKeys("BeyondSofter");  // 谷歌Bug,firefox可以正确输入.
        sleep(3);
        alert.accept();
    }*/

/*    @Test //JS 滚动窗处理
    public void methodL() {
        WebElement element = driver.findElement(By.id("loadA"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)", element);
//        JavascriptExecutor js = ((JavascriptExecutor)driver);
//        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }*/

/*    @Test // 上传文件方法
    public void methodW() throws InterruptedException {
        WebElement element = driver.findElement(By.id("loadA"));
        // 滑动至需操作上传文件按钮处
        scrollIntoView(element);
        sleep(2);
        // 本地文件路径
        String filePath = "C:\\Users\\AUTO\\Desktop\\JavaSeleniumFrameWork.png";
        element.sendKeys(filePath);
    }*/

/*    @Test
    public void methodM() throws InterruptedException {
        // 多窗口句柄操作
        WebElement elementA = driver.findElement(By.linkText("Open new window"));
        sleep(2);
        String indexModel = driver.getWindowHandle();
        elementA.click();
        Set<String> handles = driver.getWindowHandles();

        // 遍历判断当前页面是否为百度页面
        for(String handle : handles) {
            if(handle.equals(indexModel)) {
                continue;
            }
            driver.switchTo().window(handle);
        }
        sleep(2);

        WebElement elementBDSearch = driver.findElement(By.id("kw"));
        sleep(2);
        elementBDSearch.sendKeys("BeyondSofter");
        sleep(2);
    }*/

/*    @Test // 鼠标悬浮操作场景
    public void methodN() throws InterruptedException {
        Actions actions = new Actions(driver);
        WebElement elementA = driver.findElement(By.className("over"));
        sleep(2);
        actions.moveToElement(elementA).perform();
        sleep(2);
        WebElement elementB = driver.findElement(By.className("display"));
        System.out.println("检查 \"Hello World!:\" 是否正常显示：" + elementB.isDisplayed());
    }*/

/*    @Test // 动态方法检索等待
    public void methodT() {
        WebElement elementA = driver.findElement(By.className("wait"));
        scrollIntoView(elementA);
        elementA.click();

        // 动态检索元素等待
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("red")));
        WebElement elementB = driver.findElement(By.className("red"));

        System.out.println("检查‘wait for display’ 文本是否正常显示：" + elementB.isDisplayed());
    }*/

    // Actions 模拟鼠标选择多个选项
/*    @Test
    public void methodV() {
        // 下拉列表选择 1 、4 Value
        Actions actions = new Actions(driver);
        driverWait(By.xpath("//option[contains(text(), 'Emmental')]"));
        WebElement elementFirst = driver.findElement(By.xpath("//option[contains(text(), 'Emmental')]"));
        scrollIntoView(elementFirst);

        driverWait(By.xpath("//option[contains(text(), 'Cheddar')]"));
        WebElement elementFour = driver.findElement(By.xpath("//option[contains(text(), 'Cheddar')]"));
        scrollIntoView(elementFirst);
        actions.keyDown(Keys.CONTROL).     // SHIFT
                click(elementFirst).
                click(elementFour).
                keyUp(Keys.CONTROL).
                perform();
    }*/

/*    @Test // 表单 frame / iframe
    public void methodX() {
//        driver.switchTo().frame("aa");
//        driver.switchTo().frame(0);
        WebElement elementA = driver.findElement(By.name("aa"));
        driver.switchTo().frame(elementA);
        driverWait(By.id("userA"));
        WebElement element = driver.findElement(By.id("userA"));
        scrollIntoView(element);
        element.sendKeys("BeyondSoft");
    }*/



    @AfterMethod
    public void methodZ() throws InterruptedException {
        sleep(3);
        driver.quit();
    }

    public void sleep(int i) throws InterruptedException {
        Thread.sleep(1000 * i);
    }

    // 页面滑动至指定元素
    public void scrollIntoView(WebElement element) {
        ((JavascriptExecutor)driver).
                executeScript("arguments[0].scrollIntoView(true)", element);
    }

    // 元素动态等待
    public void driverWait(By by) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    // 自定义封装等待
    public void driverOwnWait(final By by) {
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).
                withTimeout(300, TimeUnit.SECONDS).
                pollingEvery(1, TimeUnit.SECONDS).
                ignoring(NoSuchElementException.class).
                withMessage("Time loading succeed");
        wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(by);
            }
        });
    }
}
