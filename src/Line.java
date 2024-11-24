/*
 *  This class represents a line. 
 *  A line has a slope an a y-intercept.
 */
public class Line {
    private int slope;
    private int y_intercept;
    
    public Line(int slope, int y_intercept) {
        this.slope = slope;
        this.y_intercept = y_intercept;
    }
    
    public boolean pointIsOnLine(int x, int y) {
        return y == getY(x);
    }
    
    public int getSlope() {
        return slope;
    }
    
    public int getY(int x) {
        return slope * x + y_intercept;
    }
    
    public String toString() {
        return "y = " + slope + "x + " + y_intercept;
    }
}