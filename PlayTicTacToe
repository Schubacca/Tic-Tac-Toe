import java.util.Scanner;

public class PlayTicTacToe {
	
	public static void main(String[] args){
		
		Board testBoard = new Board();
		String playerX = getPlayerName('X');
		String playerO = getPlayerName('O');
		testBoard.displayBoard();
		while(true){
			testBoard.getXMove(playerX);
			testBoard.displayBoard();
			if(testBoard.didXWin() == true){
				System.out.println(playerX + " has won the game. Thank you for playing.");
				System.exit(0);
			}
			testBoard.getOMove(playerO);
			testBoard.displayBoard();
			if(testBoard.didOWin() == true){
				System.out.println(playerO + " has won the game. Thank you for playing.");
				System.exit(0);
			}
		}
	}
	
	public static String getPlayerName(char player){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the name of player '" + player + "': ");
		return input.nextLine();
	}
}
