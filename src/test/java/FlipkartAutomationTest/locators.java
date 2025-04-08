package FlipkartAutomationTest;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;

public class locators {
	
	//Access for chome application launch
	public static By user_location=AppiumBy.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button");
	public static By select_language=AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[4]/android.widget.RelativeLayout");

	
	//Login locators
	public static By mobile_number_field = AppiumBy.id("com.flipkart.android:id/phone_input");
	public static By continue_button = AppiumBy.id("com.flipkart.android:id/button");
	public static By flipkart_home_page = AppiumBy.xpath(" /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout");
	public static By skip_btn = AppiumBy.id("com.flipkart.android:id/custom_back_icon");
	
	public static By otp_field = AppiumBy.id("com.flipkart.android:id/sub_title");
	public static By error_message = AppiumBy.xpath("	\r\n"
			+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.GridView/android.widget.LinearLayout[1]/android.widget.TextView");
	public static By resend_otp_button = AppiumBy.id("com.flipkart.android:id/tv_right_cta");
	
	//Search product locators	
	public static By click_on_search = AppiumBy.xpath("	\r\n"
			+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[4]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]");
	
	public static By search_field=AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.widget.EditText");
	public static By auto_suggestions_for_search=AppiumBy.xpath("	\r\n"
			+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup");
	
	public static By select_suggestions_for_search=AppiumBy.xpath("//*[@content-desc=\"laptop hp\"]");
	
	
	public static By productResult = AppiumBy.id("com.flipkart.android:id/product_title");

	
	public static By notifications_off = AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[1]");
	public static By select_product=AppiumBy.xpath("//*[contains(@text, 'DELL Vostro 3520 Intel Core i3 12th Gen 1215U - (8 GB/512 GB SSD/Windows 11 Home) Vostro 3520 Thin and Light Laptop')]");
	public static By product_list1=AppiumBy.xpath("	\r\n"
			+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup");
	public static By product_list2=AppiumBy.xpath("	\r\n"
			+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup");
	
	public static By click_on_product=AppiumBy.xpath("(//android.widget.TextView[contains(@text, 'Dell')]/ancestor::android.view.ViewGroup//android.widget.TextView)[3]");	
	public static By product_add_to_cart=AppiumBy.xpath("//*[contains(@text, 'Add to cart')]");
	public static By product_add_to_cart_icon=AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView");
	public static By go_to_cart=AppiumBy.xpath("//*[contains(@text, 'Go to cart')]");
	public static By remove_from_cart=AppiumBy.xpath("//*[contains(@text, 'Remove')]");
	public static By continue_shopping=AppiumBy.xpath("//*[contains(@text, 'Continue Shopping')]");
	public static By shop_now=AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Shop now\"]");

	//cart operations
	
	public static By fashions=AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Fashion \"]"); //for adding two are more products to the cart
	public static By dress_and_tops=AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Dresses, Tops \"]");	
	//or
	public static By dresses=AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView");	
	public static By dress=AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Dresses \"]/android.widget.TextView");	
	public static By dresses1=AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.ImageView");	
//	public static By women=AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView");	

	public static By women=AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]");	

//	public static By dresses1=AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView");	

	public static By Flower_Power_dress=AppiumBy.xpath("//android.widget.TextView[contains(@text, 'Flower Power')]/ancestor::android.view.ViewGroup//android.widget.TextView");	
	public static By Sheetal_Associates_dress=AppiumBy.xpath("(//android.widget.ImageView[contains(@content-des, '4.1, ★, AAYU Women Fit and Flare Multicolor Dress, 2,599 ₹822, 68% off')])[1]");	
	public static By Honky_Tonky_dress=AppiumBy.xpath("//android.widget.TextView[contains(@text, 'Flower Power')]/ancestor::android.view.ViewGroup//android.widget.TextView");	

	public static By first_dress=AppiumBy.xpath("(//android.widget.ImageView)[2]");	
	public static By second_dress=AppiumBy.xpath("(//android.widget.ImageView)[3]");	
	public static By dresses_list=AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]");	
	public static By dress_sizeM=AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"M\"]");
	//public static By dress_sizeM=AppiumBy.xpath("///*[contains(@content-desc, 'M')]");

	public static By dress_sizeL=AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"L\"]");	
	public static By dress_sizeXL=AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"XL\"]");	

	public static By continue_to_add_to_cart=AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Continue\"]");	

	//To check whether the navigated back to previous screen or not
	public static By back_arrow=AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]");	

	public static By view_similar_dresses=AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"View Similar \"]");	

	//number of products in cart
	public static By cart_icon=AppiumBy.xpath("//android.view.ViewGroup[@content-desc='2']/android.view.ViewGroup[1]");	

	//android.view.ViewGroup[@content-desc=\"2\"]/android.view.ViewGroup[1]
	
	
	//Search again with filters
	public static By filter=AppiumBy.xpath("//*[contains(@text, 'Filter')]");
	public static By size=AppiumBy.xpath("//*[contains(@text, 'Size')]");
	public static By sizeM=AppiumBy.xpath("//*[contains(@text, 'M')]");
	public static By sizeL=AppiumBy.xpath("//*[contains(@text, 'L')]");

	public static By price_below_299=AppiumBy.xpath("	\r\n"
			+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]");	
	public static By Apply_filter=AppiumBy.xpath("//*[contains(@text, 'Apply')]");	

	
	public static By getlocationFieldLocator() {
        return user_location;
    }
	
	public static By getlanguageFieldLocator() {
        return select_language;
    }
	
	public static By getLoginFieldLocator() {
	        return mobile_number_field;
	    }

	    public static By getContinueButtonLocator() {
	        return continue_button;
	    }
	    public static By getflipkarthomepage() {
	        return flipkart_home_page;
	    }
	    public static By getskipbtn() {
	        return skip_btn;
	    }
	    
	   public static By getOtpFieldLocator() {
	        return otp_field;
	    }
	   
	    public static By getErrorMessageLocator() {
	        return error_message;
	    }

	    public static By getResendOtpButtonLocator() {
	        return resend_otp_button;
	    }
	    
	    
	    public static By getclickonsearch() {
	        return click_on_search;
	    }
	    public static By getsearchfield() {
	        return search_field;
	    }
	    public static By getautosuggestionslist() {
	        return auto_suggestions_for_search;
	    }
	    
	    public static By getselctsuggestionsfromlist() {
	        return select_suggestions_for_search;
	    }

	    public static By getSearchResultLocator() {
	        return productResult;
	    }

	    //cart operations
	    public static By getnotificationsoff()
	    {
	    	return notifications_off;
	    }
	    public static By getproductslist1()
	    {
	    	return product_list1;
	    }
	    public static By getproductslist2()
	    {
	    	return product_list2;
	    }
	    public static By getclickonproduct()
	    {
	    	return click_on_product;
	    }
	    public static By getproductaddtocart()
	    {
	    	return product_add_to_cart;
	    }
	    public static By getproductaddtocarticon()
	    {
	    	return product_add_to_cart_icon;
	    }
	   
	    public static By getgotocart()
	    {
	    	return go_to_cart;
	    }
	     public static By getremovefromcart()
	    {
	    	return remove_from_cart;
	    }
	     public static By getcontinueshopping()
		    {
		    	return continue_shopping;
		    }
	     public static By getshopnow()
		    {
		    	return shop_now;
		    }
	     public static By getfashions()
		    {
		    	return fashions;
		    }
	     public static By getdressandtops()
		    {
		    	return dress_and_tops;
		    }
	     public static By getdresses()
		    {
		    	return dresses;
		    }
	     //or
	     public static By getdress()
		    {
		    	return dress;
		    }
	     public static By getdresses1()
		    {
		    	return dresses1;
		    }
	     public static By getwomen()
		    {
		    	return women;
		    }
	    
	     public static By getSheetalAssociatesdress()
		    {
		    	return Sheetal_Associates_dress;
		    }
	     public static By getFlowerPowerdress()
		    {
		    	return Flower_Power_dress;
		    }
	     public static By getHonkyTonkydress()
		    {
		    	return Honky_Tonky_dress;
		    }
	     public static By getfirstdress()
		    {
		    	return first_dress;
		    }
	     public static By getseconddress()
		    {
		    	return second_dress;
		    }
	    
	     public static By getdresseslist()
		    {
		    	return dresses_list;
		    }
	     public static By getdresssizeM()
		    {
		    	return dress_sizeM;
		    }
	     public static By getdresssizeL()
		    {
		    	return dress_sizeL;
		    }
	     public static By getdresssizeXL()
		    {
		    	return dress_sizeXL;
		    }
	     public static By getcontinuetoaddtocart()
		    {
		    	return continue_to_add_to_cart;
		    }
	     public static By getviewsimilardresses()
		    {
		    	return view_similar_dresses;
		    }
	     
	     public static By getbackarrow()
		    {
		    	return back_arrow;
		    }
	    public static By getselectproduct()
	    {
	    	return select_product;
	    }
	    
		//number of products in cart
	    public static By getcarticon()
	    {
	    	return cart_icon;
	    }
	    
	    
	    //search with filters
	    public static By getfilter()
	    {
	    	return filter;
	    }
	    public static By getsize()
	    {
	    	return size;
	    }
	    public static By getsizeM()
	    {
	    	return sizeM;
	    }
	    public static By getsizeL()
	    {
	    	return sizeL;
	    }
	    public static By getpricebelow299()
	    {
	    	return price_below_299;
	    }
	    public static By getApplyfilter()
	    {
	    	return Apply_filter;
	    }
	    
	    
	    //Search again filters
		public static By FlipkartProductName=AppiumBy.xpath("//android.widget.TextView[contains(@text, 'Dress')]");	
		  public static By getFlipkartProductName()
		    {
		    	return FlipkartProductName;
		    }
		
		  public static By FlipkartProductPrice=AppiumBy.xpath("//android.view.ViewGroup[contains(@content-desc, '₹')]");	
		  public static By getFlipkartProductPrice()
		    {
		    	return FlipkartProductPrice;
		    }
		  
	    //Switch to Amazon
		  public static By skip_sign_in=AppiumBy.xpath("in.amazon.mShop.android.shopping:id/skip_sign_in_button");	
		  public static By getskipsignin()
		    {
		    	return skip_sign_in;
		    }
		  
		  public static By searchBox=AppiumBy.xpath("//*[contains(@text, 'Search')]");	
		  public static By getsearchBox()
		    {
		    	return searchBox;
		    } 
		  
		  public static By search_data=AppiumBy.xpath("//*[contains(@text, 'Search')]");	
		  public static By getsearchdata()
		    {
		    	return search_data;
		    } 
		  
		  public static By click_amazon_dress=AppiumBy.xpath("//*[contains(@text, search_again_filters.FlipkartName)]");	
		  public static By getclickamazondress()
		    {
		    	return click_amazon_dress;
		    } 
		  
		  public static By AmazonProductName=AppiumBy.xpath("//android.widget.TextView[contains(@resource-id, 'title')]");	
		  public static By getAmazonProductName()
		    {
		    	return AmazonProductName;
		    }
		  
		  public static By AmazonProductPrice=AppiumBy.xpath("//android.widget.TextView[contains(@text, '₹')]");	
		  public static By getAmazonProductPrice()
		    {
		    	return AmazonProductPrice;
		    }
}


