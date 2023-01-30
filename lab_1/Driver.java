/******
 Name: Xiaowen Sun
 Assignment: Lab_1
 Date: 2023-01-29
 Notes: The Driver class of the lab1 for testing printPoint() method
 of Point class and printLine() method in Line class.
 ******/

/**
 * This class is a test driver to run print tests of the Point and Line class in project lab_1.
 */
public class Driver {
    /**
     * The main method of the Driver class.
     * It runs the test of the print methods in project lab_1
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        // Generate points in each quadrant and the origin
        Point p1 = new Point(4, 3);
        Point p2 = new Point(-8, -6);
        Point p3 = new Point(-3, 4);
        Point p4 = new Point(3, -4);
        Point p5 = new Point(6, 0);
        Point p6 = new Point(0, -6);
        Point origin = new Point(0, 0);

        // Test each point's quadrant with expected quadrant by if-else statements
        if (p1.getQuadrant().equals("Quadrant A")) {
            System.out.println("Quadrant A test passed");
        } else {
            System.out.println("Quadrant A test failed");
        }

        if (p2.getQuadrant().equals("Quadrant C")) {
            System.out.println("Quadrant C test passed");
        } else {
            System.out.println("Quadrant C test failed");
        }

        if (p3.getQuadrant().equals("Quadrant B")) {
            System.out.println("Quadrant B test passed");
        } else {
            System.out.println("Quadrant B test failed");
        }

        if (p4.getQuadrant().equals("Quadrant D")) {
            System.out.println("Quadrant D test passed");
        } else {
            System.out.println("Quadrant D test failed");
        }

        if (p5.getQuadrant().equals("Boarder")) {
            System.out.println("Boarder test1 passed");
        } else {
            System.out.println("Boarder test1  failed");
        }

        if (p6.getQuadrant().equals("Boarder")) {
            System.out.println("Boarder test2 passed");
        } else {
            System.out.println("Boarder test2 test failed");
        }

        if (origin.getQuadrant().equals("Origin")) {
            System.out.println("Origin test passed");
        } else {
            System.out.println("Origin test failed");
        }

        /**
         * Print each point, test toString method in Point class
         * The expected result is:
         * x:4 y:3
         * x:-8 y:-6
         * x:-3 y:4
         * x:3 y:-4
         * x:6 y:0
         * x:0 y:-6
         * x:0 y:0
         */
        p1.printPoint();
        p2.printPoint();
        p3.printPoint();
        p4.printPoint();
        p5.printPoint();
        p6.printPoint();
        origin.printPoint();

        if (p1.getQuadrant().equals("Quadrant A")) {
            System.out.println("Quadrant A test passed");
        } else {
            System.out.println("Quadrant A test failed");
        }

        // Create three lines and print each
        Line line1 = new Line(p1, p2);
        Line line2 = new Line(p3, p4);
        Line line3 = new Line(p1, origin);

        /**
         * Print each line, test toString method in Line class
         * The expected result is:
         * Start : x:4 y:3 End : x:-8 y:-6
         * Start : x:-3 y:4 End : x:3 y:-4
         * Start : x:4 y:3 End : x:0 y:0
         */
        line1.printLine();
        line2.printLine();
        line3.printLine();

        // Check the length of each line by if-else statements
        System.out.println("Line 1 length: " + line1.getLength());
        if (line1.getLength() == 15.0) {
            System.out.println("Line 1 length test pass.");
        } else {
            System.out.println("Line 1 length test fail.");
        }
        System.out.println("Line 2 length: " + line2.getLength());

        if (line2.getLength() == 10.0) {
            System.out.println("Line 2 length test pass.");
        } else {
            System.out.println("Line 2 length test fail.");
        }
        System.out.println("Line 3 length: " + line3.getLength());

        if (line3.getLength() == 5.0) {
            System.out.println("Line 3 length test pass.");
        } else {
            System.out.println("Line 3 length test fail.");
        }
    }
}
