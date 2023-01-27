package org.example.intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public abstract class BaseTest {
    WebDriver driver;
    BrowserHelper browserHelper;
    AlertHelper alertHelper;

    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup(); // configure ChromeDriver to connect browser
        driver = new ChromeDriver();  // creating instance of ChromeDriver
        driver.manage().window().maximize(); // maximizing window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(55));
        BrowserHelper browserHelper= new BrowserHelper(driver);
        alertHelper = new AlertHelper(driver);
    }
    @AfterClass
    public void tearDown(){
        driver.close();
        driver.quit();
    }

}
