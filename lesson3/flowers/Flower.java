public class Flower
{
  private int x;
  private int y;

  public Flower(int theX, int theY)
  {
    x = theX;
    y = theY;
  }

  /**
   * This function draws the flower.
   */
  public void draw()
  {
    Ellipse pinkTop = new Ellipse(x + 20, y, 20, 20);
    pinkTop.setColor(Color.PINK);
    pinkTop.fill();
    Ellipse pinkLeft = new Ellipse(x, y + 20, 20, 20);
    pinkLeft.setColor(Color.PINK);
    pinkLeft.fill();
    Ellipse yellowCentre = new Ellipse(x + 20, y + 20, 20, 20);
    yellowCentre.setColor(Color.YELLOW);
    yellowCentre.fill();
    Ellipse pinkRight = new Ellipse(x + 40, y + 20, 20, 20);
    pinkRight.setColor(Color.PINK);
    pinkRight.fill();
    Ellipse pinkBottom = new Ellipse(x + 20, y + 40, 20, 20);
    pinkBottom.setColor(Color.PINK);
    pinkBottom.fill();
    Line stem = new Line(x + 30, y + 60, x + 30, y + 120);
    stem.setColor(Color.GREEN);
    stem.draw();
  }
}
