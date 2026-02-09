package com.Bookflight.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Bookflight.pom.HomePage;

public class TestCases {
	
	WebDriver driver;
	
	@BeforeTest
	public void launchChromeBrowser() {
		
		driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		
	}
	
	@Test
	public void searchFlightTicket() throws InterruptedException {
		HomePage homepage = new HomePage(driver);
		homepage.closePopUp();
		homepage.roundtrip();
		homepage.entersourceCity("Pune");
		homepage.enterDestination("Hyderabad");
		homepage.departureDate();
		homepage.returnDate();
		homepage.clickSearchButton();
		
		
		
		
	}
	
	@AfterTest
	public void closeBrowser() {
		
	}

}
