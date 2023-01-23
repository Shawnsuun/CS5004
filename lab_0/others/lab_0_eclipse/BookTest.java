/******
 Name: Xiaowen Sun
 Assignment: Lab_0
 Date: 2023-01-11
 Notes: The BookTest class of the lab0
 ******/

import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;


/**
 * A JUnit test class for the Book class.
 */
public class BookTest {
    private Book javaNote;
    private Person xiaowen;

    @Before
    /**
     * Create a Person and a Book instance before Tests.
     */
    public void setUp() {
        //xiaowen is a Person instance.
        xiaowen = new Person("Xiaowen", "Sun", 1992);
        //javaNote is a Book instance.
        javaNote = new Book("Java Note", xiaowen, 52.0f);
    }

    @Test
    /** Test getTitle() method and title attribute of Book class.
     * getTitle() method returns the title attribute, and it should be a String,
     * title for the Book instance javaNote should be "Java Note".
     */
    public void testTitle() {
        assertEquals("Java Note", javaNote.getTitle());
    }

    @Test
    /** Test getPrice() method and price attribute of Book class.
     * getPrice() method returns the price attribute, and it should be a float,
     * price for the Book instance javaNote should be 52.0f.
     */
    public void testPrice() {
        //there should be three arguments for the assertEquals method for float.
        assertEquals(52.0f, javaNote.getPrice(), 0.0001);
    }

    @Test
    /** Test getAuthor() method and author attribute of Book class.
     * getAuthor() method returns the author attribute, and it should be a Person object,
     * the author attribute for the Book instance javaNote should be an instance of class Person,
     * which is xiaowen.
     */
    public void testPerson() {
        assertEquals(xiaowen, javaNote.getAuthor());
    }
}
