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

            	Integer pos = Integer.valueOf(request.queryParams("pos"));
            	
            	int row = 0;
            	int col = 0;
            	if(pos < 3){
            		row = 0;
            		col = pos;
            	}
            	else if(pos < 6){
            		row = 1;
            		col = pos - 3;
            	}
            	else {
            		row = 2;
            		col = pos - 6;
            	}

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
					String sym = Character.toString(tictactoe.current.getSymbol());
					tictactoe.makeMove(row, col);
					return "X";
					
				}

			}


		});

	}
}
