package com_herokuapp_hw_ks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*
Project-3 - ProjectName : com-herokuapp
BaseUrl = http://the-internet.herokuapp.com/login
1. Setup chrome browser.
2. Open URL.
3. Print the title of the page.
4. Print the current url.
5. Print the page source.
6. Enter the email to email field.
7. Enter the password to password field.
8. Click on Login Button.
9. Print the current url.
10. Refresh the page.
11. Close the browser.
 */
public class HeroKuApp {

    public static void main(String[] args) {
        //1. Setup Chrome Browser
        ChromeDriver driver = new ChromeDriver();
        //2. Open URL
        driver.get("http://the-internet.herokuapp.com/login");
        //3. Print the title of the page
        System.out.println("The title of the page:  " + driver.getTitle());
        //4. Print the current URL
        System.out.println("Current URL: " + driver.getCurrentUrl());
        //5. Print the page source
        System.out.println("The page source: " + driver.getPageSource());
        //6.Enter the email to email field
        WebElement emailField = driver.findElement(By.id("username"));
        emailField.sendKeys("xyz@gmail.com");
        //7.Enter the password to password field
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("xyz123");
        //8. Click on Login button
        WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"login\"]/button/i"));
        loginButton.click();
        //9. Print the current url.
        System.out.println("Current URL: " + driver.getCurrentUrl());
        //10. Refresh the page.
        driver.navigate().refresh();
        //11. Close the browser.
        driver.quit();
    }
}
