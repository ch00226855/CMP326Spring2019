import java.awt.*;
import javax.swing.*;

public class ChessBoard extends JComponent {
	
	public void paintComponent(Graphics g) {
		
		// test message
//		g.drawString("This indicates that ChessBoard"
//				+ "is correctly created", 100, 100);
		
		// draw the borders of the chess board
		Graphics2D g2D = (Graphics2D) g;
		
		g2D.setColor(Color.CYAN);
		g2D.drawRect(10, 10, 400, 400);
		
		// draw the 64 squares (for loops are needed)
		// for each square: choose color, determine its
		// start location, and use fillRect()
		int x, y;
		int width = 50;
		int height = 50;
		for (int i=0; i<8; i++) {// loop through rows
			for(int j=0; j<8; j++) {// loop thorugh columns
				// draw the square on Row i, Column j.
				
				if((i + j) % 2 == 0) {
					g2D.setColor(Color.WHITE);
				} else {
					g2D.setColor(Color.BLACK);
				}
				
				x = 10 + j * width;
				y = 10 + i * height;
				g2D.fillRect(x, y, width, height);
			}
		}
		
		
		// Use drawString to display the player names.
		g2D.setColor(Color.DARK_GRAY);
		g2D.drawString("Player1: Alice \t Player2: Bob", 10, 500);
	}

}
