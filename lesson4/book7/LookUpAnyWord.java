import java.util.Scanner;

public class LookUpAnyWord
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Type a word and I'll tell you how many times it appears: ");
        String word = in.nextLine();
        Book alice = new Book("aliceInWonderland.txt");
        int occurrences = alice.occurrencesOf(word);
        System.out.println(word + " occurs " + occurrences + " times!");
    }
}
