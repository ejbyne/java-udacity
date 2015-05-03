//Create a Polygon class. A polygon is a closed shape with lines joining the corner points.
//You will keep the points in an array list. Use object of java.awt.Point for the point.

//Polygon will have as an instance variable an ArrayList of Points to hold the points
//The constructor takes no parameters but initializes the instance variable
//
//The add method adds a Point to the polygon
//
//The perimeter method returns the perimeter of the polygon
//
//The draw method draws the polygon by connecting consecutive points and then
//connecting the last point to the first.
//
//No methods headers or javadoc is provided this time. You get to try your hand at writing a class almost from scratch
//
// Need help starting this question? In the lesson titled 
// "Starting points: Problem Set Questions", go to the
// problem titled "Problem Set 6 - Question 3" for some tips on 
// how to begin.
//

import java.util.ArrayList;
import java.awt.Point;

/**
 * A Polygon contains a list of all of a shapes corner points.
 */
public class Polygon
{
    // TODO: provide the required constructor, instance variable, and methods
    ArrayList<Point> points;
    /**
     * Constructs an empty list of points.
     */
    public Polygon()
    {
        points = new ArrayList<Point>();
    }
    
    /**
     * Add a point to the list.
     * @param point the point to add
     */
    public void add(Point point)
    {
        points.add(point);
    }

    /**
     * Returns the perimeter of the polygon.
     * @return the perimeter of the polygon
     */
    public int perimeter()
    {
        int perimeter = 0;
        if (points.size() > 1)
        {
            for (int i = 0; i < points.size() - 1; i++)
            {
                perimeter += points.get(i).distance(points.get(i + 1).getX(), points.get(i + 1).getY());
            }
            perimeter += points.get(points.size() - 1).distance(points.get(0).getX(), points.get(0).getY());
        }
        return perimeter;
    }
    
    /**
     * Draws the polygon.
     */
    public void draw()
    {
        if (points.size() > 1)
        {
            for (int i = 0; i < points.size() - 1; i++)
            {
                Line line = new Line(points.get(i).getX(), points.get(i).getY(), points.get(i + 1).getX(), points.get(i + 1).getY());
                line.draw();
            }
            Line line = new Line(points.get(points.size() - 1).getX(), points.get(points.size() - 1).getY(), points.get(0).getX(), points.get(0).getY());
            line.draw();
        }
    }
}
