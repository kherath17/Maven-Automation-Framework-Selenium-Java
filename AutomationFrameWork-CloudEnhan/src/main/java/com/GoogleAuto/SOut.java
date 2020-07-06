package com.GoogleAuto;

import org.openqa.selenium.By;

import pageObj.PageObjects;

public class SOut extends Browser {

	String title = "Login - My Store";

	public SOut() {

		// Browser.driver.findElement(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[2]/a")).click();
		PageObjects.Objects.signout_button(driver).click();
		// Browser.driver.findElement(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a")).click();
		PageObjects.Objects.signin_button(driver).click();

	}

	public boolean isAt() {

		return Browser.title().equals(title);
	}

}
