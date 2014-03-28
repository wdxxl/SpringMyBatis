package com.wdxxl.exam.testSample;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * http://www.javacodegeeks.com/2014/03/junit-expectedexception-rule-beyond-basics.html
 * @author wdxxl
 *
 */
public class ExceptionExpectedTestCase {
	@Rule
	public ExpectedException thrown = ExpectedException.none();

	@Test
	public void testRuntimeExceptionExpect() {
		thrown.expect(RuntimeException.class);
		thrown.expectMessage("Runtime exception occurred");

		throw new RuntimeException("Runtime exception occurred");
	}

}
