package org.example.intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;


public class XpathDemo extends BaseTest {

    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup(); // configure ChromeDriver to connect browser
        WebDriver driver = new ChromeDriver();  // creating instance of ChromeDriver
        driver.manage().window().maximize(); // maximizing window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://demoqa.com/text-box");
    }

    @Test
    public void xpathTest(){
        WebDriverManager.chromedriver().setup(); // configure ChromeDriver to connect browser
        WebDriver driver = new ChromeDriver();  // creating instance of ChromeDriver
        driver.manage().window().maximize(); // maximizing window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // driver will wait 20 sec
        driver.get("https://demoqa.com/text-box");

        WebElement nameText = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[2]/div[1]/label"));
        String expectedEmailText = "Email";
        //System.out.println(nameText);
        Assert.assertEquals(nameText.getText(),expectedEmailText);

        WebElement nameText2 = driver.findElement(By.xpath("//label[@id ='userEmail-label']"));
        Assert.assertTrue(expectedEmailText.contains(nameText2.getText()));

        driver.close();
        driver.quit();

    }

    @AfterClass
    public void tearDown (){
        driver.close();
        driver.quit();

    }
}
