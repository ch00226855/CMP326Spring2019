import java.awt.*;
import javax.swing.*;

public class DrawHouse extends JComponent{
	
	// we must implement paintComponent() to show something on the screen
	public void paintComponent(Graphics g) {
		
//		g.drawString("This is my house", 50, 50);
//		
//		g.drawRect(100, 150, 123, 234);
//		
//		g.drawOval(0, 0, 20, 30);
		
		// wall
		g.setColor(Color.GRAY); // Assign the gray color to the graphics
		g.fillRect(237, 170, 311, 237);
		
		// door
		g.setColor(Color.RED);
		g.fillRect(420, 230, 95, 177);
		
		// door knob
		g.setColor(Color.MAGENTA);
		g.fillOval(433, 314, 11, 14);
		
		// roof
		int[] xCoordinates = {379, 162, 620};
		int[] yCoordinates = {64, 167, 167};
		g.setColor(Color.BLACK);
		g.fillPolygon(xCoordinates, yCoordinates, 3);
		
		// add text
		g.setColor(Color.PINK);
		g.drawString("This is my house.", 214, 448);
	}
	
	

}
