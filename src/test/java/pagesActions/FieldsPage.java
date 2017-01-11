package pagesActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import junit.framework.Assert;

public class FieldsPage extends PageControls {
	// Controls for LoginDemo's Welcome page
	By FirstNameTextView = By.id("tv_first_name");
	By FirstNameEditBox = By.id("et_first_name");
	By LastNameTextView = By.id("tv_last_name");
	By LastNameEditBox = By.id("et_last_name");
	By submitBtn = By.id("btn_submit");


	// Controls for LoginDemo's Fields page
	By checkboxCtrl = By.id("checkBox");
	By radioBtnCtrl = By.id("radioButton");
	By switchCtrl = By.id("switch1");
	By ratingBarCtrl = By.id("ratingBar");
	By progressBarCtrl = By.id("progressBar");
	By spinnerBarCtrl = By.id("spinner");

	public FieldsPage(WebDriver driver) {
		super(driver);
	}

	public FieldsPage controlsPage() {
		// Wait until the Submit button appears
		waitForVisibilityOf(submitBtn);

		// Assert the First Name, Last Name label and Submit text on submit button.
		Assert.assertTrue(driver.findElement(FirstNameTextView).getText().equalsIgnoreCase("First Name"));
		Assert.assertTrue(driver.findElement(LastNameTextView).getText().equalsIgnoreCase("Last Name"));
		Assert.assertTrue(driver.findElement(submitBtn).getText().equalsIgnoreCase("Submit"));

		// Enter First Name after clearing the previous text (if any)
		driver.findElement(FirstNameEditBox).click();
		driver.findElement(FirstNameEditBox).clear();
		driver.findElement(FirstNameEditBox).sendKeys("testFN");

		// Enter Last Name after clearing the previous text (if any)
		driver.findElement(LastNameEditBox).click();
		driver.findElement(LastNameEditBox).clear();
		driver.findElement(LastNameEditBox).sendKeys("testLN");

		// Click on Submit button
		driver.findElement(submitBtn).click();

		// Wait until the Spinner Bar appears
		waitForVisibilityOf(spinnerBarCtrl);

		// Assert all the fields are available on the page
		isElementPresent(driver, checkboxCtrl);
		isElementPresent(driver, radioBtnCtrl);
		isElementPresent(driver, switchCtrl);
		isElementPresent(driver, ratingBarCtrl);
		isElementPresent(driver, progressBarCtrl);
		isElementPresent(driver, spinnerBarCtrl);

		// Verify that all the elements are disabled 
		isDisabled(driver, checkboxCtrl);
		isDisabled(driver, radioBtnCtrl);
		isDisabled(driver, switchCtrl);
		isDisabled(driver, ratingBarCtrl);
		isDisabled(driver, progressBarCtrl);
		isDisabled(driver, spinnerBarCtrl);

		// Verify that Check box and Radio button are not checked 
		Assert.assertEquals(driver.findElement(checkboxCtrl).isSelected(), false);
		Assert.assertEquals(driver.findElement(radioBtnCtrl).isSelected(), false);

		// Enable few elements (Check box, Radio Button and a Switch)
		driver.findElement(checkboxCtrl).click();
		driver.findElement(radioBtnCtrl).click();
		driver.findElement(switchCtrl).click();

		// Verify that enabled the elements are enabled now
		Assert.assertEquals(driver.findElement(checkboxCtrl).getAttribute("checked"), "true");
		Assert.assertEquals(driver.findElement(radioBtnCtrl).getAttribute("checked"), "true");
		Assert.assertEquals(driver.findElement(switchCtrl).getAttribute("checked"), "true");

		return new FieldsPage(driver);
	}
}