package com.GoogleAuto;



public class LandPage  {

	static String url = "http://automationpractice.com/index.php";
	static String title = "My Store";
	
	
	
	public void goTo() {//throws Exception {
		//Thread.sleep(1000);
		Browser.goTo(url);
	}

	public boolean isAt() {
		return Browser.title().equals(title);
	}
}
