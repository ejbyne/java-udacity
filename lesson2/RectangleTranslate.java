public class RectangleTranslate
{
  public static void main(String[] args)
  {
    Rectangle box = new Rectangle(5, 10, 60, 90);
    System.out.println(box.getX());
    System.out.println(box.getWidth());
    box.translate(25, 40);
    System.out.println(box.getX());
    System.out.println(box.getWidth());
  }
}
