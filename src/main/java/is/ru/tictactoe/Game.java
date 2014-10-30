package is.ru.tictactoe;

public class Game{
	Board b = new Board();
	Player p1 = new Player('X');
	Player p2 = new Player('O');
	Player current = p1;


	public void makeMove(int row, int col){
		this.b.addToBoard(current, row, col);
        switchPlayers();
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

	public void switchPlayers(){
		if (current == p1) {
			current = p2;
		}
		else {
			current = p1;
		}
	}

}

