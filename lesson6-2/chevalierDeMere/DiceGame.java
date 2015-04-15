import java.util.Random;

public class DiceGame
{
    Random generator;
    
    public DiceGame()
    {   
        generator = new Random(45);
    }
    /** 
     * Throw a die four times and bet on at least one 6. 
     * @return true if the chevalier wins.
     */
    public boolean game1()
    {
        // YOUR CODE HERE
        // Use the instance variable generator to simulate 
        // 4 die rolls. 
        // Return true if the chevalier wins (at least one is a 6).
        int sixes = 0;
        for (int roll = 1; roll <= 4; roll++)
        {
            int number = generator.nextInt(6) + 1;
            if (number == 6)
            {
                sixes ++;
            }
        }
        return sixes > 0;
    }
    
    /**
     * Throw two dice 24 times and bet on at least one double-six.
     * @return true if the chevalier wins. 
     */
    public boolean game2()
    {   
        // YOUR CODE HERE 
        // Use the instance variable generator to simulate 
        // 24 rolls of a pair of dice.
        // Return true if at least one pair is both 6s. 
        int pairsOfSixes = 0;
        for (int roll = 1; roll <= 24; roll++)
        {
            int firstNumber = generator.nextInt(6) + 1;
            int secondNumber = generator.nextInt(6) + 1;
            if (firstNumber == 6 && secondNumber == 6)
            {
                pairsOfSixes ++;
            }
        }
        return pairsOfSixes > 0;
    }
}
