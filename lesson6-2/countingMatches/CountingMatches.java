import java.util.Scanner;
public class CountingMatches
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int counter = 0;
        System.out.print("Enter a value, Q to quit: " );
        while (in.hasNextDouble())
        {
            double value = in.nextDouble();
            if (value < 0)
            {
                counter ++;
            }
            System.out.print("Enter a value, Q to quit: " );
        }
        System.out.println("The water line fell on " + counter + " years.");
    }
}
