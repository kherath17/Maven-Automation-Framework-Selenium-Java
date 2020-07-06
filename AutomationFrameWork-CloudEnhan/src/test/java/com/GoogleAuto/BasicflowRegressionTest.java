package com.GoogleAuto;


import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sun.jna.platform.win32.Version;

import pageObj.PageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;

import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class BasicflowRegressionTest {
 // private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  private RemoteWebDriver driver;
 
  
 @Before
  public void setUp()  {
	System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
	 driver = new FirefoxDriver();
	// System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	 //driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void basicflow() throws MalformedURLException {
	  DesiredCapabilities cap = DesiredCapabilities.firefox();
	  cap.setBrowserName("firefox");
	  cap.setPlatform(Platform.ANY);
	  URL url = new URL("http://192.168.8.102:37993/wd/hub");
	  driver = new RemoteWebDriver(url, cap);
	  
	    
    driver.get("http://automationpractice.com/index.php");
    driver.manage().window().setSize(new Dimension(777, 695));
    driver.findElement(By.linkText("Sign in")).click();
    driver.findElement(By.id("email")).click();
    driver.findElement(By.id("passwd")).sendKeys("yamaha123");
    driver.findElement(By.id("email")).sendKeys("kherath17@gmail.com");
    driver.findElement(By.cssSelector("#SubmitLogin > span")).click();
    //driver.findElement(By.linkText("Sign out")).click();
    PageObjects.Objects.signout_button(driver).click();
    assertThat(driver.getTitle(), is("Login - My Store"));
    
  }
}
