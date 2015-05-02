//
// Complete the given class to shift the first picture (the one at index 0)
// to the end of the array list and  display the pictures object in the modified list
// horizontally as was done in the lesson.  Put 10 pixels between pictures.
// You can find the pictures required in in the bluej project
//

import java.util.ArrayList;

public class ShiftFirstToEnd
{
   public static void main(String[] args)
   {
      ArrayList<Picture> gallery = new ArrayList<Picture>();
      gallery.add(new Picture("degas1.jpg"));
      gallery.add(new Picture("gaugin1.jpg"));
      gallery.add(new Picture("monet1.jpg"));
      gallery.add(new Picture("monet2.jpg"));
      gallery.add(new Picture("renoir1.jpg"));

      Picture firstPicture = gallery.get(0);
      gallery.remove(0);
      gallery.add(gallery.size(), firstPicture);
      int x = 0;
      for (Picture pic : gallery)
      {
          pic.translate(x + 10, 0);
          pic.draw();
          x = pic.getMaxX();
      }
   }
}
