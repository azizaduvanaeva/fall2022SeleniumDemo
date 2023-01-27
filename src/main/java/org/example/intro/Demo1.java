package org.example.intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class Demo1 {
    @Test
    public void testDemo1(){
        WebDriverManager.chromedriver().setup(); // configure ChromeDriver to connect browser
        WebDriver driver = new ChromeDriver();  // creating instance of ChromeDriver
        driver.manage().window().maximize(); // maximizing window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // driver will wait 20 sec
        driver.get("https://demoqa.com/text-box");

        WebElement fullNameInputField = driver.findElement(By.id("userName"));
        fullNameInputField.sendKeys("Aziza");
        WebElement userEmail = driver.findElement(By.id("userEmail"));
        userEmail.sendKeys("doe@gmail.com");
        WebElement currentAddress = driver.findElement(By.id("currentAddress"));
        currentAddress.sendKeys("UAE 000");
        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
        permanentAddress.sendKeys("Dubai 0000");
    }

}
