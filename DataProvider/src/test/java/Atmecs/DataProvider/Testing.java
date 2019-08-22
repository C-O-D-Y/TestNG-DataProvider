package Atmecs.DataProvider;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testing {
	SoftAssert softassert = new SoftAssert();

	@BeforeMethod
	public void BeforeTestmessage() {
		System.out.println("Testing Data verification");
	}

	@AfterMethod
	public void AfterTestmessage() {
		System.out.println("Verification Completed");
	}

	@Test(priority = 3, dataProvider = "data-provider", dataProviderClass = TakeInput.class)
	public void testMethod1(Object data, Object vertex) {
		try {
			System.out.println(data);
			softassert.assertEquals(data, "arjun");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("TestNGException Came");
		}

	}

	@Test(priority = 2, dataProvider = "data-provider", dataProviderClass = TakeInput.class)
	public void testMethod2(Object data, Object vertex) {
		try {
			System.out.println(data);
			softassert.assertEquals(data, "saurabh");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("TestNGException Came");
		}

	}

	@Test(priority = 4, dataProvider = "data-provider", dataProviderClass = TakeInput.class)
	public void testMethod3(Object data, Object vertex) {
		try {
			System.out.println(data);
			softassert.assertEquals(data, "rishav");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("TestNGException Came");
		}

	}

	@Test(priority = 1, dataProvider = "data-provider", dataProviderClass = TakeInput.class)
	public void testMethod4(Object data, Object vertex) {
		try {
			System.out.println(data);
			softassert.assertEquals(data, "anusha");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("TestNGException Came");
		}

	}
}