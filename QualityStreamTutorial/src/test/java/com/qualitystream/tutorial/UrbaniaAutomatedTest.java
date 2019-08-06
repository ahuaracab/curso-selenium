package com.qualitystream.tutorial;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UrbaniaAutomatedTest {
	
	private WebDriver driver;
	By registerLinkLocator = By.cssSelector("a[class='e-register lnkRegisterUrbania js-register']");
	By registerPageLocator = By.xpath("//img[@src='https://cds.urbania.g3c.pe/spa-tinsa/logo-tinsa.d678984e517ebb9410d6c87142858d64.png']");
	
	By nombreLocator = By.name("fullName");
	By emailLocator = By.name("email");
	By passwordLocator = By.name("phone");
	By confirmLocator = By.cssSelector("input[name='address']");
	
	By registerBtnLocator = By.xpath("//input[@value='Regístrate']");
	
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://urbania.pe");
		
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void registerUser() throws InterruptedException {
		
		driver.findElement(registerLinkLocator).click();
		Thread.sleep(2000);
		if(driver.findElement(registerPageLocator).isDisplayed()) {
			driver.findElement(nombreLocator).sendKeys("Jose Perez");
			driver.findElement(emailLocator).sendKeys("jose.perez@gmail.com");
			driver.findElement(passwordLocator).sendKeys("986532147");
			driver.findElement(confirmLocator).sendKeys("San Tobias 154956");
			driver.findElement(registerBtnLocator).click();
		} else {
			System.out.println("Register pages was not found");
		}
		
	}

}
