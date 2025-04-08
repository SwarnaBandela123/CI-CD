package FlipkartAutomationTest;

import java.net.URL;
import java.time.Duration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class Amazon {
	public static AndroidDriver driver;

	public static void main(String[] args) {
		AppiumServiceBuilder ServiceBuilder=new AppiumServiceBuilder();
		AppiumDriverLocalService Server=AppiumDriverLocalService.buildService(ServiceBuilder.usingPort(4723));
		ServiceBuilder.withTimeout(Duration.ofSeconds(90));
		Server.start();
		
		DesiredCapabilities DC = new DesiredCapabilities();		
		DC.setCapability("platformName", "Android");
		DC.setCapability("deviceName", "a6fuugukwcwseekv");
		DC.setCapability("automationName", "uiautomator2");
		DC.setCapability("newCommandTimeout", 60);
		//DC.setCapability("noReset", true); // Optional, prevents resetting the app
		DC.setCapability("appPackage", "in.amazon.mShop.android.shopping");
		DC.setCapability("appActivity", "com.amazon.mShop.navigation.MainActivity");
		
		try {
			
		URL url=Server.getUrl();		
		driver=new AndroidDriver(url,DC);
		System.out.println("Flipkart application launched successfully and give the accesses");
		
		}catch(Exception e) {
            System.out.println("Driver initialization failed: " + e.getMessage());
		}
		
		WebElement Amazon_search=driver.findElement(AppiumBy.id("in.amazon.mShop.android.shopping:id/chrome_action_bar_search_icon")); 
		Amazon_search.click();

	}

}
