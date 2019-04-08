import java.awt.*;
import javax.swing.*;

public class ChessWindow extends JFrame {

	public ChessWindow() {
		
		// use ChessBoard class to draw chess board
		ChessBoard board = new ChessBoard();
		this.add(board);
		
	}
	
	public static void main(String[] args) {
		
		// create a ChessWindow object
		ChessWindow window = new ChessWindow();
		
		// set size, set title, set default close operation
		window.setSize(1000, 1000);
		window.setTitle("Chess");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		
		// set visible
		window.setVisible(true);
		
	}
}
