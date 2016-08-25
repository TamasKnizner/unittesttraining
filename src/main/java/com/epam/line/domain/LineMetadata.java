package com.epam.line.domain;

/**
 * Represents meta-data of a line.
 *
 */
public class LineMetadata {
    private int wordCount;

    /**
     * Creates new instance
     * 
     * @param wordCount number of words in a line
     */
    public LineMetadata(int wordCount) {
        super();
        this.wordCount = wordCount;
    }

    public int getWordCount() {
        return wordCount;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + wordCount;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LineMetadata other = (LineMetadata) obj;
		if (wordCount != other.wordCount)
			return false;
		return true;
	}
    
    

}
