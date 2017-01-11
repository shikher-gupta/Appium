package testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pagesActions.FieldsPage;

public class ControlPageTest extends DeviceSetUp {

	@BeforeClass
	public void setUp() throws Exception {
		prepareAndroidForAppium();
	}

	@AfterClass
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void fieldPageTest() throws InterruptedException {
		new FieldsPage(driver).controlsPage();
	}
}