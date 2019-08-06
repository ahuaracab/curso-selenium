package com.qualitystream.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginLogoutPage extends Base {
	
	By nombre = By.id("form_name");
	By email = By.name("email");
	By password = By.name("password");
	By login = By.name("login");

	public LoginLogoutPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void LoginLogout() throws InterruptedException {
		sendKeys(nombre,"angelo");
		sendKeys(email,"ahuaracab@ecodigital.pe");
		sendKeys(password,"ghlrd2j2.");
		click(login);
	}	
	
	public String LogoutMessage() {
		By logout = By.id("logout");
		return getText(logout);
	}
}
	
