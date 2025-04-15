package FlipkartAutomationTest;


import java.time.Duration;
import java.util.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import ch.qos.logback.classic.Logger;



public class cart_operations implements MultiThreadTestCase{

@Test
	@Override
	public void executeTestCase() throws Exception {
	logger.info(testDataLoader.get_start_cart_operations_testcase());
	
	logger.info("cart operations");
   	
   //Again add two are more products to the cart
	WebElement fashions = wait.until(ExpectedConditions.visibilityOfElementLocated(locators.getfashions()));
	fashions.click();
    logger.info(testDataLoader.get_navi_fashions());

    
    try {
        WebElement dress = wait.until(ExpectedConditions.visibilityOfElementLocated(locators.getdress()));
		if(dress.isDisplayed()) {
			 dress.click();
		        WebElement dresses1 = wait.until(ExpectedConditions.visibilityOfElementLocated(locators.getdresses1()));
		        dresses1.click();
		    	logger.info(testDataLoader.get_select_dresses());
		}else {

			WebElement dress_and_tops = wait.until(ExpectedConditions.visibilityOfElementLocated(locators.getdressandtops()));
	    	dress_and_tops.click();
		    logger.info(testDataLoader.get_dress_and_tops());
		    WebElement dresses = wait.until(ExpectedConditions.visibilityOfElementLocated(locators.getdresses()));
		    dresses.click(); 
			logger.info(testDataLoader.get_select_dresses());				
			
		}
    }catch (TimeoutException | NoSuchElementException exception) {    	
    	logger.info("Getting exception "+exception);

    	WebElement women = wait.until(ExpectedConditions.visibilityOfElementLocated(locators.getwomen()));
		women.click();
        WebElement dress1 = wait.until(ExpectedConditions.visibilityOfElementLocated(locators.getdress()));
		dress1.click();
		WebElement dresses1 = wait.until(ExpectedConditions.visibilityOfElementLocated(locators.getdresses1()));
        dresses1.click();
    	logger.info(testDataLoader.get_select_dresses());
    		
    }
	
	
    AndroidDriverInitializer.androiddriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); // Timeout in seconds

	
	//Applying filters
 	WebElement filter = wait.until(ExpectedConditions.visibilityOfElementLocated(locators.getfilter()));
 	filter.click();
 	WebElement size = wait.until(ExpectedConditions.visibilityOfElementLocated(locators.getsize()));
 	size.click();
 	WebElement sizeM = wait.until(ExpectedConditions.visibilityOfElementLocated(locators.getsizeM()));
 	sizeM.click();
 	WebElement sizeL = wait.until(ExpectedConditions.visibilityOfElementLocated(locators.getsizeL()));
 	sizeL.click();
 	WebElement Apply_filter = wait.until(ExpectedConditions.visibilityOfElementLocated(locators.getApplyfilter()));
	Apply_filter.click();
	
	
    
	AndroidDriverInitializer.androiddriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); // Timeout in seconds
 	//add one dress to the cart 
	
	WebElement first_dress = wait.until(ExpectedConditions.visibilityOfElementLocated(locators.getfirstdress()));	
	first_dress.click();

   	WebElement first_dress_add_to_cart = wait.until(ExpectedConditions.visibilityOfElementLocated(locators.getproductaddtocart()));
   	first_dress_add_to_cart.click();
   	
	   	try {
	   	WebElement first_dress_sizeM = wait.until(ExpectedConditions.visibilityOfElementLocated(locators.getdresssizeM()));
		   	if(first_dress_sizeM.isDisplayed()) 
		   	{
		   		first_dress_sizeM.click();
		   	}else {
		   		WebElement first_dress_sizeL = wait.until(ExpectedConditions.visibilityOfElementLocated(locators.getdresssizeL()));
		   	   	first_dress_sizeL.click();
		   	}
	   	}catch(TimeoutException | NoSuchElementException dresssizeM_L) {
	   		WebElement first_dress_sizeXL = wait.until(ExpectedConditions.visibilityOfElementLocated(locators.getdresssizeXL()));
	   	   	first_dress_sizeXL.click();
	   	}
   	
   	
   	WebElement first_dress_continue_to_add_to_cart = wait.until(ExpectedConditions.visibilityOfElementLocated(locators.getcontinuetoaddtocart()));
   	first_dress_continue_to_add_to_cart.click();
	logger.info(testDataLoader.get_first_dress_to_cart());
	
	AndroidDriverInitializer.androiddriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); // Timeout in seconds
	
	MultiThreadTestCase.navigateBack();// NAvigate back to previouse screen

	AndroidDriverInitializer.androiddriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); // Timeout in seconds

	
		WebElement second_dress = wait.until(ExpectedConditions.visibilityOfElementLocated(locators.getseconddress()));
		second_dress.click();	
		
		WebElement second_dress_add_to_cart = wait.until(ExpectedConditions.visibilityOfElementLocated(locators.getproductaddtocart()));
		second_dress_add_to_cart.click();
		
		WebElement second_dress_sizeM = wait.until(ExpectedConditions.visibilityOfElementLocated(locators.getdresssizeM()));
	   	if(second_dress_sizeM.isDisplayed()) 
	   	{
	   		second_dress_sizeM.click();
	   	}
	   	else {
	   	   	WebElement second_dress_sizeXL = wait.until(ExpectedConditions.visibilityOfElementLocated(locators.getdresssizeL()));
	   	 second_dress_sizeXL.click();
	   	}
   	WebElement second_dress_continue_to_add_to_cart = wait.until(ExpectedConditions.visibilityOfElementLocated(locators.getcontinuetoaddtocart()));
   	second_dress_continue_to_add_to_cart.click();
	logger.info(testDataLoader.get_second_dress_to_cart());
	

	
	AndroidDriverInitializer.androiddriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); // Timeout in seconds

	MultiThreadTestCase.navigateBack();// NAvigate back to previouse screen

	AndroidDriverInitializer.androiddriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); // Timeout in seconds
  	
  	//get the count of products from cart
  
	
	WebElement cart_icon = wait.until(ExpectedConditions.visibilityOfElementLocated(locators.getcarticon()));

   	String cartText = cart_icon.getText();
    
    // Now, extract the numeric value (removing any extra characters like parentheses if necessary)
    int productCount = 0;
    if (cartText != null && !cartText.isEmpty()) {
        try {
            // If the count is shown like "(2)", extract the number by removing parentheses
            String countText = cartText.replaceAll("[^0-9]", "");
            productCount = Integer.parseInt(countText);
            logger.info("Number of products in the cart: " + productCount);// Print or return the product count
        } catch (NumberFormatException e) {
            logger.error("Error parsing product count: " + e.getMessage());
        }
    }else {
        logger.info("Number of products in the cart: 0");
    }
  	
   	
}
}

