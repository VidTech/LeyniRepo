package is.ru.tictactoe;


import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class TicTacToeTest {

	//final TicTacToe test = new TicTacToe();

	public static void printArray(double theBoard[][]) {
    	for (int row = 0; row < theBoard.length; row++) {
        	for (int column = 0; column < theBoard[row].length; column++) {
            	System.out.print(theBoard[row][column] + " ");
        	}
        	System.out.println();
    	}
	}

	printArray(theBoard[][]);

	@Test
	public void testBoardInitialize(){

		Board test = new Board();

		assertEquals(3, test.theBoard[0].length);
		assertEquals(3, test.theBoard[1].length);
		assertEquals(3, test.theBoard[2].length);
	}




}
