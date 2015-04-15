// Write a program that finds the first word in Alice In Wonderland
// that is longer than 9 characters, and if there are no words
// that are long, prints "There are no long words".

import java.util.Scanner;
import java.io.FileReader;

public class FirstMatch
{
    public static void main(String[] args) throws java.io.FileNotFoundException
    {
        Scanner in = new Scanner(new FileReader("aliceInWonderland.txt"));
        String longWord = "";
        boolean found = false;
        int position = -1;
        final int THRESHOLD = 9;
        while (in.hasNext() && !found)
        {
            String word = in.next();
            if (word.length() > THRESHOLD)
            {
                longWord = word;
                found = true;
            }
            position ++;
        }
        if (found)
        {
            System.out.println("The first long word is " + longWord + " at position " + counter);
        }
        else
        {
            System.out.println("There are no long words");
        }
    }
}
