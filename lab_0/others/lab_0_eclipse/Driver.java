/******
 Name: Xiaowen Sun
 Assignment: Lab_0
 Date: 2023-01-11
 Notes: The Driver class of the lab0
 ******/

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * This class is a Junit test driver to run all the tests of the project lab_0.
 */
public class Driver {
    /**
     * The main method of the Driver class. It runs the test cases of the project lab_0
     * including BookTest and PersonTest classes and prints the result
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        // Run the test cases in the BookTest class
        Result bookRes = JUnitCore.runClasses(BookTest.class);
        // Run the test cases in the PersonTest class
        Result personRes = JUnitCore.runClasses(PersonTest.class);
        // Print the failures for the BookTest class
        for (Failure f : bookRes.getFailures()) {
            System.out.println(f.toString());
        }
        // Print the final test result for the BookTest class
        System.out.println(bookRes.wasSuccessful() ? "Pass" : "Fail");
        // Print the failures for the PersonTest class
        for (Failure f : personRes.getFailures()) {
            System.out.println(f.toString());
        }
        // Print the final test result for the PersonTest class
        System.out.println(personRes.wasSuccessful() ? "Pass" : "Fail");
    }
}