package com.epam.line.support;

/**
 * Splits a line of text.
 *
 */
public interface LineSplitter {

    /**
     * Splits 'line'.
     * @param line string to be splitted.
     * @return splitted line
     */
    String[] split(String line);

}
