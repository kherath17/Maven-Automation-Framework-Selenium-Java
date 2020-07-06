package pageObj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.GoogleAuto.Browser;

public class PageObjects extends Browser {
	
	
	public static class Objects{
		//private static WebElement element = null;
		
		/* public static  WebElement signin_button(WebElement element)
		 {
		 
			 element = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a"));
			 return element;
		 
		 }
*/
		
		
//------------------------------Buttons-----------------------------------------//		
		
		public static WebElement signin_button(WebDriver driver) {
			WebElement element = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a"));
			 return element;
		}

		public static WebElement login_button(WebDriver driver) {
			WebElement element = driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]"));
			 return element;
		}
		
		public static WebElement signout_button(WebDriver driver) {
			WebElement element = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[2]/a"));
			 return element;
		}
		
		
		
//-------------------------------TextBoxes--------------------------------------//		
		public static WebElement username_txtbox(WebDriver driver) {
			WebElement element = driver.findElement(By.xpath("//*[@id=\"email\"]"));
			 return element;
		}
		
		public static WebElement password_txtbox(WebDriver driver) {
			WebElement element = driver.findElement(By.xpath("//*[@id=\"passwd\"]"));
			 return element;
		}
		
		

		
	}

}
