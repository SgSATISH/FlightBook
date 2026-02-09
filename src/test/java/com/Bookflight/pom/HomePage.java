package com.Bookflight.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {

		this.driver = driver;

	}

	By close = By.xpath("//span[@class='commonModal__close']");

	By roundTrip = By.xpath("//li[@data-cy='roundTrip']");

	By sourceCity = By.id("fromCity");

	By sourceFromCity = By.xpath("//input[@aria-controls='react-autowhatever-1']");

	By destinataionToCity = By.id("toCity");

	By destinationCitySearchBox = By.xpath("//input[@placeholder='To']");

	By destinationSearchButton = By.xpath("//a[@class='primaryBtn font24 latoBold widgetSearchBtn ']");

	// action method

	public void closePopUp() throws InterruptedException {

		driver.findElement(close).click();
		Thread.sleep(4000);

	}

	public void roundtrip() throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement roundTrip = driver.findElement(By.cssSelector("li[data-cy='roundTrip']"));
		js.executeScript("arguments[0].click();", roundTrip);

	}

	public void entersourceCity(String fromCity) throws InterruptedException {

		driver.findElement(sourceCity).click();
		Thread.sleep(2000);
		driver.findElement(sourceFromCity).sendKeys(fromCity);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='" + fromCity + "']")).click();

	}

	public void enterDestination(String toCity) throws InterruptedException {

		driver.findElement(destinataionToCity);
		Thread.sleep(2000);
		driver.findElement(destinationCitySearchBox).sendKeys(toCity);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='" + toCity + "']"));

	}

	public void departureDate() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(500,600)", "");
		driver.findElement(By.xpath("//div[@aria-label='Thu Dec 18 2025']")).click();

	}

	public void returnDate() {
		driver.findElement(By.xpath("//div[@aria-label='Mon Jan 05 2026']")).click();

	}

	public void clickSearchButton() {
		driver.findElement(destinationSearchButton).click();
	}


    		
    		
}
