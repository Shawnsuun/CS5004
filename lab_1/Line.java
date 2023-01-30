/******
 Name: Xiaowen Sun
 Assignment: Lab_1
 Date: 2023-01-29
 Notes: The Line class of the lab1
 ******/

import java.lang.Math;

/**
 * The Line class represents a line made up of two points (p1 and p2)
 */
public class Line {
    private Point p1;
    private Point p2;

    /**
     * Default constructor that creates a line at the origin
     */
    public Line() {
        p1 = new Point();
        p2 = new Point();
    }

    /**
     * Constructor that accepts two points
     * @param p1 The first point of the line
     * @param p2 The second point of the line
     */
    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    /**
     * Constructor that accepts four int values to create two points
     * @param x1 The x coordinate of the first point
     * @param y1 The y coordinate of the first point
     * @param x2 The x coordinate of the second point
     * @param y2 The y coordinate of the second point
     */
    public Line(int x1, int y1, int x2, int y2) {
        p1 = new Point(x1, y1);
        p2 = new Point(x2, y2);
    }

    /**
     * Method to print the two points of the line
     */
    public void printLine() {
        System.out.println(this);
    }

    /**
     * Method to calculate the length of the line
     * @return The length of the line
     */
    public double getLength() {
        int xDiff = p2.getX() - p1.getX();
        int yDiff = p2.getY() - p1.getY();
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    /**
     * Returns the first point of the line
     * @return Point p1
     */
    public Point getP1() {
        return p1;
    }

    /**
     * Returns the second point of the line
     * @return Point p2
     */
    public Point getP2() {
        return p2;
    }

    /**
     * Returns the slope of the line
     * @return slope of the line
     */
    public double getSlope() {
        double deltaY = p2.getY() - p1.getY();
        double deltaX = p2.getX() - p1.getX();
        return deltaY / deltaX;
    }

    /**
     * Check if two lines cross each other.
     *
     * @param l line to check for crossing
     * @return true if the two lines cross, false otherwise
     */
    public boolean checkCross(Line l) {
        return !(this.getSlope() == l.getSlope());
    }

    /**
     * Returns a string representation of the lINE object.
     * The string contains the x and y values of the point separated by a colon.
     *
     * @return a string representation of the Line object
     */
    @Override
    public String toString() {
        return "Start : " + p1.toString()
                + " End : " + p2.toString();
    }
}
