import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

public class TwoRectangles extends JComponent {
	
	public void paintComponent(Graphics g) {
		
		// type case g to Graphics2D
		Graphics2D g2D = (Graphics2D) g;
		
		// draw two rectangles
		g2D.drawRect(50, 50, 640, 500);
		
		g2D.setColor(Color.PINK);
		g2D.fillRect(50, 200, 200, 300);
		
	}

}
