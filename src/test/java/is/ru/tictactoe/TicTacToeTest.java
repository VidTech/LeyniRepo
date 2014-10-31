package is.ru.tictactoe;


import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class TicTacToeTest {



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

	@Test
	//test if move is outside the board
	public void testMakeMove(){
		Game test = new Game();
		assertEquals("some error", test.makeMove(4,4));
	}

	@Test
	public void testCheckForWinnerInCol(){
		Game test = new Game();
		test.b.addToBoard(test.p1, 0, 0);
		test.b.addToBoard(test.p1, 1, 0);
		test.b.addToBoard(test.p1, 2, 0);
		assertEquals(true, test.checkIfWinner());
	}

	@Test
	public void testCheckForWinnerInRow(){
		Game test = new Game();
		test.b.addToBoard(test.p1, 0, 0);
		test.b.addToBoard(test.p1, 0, 1);
		test.b.addToBoard(test.p1, 0, 2);
		assertEquals(true, test.checkIfWinner());
	}

	@Test
	public void testCheckForWinnerInCross(){
		Game test = new Game();
		test.b.addToBoard(test.p1, 0, 0);
		test.b.addToBoard(test.p1, 1, 1);
		test.b.addToBoard(test.p1, 2, 2);
		assertEquals(true, test.checkIfWinner());
	}

	@Test
	//testing when there is a winner
	public void testCheckForTie(){
		Game test = new Game();
		test.b.addToBoard(test.p1, 0, 0);
		test.b.addToBoard(test.p2, 0, 1);
		test.b.addToBoard(test.p1, 0, 2);
		test.b.addToBoard(test.p2, 1, 0);
		test.b.addToBoard(test.p1, 1, 1);
		test.b.addToBoard(test.p2, 1, 2);
		test.b.addToBoard(test.p1, 2, 0);
		test.b.addToBoard(test.p2, 2, 2);
		test.b.addToBoard(test.p1, 2, 1);
		assertEquals(false, test.checkIfTie());
	}

	@Test
	//testing when it is a tie
	public void testCheckForTie2(){
		Game test = new Game();
		test.b.addToBoard(test.p1, 0, 0);
		test.b.addToBoard(test.p1, 0, 1);
		test.b.addToBoard(test.p2, 0, 2);
		test.b.addToBoard(test.p2, 1, 0);
		test.b.addToBoard(test.p1, 1, 1);
		test.b.addToBoard(test.p1, 1, 2);
		test.b.addToBoard(test.p1, 2, 0);
		test.b.addToBoard(test.p2, 2, 2);
		test.b.addToBoard(test.p2, 2, 1);
		assertEquals(true, test.checkIfTie());
	}

	@Test
	//test if current player is p1 in the beginning
	public void testCurrentPlayer(){
		Game test = new Game();
		assertEquals(test.p1, test.current);
	}

	@Test
	//test if current player is now p2
	public void testSwitchPlayer(){
		Game test = new Game();
		test.makeMove(1, 1);
		assertEquals(test.p2, test.current);
	}


}
