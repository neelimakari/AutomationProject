package com.automation.seleniumCorePrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class RightClickDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/neelimak/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
        driver.get("https://www.jqueryui.com");
        Thread.sleep(9000);
        driver.findElement(By.linkText("Autocomplete")).click();
        Thread.sleep(29000);
        List<WebElement> frames=driver.findElements(By.tagName("iframe"));
        System.out.println("No of frames are:" + frames.size());
        driver.switchTo().frame(0);
        driver.findElement(By.id("tags")).sendKeys("JOB");
        driver.switchTo().defaultContent();
        //WebElement element=driver.findElement(By.className("demo-frame"));
        //driver.switchTo().frame(element);
        driver.findElement(By.linkText("Draggable")).click();
        driver.switchTo().frame(0);
        WebElement draggable1=driver.findElement(By.id("draggable"));
        Actions actions=new Actions(driver);
        actions.dragAndDropBy(draggable1,150,150).build().perform();
        driver.switchTo().defaultContent();
        driver.findElement(By.linkText("Droppable")).click();
        driver.switchTo().frame(0);
        WebElement draggable11=driver.findElement(By.id("draggable"));
        WebElement droppable2=driver.findElement(By.id("droppable"));
        driver.close();
    }
}