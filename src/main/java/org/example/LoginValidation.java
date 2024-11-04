
    package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

    public class LoginValidation {
        public static void main(String[] args) throws InterruptedException {
            WebDriver driver = new ChromeDriver(); // check in which
            driver.get("https://www.saucedemo.com/"); //opens chromme
            driver.manage().window().maximize(); // maximize the chrome
            Thread.sleep(2000);
            WebElement username = driver.findElement(By.id("user-name"));
            username.sendKeys("standard_user");
            Thread.sleep(2000);
            WebElement password = driver.findElement(By.id("password"));
            password.sendKeys("secret_sauce");
            Thread.sleep(2000);
            WebElement loginbutton = driver.findElement(By.id("login-button"));
            loginbutton.click();
            Thread.sleep(2000);
            WebElement slider=driver.findElement(By.id("react-burger-menu-btn"));
            slider.click();
            Thread.sleep(2000);
            WebElement logout=driver.findElement(By.id("logout_sidebar_link"));
            logout.click();
            driver.quit();
            System.out.println("Logout successful");
        }
    }

