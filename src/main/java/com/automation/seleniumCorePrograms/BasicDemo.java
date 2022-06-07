package com.automation.seleniumCorePrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class BasicDemo
{
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/neelimak/Downloads/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
        driver.get("https://www.rameshsoft.com");
        driver.findElement(By.xpath("//a[text()='Contact Now']")).click();
        WebElement contactNow=driver.findElement(By.xpath("//a[text()='Contact Now']"));
        if(contactNow.isDisplayed()&&contactNow.isEnabled())
        {
            contactNow.click();
        }
    else
        {
            System.out.println("Contact Now element is not displayed");
        }
    WebElement radioBtn=driver.findElement(By.xpath("//input[@value='Offline']"));
    if(radioBtn.isDisplayed()&& radioBtn.isEnabled())
    {
        radioBtn.click();
    }
    else
    {
        System.out.println("Radio button is not displayed");
    }
    if (radioBtn.isSelected())
        {
        System.out.println("Radio button is selected");
        }
    else
    {
        System.out.println("Radio button is not selected");
    }
    WebElement chkBox=driver.findElement(By.xpath("//input[@name='AgreeWithUs']"));
    if(chkBox.isDisplayed()&&chkBox.isEnabled())
        {
            chkBox.click();
        }
    else
        {
            System.out.println("Check box is not displayed");
        }

    if(chkBox.isSelected())
    {
        System.out.println("Check box is selected");
    }
    else
    {
        System.out.println("Check box is not selected");
    }
WebElement dd=driver.findElement(By.name("use_label_element"));
    String tagName=dd.getTagName();
    if(tagName.equalsIgnoreCase("select"))
    {
        Select select=new Select(dd);
        select.selectByIndex(0);
        select.selectByValue("Core Java");
        select.selectByVisibleText("Selenium Through Java");
        List<WebElement> ddElements=select.getOptions();
        System.out.println("No of elements in drop down:" + ddElements.size());
        List<WebElement> ddSelectedElements=select.getAllSelectedOptions();
        System.out.println("No of elements in drop down selected elements are :" + ddSelectedElements.size());
        WebElement firstElement=select.getFirstSelectedOption();
        System.out.println("First selected element is :" + firstElement.getText());
        boolean status=select.isMultiple();
        if(status)
        {
            System.out.println("It is multi select drop down");
        }
        else
        {
            System.out.println("It is not a multi select drop down");
        }
    }

    else
    {
        List<WebElement> ddSelectedElements= driver.findElements(By.xpath("//*[@name='use_label_element']/option"));
    System.out.println("No of drop down selected elements are:" + ddSelectedElements.size());
    WebElement element=driver.findElement(By.xpath("//*[@name='use_label_element']/option[3]"));
    element.click();



    }







    }
    }



