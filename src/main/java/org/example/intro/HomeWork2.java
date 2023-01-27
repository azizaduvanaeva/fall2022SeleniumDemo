package org.example.intro;

import com.github.javafaker.Faker;
import com.github.javafaker.Number;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomeWork2 extends BaseTest{
    @Test
    public void webTables (){
        driver.navigate().to("https://demoqa.com/webtables");
        driver.findElement(By.id("addNewRecordButton")).click();
        Faker faker = new Faker();
        String fName = faker.name().name();
        String lName = faker.name().lastName();
        String email = faker.internet().emailAddress();
        String age = String.valueOf(faker.number().randomDigit());
        String salary = String.valueOf(faker.number().randomDigit());
        String department = faker.job().field();

        WebElement fullNameInput = driver.findElement(By.id("firstName"));
        WebElement lastName1 = driver.findElement(By.id("lastName"));
        WebElement email1 = driver.findElement(By.id("userEmail"));
        WebElement ageInput = driver.findElement(By.id("age"));
        WebElement salary2 = driver.findElement(By.id("salary"));
        WebElement department1 = driver.findElement(By.id("department"));

        fullNameInput.sendKeys(fName);
        lastName1.sendKeys(lName);
        email1.sendKeys(email);
        ageInput.sendKeys(age);
        salary2.sendKeys(salary);
        department1.sendKeys(department);

        driver.findElement(By.id("submit")).click();


        WebElement allData = driver.findElement(By.xpath("//div[@class='col-12 mt-4 col-md-6']"));
        System.out.println(allData.getText());

//        List<WebElement> saveData = driver.findElement(By.xpath());

        List<WebElement> saveData = driver.findElements(By.xpath("//div[@class='col-12 mt-4 col-md-6']"));

        for(WebElement j: saveData) {
            System.out.println(j.getText());
            Helper.pause(3000);
            System.out.println("----------------");
            break;
        }

    }
}
