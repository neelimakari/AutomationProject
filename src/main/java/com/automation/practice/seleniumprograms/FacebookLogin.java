package com.automation.practice.seleniumprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin
{
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/neelimak/Downloads/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://www.facebook.com/");
        /*WebElement userName=driver.findElement(By.id("email"));
        userName.sendKeys("neelima.karu@gmail.com");
        WebElement nxt= driver.findElement(By.id("emaildata-test"));
        nxt.click();*/
        Thread.sleep(3000);
        driver.close();
    }
}
