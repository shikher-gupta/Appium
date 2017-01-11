package testcases;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;


public class DeviceSetUp {
	protected AndroidDriver driver;

	protected void prepareAndroidForAppium() throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("appium-version", "1.5.3");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "5.1");
		capabilities.setCapability("deviceName", "TA64303BER");
		capabilities.setCapability("app", "/Users/shikhergupta/Documents/workspace/appium_myApp/apps/app-debug.apk");
		capabilities.setCapability("appPackage", "com.shikhergupta.logindemo");
		capabilities.setCapability("appActivity", "com.shikhergupta.logindemo.WelcomePage");

		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	}
}