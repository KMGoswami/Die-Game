
/**	
	@author Kartavya Goswami
	
	Purpose :- A dice batting game , in which user will enter a bet amount and type. If user will win , bet will be doubled otherwise 
				user will lose money. If user type any wrong bet type , user will be asked to enter it again.
 */

public class Main {

	public static void main(String[] args) {

		Game game = new Game();			// Object of Game class

		game.getBetFromUser();

	}

}
