package com.GoogleAuto;

import static org.junit.jupiter.api.Assertions.assertEquals;



import org.openqa.selenium.By;

import pageObj.PageObjects;

import utility.ExcelUtils;





public  class LogIn extends Browser {
	
	
//excelchnage4444
	public LogIn() throws Exception {
		
		ExcelUtils.setExcelFile("C:\\Users\\kasun.herath\\Desktop\\My Automation Frameworks\\Completed-CloudEnhan\\AutomationFrameWork-CloudEnhan\\src\\test\\java\\testdata\\TestData.xlsx", "Sheet1");
		
		//String url ="http://automationpractice.com/index.php?controller=authentication&back=my-account";
		//Browser.driver.get(url);
		
		//Browser.driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("kherath17@gmail.com");
		PageObjects.Objects.username_txtbox(driver).sendKeys(ExcelUtils.getCellData(0, 1));
		//Browser.driver.findElement(By.xpath("//*[@id=\"passwd\"]")).sendKeys("yamaha123");
		PageObjects.Objects.password_txtbox(driver).sendKeys(ExcelUtils.getCellData(0, 2));
		//Browser.driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]")).click();
		PageObjects.Objects.login_button(driver).click();
		String Expected = "Kasun Herath";
		String Actual = Browser.driver.findElement(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a")).getText();
		assertEquals(Expected,Actual);
	
	}
	/*public void confirmLog() {
		String Actual = Browser.driver.findElement(By.name("Kasun Herath")).getText();
		String Expected = "Kasun Herath";
		assertEquals(Expected,Actual);
	}
*/
}
