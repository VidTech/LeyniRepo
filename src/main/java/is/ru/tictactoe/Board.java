package is.ru.tictactoe;

public class Board{
	public char[][] theBoard = new char[3][3];

	Board(){
		initializeBoard();
	}

	public void initializeBoard( ) {
	        for (int i = 0; i < 3; i++){
           		for (int j = 0; j < 3; j++) {
				theBoard[i][j] = ' ';
			}
		}
	}
	
	public void  addToBoard(Player p, int col, int row) {
		theBoard[col][row] = p.getSymbol( );

	}

	public char getSymbolAtPos(int col, int row) {
		return theBoard[col][row];
	}


}
