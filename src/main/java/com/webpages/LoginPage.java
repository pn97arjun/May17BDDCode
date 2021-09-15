package com.webpages;

import com.base.TestBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class LoginPage extends TestBase {
    WebDriver driver;
    public LoginPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath="//a[text()='REGISTER']")
    public static WebElement registerLink;

    @FindBy(xpath="//input[@name='firstName']")
    public static WebElement firstNameInput;

    public void register()
    {
      System.out.println("Registering");
      registerLink.click();
      firstNameInput.sendKeys("John");

    }





}
