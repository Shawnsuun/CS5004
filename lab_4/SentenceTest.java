import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;

public class SentenceTest {
    @Test
    public void testGetNumberOfWords() {
        Sentence s = new wordNode("Helloooo");
        assertEquals(1, s.getNumberOfWords());
        assertEquals("Helloooo", s.toString());
        s.append(",");
        assertEquals(1, s.getNumberOfWords());
        assertEquals("Helloooo,", s.toString());
        s.append("world");
        s.append("!");
        assertEquals(2, s.getNumberOfWords());
        assertEquals("Helloooo,world!", s.toString());
        Sentence sClone = s.clone();
        assertEquals(2, sClone.getNumberOfWords());
        assertEquals("Helloooo,world!", sClone.toString());
        Sentence sMerge = s.merge(sClone);
        assertEquals("Helloooo,world!Helloooo,world!", sMerge.toString());
        assertEquals("Helloooo", sMerge.longestWord());
        sMerge.append("woooooooooo");
        assertEquals("woooooooooo", sMerge.longestWord());
    }


}
