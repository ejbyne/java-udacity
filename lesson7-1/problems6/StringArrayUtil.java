
//
// Complete the method in this class to compute and return the shortest string
// (the one with the fewest characters)
// HINT: You can use the ArrayList algorithm for finding the minimum
//

import java.util.ArrayList;
public class StringArrayUtil
{
   public String shortestString(ArrayList<String> words)
   {
      String shortest = words.get(0); //initialize
      for (int i = 1; i < words.size(); i++)
      {
          if (words.get(i).length() < shortest.length())
          {
              shortest = words.get(i);
          }
      }
      return shortest;
   }
}
