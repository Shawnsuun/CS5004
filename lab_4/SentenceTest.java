import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;

public class SentenceTest {
    @Test
    public void testGetNumberOfWords() {
        Sentence s = new wordNode("Hello");
        assertEquals(1, s.getNumberOfWords());
        assertEquals("Hello", s.toString());
        s.append("Hello");
        assertEquals(2, s.getNumberOfWords());
        assertEquals("HelloHello", s.toString());
    }
}
