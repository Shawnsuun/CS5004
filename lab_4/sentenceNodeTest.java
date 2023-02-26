/******
 Name: Xiaowen Sun
 Assignment: Lab_4
 Date: 2023-02-26
 Notes: The sentenceNodeTest class of the lab4
 ******/

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.AssertJUnit.assertEquals;

/**
 * A class to test the functionality of sentenceNode and its subclasses.
 */
public class sentenceNodeTest {
    /**
     * Tests the getNumberOfWords method with a single word sentenceNode.
     */
    @Test
    public void testGetNumberOfWords1() {
        sentenceNode s = new wordNode("Helloooo");
        assertEquals(1, s.getNumberOfWords());
        assertEquals("Helloooo", s.toString());
    }

    /**
     * Tests the getNumberOfWords method with a multi-word sentenceNode.
     */
    @Test
    public void testGetNumberOfWords2() {
        sentenceNode s = new wordNode("Helloooo");
        s.append(",");
        s.append("world");
        s.append("!");
        assertEquals(2, s.getNumberOfWords());
        assertEquals("Helloooo, world!", s.toString());
    }

    /**
     * Tests the clone method of sentenceNode.
     */
    @Test
    public void testClone() {
        sentenceNode s = new wordNode("Helloooo");
        s.append(",");
        s.append("world");
        s.append("!");
        sentenceNode sClone = s.clone();
        assertEquals(2, sClone.getNumberOfWords());
        assertEquals("Helloooo, world!", sClone.toString());
    }

    /**
     * Tests the merge method of sentenceNode.
     */
    @Test
    public void testMerge() {
        sentenceNode s = new wordNode("Helloooo");
        s.append(",");
        s.append("world");
        s.append("!");
        sentenceNode sClone = s.clone();
        sentenceNode sMerge = s.merge(sClone);
        assertEquals("Helloooo, world! Helloooo, world!", sMerge.toString());
    }

    /**
     * Tests the longestWord method of sentenceNode.
     */
    @Test
    public void testLongestWord() {
        sentenceNode s = new wordNode("Helloooo");
        s.append(",");
        s.append("world");
        s.append("!");
        sentenceNode sClone = s.clone();
        sentenceNode sMerge = s.merge(sClone);
        assertEquals("Helloooo", sMerge.longestWord());
        sMerge.append("woooooooooo");
        assertEquals("woooooooooo", sMerge.longestWord());
    }

    /**
     * Tests the toList method of sentenceNode.
     */
    @Test
    public void testToList() {
        sentenceNode s = new wordNode("Helloooo");
        s.append(",");
        s.append("world");
        s.append("!");
        List<String> list = new ArrayList<>();
        list.add("Helloooo");
        list.add(",");
        list.add("world");
        list.add("!");
        assertEquals(list, s.toList());
    }

    /**
     * Tests the reverse method of sentenceNode.
     */
    @Test
    public void testReverse() {
        sentenceNode s = new wordNode("Hello");
        s.append(",");
        s.append("world");
        s.append("!");
        ListNode reversed = s.reverse();
        assertEquals("! world, Hello", reversed.toString());
    }
}