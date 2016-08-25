package com.epam.line.metadata;

/**
 * Counts words that are not longer than a given limit.
 *
 */
public class LimitedWordCounter implements WordCounter {
    private int limit;


    /**
     * Creates new instance.
     * @param limit max length of a word. Cannot be negative.
     */
    public LimitedWordCounter(int limit) {
        super();
        if (limit < 0) {
            throw new IllegalArgumentException("Limit cannot be negative!");
        }
        this.limit = limit;
    }

    @Override
    public int count(String[] words) {
        if (words == null) {
            throw new IllegalArgumentException("Collection of words must not be empty");
        }
        int counter = 0;
        for (String word : words) {
            if (word.length() <= limit) {
                ++counter;
            }
        }
        return counter;
    }
    
    
}
