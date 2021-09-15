package com.base;



import org.junit.Before;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;


import java.util.concurrent.TimeUnit;

public class TestBase {

    public static WebDriver driver;

    public static void initializeBrowser()
    {
        System.setProperty("webdriver.chrome.driver","src/main/resources/Drivers/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/test/newtours/index.php");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public static void logOff()
    {
        System.out.println("Quiting");
        driver.quit();
    }


    /*public void waitforElement(WebElement e)
    {
        WebDriverWait wait=new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(e.toString())));

    }*/

    /*public void switchWindow()
    {
        for(String windowHandle:driver.getWindowHandles())
        {
            driver.switchTo().window(windowHandle);
            driver.switchTo().defaultContent();
        }
    }
    public void switchFrame(String frameId)
    {
        driver.switchTo().defaultContent();
        driver.switchTo().frame(frameId);
    }
*/

   /* public static void browserInitialize()
    {
        System.setProperty("webdriver.chrome.driver","src/main/resources/Drivers/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/test/newtours/index.php");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }*/


}
