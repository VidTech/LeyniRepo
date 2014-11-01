package is.ru.tictactoe;
import java.util.Scanner;

import static spark.Spark.*;
import spark.*;


public class TicTacToe{

	public static void main(String[] args) {


		staticFileLocation("/public");
        setPort(Integer.valueOf(System.getenv("PORT")));
        final Game tictactoe = new Game();

		//Scanner scanner = new Scanner(System.in);
		//Game theGame = new Game();
         post(new Route("/add") 
        {
            @Override
       		public Object handle(Request request, Response response)
            {

            	String boardPos = request.queryParams("boardPos");
            	Strin pos = boardPos.split("=")[1];

            	int row = Integer.valueOf(pos.split("_")[0]);
            	int col = Integer.valueOf(pos.split("_")[0]);

				if(tictactoe.checkIfWinner()){
					//tictactoe = new Game();
					tictactoe.b.initializeBoard();
					return "X";
				}
				if(tictactoe.checkIfTie()){
					//tictactoe = new Game();
					tictactoe.b.initializeBoard();
					return "X";
				}
				else{
					tictactoe.makeMove(row, col);
					return "X";
					
				}

			}


		});

	}
}
