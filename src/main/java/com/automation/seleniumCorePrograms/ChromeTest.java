package com.automation.seleniumCorePrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ChromeTest
{
     public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver","/Users/neelimak/Downloads/chromedriver");
        ChromeDriver driver = new ChromeDriver();
          //WebDriver driver=new ChromeDriver();
        RemoteWebDriver driver=new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/form");
        driver.findElement(By.id("first-name")).sendKeys("First Name");
        driver.findElement(By.id("last-name")).sendKeys("Last Name");
        driver.findElement(By.xpath("//a[contains(text(),'Submit')]")).click();
        driver.close();//
    }
}
