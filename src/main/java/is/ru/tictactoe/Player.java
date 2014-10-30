package is.ru.tictactoe;

public class Player{
	private char character;
	
	Player(char c) {
		this.character = c;
	}

	public char getSymbol( ) {
		return this.character;
	}

}
