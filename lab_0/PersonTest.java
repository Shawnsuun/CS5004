/******
 Name: Xiaowen Sun
 Assignment: Lab_0
 Date: 2023-01-11
 Notes: The PersonTest class of the lab0
 ******/

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * A JUnit test class for the Person class.
 */
public class PersonTest {

  private Person john;
  /**
   * Create a Person instance before Tests.
   */
  @Before
  public void setUp() {

    john = new Person("John", "Doe", 1945);
  }

  @Test
  /** Test getFirstName() method and firstName attribute of Person class.
   * getFirstName() method returns the firstName attribute, and it should be a String,
   * firstName for the Person instance john should be "John".
   */
  public void testFirst() {
    assertEquals("John", john.getFirstName());
  }

  @Test
  /** Test getLastName() method and lastName attribute of Person class.
   * getLastName() method returns the lastName attribute, and it should be a String,
   * lastName for the Person instance john should be "Doe".
   */
  public void testSecond() {
    assertEquals("Doe", john.getLastName());
  }

  @Test
  /** Test getYearOfBirth() method and yearOfBirth attribute of Person class.
   * getYearOfBirth() method returns the yearOfBirth attribute, and it should be an int,
   * yearOfBirth for the Person instance john should be 1945.
   */
  public void testYearOfBirth() {
    assertEquals(1945, john.getYearOfBirth());
  }

}
