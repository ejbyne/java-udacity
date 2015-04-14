// Bluej project: lesson6/average

import java.util.Scanner;
// Write a program that helps a user compute their average time
// for sprinting 100 meters.
public class AverageDemo
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int count = 0;
        double sum = 0;
        double value;
        do
        {
            System.out.print("Enter a value, 0 to quit: ");
            value = in.nextDouble();
            if (value != 0)
            {            
                sum += value;
                count ++;
            }
        }
        while (value != 0);
        double average = sum / count;
        System.out.printf("Average: %.2f\n", average);
    }
}
