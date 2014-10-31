package is.ru.tictactoe;
import java.util.Scanner;

//import static spark.Spark.*;
//import spark.*;


public class TicTacToe{

	public static void main(String[] args) {


		//staticFileLocation("/public");
        //setPort(Integer.valueOf(System.getenv("PORT")));
        //final Game tictactoe = new Game();

		Scanner scanner = new Scanner(System.in);
		Game theGame = new Game();



		while (true) {
			if(theGame.checkIfWinner()){
				theGame = new Game();
			}
			if(theGame.checkIfTie()){
				theGame = new Game();
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
