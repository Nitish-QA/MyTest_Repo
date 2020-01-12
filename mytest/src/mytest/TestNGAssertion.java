package mytest;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNGAssertion {
	
//------------------HARD ASSERT-----------------------------------------------------------------------
	
// Hard Assert means execution will stop if fails and move to the next test case	
	@Test	
	public void test1() {
	
		Assert.assertEquals("expected", "actual");
		
		}
	
	@Test
	public void test2() {
		// TODO Auto-generated method stub
		
		Assert.assertEquals("expected", "actual" ,"comment only display when fails");
		System.out.println("passed");
	}
	
	
	@Test
	public void test3() {
		
		Assert.assertTrue(true);
		System.out.println("hello"); // this line will get executed.
		
		Assert.assertFalse(false);
		System.out.println("hi");  // this line will not get executed
	}
	
//-----------------VERIFY/SOFT ASSERT--------------------------------------------------------------------------
	
/* Soft Assert means even if the validation fails it will execute further	
	IMP- need to Create object of SoftAssert Class
	VIMP- must have to use .assertAll() at the end */
	
	@Test
	public void test4() {
		
		SoftAssert assertion = new SoftAssert();
		
		assertion.assertEquals(12, 13); // here validation fails
		System.out.println("hi");  // this statement will get  excuted
		assertion.assertAll();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
