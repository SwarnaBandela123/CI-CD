package FlipkartAutomationTest;

import java.util.NoSuchElementException;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;


public class logInTestCase implements MultiThreadTestCase{
	
 @Test
	@Override
	public void executeTestCase() throws Exception {
		//Login to the Flipkart application
		logger.info(testDataLoader.get_start_login_testcase());
	    
		WebElement mobilenumberfield = wait.until(ExpectedConditions.visibilityOfElementLocated(locators.getLoginFieldLocator()));
		mobilenumberfield.click();
		
		String mobileNum=testDataLoader.get_mobile_Number(); 
		
        for (char digit : mobileNum.toCharArray()) {
            pressKey(Character.getNumericValue(digit));  // Press each digit on the keypad
		}
		
       	
		logger.info(testDataLoader.get_entered_mobile_num());
		
		 WebElement continuewithMobileNum =AndroidDriverInitializer.androiddriver.findElement(locators.getContinueButtonLocator());
		 
		 continuewithMobileNum.click();
		 
		 logger.info(testDataLoader.get_clicked_continue_btn());
		 logger.info(testDataLoader.get_waiting_for_otp()); 
		 logger.info(testDataLoader.get_flipkart_home_page()); 
		
		 try {
		 WebElement errorMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(locators.getErrorMessageLocator()));  
		
			 if(errorMessage.isDisplayed()) { 
				 WebElement Skip_button = wait.until(ExpectedConditions.visibilityOfElementLocated(locators.getskipbtn()));                              
	             Skip_button.click();             
	             logger.info(testDataLoader.get_flipkart_home_page());
	
			 } else {
				 logger.info(testDataLoader.get_click_otp_resend_btn()); 

				 WebElement ResendCode = wait.until(ExpectedConditions.visibilityOfElementLocated(locators.getResendOtpButtonLocator())); 

				 ResendCode.click(); 

				 logger.info(testDataLoader.get_waiting_for_otp()); 

				 logger.info(testDataLoader.get_flipkart_home_page()); 
			 }
		 }catch (TimeoutException | NoSuchElementException exception) {
			 logger.info("getting exception: "+exception.getMessage());
			} 
                                
      }
}	

