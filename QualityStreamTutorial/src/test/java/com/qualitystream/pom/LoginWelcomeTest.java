package com.qualitystream.pom;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class LoginWelcomeTest {
	
	private WebDriver driver;
	LoginWelcomePage login_welcome_page;
	
	@Before
	public void setUp() throws Exception {
		login_welcome_page = new LoginWelcomePage(driver);
		driver = login_welcome_page.chromeDriverConnection();
		login_welcome_page.visit("file:///C:/Users/AngeloHB/Desktop/curso-javascript/curso-javascript/proyecto-js/index.html");//windows
		//login_welcome_page.visit("file:///home/ahuaracab/Desktop/web/curso-javascript/proyecto-js/index.html");//linux
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws InterruptedException {
		login_welcome_page.LoginWelcome();
		Thread.sleep(3000);
		assertEquals("Bienvenido, angelo", login_welcome_page.WelcomeMessage());
	}

}
