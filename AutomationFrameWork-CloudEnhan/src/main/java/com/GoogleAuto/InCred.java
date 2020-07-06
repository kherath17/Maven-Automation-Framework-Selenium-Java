package com.GoogleAuto;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;

import pageObj.PageObjects;
import utility.ExcelUtils;

public class InCred extends Browser {
	
	public InCred() throws Exception {
		
	
	
	//Browser.driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("kherath17@gmail.com");
	PageObjects.Objects.username_txtbox(driver).sendKeys(ExcelUtils.getCellData(1, 1));
	//Browser.driver.findElement(By.xpath("//*[@id=\"passwd\"]")).sendKeys("yamasha123");
	PageObjects.Objects.password_txtbox(driver).sendKeys(ExcelUtils.getCellData(1, 2));
	//Browser.driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]")).click();
	PageObjects.Objects.login_button(driver).click();
	String Expected = "There is 1 error\n" + 
			"Authentication failed.";
	String Actual = Browser.driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div[1]")).getText();
	assertEquals(Expected,Actual);
	}

}
