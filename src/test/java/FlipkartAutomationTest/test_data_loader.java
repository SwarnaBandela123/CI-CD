package FlipkartAutomationTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class test_data_loader {
	 private Properties properties;
	    
	    public test_data_loader(String filePath) {
	        properties = new Properties();
	        try {
	            FileInputStream fileInputStream = new FileInputStream(filePath);
	            properties.load(fileInputStream);
	            fileInputStream.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	            System.out.println("Failed to load test data file: " + e.getMessage());
	        }
	    }
	    //comman input data
	    public String get_waiting_for_otp() {
	        return properties.getProperty("waiting_for_otp");
	    }
	    public String get_flipkart_home_page() {
	        return properties.getProperty("flipkart_home_page");
	    }
	    
	    //Login Flipkart
	    
	    public String get_start_login_testcase() {
	        return properties.getProperty("start_login_testcase");
	    }
	    // Retrieve mobile number from properties file
	    public String get_mobile_Number() {
	        return properties.getProperty("mobile_Number");
	    }
	    
	    public String get_entered_mobile_num() {
	        return properties.getProperty("entered_mobile_num");
	    }
	    public String get_clicked_continue_btn() {
	        return properties.getProperty("clicked_continue_btn");
	    }
	    public String get_otp_field_displayed() {
	        return properties.getProperty("otp_field_displayed");
	    }
	
	    
	    //Negative scenario for login
	    public String get_otp_field_not_displayed() {
	        return properties.getProperty("otp_field_not_displayed");
	    }
	    public String get_error_text_max_attemps_reached() {
	        return properties.getProperty("error_text_max_attemps_reached");
	    }
	    public String get_error_text_account_locked() {
	        return properties.getProperty("error_text_account_locked");
	    }
	    public String get_error_text_unkown_error() {
	        return properties.getProperty("error_text_unkown_error");
	    }
	    
	    //OTP resend 
	    public String get_click_otp_resend_btn() {
	        return properties.getProperty("click_otp_resend_btn");
	    }
	    
	    
	    // Retrieve search term from properties file
	    public String get_start_search_product_testcase() {
	        return properties.getProperty("start_search_product_testcase");
	    }
	    public String get_search_text() {
	        return properties.getProperty("search_text");
	    }
	    public String get_select_option_from_suggestions() {
	        return properties.getProperty("select_option_from_suggestions");
	    }
	    public String get_suggetions_not_found() {
	        return properties.getProperty("suggetions_not_found");
	    }
	    public String get_page_load() {
	        return properties.getProperty("page_load");
	    }
	    public String get_product_info_displayed() {
	        return properties.getProperty("product_info_displayed");
	    }
	    public String get_failed_to_display_products() {
	        return properties.getProperty("failed_to_display_products");
	    }
	    
	    //Cart operations
	    public String get_start_cart_operations_testcase() {
	        return properties.getProperty("start_cart_operations_testcase");
	    }
	    public String get_product_Name() {
	        return properties.getProperty("product_Name");
	    }
	    public String get_product_added_cart() {
	        return properties.getProperty("product_added_cart");
	    } 
	    public String get_navigated_to_cart() {
	        return properties.getProperty("navigated_to_cart");
	    } 
	    public String get_remove_product_from_cart() {
	        return properties.getProperty("remove_product_from_cart");
	    }
	    public String get_continue_shopping() {
	        return properties.getProperty("continue_shopping");
	    }
	    public String get_navi_fashions() {
	        return properties.getProperty("navi_fashions");
	    }
	    public String get_dress_and_tops() {
	        return properties.getProperty("dress_and_tops");
	    }
	    public String get_select_dresses() {
	        return properties.getProperty("select_dresses");
	    }
	    public String get_first_dress_to_cart() {
	        return properties.getProperty("first_dress_to_cart");
	    }
	     public String get_second_dress_to_cart() {
	        return properties.getProperty("second_dress_to_cart");
	    }
	    public String get_navi_back() {
	        return properties.getProperty("navi_back");
	    }
	    
	    
	    //search again and apply filters
	    public String get_start_search_again_testcase() {
	        return properties.getProperty("start_search_again_testcase");
	    }
	}
