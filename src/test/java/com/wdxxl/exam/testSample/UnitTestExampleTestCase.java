package com.wdxxl.exam.testSample;

import java.util.ArrayList;


import org.junit.Assert;
import org.junit.Test;


public class UnitTestExampleTestCase{

	@Test
	public void test(){
		Assert.assertEquals(1, 1);
		Assert.assertFalse(1>1);
		Assert.assertNotNull(new String());
		Assert.assertSame("Hello", "Hello");
	}
	
	@Test
	public void testException() { 
	    try {
			new ArrayList<Object>().get(0);
		} catch (Exception e) {
			Assert.assertTrue(true);
		}  
	}
}

