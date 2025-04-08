package FlipkartAutomationTest;

import io.appium.java_client.AppiumDriver;

public abstract class DriverInitializer {
	public static AppiumDriver driver;
	public abstract void AppiumDriverInitializer();

}
