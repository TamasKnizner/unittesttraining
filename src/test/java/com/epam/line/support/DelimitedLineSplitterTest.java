package com.epam.line.support;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DelimitedLineSplitterTest {

	private DelimitedLineSplitter delimitedLineSplitter;

	@Before
	public void setup() {
		String separator = " ";
		delimitedLineSplitter = new DelimitedLineSplitter(separator);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testConstructorShouldThrowExceptionWhenSeparatorIsNull() {
		// GIVEN
		String separator = null;
		// WHEN
		new DelimitedLineSplitter(separator);
		// THEN
		// Exception is thrown
	}

	@Test(expected = IllegalArgumentException.class)
	public void testConstructorShouldThrowExceptionWhenSeparatorIsEmpty() {
		// GIVEN
		String separator = "";
		// WHEN
		new DelimitedLineSplitter(separator);
		// THEN
		// Exception is thrown
	}
	
	@Test
	public void testSplitShouldWorkWhenGivenTheseData() {
		// GIVEN
		String data = "This is a single line string with a lot of spaces.";
		String[] expectedOutput = {"This", "is", "a", "single", "line", "string", "with", "a", "lot", "of", "spaces."};
		// WHEN
		String[] actualOutput = delimitedLineSplitter.split(data);
		// THEN
		Assert.assertArrayEquals(expectedOutput, actualOutput);
		
	}

}
