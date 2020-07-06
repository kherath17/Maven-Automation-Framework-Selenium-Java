package com.GoogleAuto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.*;

//import common.envsetup;

public class Browser{// extends envsetup {
	public static WebDriver driver;
	/*
	public static void Instance() {
	System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
	driver = new FirefoxDriver();//create instance here and execute by built in feature ,where chrome doesnt support inbuilt
	//public static WebDriver driver;//calls to the driver in envsetup
	}
	*/
	public static  void goTo(String url) {

		driver.get(url);

	}

	public  static String title() {

		return driver.getTitle();

	}

	public static  void close() {
		driver.close();
	}
}

