import java.util.Random;

public class DiceRoller
 {
    public static void main( String[] args )
    {
    	
    	System.out.println("Generate one random die roll from 1 to 6");

       
        Random rnd = new Random();
        
        for (int i = 1; i <= 6; ++i)
        {
          int dieNumber = 1 + rnd.nextInt(6);
          System.out.println("Your die roll was : " + dieNumber);
        }
        
        
        
    }
 }
