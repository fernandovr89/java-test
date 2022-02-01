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
        String extension = "";
        if (filename == null || filename.length() == 0)
            return null;

        int index = filename.lastIndexOf('.');
        if (index >= 0) {
            extension = filename.substring(index + 1);
            return extension;
        }
        return null;
    }

    /**
     * return the longest string contained inside the input array
     *
     * @param array input Array of values
     * @return null if input is null and the longest string otherwise
     */
    public String getLongestString(Object[] array) {
        if (array == null || array.length == 0)
            return null;

        String longestString = "";
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                if (array[i] instanceof Object[]) {
                    Object[] array_i = (Object[]) array[i];
                    if (array_i.length > 0)
                        longestString = this.getLongestString(array_i);
                } else if (array[i] instanceof String) {
                    if (array[i].toString().length() > longestString.length()) {
                        longestString = array[i].toString();
                    }
                }
            }
        }
        return longestString;
    }

    /**
     * Returns true if both arrays contains the same values in the same order
     *
     * @param array1 first Array to test
     * @param array2 second Array to test
     * @return true if both arrays contains the same values
     */
    public boolean areArraysEquals(String[] array1, String[] array2) {
        if (array1 == array2)
            return true;

        if (array1 == null || array2 == null)
            return false;

        if (array1.length != array2.length)
            return false;

        for (int i = 0; i < array1.length; i++) {
            String string1 = array1[i];
            String string2 = array2[i];
            if (string1 == null || string2 == null || !string1.equals(string2))
                return false;
        }
        return true;
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
        if (input == null)
            return null;
        String output = "";
        char[] charArray = input.toCharArray();
        int count = 1;
        for (int i = 0; i < charArray.length; i++) {
            for (int j = i + 1; j < charArray.length; j++) {
                if (charArray[i] == charArray[j] && charArray[i] != Character.MIN_VALUE) {
                    count++;
                    charArray[j] = Character.MIN_VALUE;
                } else {
                    break;
                }
            }
            if (count > 1) {
                output = output + count + charArray[i];
            } else if (charArray[i] != Character.MIN_VALUE) {
                output = output + charArray[i];
            }
            count = 1;
        }
        return output;
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
        if (array == null)
            return null;
        if (array.length == 0)
            return null;
        String[] compressedString = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            compressedString[i] = this.getCompressedString(array[i]);
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if ((compressedString[j].compareTo(compressedString[j + 1])) > 0) {
                    String compressedToSwap = compressedString[j];
                    compressedString[j] = compressedString[j + 1];
                    compressedString[j + 1] = compressedToSwap;
                    String originalToSwap = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = originalToSwap;
                }
            }
        }
        return array;
    }

}
