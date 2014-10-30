package is.ru.tictactoe;

public class Game{
	Board b = new Board();
	Player p1 = new Player('X');
	Player p2 = new Player('O');


	public void makeMove(Player p, int row, int col){
		this.b.addToBoard(p, row, col);
	}

	public Player checkIfWinner(Board b){
		return null;
	}

	public boolean checkIfTie(Board b){
		return true;
	}

}

