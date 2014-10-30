package is.ru.tictactoe;

public class Player{
	private char character;
	private String name;
	
	Player(char c) {
		this.character = 'X';
	}

	public char getSymbol( ) {
		return this.character;
	}

	public String getName( ) {
		return this.name;
	}
}
