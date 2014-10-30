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

}
