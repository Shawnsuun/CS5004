/******
 Name: Xiaowen Sun
 Assignment: Lab_1
 Date: 2023-01-29
 Notes: The Point class of the lab1
 ******/

/**
 * Represents a Point in a two-dimensional coordinate system.
 *
 * The x and y values of the point are stored as instance variables.
 * The point can be placed in one of four quadrants or on an axis.
 */
public class Point {
    private int x;
    private int y;

    /**
     * Constructs a new Point object with x and y values set to 0.
     */
    public Point() {
        this.x = 0;
        this.y = 0;
    }

    /**
     * Constructs a new Point object with specified x and y values.
     *
     * @param x x value of the point
     * @param y y value of the point
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Returns the x value of the point.
     *
     * @return x value of the point
     */
    public int getX() {
        return x;
    }

    /**
     * Returns the y value of the point.
     *
     * @return y value of the point
     */
    public int getY() {
        return y;
    }

    /**
     * Sets the x value of the point.
     * The x value is clamped to the range [-99, 99].
     *
     * @param x the new x value of the point
     */
    public void setX(int x) {
        this.x = x > 99 ? 99 : x < -99 ? -99 : x;
    }

    /**
     * Sets the y value of the point.
     * The y value is clamped to the range [-99, 99].
     *
     * @param y the new y value of the point
     */
    public void setY(int y) {
        this.y = y > 99 ? 99 : y < -99 ? -99 : y;
    }

    /**
     * Returns the quadrant the Point object is located in.
     *
     * @return the quadrant the Point object is located in
     */
    public String getQuadrant() {
        if (x == 0 && y != 0 || x != 0 && y ==0) {
            return "Boarder";
        }
        if (x == 0 && y == 0) {
            return "Origin";
        }
        if (x > 0 && y > 0) {
            return "Quadrant A";
        }
        if (x < 0 && y > 0) {
            return "Quadrant B";
        }
        if (x < 0 && y < 0) {
            return "Quadrant C";
        }
        return "Quadrant D";
    }

    /**
     * Method to print the values of the Point object
     */
    public void printPoint() {
        System.out.println(this);
    }

    /**
     * Swaps the x and y coordinates of the Point object.
     */
    public void swapXY() {
        int temp = x;
        x = y;
        y = temp;
    }

    /**
     * Returns a string representation of the Point object.
     * The string contains the x and y values of the point separated by a colon.
     *
     * @return a string representation of the Point object
     */
    @Override
    public String toString() {
        return "x:" + String.valueOf(x) + " y:" + String.valueOf(y);
    }

    /**
     * Indicates whether some other object is "equal to" this Point.
     *
     * @param obj the reference object with which to compare.
     * @return true if this object is the same as the obj argument; false otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Point)) {
            return false;
        }
        Point p = (Point) obj;
        return p.x == x && p.y == y;
    }

    /**
     * Returns a hash code value for this Point object.
     *
     * @return a hash code value for this Point object.
     */
    @Override
    public int hashCode() {
        int hash = 17;
        hash = 31 * hash + x;
        hash = 31 * hash + y;
        return hash;
    }
}