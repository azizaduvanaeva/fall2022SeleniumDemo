package org.example.intro;

import org.testng.annotations.Test;

public class BrowserNavigationDemo extends BaseTest{
    @Test
    public void Test1(){
        driver.navigate().to("https://www.imoving.com/");

    }
}
