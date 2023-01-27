package org.example.intro;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class AlertDemo extends BaseTest{
    @Test
    public void TestAlert1(){
        driver.get("https://demoqa.com/alerts");
        WebElement alertButton = driver.findElement(By.id("alertButton"));
        alertButton.click();

        Alert alert = driver.switchTo().alert();
        alert.accept();
        Helper.pause(5000);

    }

    @Test
    public void testExplicitWaitAndAlert(){
        driver.get("https://demoqa.com/alerts");
        WebElement alertButton = driver.findElement(By.id("timerAlertButton"));
        alertButton.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    @Test
    public void testThirdButton(){
        driver.get("https://demoqa.com/alerts");
        WebElement thirdButton = driver.findElement(By.id("confirmButton"));
        thirdButton.click();
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
        WebElement cancelBtn = driver.findElement(By.id("confirmResult"));
        Assert.assertEquals(cancelBtn.getText(), "You selected Cancel");
    }
    @Test
    public void promtBoxAlert(){
        driver.get("https://demoqa.com/alerts");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)", "");
        WebElement textEnterBtn = driver.findElement(By.id("promtButton"));
        textEnterBtn.click();
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Aziza");
        alert.accept();
        WebElement textTest = driver.findElement(By.id("promptResult"));
        Assert.assertEquals(textTest.getText(),"You entered Aziza");


    }
}

