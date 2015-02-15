import java.util.Scanner;


public class Board {

	char[][] board = new char[3][3];
	
	
	public void displayBoard() {
		System.out.println("\n-------------");
		for (int i = 0; i < 3; i++) {
			System.out.print("| ");
		for (int j = 0; j < 3; j++){
			if(board[i][j] != 0)
				System.out.print(board[i][j] + " | ");
			else
				System.out.print("  | ");
		 	}
		 		System.out.println("\n-------------");
		 	}
	}
	
	public void getXMove(String playerName){
		Scanner input = new Scanner(System.in);
		System.out.println(playerName + ", enter a row index for your move: ");
		int row = input.nextInt();
		System.out.println(playerName + ", enter a column index for your move: ");
		int col = input.nextInt();
		while(board[row][col] == 'X' || board[row][col] == 'O'){
			System.out.println("That move cannot be made, please try again.");
			System.out.println("Enter a row index for a different move: ");
			row = input.nextInt();
			System.out.println("Enter a column index for a different move: ");
			col = input.nextInt();
		}
		makeMove('X', row, col);
	}
	
	public void getOMove(String playerName){
		Scanner input = new Scanner(System.in);
		System.out.println(playerName + ", enter a row index for your move: ");
		int row = input.nextInt();
		System.out.println(playerName + ", enter a column index for your move: ");
		int col = input.nextInt();
		while(board[row][col] == 'X' || board[row][col] == 'O'){
			System.out.println("That move cannot be made, please try again.");
			System.out.println("Enter a row index for a different move: ");
			row = input.nextInt();
			System.out.println("Enter a column index for a different move: ");
			col = input.nextInt();
		}
		makeMove('O', row, col);		
	}
	
	public void makeMove(char player, int row, int col){
		board[row][col] = player;
	}
	
	public boolean didXWin(){
		if(checkRows('X') == true || checkCols('X') == true 
				|| checkDiagonals('X') == true){
			return true;
		}
		return false;
	}
	
	public boolean didOWin(){
		if(checkRows('O') == true || checkCols('O') == true 
				|| checkDiagonals('O') == true){
			return true;
		}
		return false;
	}

	public boolean checkRows(char player){
		for(int row = 0; row < board.length; row++){
			int count = 0;
			for(int col = 0; col < board[row].length; col++){
				if (board[row][col] == player){
					count++;
				}
				
			}
			if (count == 3)
				return true;
		}
		return false;
	}
	
	public boolean checkCols(char player){
		for(int col = 0; col < board.length; col++){
			int count = 0;
			for(int row = 0; row < board.length; row++){
				if (board[row][col] == player){
					count++;
				}
				
			}
			if (count == 3)
				return true;
		}
		return false;
	}
	
	public boolean checkDiagonals(char player){
		int count1 = 0;
		for(int i = 0; i < board.length; i++){
			if (board[i][i] == player){
					count1++;
			}	
		}
		if (count1 == 3)
			return true;
		int count2 = 0;
		for(int i = 2; i >= 0; i--){
			if (board[i][i] == player){
					count2++;
			}	
		}
		if (count2 == 3)
			return true;
		return false;
	}
	

	
}
