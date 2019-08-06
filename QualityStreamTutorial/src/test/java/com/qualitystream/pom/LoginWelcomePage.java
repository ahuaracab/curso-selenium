package com.qualitystream.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginWelcomePage extends Base{
	
	By nombre = By.id("form_name");
	By email = By.name("email");
	By password = By.name("password");
	By login = By.name("login");
	
	public LoginWelcomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void LoginWelcome() throws InterruptedException {
		sendKeys(nombre,"angelo");
		sendKeys(email,"ahuaracab@ecodigital.pe");
		sendKeys(password,"ghlrd2j2.");
		click(login);
	}	
	
	public String WelcomeMessage() {
		By welcome = By.tagName("strong");
		return getText(welcome);
	}
}
