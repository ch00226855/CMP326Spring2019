import java.awt.*;
import javax.swing.*;

public class HistogramComponent extends JComponent{
	
	public void paintComponent(Graphics g) {
		
		Graphics2D g2D = (Graphics2D) g;
		
		g2D.setColor(Color.BLACK);
		g2D.fillRect(100, 100, 300, 100);
		
		g2D.setColor(Color.RED);
		g2D.fillRect(100, 220, 200, 100);
		
		Color myColor = new Color(102, 153, 0);
		g2D.setColor(myColor);
//		g2D.fillRect(100, 340, 500, 100);
		
		Rectangle rect3 = new Rectangle(100, 340, 500, 100);
		g2D.fill(rect3);
		
		g2D.setColor(Color.MAGENTA);
		Font myFont = new Font("Monospaced", Font.ITALIC, 40);
		g2D.setFont(myFont);
		g2D.drawString("Hello World", 350, 500);
		
	}

}
