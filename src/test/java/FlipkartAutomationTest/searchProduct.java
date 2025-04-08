package FlipkartAutomationTest;

import java.time.Duration;
import java.util.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class searchProduct implements MultiThreadTestCase {

	@Override
	public void executeTestCase() throws Exception {
		logger.info(testDataLoader.get_start_search_product_testcase());
		 WebElement click_on_search = wait.until(ExpectedConditions.visibilityOfElementLocated(locators.getclickonsearch()));
		 click_on_search.click();
		 WebElement SearchField = wait.until(ExpectedConditions.visibilityOfElementLocated(locators.getsearchfield()));
		 SearchField.sendKeys(testDataLoader.get_search_text());
		 
		
		 MultiThreadTestCase.enter_button();// To click on enter button after entered the text in search field 
		 
	     WebElement notifications_off = wait.until(ExpectedConditions.visibilityOfElementLocated(locators.getnotificationsoff()));
	 		notifications_off.click();
		 logger.info(testDataLoader.get_page_load());
		 logger.info(testDataLoader.get_product_info_displayed());
         
		 
		AndroidDriverInitializer.androiddriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // Timeout in seconds

		//Select the product and add it to the cart}
		   
		   	WebElement click_on_product = wait.until(ExpectedConditions.visibilityOfElementLocated(locators.getclickonproduct()));
		   	click_on_product.click();
	           
	       // add it to the cart 
		   	
		    try {
		        // Try locating the first element
		        WebElement product_add_to_cart = wait.until(ExpectedConditions.visibilityOfElementLocated(locators.getproductaddtocart()));

		        if (product_add_to_cart.isDisplayed()) {
		            product_add_to_cart.click();
		            logger.info(testDataLoader.get_product_added_cart());
		        	WebElement go_to_cart = wait.until(ExpectedConditions.visibilityOfElementLocated(locators.getgotocart()));
		    	   	go_to_cart.click();
		    	   	logger.info(testDataLoader.get_navigated_to_cart());
		    	   	//Remove product from cart
		    		WebElement remove_from_cart = wait.until(ExpectedConditions.visibilityOfElementLocated(locators.getremovefromcart()));
		    	   	remove_from_cart.click();
		    	   	logger.info(testDataLoader.get_remove_product_from_cart());
		    	   	
		        }
		    } catch (TimeoutException | NoSuchElementException e) {
		        // Handle exception when the first element is not found
		        logger.info("First add-to-cart element not found. Checking alternative...");

		        // Try locating the second element
		        WebElement product_add_to_cart_icon = wait.until(ExpectedConditions.visibilityOfElementLocated(locators.getproductaddtocarticon()));
		        product_add_to_cart_icon.click();
		       
		        try {
		        WebElement product_add_to_cart = wait.until(ExpectedConditions.visibilityOfElementLocated(locators.getproductaddtocart()));
			       if(product_add_to_cart.isDisplayed()) {
			    	   product_add_to_cart.click();
				        logger.info(testDataLoader.get_product_added_cart());
				        WebElement remove_from_cart = wait.until(ExpectedConditions.visibilityOfElementLocated(locators.getremovefromcart()));
			    	   	remove_from_cart.click();
			    	   	remove_from_cart.click();
			    	   	logger.info(testDataLoader.get_remove_product_from_cart());
			       }
		        }catch (TimeoutException | NoSuchElementException exception) {
			    	   WebElement remove_from_cart = wait.until(ExpectedConditions.visibilityOfElementLocated(locators.getremovefromcart()));
			    	   	remove_from_cart.click();
			    	   	logger.info(testDataLoader.get_remove_product_from_cart());
			       }
		       
		    }
		
		    
	   	//Navigate to cart
	   
	   	//Again add two or more products to the cart
	   try {	
	   	WebElement continue_shopping = wait.until(ExpectedConditions.visibilityOfElementLocated(locators.getcontinueshopping()));
		   	if(continue_shopping.isDisplayed())
		   	{
		   	continue_shopping.click();
		     logger.info(testDataLoader.get_continue_shopping());
		   	}
	   }catch (TimeoutException | NoSuchElementException exception) {
		   	   	WebElement shop_now = wait.until(ExpectedConditions.visibilityOfElementLocated(locators.getshopnow()));
		   	   	shop_now.click();
		   	}
		 
		 
		 }
	

}
