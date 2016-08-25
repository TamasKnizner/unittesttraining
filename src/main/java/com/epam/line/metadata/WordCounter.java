package com.epam.line.metadata;

/**
 * Counts words in string.
 *
 */
public interface WordCounter {

    /**
     * Counts words in the given string array.
     * @param words array of words
     * @return number of words in the given array
     */
    int count(String[] words);

}
