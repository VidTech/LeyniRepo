package is.ru.tictactoe;


import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class TicTacToeTest {

	//final TicTacToe test = new TicTacToe();


	@Test
	public void testBoardInitialize(){

		Board test = new Board();

		assertEquals(3, test.theBoard[0].length);
		assertEquals(3, test.theBoard[1].length);
		assertEquals(3, test.theBoard[2].length);
	}

	@Test
	public void testPlayerCharacter(){
		Game test = new Game();
		assertEquals('X', test.p1.getSymbol());
	}

	@Test
	public void testAddToBoard(){
		Game test = new Game();
		test.b.addToBoard(test.p1, 1, 1);
		assertEquals('X', test.b.getSymbolAtPos(1,1));
	}


}
