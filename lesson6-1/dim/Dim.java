public class Dim
{
    public static void main(String[] args)
    {
        Picture mary = new Picture("queen-mary.png");
        mary.draw();
        for (int i = 0; i < mary.pixels(); i += 5)
        {
            mary.setColorAt(i, Color.BLACK);
        }
    }
}
