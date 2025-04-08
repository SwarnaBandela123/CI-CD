package FlipkartAutomationTest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class search_again_filters implements MultiThreadTestCase {
	 public static String FlipkartName;
	 public static double flipkartOfferedPrice;
	@Override
	public void executeTestCase() throws InterruptedException {
		logger.info(testDataLoader.get_start_search_product_testcase());
		
		
		MultiThreadTestCase.scrollFun("Free delivery");//		//page scroll and click on particular product
		
        //product name
		WebElement FlipkartProductName = wait.until(ExpectedConditions.visibilityOfElementLocated(locators.getFlipkartProductName()));

		FlipkartName = FlipkartProductName.getText();
        logger.info("Flipkart Product Name: " + FlipkartName);

        //product price
        WebElement FlipkartProductPrice = wait.until(ExpectedConditions.visibilityOfElementLocated(locators.getFlipkartProductPrice()));
        String flipkartContentDesc = FlipkartProductPrice.getAttribute("content-desc");
        // Regular expression to extract the price (offered price)
        String FlipkartOfferedPrice = flipkartContentDesc.replaceAll(".*(₹\\d+,?\\d+).*", "$1"); 
        FlipkartOfferedPrice = FlipkartOfferedPrice.replace("₹", "").replace(",", "");
        // Convert to double
       flipkartOfferedPrice = Double.parseDouble(FlipkartOfferedPrice);
        logger.info("Flipkart Product Price: ₹" + flipkartOfferedPrice);
       
	}

}
