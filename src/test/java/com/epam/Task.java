package com.epam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Task {
    @Test
    public void firstScenario() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("Apple");
        element.submit();
        (new WebDriverWait(driver, 60)).until((dr) -> dr.getTitle().toLowerCase().startsWith("apple"));
        System.out.println("Page title is: " + driver.getTitle());
    }
}
