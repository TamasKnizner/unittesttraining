package com.epam.line;

import com.epam.line.domain.LineMetadata;
import com.epam.line.metadata.WordCounter;
import com.epam.line.support.LineSplitter;

/**
 * Collects basic meta-data of a line.
 *
 */
public class LineMetadataCollector {
    private WordCounter wordCounter;
    private LineSplitter lineSplitter;

    /**
     * Creates new instance.
     * @param wordCounter counts words
     * @param lineSplitter splits lines
     */
    public LineMetadataCollector(WordCounter wordCounter, LineSplitter lineSplitter) {
        super();
        this.wordCounter = wordCounter;
        this.lineSplitter = lineSplitter;
    }

    /**
     * Collects meta-data regarding 'line'.
     * @param line string to collect meta-data about 
     * @return collected meta-data
     */
    public LineMetadata collectLineMetadata(String line) {
        String[] words = split(line);
        int wordCount = count(words);
        return createMetadata(wordCount);
    }

    private LineMetadata createMetadata(int wordCount) {
        return new LineMetadata(wordCount);
    }

    private int count(String[] words) {
        return wordCounter.count(words);
    }

    private String[] split(String line) {
        return lineSplitter.split(line);
    }
}
