package is.ru.tictactoe;




public class TicTacToe{
	char grid[];
	int player;


	public TicTacToe(){
		grid = new char[9];
		player = 1;
		initializeGrid();
	}


	public void initializeGrid(){
		for(int i = 0; i < 9; i++)
			grid[i] = ' ';
	}




	public static void main(String[] args){

		final TicTacToe tictactoe = new TicTacToe();

	}



}