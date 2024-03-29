package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class HomeWorks2 {

    /*
    navigate to fb.com
    click on create new account
    fill up all the textboxes
    click on sign up button
    close the pop up
    close the browser
     */

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.fb.com");
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(3000);
        WebElement firstName=driver.findElement(By.name("firstname"));
        firstName.sendKeys("Eren");
        WebElement lastName=driver.findElement(By.name("lastname"));
        lastName.sendKeys("Dagdemir");
        WebElement email=driver.findElement(By.name("reg_email__"));
        email.sendKeys("adana@gmail.com");
        WebElement confirmEmail=driver.findElement(By.name("reg_email_confirmation__"));
        confirmEmail.sendKeys("adana@gmail.com");
        WebElement password=driver.findElement(By.name("reg_passwd__"));
        password.sendKeys("password123");
        WebElement birthMonth=driver.findElement(By.id("month"));
        birthMonth.sendKeys("may");
        WebElement birthDay=driver.findElement(By.id("day"));
        birthDay.sendKeys("21");
        WebElement birthYear=driver.findElement(By.id("year"));
        birthYear.sendKeys("1990");
        driver.findElement(By.className("_58mt")).click();
        driver.findElement(By.name("websubmit")).click();
        Thread.sleep(10000);
        WebElement popup=driver.findElement(By.cssSelector("https://static.xx.fbcdn.net/rsrc.php/v3/y2/r/__geKiQnSG-.png"));
        popup.click();









    }
}

