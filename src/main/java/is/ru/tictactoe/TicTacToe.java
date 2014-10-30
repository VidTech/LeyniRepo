package is.ru.tictactoe;
import java.util.Scanner;


public class TicTacToe{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Game theGame = new Game();

		while (true) {
			if(theGame.checkIfWinner()){
				theGame.b = new Board();
			}
			if(theGame.checkIfTie()){
				theGame.b = new Board();
			}
			else{
				int row = scanner.nextInt();
				int col = scanner.nextInt();

				theGame.makeMove(row, col);
				theGame.b.displayBoard();
			}

		}


	}

}
