package myapp;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import org.junit.Before; 
import org.junit.Test; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver; 
 
public class AppTest { 

    private WebDriver driver; 
 
    @Before 
    public void setUp() { 
        // Set the path for the ChromeDriver executable 
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe"); 
        driver = new ChromeDriver(); 
    } 
 
    @Test 
    public void testGoogle() { 
    	 System.out.println("Opening Microsoft Teams..by Asmika.");
         driver.get("https://teams.microsoft.com/");

         // Wait for page to load
         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
         wait.until(ExpectedConditions.titleContains("Microsoft Teams"));

         System.out.println("Microsoft Teams loaded successfully.");
    } 
 
//    @After 
//    public void tearDown() { 
//        driver.quit(); 
//    } 
} 
 