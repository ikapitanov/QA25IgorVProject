package com.telran.qa25;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class YouTubeTest {
    ChromeDriver wd;

    @BeforeMethod
    public void setUp(){
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        wd.navigate().to("https://www.youtube.com/");

    }

    @Test
    public void navSerchTest(){
        System.out.println("site opened");
        wd.findElement(By.name("search_query")).click();
        wd.findElement(By.name("search_query")).sendKeys("как писать скрипты на python"+ Keys.ENTER);
        wd.findElement(By.linkText("Пишем TELEGRAM бота на Python")).click();
    }

    @AfterMethod
    public void tearDown(){
        wd.quit();
    }
}
