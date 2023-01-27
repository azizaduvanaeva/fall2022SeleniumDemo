package org.example.intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class xPathEtsy extends BaseTest{
    @Test
    public void XPathsEtsy(){
        driver.navigate().to("https://www.etsy.com/");
       // WebElement cart = driver.findElement(By.xpath("//*[name()='path' and contains(@d,'M9 22a2 2 ')]"));
        //cart.click();
        WebElement personalizedGifts = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/div/ul/li[2]/a"));
        personalizedGifts.click();

    }


}
