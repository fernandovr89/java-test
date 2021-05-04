package io.glide;


/**
 * This is where you have to code.
 *
 * See javadoc and associated unit tests to understand what is expected
 */
public class ThisIsWhereYouCode {

    /**
     * input will be a string, but it may not have a file extension. return the file
     * extension (with no period) if it has one, otherwise null
     *
     * @param filename
     * @return null if input is null or filename has no extension and the
     *         extension without the period otherwise
     */
    public String getFileNameExtension(String filename) {
        // XXX implement me !
        return null;
    }

    /**
     * return the longest string contained inside the input array
     *
     * @param array input Array of values
     * @return null if input is null and the longest string otherwise
     */
    public String getLongestString(Object[] array) {
        // XXX implement me !
        return null;
    }

    /**
     * Returns true if both arrays contains the same values in the same order
     *
     * @param array1 first Array to test
     * @param array2 second Array to test
     * @return true if both arrays contains the same values
     */
    public boolean areArraysEquals(String[] array1, String[] array2) {
        // XXX implement me !
        return false;
    }

    /**
     * Compress the input string with a very dummy algorithm : repeated letters
     * are replaced by {n}{letter} where n is the number of repetition and
     * {letter} is the letter. n must be superior to 1 (otherwise, simply output
     * the letter)
     *
     * @param input the input string that can only contains letters
     * @return the compressed String or null if the input is null
     */
    public String getCompressedString(String input) {
        // XXX implement me !
        return null;
    }

    /**
     * Sort the input array of string based on lexicographic order of the
     * corresponding compressed string.
     *
     * Hint : The expected sorting should use the getCompressedString implementation
     *
     * @param array the Array to sort
     * @return the sorted array
     */
    public String[] getSortedArray(String[] array) {
        // XXX implement me !
        return null;
    }

}
