package com.epam.line;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.epam.line.domain.LineMetadata;
import com.epam.line.metadata.LimitedWordCounter;
import com.epam.line.support.DelimitedLineSplitter;

public class LineMetadataCollectorTest {

	private LineMetadataCollector lineMetadataCollector;
	
	@Before
	public void setup() {
		int limit = 16;
		String separator = " ";
		lineMetadataCollector = new LineMetadataCollector(new LimitedWordCounter(limit), new DelimitedLineSplitter(separator));
	}
	
	@Test
	public void testCollectLineMetadataShouldWorkCorrectlyWhenGivenTheseData() {
		//GIVEN
		String testData = "This is a single line string with a lot of spaces.";
		LineMetadata expectedOutput = new LineMetadata(11);
		//WHEN
		LineMetadata actualOutput = lineMetadataCollector.collectLineMetadata(testData);
		//THEN
		Assert.assertEquals(expectedOutput, actualOutput);
	}
	
}
