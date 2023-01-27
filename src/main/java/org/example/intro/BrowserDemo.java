package org.example.intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class BrowserDemo extends BaseTest{

    //BrowserHelper browserHelper= new BrowserHelper(driver);
    @Test
    public void Test1(){
        driver.navigate().to("https://demoqa.com/browser-windows");
        WebElement newTab = driver.findElement(By.id("tabButton"));

        newTab.click();
        Helper.pause(5000);
        browserHelper.switchToWindow(0);
        Helper.pause(3000);
    }

}
