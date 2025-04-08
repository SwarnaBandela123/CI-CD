package FlipkartAutomationTest;

import java.net.URL;
import java.time.Duration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class AndroidDriverInitializer extends DriverInitializer{

	public static AndroidDriver androiddriver;
	@Override
	public void AppiumDriverInitializer() {
    	AppiumServiceBuilder ServiceBuilder=new AppiumServiceBuilder();
		AppiumDriverLocalService Server=AppiumDriverLocalService.buildService(ServiceBuilder.usingPort(4723));
		ServiceBuilder.withTimeout(Duration.ofSeconds(60));
		Server.start();
		
		DesiredCapabilities DC = new DesiredCapabilities();		
		DC.setCapability("platformName", "Android");
		DC.setCapability("deviceName", "a6fuugukwcwseekv");
		DC.setCapability("automationName", "uiautomator2");
		DC.setCapability("newCommandTimeout", 60);
		//DC.setCapability("noReset", true); // Optional, prevents resetting the app
		DC.setCapability("appPackage", "com.flipkart.android");
		DC.setCapability("appActivity", "com.flipkart.android.activity.HomeFragmentHolderActivity");
		
		try {
			
		URL url=Server.getUrl();		
		androiddriver=new AndroidDriver(url,DC);
		System.out.println("Flipkart application launched successfully and give the accesses");
		
		}catch(Exception e) {
            System.out.println("Driver initialization failed: " + e.getMessage());
		}
		

	}
	
	public void allowaccess() {
		if (androiddriver != null) {
			System.out.println("Giving location access");
			WebElement location=androiddriver.findElement(locators.getlocationFieldLocator());
			location.click();
			WebElement language=androiddriver.findElement(locators.getlanguageFieldLocator());
			language.click();
		} else {
		    System.out.println("Driver is not initialized!");
		}
	}
	
	
	}

