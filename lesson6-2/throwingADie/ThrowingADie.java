// A program that simulates tossing a die 100 times. 
// It prints the number of times you roll a 6. 
import java.util.Random;

public class ThrowingADie
{
    public static void main(String[] args)
    {
        // YOUR CODE HERE
        // Write a loop that simulates 100 die rolls. 
        // generate 100 random ints using generator. 
        // the ints should have values 1,2,3,4,5, or 6
        // Print the number of 6s rolled. 
        Random generator = new Random(42);
        int sixes = 0;
        for (int roll = 1; roll <= 100; roll++)
        {
            int number = generator.nextInt(6) + 1;
            if (number == 6)
            {
                sixes ++;
            }
        }
        System.out.println(sixes);
    }
}
