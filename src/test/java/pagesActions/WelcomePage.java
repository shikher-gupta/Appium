package pagesActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import junit.framework.Assert;

public class WelcomePage extends PageControls {

	// Controls for LoginDemo's Welcome page
	By FirstNameTextView = By.id("tv_first_name");
	By FirstNameEditBox = By.id("et_first_name");
	By LastNameTextView = By.id("tv_last_name");
	By LastNameEditBox = By.id("et_last_name");
	By submitBtn = By.id("btn_submit");

	// Controls for LoginDemo's fields page
	By checkboxCtrl = By.id("checkBox");
	By radioBtnCtrl = By.id("radioButton");

	public WelcomePage(WebDriver driver) {
		super(driver);
	}

	public WelcomePage loginForm() {
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

		// Verify that the control page loads successfully
		waitForVisibilityOf(checkboxCtrl);
		isElementPresent(driver, checkboxCtrl);
		isElementPresent(driver, radioBtnCtrl);

		//		// Wait and assert the "Welcome! testFN testLN" text
		//		By fullNameTextViewCtrl = By.id("tv_show_full_name");
		//		waitForVisibilityOf(fullNameTextViewCtrl);
		//		scrollPageUp();
		//		Assert.assertTrue(driver.findElement(fullNameTextViewCtrl).getText().equalsIgnoreCase("Welcome! " + "testFN" + " " + " testLN"));

		return new WelcomePage(driver);
	}
}