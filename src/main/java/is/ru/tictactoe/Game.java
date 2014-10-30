package is.ru.tictactoe;

public class Game{
	Board b = new Board();
	Player p1 = new Player('X');
	Player p2 = new Player('O');


	public void makeMove(Player p, int row, int col){
		this.b.addToBoard(p, row, col);
	}

	public boolean checkIfWinner(){
		if((winningRow() == true || winningColumn() == true) || winningCross() == true){
			return true;
        }
        return false;
	}

	private boolean winningRow(){
        
        if(b.getSymbolAtPos(0,0) != ' ' && b.getSymbolAtPos(0,0) == b.getSymbolAtPos(0,1) && b.getSymbolAtPos(0,1) == b.getSymbolAtPos(0,2)){
            return true;
        }
        if(b.getSymbolAtPos(1,0) != ' ' && b.getSymbolAtPos(1,0) == b.getSymbolAtPos(1,1) && b.getSymbolAtPos(1,1) == b.getSymbolAtPos(1,2)){
            return true;
        }
        if(b.getSymbolAtPos(2,0) != ' ' && b.getSymbolAtPos(2,0) == b.getSymbolAtPos(2,1) && b.getSymbolAtPos(2,1) == b.getSymbolAtPos(2,2)){
            return true;
        }
        return false;
    }

    // Checks if there is a winner in a column
    private boolean winningColumn(){
        if(b.getSymbolAtPos(0,0) != ' ' && b.getSymbolAtPos(0,0) == b.getSymbolAtPos(1,0) && b.getSymbolAtPos(1,0) == b.getSymbolAtPos(2,0)){
            return true;
        }
        if(b.getSymbolAtPos(0,1) != ' ' && b.getSymbolAtPos(0,1) == b.getSymbolAtPos(1,1) && b.getSymbolAtPos(1,1) == b.getSymbolAtPos(2,1)){
            return true;
        }
        if(b.getSymbolAtPos(0,2) != ' ' && b.getSymbolAtPos(0,2) == b.getSymbolAtPos(1,2) && b.getSymbolAtPos(1,2) == b.getSymbolAtPos(2,2)){
            return true;
        }
        return false;
    }



    // Checks if there is a winner diagonally
    private boolean winningCross(){
        if(b.getSymbolAtPos(0,0) != ' ' && b.getSymbolAtPos(0,0) == b.getSymbolAtPos(1,1) && b.getSymbolAtPos(1,1) == b.getSymbolAtPos(2,2)){
            return true;
        }       
        if(b.getSymbolAtPos(0,2) != ' ' && b.getSymbolAtPos(0,2) == b.getSymbolAtPos(1,1) && b.getSymbolAtPos(1,1) == b.getSymbolAtPos(2,0)){
            return true;
        }
        return false;
    }

	public boolean checkIfTie(){
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				if(b.getSymbolAtPos(i,j) == ' '){
					return false;
				}
			}
		}
		return true;
	}

    public static void main(String[] args) {
        //b.displayBoard();

        //create instance of Board
        Board board = new Board();
        
        //printing the board
        board.displayBoard();
    }

}

