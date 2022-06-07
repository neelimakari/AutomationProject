package com.automation.seleniumCorePrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class ActionsDemo
{
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver","/Users/neelimak/Downloads/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
        driver.get("https://www.gmail.com");
        WebElement userName= driver.findElement(By.id("identifierId"));
        userName.sendKeys("neelima.karu@gmail.com");
        Actions actions=new Actions(driver);
        //actions.click(userName).sendKeys("neelima.karu@gmail.com").build().perform();
        //Actions actions2=actions
        WebElement nxt=driver.findElement(By.id("identifierNext"));
        nxt.click();
        actions.click(nxt).build().perform();
        actions.doubleClick().build().perform();
        actions.sendKeys(nxt,Keys.ENTER).build().perform();
        driver.get("https://www.google.com");
        actions.sendKeys(Keys.chord(Keys.CONTROL,"s")).build().perform();
        actions.sendKeys(Keys.chord(Keys.CONTROL,"t")).build().perform();
        actions.sendKeys(Keys.chord(Keys.CONTROL,Keys.SHIFT,"s")).build().perform();
        actions.sendKeys(Keys.END).build().perform();
        actions.sendKeys(Keys.HOME).build().perform();
        actions.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN).build().perform();
        driver.get("https://www.amazon.com");
        WebElement flag=driver.findElement(By.xpath("//span[@class='icp-nav-flag icp-nav-flag-gb']"));
        actions.moveToElement(flag).build().perform();
    }
}
