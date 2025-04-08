package FlipkartAutomationTest;

public class MultiThreadTestCaseExecutor {
	  public static void main(String[] args) {
	        // Initialize Appium Driver
	        AndroidDriverInitializer androidDriver = new AndroidDriverInitializer();
	        androidDriver.AppiumDriverInitializer(); 
	        androidDriver.allowaccess();
	        
	        // Create instances of the test cases
	        logInTestCase loginTest = new logInTestCase();
	        searchProduct searchTest = new searchProduct();
	        cart_operations cartoperationsTest= new cart_operations();
	        search_again_filters searchagainfiltersTest= new search_again_filters();
	        switch_to_Amazon switchtoAmazonTest= new switch_to_Amazon();

	        
	        // Create TestCaseRunner instances for each test case
	        TestCaseRunner loginTestRunner = new TestCaseRunner(loginTest);
	        TestCaseRunner searchproductTestRunner = new TestCaseRunner(searchTest);
	        TestCaseRunner cartoperationsTestRunner= new TestCaseRunner(cartoperationsTest);
	        TestCaseRunner searchagainfiltersTestRunner= new TestCaseRunner(searchagainfiltersTest);
	        TestCaseRunner switchtoAmazonTestRunner= new TestCaseRunner(switchtoAmazonTest);

	        // Create threads for each test case
	        Thread loginTestThread = new Thread(loginTestRunner);
	        Thread searchproductTestThread = new Thread(searchproductTestRunner);
	        Thread cartoperationsTestThread = new Thread(cartoperationsTestRunner);
	        Thread searchagainfiltersTestThread = new Thread(searchagainfiltersTestRunner);
	        Thread switchtoAmazonTestThread = new Thread(switchtoAmazonTestRunner);


	        try {
	            // Start the login test case first
	            loginTestThread.start();
	            
	            // Ensure login test case finishes before starting the search product test case
	            loginTestThread.join();  // Blocks until loginTestThread finishes

	            // Start the search product test case after the login test case completes
	            searchproductTestThread.start();

	            // Wait for the search product test case to finish
	            searchproductTestThread.join();  // Blocks until searchTestThread finishes
	            
	            // Start the cart operations test case after the search product test case completes
	            cartoperationsTestThread.start();
	            cartoperationsTestThread.join();// Blocks until cartoperationsTestThread finishes
	            
	            searchagainfiltersTestThread.start();
	            searchagainfiltersTestThread.join();
	            
	            switchtoAmazonTestThread.start();
	            switchtoAmazonTestThread.join();
	            

	        } catch (InterruptedException e) {
	            System.out.println("Failed to navigate back: " + e.getMessage());
	        } finally {
		        // Quit the driver after both tests are executed

	            if (AndroidDriverInitializer.androiddriver != null) {
	            	AndroidDriverInitializer.androiddriver.quit();
	    	        System.out.println("Tests executed and driver closed.");
	            }
	          
	        }
	        
	    }


	}
