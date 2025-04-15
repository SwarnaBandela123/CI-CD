package FlipkartAutomationTest;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class switch_to_Amazon implements MultiThreadTestCase{
	 public static String AmazonName;
	 public static double amazonOfferedPrice;
	@SuppressWarnings("deprecation")
	@Override
	
@Test
	public void executeTestCase() throws Exception {
		//switching to amazon applications
		if (AndroidDriverInitializer.androiddriver != null) {
		   AndroidDriverInitializer.androiddriver.activateApp(amazon_app_package);
            logger.info("Switched to Amazon app successfully.");
        } else {
           logger.info("Driver is not initialized.");
        }

		WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(locators.getsearchBox()));
		searchBox.click(); // Focus the search box
		
		WebElement search_data = wait.until(ExpectedConditions.visibilityOfElementLocated(locators.getsearchdata()));
		search_data.sendKeys(search_again_filters.FlipkartName);
		 
		MultiThreadTestCase.enter_button();// To click on enter button after entered the text in search field 
		
		WebElement click_amazon_dress = wait.until(ExpectedConditions.visibilityOfElementLocated(locators.getclickamazondress()));
		click_amazon_dress.click();
		
		AndroidDriverInitializer.androiddriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //product name
		WebElement AmazonProductName = wait.until(ExpectedConditions.visibilityOfElementLocated(locators.getAmazonProductName()));
		AmazonName = AmazonProductName.getText();
        logger.info("Amazon Product Name: " + AmazonName);

        //product price
        
    	MultiThreadTestCase.scrollFun("Inclusive of all taxes");//		//page scroll and click on particular product

        
   
        WebElement AmazonProductPrice = wait.until(ExpectedConditions.visibilityOfElementLocated(locators.getAmazonProductPrice()));

        String amazonContentDesc=AmazonProductPrice.getText();
        
	    // Regular expression to extract the second price (offered price)
        logger.info(amazonContentDesc);
        String AmazonOfferedPrice = amazonContentDesc.replaceAll(".*(₹\\d+,?\\d+).*", "$1"); 
        AmazonOfferedPrice=AmazonOfferedPrice.replace("₹", "").replace(",", "");
        
        amazonOfferedPrice=Double.parseDouble(AmazonOfferedPrice);
	    logger.info("Amazon Product Price: " + amazonOfferedPrice);
	    
        
	    //Comparing price of Flipkart product and Amazon product
	    
	    try {
	   
	    		if(search_again_filters.flipkartOfferedPrice == amazonOfferedPrice) 
	    		{
		    		logger.info("Flipkart product price: "+ search_again_filters.flipkartOfferedPrice + " & Amazon product price: " + amazonOfferedPrice + " -- are same" );

	    		}else if(search_again_filters.flipkartOfferedPrice > amazonOfferedPrice)
	    		{
	    			logger.info("Flipkart product price: "+ search_again_filters.flipkartOfferedPrice + " is greater than Amazon product price: " + amazonOfferedPrice);

	    		}else if(search_again_filters.flipkartOfferedPrice < amazonOfferedPrice)
	    		{
	    			logger.info("Flipkart product price: "+ search_again_filters.flipkartOfferedPrice + " is less than Amazon product price: " + amazonOfferedPrice);

	    		}else {
	    			logger.info("Unexpected price comparison: Flipkart product price: " + search_again_filters.flipkartOfferedPrice + " and Amazon product price: " + amazonOfferedPrice);	    	
	    			}
	  
	    }catch(Exception ProductPriceException){
	    	logger.error("Getting exeption while comparing price: "+ProductPriceException.getMessage());
	    }

		
		 

}
}