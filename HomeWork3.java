package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class HomeWork3 {

    /*
    navigate to fb.com
    click on create new account
    fill up all the textboxes
    click on sign up button
    close the pop up
    close the browser
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.fb.com");
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("firstname")).sendKeys("Eren");
        driver.findElement(By.name("lastname")).sendKeys("Dagdemir");
        driver.findElement(By.name("reg_email__")).sendKeys("adana@gmail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("adana@gmail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("password123");
        driver.findElement(By.id("month")).sendKeys("may");
        driver.findElement(By.id("day")).sendKeys("20");
        driver.findElement(By.id("year")).sendKeys("1990");
        driver.findElement(By.className("_58mt")).click();
        driver.findElement(By.name("sex")).sendKeys("Male");
        driver.findElement(By.name("websubmit")).click();
        Thread.sleep(5000);
        driver.close();


    }
}

