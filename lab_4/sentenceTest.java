/******
 Name: Xiaowen Sun
 Assignment: Lab_4
 Date: 2023-02-26
 Notes: The sentenceTest class of the lab4
 ******/

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.AssertJUnit.assertEquals;

/**
 * A class to test the functionality of Sentence.
 */
public class sentenceTest {
    /**
     * Tests the getNumberOfWords method with an empty Sentence object.
     */
    @Test
    public void testGetNumberOfWords1() {
        Sentence s = new Sentence();
        assertEquals(0, s.getNumberOfWords());
        assertEquals("", s.toString());
    }

    /**
     * Tests the getNumberOfWords method with a multi-word Sentence object.
     */
    @Test
    public void testGetNumberOfWords2() {
        sentenceNode sNode = new wordNode("Helloooo");
        sNode.append(",");
        sNode.append("world");
        sNode.append("!");
        Sentence s = new Sentence(sNode);
        assertEquals(2, s.getNumberOfWords());
        assertEquals("Helloooo, world!", s.toString());
    }

    /**
     * Tests the clone method of Sentence.
     */
    @Test
    public void testClone() {
        sentenceNode sNode = new wordNode("Helloooo");
        sNode.append(",");
        sNode.append("world");
        sNode.append("!");
        Sentence s = new Sentence(sNode);
        Sentence sClone = s.clone();
        assertEquals(2, sClone.getNumberOfWords());
        assertEquals("Helloooo, world!", sClone.toString());
    }

    /**
     * Tests the merge method of Sentence.
     */
    @Test
    public void testMerge() {
        sentenceNode sNode = new wordNode("Helloooo");
        sNode.append(",");
        sNode.append("world");
        sNode.append("!");
        Sentence s = new Sentence(sNode);
        Sentence sClone = s.clone();
        Sentence sMerge = s.merge(sClone);
        assertEquals("Helloooo, world! Helloooo, world!", sMerge.toString());
    }

    /**
     * Tests the longestWord method of Sentence.
     */
    @Test
    public void testLongestWord() {
        sentenceNode sNode = new wordNode("Helloooo");
        sNode.append(",");
        sNode.append("world");
        sNode.append("!");
        Sentence s = new Sentence(sNode);
        Sentence sClone = s.clone();
        Sentence sMerge = s.merge(sClone);
        assertEquals("Helloooo", sMerge.longestWord());
        sMerge.append("woooooooooo");
        assertEquals("woooooooooo", sMerge.longestWord());
    }

    /**
     * Tests the toList method of Sentence.
     */
    @Test
    public void testToList() {
        sentenceNode sNode = new wordNode("Helloooo");
        sNode.append(",");
        sNode.append("world");
        sNode.append("!");
        Sentence s = new Sentence(sNode);

        List<String> list = new ArrayList<>();
        list.add("Helloooo");
        list.add(",");
        list.add("world");
        list.add("!");
        assertEquals(list, s.toList());
    }

    /**
     * Tests the reverse method of Sentence.
     */
    @Test
    public void testReverse() {
        sentenceNode sNode = new wordNode("Helloooo");
        sNode.append(",");
        sNode.append("world");
        sNode.append("!");
        Sentence s = new Sentence(sNode);
        Sentence sReverse = s.reverse();
        assertEquals("! world, Helloooo", sReverse.toString());
    }
}
