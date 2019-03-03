
/**	
	@author Kartavya Goswami
	This class contains the ligic for the game.	
 */

import java.util.Scanner;

public class Game {

	private int potAmount;
	private int betAmount;
	private String betType;
	private Scanner input;
	

	public Game() 	// default constructor
	{
		potAmount = 100;
		betAmount = 1;
		input = new Scanner(System.in);
		System.out.println("Welcome to Double or Nothing Dice Game..bet an amount and type");
		System.out.println("\t -if you are correct, you win twice your bet,");
		System.out.println("\t -otherwise you lose your bet");
		System.out.println("\t -Bet Type : Odd, Even, High, Low");
		System.out.println("A bet of 0 ends the game");
	}

	public void getBetFromUser() // ask user to enter bet type and bet amount
	{

		for (int j = 0; j >= 0; j++) {
			if (potAmount != 0) {
				System.out.println("\nYour current pot is " + potAmount);
				System.out.print("Enter your bet amount :");
				betAmount = input.nextInt();

				for (int x = 1; x >= 1; x++) {
					if (betAmount > potAmount || betAmount < 0) {
						System.out.print("Error - cannot bet less than 0 or more than " + potAmount
								+ "...Enter your bet amount:");
						betAmount = input.nextInt();
						if (betAmount != 0 && betAmount > 0 && betAmount <= potAmount) {

							System.out.print("Enter your bet type:");
							betType = input.next();
							potAmount = potAmount - betAmount;
							playGame();
							break;
						} else if (betAmount == 0) {
						
							System.out.println("You end the game with pot of " + potAmount);
							break;
						}
					} else if (betAmount > 0 && betAmount <= potAmount) {

						System.out.print("Enter your bet type:");
						betType = input.next();
						potAmount = potAmount - betAmount;
						playGame();
						break;
					}

					else if (betAmount == 0) {
						System.out.println("You end the game with pot of " + potAmount);
						break;
					}

				}
				if (betAmount == 0) {
					break;
				}
			}

			else if (potAmount == 0) {
				System.out.println("\nYour current pot is " + potAmount);
				System.out.println("You end the game with pot of " + potAmount);
				break;
			}

		} 
	}

	public void playGame() // method for the logic of the game
	{
		
		Die arrayDie[] = new Die[3];
		int q = 0;
		int total = 0;
		while (q <= 2) {
			arrayDie[q] = new Die();
			arrayDie[q].rollDie();
			total += arrayDie[q].getValue();
			q++;
		}

		
		for (int k = 0; k >= 0; k++) {
			if (betAmount != 0) {
				if (betType.equalsIgnoreCase("Odd") == true && total % 2 != 0) {
					
					System.out.print("Your dies are: ");
					arrayDie[0].displayDie();
					System.out.print(" and ");
					arrayDie[1].displayDie();
					System.out.print(" and ");
					arrayDie[2].displayDie();
					System.out.println();
					System.out.println("You WIN....double your bet ");
					potAmount = potAmount + 2 * (betAmount);

					break;
				} else if (betType.equalsIgnoreCase("Odd") == true && total % 2 == 0) {
					
					
					System.out.print("Your dies are: ");
					arrayDie[0].displayDie();
					System.out.print(" and ");
					arrayDie[1].displayDie();
					System.out.print(" and ");
					arrayDie[2].displayDie();
					System.out.println();
					
					System.out.println("You LOSE....your bet");
					break;
				} else if (betType.equalsIgnoreCase("Even") == true && total % 2 == 0) {
					
					
					System.out.print("Your dies are: ");
					arrayDie[0].displayDie();
					System.out.print(" and ");
					arrayDie[1].displayDie();
					System.out.print(" and ");
					arrayDie[2].displayDie();
					System.out.println();
					
					System.out.println("You WIN....double your bet ");
					potAmount = potAmount + 2 * (betAmount);
					break;
				} else if (betType.equalsIgnoreCase("Even") == true && total % 2 != 0) {
					
					
					System.out.print("Your dies are: ");
					arrayDie[0].displayDie();
					System.out.print(" and ");
					arrayDie[1].displayDie();
					System.out.print(" and ");
					arrayDie[2].displayDie();
					System.out.println();
					
					System.out.println("You LOSE....your bet");
					break;
				} else if (betType.equalsIgnoreCase("High") == true && total >= 9) {
				
					
					System.out.print("Your dies are: ");
					arrayDie[0].displayDie();
					System.out.print(" and ");
					arrayDie[1].displayDie();
					System.out.print(" and ");
					arrayDie[2].displayDie();
					System.out.println();
					
					System.out.println("You WIN....double your bet ");
					potAmount = potAmount + 2 * (betAmount);
					break;
				} else if (betType.equalsIgnoreCase("High") == true && total < 9) {
					
					
					System.out.print("Your dies are: ");
					arrayDie[0].displayDie();
					System.out.print(" and ");
					arrayDie[1].displayDie();
					System.out.print(" and ");
					arrayDie[2].displayDie();
					System.out.println();
					
					System.out.println("You LOSE....your bet");
					break;
				} else if (betType.equalsIgnoreCase("Low") == true && total < 9) {
									
					System.out.print("Your dies are: ");
					arrayDie[0].displayDie();
					System.out.print(" and ");
					arrayDie[1].displayDie();
					System.out.print(" and ");
					arrayDie[2].displayDie();
					System.out.println();
					
					System.out.println("You WIN....double your bet ");
					potAmount = potAmount + 2 * (betAmount);
					break;
				} else if (betType.equalsIgnoreCase("Low") == true && total >= 9) {
					
					
					System.out.print("Your dies are: ");
					arrayDie[0].displayDie();//
					System.out.print(" and ");
					arrayDie[1].displayDie();
					System.out.print(" and ");
					arrayDie[2].displayDie();
					System.out.println();
					
					System.out.println("You LOSE....your bet");
					break;
				} else {
					for (int i = 1; i >= 1; i++) {
						if (betType.equalsIgnoreCase("Low") == false && betType.equalsIgnoreCase("high") == false
								&& betType.equalsIgnoreCase("Odd") == false
								&& betType.equalsIgnoreCase("Even") == false) {
							System.out.print("Please enter odd, even, high, or low ....Enter your bet type: ");
							betType = input.next();
						} else if (betType.equalsIgnoreCase("Low") == true || betType.equalsIgnoreCase("high") == true
								|| betType.equalsIgnoreCase("Odd") == true
								|| betType.equalsIgnoreCase("Even") == true) {
							break;
						}
					}

				}

			}

			else if (potAmount == 0 && betAmount != 0) {
				
				
				System.out.print("Your dies are: ");
				arrayDie[0].displayDie();//
				System.out.print(" and ");
				arrayDie[1].displayDie();
				System.out.print(" and ");
				arrayDie[2].displayDie();
				System.out.println();
				
				System.out.println("You end the game with pot of " + potAmount);
				break;
			}
		}

	}

}
