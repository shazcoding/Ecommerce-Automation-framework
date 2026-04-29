package tests;

//package tests;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

@Test
public void testLogin() {

WebDriverManager.chromedriver().setup();

WebDriver driver = new ChromeDriver();

driver.get("https://www.saucedemo.com");

System.out.println("Website Opened updated");

driver.quit();
}
}
