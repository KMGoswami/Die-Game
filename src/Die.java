
/**	
	@author Kartavya Goswami
	This class works as a virtual die for our game.
	
 */
import java.util.Random;

public class Die {

	private int dieValue;		// It will store the value of one die
	private Random randomNumbers;   //Generete random number
	
	public Die()				//Default Constructor 
	{
		randomNumbers = new Random();
	}

	public void rollDie() 		// Create a random value for die
	{
		dieValue = randomNumbers.nextInt(6) + 1;		
	}

	public void displayDie() 	// Display the value of die
	{
		System.out.print(dieValue);
	}

	public int getValue() 		//Returns value of die
	{
		return dieValue;
	}
}
