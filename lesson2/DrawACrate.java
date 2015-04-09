public class DrawACrate
{
  public static void main(String[] args)
  {
    Rectangle face = new Rectangle(20, 30, 100, 40);
    face.draw();
    Line line1 = new Line(20, 30, 50, 10);
    line1.draw();
    Line line2 = new Line(120, 70, 150, 50);
    line2.draw();
    Line line3 = new Line(120, 30, 150, 10);
    line3.draw();
    Line line4 = new Line(50, 10, 150, 10);
    line4.draw();
    Line line5 = new Line(150, 10, 150, 50);
    line5.draw();
    Text message = new Text(20, 30, "TOP SECRET");
    message.draw();
  }
}
