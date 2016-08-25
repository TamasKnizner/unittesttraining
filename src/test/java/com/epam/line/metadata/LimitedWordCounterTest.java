package com.epam.line.metadata;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LimitedWordCounterTest {

	private LimitedWordCounter limitedWordCounter;

	@Before
	public void setup() {
		limitedWordCounter = new LimitedWordCounter(16);
	}

	@Test
	public void testCountShouldReturnANumberWhenGivenTheseData() {
		// GIVEN
		String[] data = {"A", "simple", "string."};
		int expectedOutput = 3;
		// WHEN
		int actualOutput = limitedWordCounter.count(data);
		// THEN
		Assert.assertEquals(expectedOutput, actualOutput);
	}

	@Test
	public void testCountShouldReturnZeroWhenGivenTheseData() {
		// GIVEN
		String[] data = {};
		int expectedOutput = 0;
		// WHEN
		int actualOutput = limitedWordCounter.count(data);
		// THEN
		Assert.assertEquals(expectedOutput, actualOutput);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testConstructorShouldThrowExceptionWhenLimitIsLessThenZero() {
		// GIVEN
		int limit = -1;
		// WHEN
		new LimitedWordCounter(limit);
		// THEN
		// Exception is thrown
	}

	@Test(expected = IllegalArgumentException.class)
	public void testCountShouldThrowExceptionWhenGivenDataIsNull() {
		// GIVEN
		String[] data = null;
		// WHEN
		limitedWordCounter.count(data);
		// THEN
		// Exception is thrown
	}

}
