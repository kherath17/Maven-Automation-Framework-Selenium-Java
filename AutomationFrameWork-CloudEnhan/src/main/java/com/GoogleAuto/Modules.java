package com.GoogleAuto;

public class Modules  {

	public static LandPage landPage()  {
		return new LandPage();

	}

	public static SignIn signIn() {
		return new SignIn();
	}

	public static LogIn logIn() throws Exception {
		return new LogIn();

	}

	public static SOut sOut() {
		return new SOut();

	}

	public static InCred inCred() throws Exception {
		return new InCred();

	}

}
