package com.GoogleAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.GoogleAuto.Browser;

import pageObj.PageObjects;

public class SignIn extends Browser {

	String title = "Login - My Store";

	public SignIn() {
		// Browser.driver.findElement(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a")).click();

		PageObjects.Objects.signin_button(driver).click();
	}

	public boolean isAt() {
		return Browser.title().equals(title);
	}

}
