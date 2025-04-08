package FlipkartAutomationTest;

public class TestCaseRunner implements Runnable  {
	 private final MultiThreadTestCase testCase;

	    public TestCaseRunner(MultiThreadTestCase testCase) {
	        this.testCase = testCase;
	    }

	    @Override
	    public void run() {
	        try {
				testCase.executeTestCase();
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Print exception: "+e);
			}
	    }
	}

