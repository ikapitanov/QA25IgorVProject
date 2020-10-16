package com.telran.qa25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SuperPharm {
    WebDriver wd;

    @BeforeMethod
    public void setUp(){
        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test
    public void testNavMenu(){
        wd.get("https://shop.super-pharm.co.il/");

        WebElement nav = wd.findElement(By.xpath("//nav[@id = 'navbar-header-top']"));
        nav.findElement(By.xpath(".//*[@title='תנאי שימוש']")).click();
    }

    @AfterMethod
    public void tearDown(){
        wd.quit();
    }
}
