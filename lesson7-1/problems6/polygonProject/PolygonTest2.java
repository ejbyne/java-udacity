import java.awt.Point;

public class PolygonTest2
{
 
    public static void main(String[] args)
    {
       
       Polygon shape = new Polygon();
       shape.add(new Point(0, 0));
       shape.add(new Point(20, 0));
       shape.add(new Point(20, 20));
       shape.add(new Point(0, 20));
       System.out.println(shape.perimeter());
       shape.draw();
    }
}
