package com.epam.line.support;

/**
 * Splits lines into words based on a separator.
 *
 */
public class DelimitedLineSplitter implements LineSplitter {
	private String separator;

	/**
	 * Creates new instance.
	 * 
	 * @param separator
	 *            non-empty string acting as a word separator
	 */
	public DelimitedLineSplitter(String separator) {
		super();
		if (separator == null || separator.isEmpty()) {
			throw new IllegalArgumentException("Separator must not be empty!");
		}
		this.separator = separator;
	}

	@Override
	public String[] split(String line) {
		return line.split(separator);
	}
}
