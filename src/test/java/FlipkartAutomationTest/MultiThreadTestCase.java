package FlipkartAutomationTest;

import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.nativekey.PressesKey;

public interface MultiThreadTestCase {
	
	void executeTestCase() throws Exception;
	
	WebDriverWait wait= new WebDriverWait(AndroidDriverInitializer.androiddriver,Duration.ofSeconds(30));

    static final Logger logger = LoggerFactory.getLogger(MultiThreadTestCase.class);
	
    test_data_loader testDataLoader = new test_data_loader("src\\test\\java\\FlipkartAutomation\\test_data.properties");

	
	default void pressKey(int num) {
	        KeyEvent key = new KeyEvent(AndroidKey.valueOf("NUMPAD_" + num));
	        ((PressesKey) AndroidDriverInitializer.androiddriver).pressKey(key);
	  	}
	
//	AndroidDriver android_driver = AndroidDriverInitializer.androiddriver; 
	
	//Amazon App package and App activity
	
	String amazon_app_package="in.amazon.mShop.android.shopping";
	String amazon_app_activity="com.amazon.mShop.navigation.MainActivity";

	
	
	//Navigate back to previouse screen	
	public static void navigateBack()
	{
		
		if (AndroidDriverInitializer.androiddriver != null) { 
		    AndroidDriver back_to_previous_screen =  AndroidDriverInitializer.androiddriver; 
		    try { 
		        back_to_previous_screen.pressKey(new KeyEvent(AndroidKey.BACK));
		        WebElement back_arrow = wait.until(ExpectedConditions.visibilityOfElementLocated(locators.getbackarrow()));
		        
		        if (back_arrow.isDisplayed()) {
		            logger.info(testDataLoader.get_navi_back()); // Log back navigation success
		        } else {
		            back_to_previous_screen.pressKey(new KeyEvent(AndroidKey.BACK));
		            back_arrow = wait.until(ExpectedConditions.visibilityOfElementLocated(locators.getbackarrow()));
		            
		            if (back_arrow.isDisplayed()) {
		                logger.info(testDataLoader.get_navi_back()); // Log back navigation success
		            } else {
		                logger.error("Back arrow still not visible after two attempts.");
		            }
		        }	        
		    } catch (Exception e) { 
		        logger.error("Failed to navigate back: " + e.getMessage()); 
		    } 
		} else { 
		    logger.error("Driver is not initialized."); 
		} 		
		
		
	/*	
		
		Map<String, Object> params = new HashMap<>();
		params.put("keycode", 4); // 4 is KEYCODE_BACK in Android
		try {
		    AndroidDriver back_to_previous_screen = AndroidDriverInitializer.androiddriver;
		    back_to_previous_screen.executeScript("mobile: pressKey", params);
		    WebDriverWait wait = new WebDriverWait(back_to_previous_screen,  Duration.ofSeconds(10));
            WebElement back_arrow= wait.until(ExpectedConditions.visibilityOfElementLocated(locators.getbackarrow()));
	           if(back_arrow.isDisplayed())
	           {
	   		    logger.info("Navigated back to previous screen.");
	
	           }else {
		   		    back_to_previous_screen.executeScript("mobile: pressKey", params);
		            if(back_arrow.isDisplayed())
		            {
		       		    logger.info("Navigated back to previous screen.");
		            }
	           }
           
		} catch (Exception e) {
		    logger.error("Failed to navigate back using ADB command: " + e.getMessage());
		} 
	*/
		/*
	    try {
	        // Define the TouchAction for simulating the back gesture
	        new TouchAction(AndroidDriverInitializer.androiddriver)
	            .press(PointOption.point(500, 1500))  // Example of coordinates for pressing
	            .moveTo(PointOption.point(500, 1200))  // Move upwards to simulate the back swipe
	            .release()
	            .perform();  // Perform the action

	        logger.info("Navigated back using TouchAction.");
	    } catch (Exception e) {
	        logger.error("Failed to navigate back using TouchAction: " + e.getMessage());
	    }
		*/
	}
	
		
	//To click on enter button after entered the text in search bar
	
	public static void enter_button()
	{
		
		Map<String, String> action = new HashMap<>();
        action.put("action", "search"); // Simulates the "search" action
        AndroidDriverInitializer.androiddriver.executeScript("mobile: performEditorAction", action);
	}
	
	//Scroll to view a specific product
	
	public static void scrollFun(String scrollToViewText)
	{
		//page scroll and click on particular product
        
				Actions actions = new Actions(AndroidDriverInitializer.androiddriver);
				actions.perform();
				wait.until(ExpectedConditions.visibilityOfElementLocated(new AppiumBy.ByAndroidUIAutomator(
						"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView("
								+ "new UiSelector().textContains(\"" + scrollToViewText + "\").instance(0))"))).click(); 
				logger.info("Page scrolled successfully and clicked on product");
	}
	

	

}