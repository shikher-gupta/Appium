package pagesActions;

import java.util.HashMap;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageControls {

	protected WebDriver driver;

	public PageControls(WebDriver driver) {
		this.driver = driver;
	}

	protected void waitForVisibilityOf(By locator) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	protected void waitForClickabilityOf(By locator) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(locator));
	}

	// To scroll page up
	public void scrollPageUp() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		HashMap<String, Double> swipeObject = new HashMap<String, Double>();
		swipeObject.put("startX", 0.50);
		swipeObject.put("startY", 0.95);
		swipeObject.put("endX", 0.50);
		swipeObject.put("endY", 0.01);
		swipeObject.put("duration", 3.0);
		js.executeScript("mobile: swipe", swipeObject);
	}

	// Swipe Left to right
	public void swipeLeftToRight() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		HashMap<String, Double> swipeObject = new HashMap<String, Double>();
		swipeObject.put("startX", 0.01);
		swipeObject.put("startY", 0.5);
		swipeObject.put("endX", 0.9);
		swipeObject.put("endY", 0.6);
		swipeObject.put("duration", 3.0);
		js.executeScript("mobile: swipe", swipeObject);
	}

	// Swipe Right to Left
	public void swipeRightToLeft() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		HashMap<String, Double> swipeObject = new HashMap<String, Double>();
		swipeObject.put("startX", 0.9);
		swipeObject.put("startY", 0.5);
		swipeObject.put("endX", 0.01);
		swipeObject.put("endY", 0.5);
		swipeObject.put("duration", 3.0);
		js.executeScript("mobile: swipe", swipeObject);
	}

	// Swipe First Carousel From Right To Left
	public void swipeFirstCarouselFromRightToLeft() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		HashMap<String, Double> swipeObject = new HashMap<String, Double>();
		swipeObject.put("startX", 0.9);
		swipeObject.put("startY", 0.2);
		swipeObject.put("endX", 0.01);
		swipeObject.put("endY", 0.2);
		swipeObject.put("duration", 3.0);
		js.executeScript("mobile: swipe", swipeObject);
	}

	// Perform Tap Action
	public void performTapAction(WebElement elementToTap) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		HashMap<String, Double> tapObject = new HashMap<String, Double>();
		tapObject.put("x", (double) 360); // in pixels from left
		tapObject.put("y", (double) 170); // in pixels from top
		tapObject.put("element", Double.valueOf(((RemoteWebElement) elementToTap).getId()));
		js.executeScript("mobile: tap", tapObject);
	}

	// Check visibility of the element
	public boolean isElementPresent(WebDriver driver, By locator) {
		// Wait for the element
		waitForVisibilityOf(locator);

		try {
			driver.findElement(locator);
			// If element is found set the timeout back and return true
			return true;
		} 

		catch (NoSuchElementException e) {
			// If element isn't found, set the timeout and return false
			return false;
		}
	}

	// Check that the element is disable
	public boolean isDisabled(WebDriver driver, By locator) {
		// Wait for the element
		waitForVisibilityOf(locator);

		try {
			driver.findElement(locator).getAttribute("checked").equals("false");
			// If element is disabled set the timeout back and return true
			return true;
		}

		catch (NoSuchElementException e) {
			// If element isn't disabled, set the timeout and return false
			return false;
		}
	}

	// Check that the element is enable
	public boolean isEnable(WebDriver driver, By locator) {
		// Wait for the element
		waitForVisibilityOf(locator);

		try {
			driver.findElement(locator).getAttribute("checked").equals("true");
			// If element is enable set the timeout back and return true
			return true;
		}

		catch (NoSuchElementException e) {
			// If element isn't enable, set the timeout and return false
			return false;
		}
	}
}