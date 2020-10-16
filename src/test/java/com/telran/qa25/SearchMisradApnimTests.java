package com.telran.qa25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SearchMisradApnimTests {
    WebDriver wd;

    @BeforeMethod
    public void setUp(){
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wd.navigate().to("https://www.gov.il/");
    }

    @Test
    public void searchFromNavMenuTest(){
        wd.findElement(By.cssSelector("#tm-4")).click();

        String pageTitle = wd.findElement(By.cssSelector("h1 span")).getText();
        System.out.println(pageTitle);
    }

    @AfterMethod
    public void tearDown(){
        wd.quit();
    }
}
