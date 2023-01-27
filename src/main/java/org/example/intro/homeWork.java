package org.example.intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;

import java.time.Duration;

public class homeWork {
    WebDriver driver;


    @BeforeClass
    public void glovoSignIn(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        driver.get("https://glovoapp.com/kg/ru/bishkek/");

    }
    @Test (description = "Find Get Started button")
    public void xPath1(){
        WebElement signIn = driver.findElement(By.xpath("//*[@id=\"user-register\"]/span"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)", "");
        signIn.click();
    }
    @Test
    public void register(){
        WebElement fullNameInput = driver.findElement(By.xpath("//*[@id=\"signup-name\"]/div/input"));
        fullNameInput.sendKeys("Aziza");

    }
    @Test
    public void email(){
        WebElement email = driver.findElement(By.xpath("//*[@id=\"signup-email\"]/div/input"));
        email.sendKeys("azi@gmail.com");
    }
    @Test
    public void password(){
        WebElement password = driver.findElement(By.xpath("//*[@id=\"signup-password\"]/div/div/input"));
        password.sendKeys("54321");
    }

}