package com.GoogleAuto;

import java.util.HashMap;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
//import org.junit.experimental.categories.Category;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;

import org.testng.annotations.Parameters;

import org.testng.annotations.Parameters;

import com.GoogleAuto.Browser;
import com.GoogleAuto.Modules;

//import common.envsetup;

//@Category(UnitTest.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class UnitTest extends Browser { // extends envsetup {
	@Before
	public void setUp() {
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		if (driver == null) {
			driver = new FirefoxDriver();
		}
		// js = (JavascriptExecutor) driver;
		// vars = new HashMap<String, Object>();
	}

	/*
	 * WebDriver driver;
	 * 
	 * @BeforeClass public void Instance() {
	 * 
	 * System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe"); driver =
	 * new FirefoxDriver();
	 * 
	 * //System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	 *  
	 * //driver = new ChromeDriver(); }
	 * 
	 * 
	 * /* WebDriver driver;
	 * 
	 * @Parameters("browser")
	 * 
	 * @BeforeClass public void setupEnv(String browser) { driver =
	 * beforeTest(browser); }
	 */

	@Test
	public void a1navToLandingPage() {// throws Exception {
		// Thread.sleep(1000);
		Modules.landPage().goTo();
		Assert.assertTrue(Modules.landPage().isAt());
		// driver.get("https://www.google.com/");
	}

	@Test
	public void a2navToSignin() {

		Modules.signIn();
		Assert.assertTrue(Modules.signIn().isAt());

	}

	@Test
	public void a3authLogIn() throws Exception {
		Modules.logIn();
		// Modules.logIn().confirmLog();
		// Assert.assertEquals(Modules.logIn().Expected,Modules.logIn().Actual);
	}

	@Test
	public void a4signOut() {
		Modules.sOut();
		Assert.assertTrue(Modules.sOut().isAt());
	}

	@Test
	public void a5inCred() throws Exception {
		Modules.inCred();
	}

	@AfterClass
	public static void cleanup() {
		Browser.close();
	}

}
