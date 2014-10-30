package is.ru.tictactoe;

public class Board{
	public char[][] theBoard = new char[3][3];

	Board(){
		initializeBoard();
	}

	public void initializeBoard() {
	        for (int i = 0; i < 3; i++){
           		for (int j = 0; j < 3; j++) {
				theBoard[i][j] = ' ';
			}
		}
	}
	
	public void  addToBoard(Player p, int row, int col) {
		if(theBoard[row][col] == ' ') {
			theBoard[row][col] = p.getSymbol( );
		}
		else return;
	}

	public char getSymbolAtPos(int row, int col) {
		return theBoard[row][col];
	}

	public void displayBoard() {
		System.out.println("-------------");

		for (int i = 0; i < 3; i++){
			System.out.print("| ");
			for (int j = 0; j < 3; j++){
				System.out.print(theBoard[i][j] + " | ");
			}
			System.out.println();
			System.out.println("-------------");
		}
	}


}
