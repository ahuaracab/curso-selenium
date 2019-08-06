package com.qualitystream.pom;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class LoginLogoutTest {
	
	private WebDriver driver;
	LoginLogoutPage login_logout_page;
	
	@Before
	public void setUp() throws Exception {
		login_logout_page = new LoginLogoutPage(driver);
		driver = login_logout_page.chromeDriverConnection();
		login_logout_page.visit("file:///home/ahuaracab/Desktop/web/curso-javascript/proyecto-js/index.html");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws InterruptedException {
		login_logout_page.LoginLogout();
		Thread.sleep(3000);
		assertEquals("Cerrar sesión", login_logout_page.LogoutMessage());
	}

}
