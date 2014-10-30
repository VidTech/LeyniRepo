package is.ru.tictactoe;


import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class TicTacToeTest {

	//final TicTacToe test = new TicTacToe();

	@Test
	public void testConstructorGrid(){

		TicTacToe test = new TicTacToe();
		assertEquals(8, test.grid.length);
	}




}
