package io.glide.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import io.glide.ThisIsWhereYouCode;

/**
 * Here are the unit tests that must be verified by the implementation
 */
public class Tester {

    ThisIsWhereYouCode impl = new ThisIsWhereYouCode();

    @Test
    public void testExtensions() {

        String[] inputs = { "somefile.dat", "movie.torrent", "noextension", ".htaccess", "noext.", null };
        String[] expected = { "dat", "torrent", null, "htaccess", "", null };

        for (int i = 0; i < inputs.length; i++) {
            assertEquals(expected[i], impl.getFileNameExtension(inputs[i]));
        }
    }

    @Test
    public void testLongestString() {

        Object[][] inputs = { new Object[] { "a", "ab", "abc" },
                new Object[] { "abc", "ab", "a" },
                new Object[] { "big", new Object[] { "ab", "a", }, "tiny" },
                new Object[] { "big", new Object[] { "ab", "a", new Object[] { "superbig", "a" } }, "tiny" },
                new Object[] { 123, 23123123, "a" },
                new Object[] { null, new Object[] {}, "a" } };
        String[] expected = { "abc", "abc", "tiny", "superbig", "a", "a" };
        for (int i = 0; i < inputs.length; i++) {
            assertEquals(expected[i], impl.getLongestString(inputs[i]));
        }
    }

    @Test
    public void testArrayEquals() {

        assertTrue(impl.areArraysEquals(new String[] {}, new String[] {}));
        assertTrue(impl.areArraysEquals(new String[] { "a", "b", "c" }, new String[] { "a", "b", "c" }));
        assertFalse(impl.areArraysEquals(new String[] { "a", "b", "c" }, new String[] { "b", "a", "c" }));
        assertFalse(impl.areArraysEquals(new String[] { "a", "b", "c" }, new String[] { "ab", "", "c" }));
        assertFalse(impl.areArraysEquals(null, new String[] {}));
        assertFalse(impl.areArraysEquals(new String[] { "a", null, "b" }, new String[] { "a", "b" }));
        assertFalse(impl.areArraysEquals(null, new String[] {}));
        assertTrue(impl.areArraysEquals(null, null));

    }

    @Test
    public void testCompressor() {

        String[] inputs = { "abc", "aaabbc", null, "abccc", "aaaaaaaaaaaaaaabb", "aabbbbaaa" };
        String[] expected = { "abc", "3a2bc", null, "ab3c", "15a2b", "2a4b3a" };

        for (int i = 0; i < inputs.length; i++) {
            assertEquals(expected[i], impl.getCompressedString(inputs[i]));
        }

    }

    void dump(String[] array) {
        System.out.print("[");
        for (String d : array) {
            System.out.print(d + ",");
        }
        System.out.println("]");
    }

    /**
     * Please read carefully the doc of the getSortedArray method
     * (i.e. the test is not broken)
     */
    @Test
    public void testSorter() {

        String[][] inputs = { new String[] { "a", "ab", "abc" },
                new String[] { "abc", "ab", "a" },
                new String[] { "abc", "aab", "abbb" },
                new String[] { "abc", "acc", "ab" },
                new String[] { "aaaa", "aaab", "ab" } };

        String[][] expected = { new String[] { "a", "ab", "abc" },
                new String[] { "a", "ab", "abc" },
                new String[] { "aab", "abbb", "abc" },
                new String[] { "acc", "ab", "abc" },
                new String[] { "aaab", "aaaa", "ab" } };

        for (int i = 0; i < inputs.length; i++) {
            assertTrue(impl.areArraysEquals(expected[i], impl.getSortedArray(inputs[i])));
        }

    }

}
