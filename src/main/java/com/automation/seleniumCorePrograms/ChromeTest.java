package com.automation.seleniumCorePrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.Set;

public class ChromeTest
{
     public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver","/Users/neelimak/Downloads/chromedriver");
        ChromeDriver driver = new ChromeDriver();
          //WebDriver driver=new ChromeDriver();
        RemoteWebDriver driver=new ChromeDriver();
        /*driver.get("https://formy-project.herokuapp.com/form");
        driver.findElement(By.id("first-name")).sendKeys("First Name");
        driver.findElement(By.id("last-name")).sendKeys("Last Name");
        driver.findElement(By.xpath("//a[contains(text(),'Submit')]")).click();
        driver.close();*/
        driver.get("https://www.gmail.com");
        String actualTitle=driver.getCurrentUrl();
        System.out.println("Title is:" + actualTitle);
        String actualCurUrl=driver.getCurrentUrl();
        System.out.println("Current Url is:" + actualCurUrl);
        String curWindowName=driver.getWindowHandle();
        System.out.println("Current window name is:" + curWindowName);
        Set<String> windows=driver.getWindowHandles();
        System.out.println(" window are:" + windows);
        WebElement userName=driver.findElement(By.id("identifierId"));
        userName.sendKeys("neelima.karu@gmail.com");
        WebElement nxt= driver.findElement(By.id("identifierNext"));
        nxt.click();
        Thread.sleep(5000);
        driver.close();
    }
}
