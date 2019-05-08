import java.awt.*;
import javax.swing.*;

public class ScoreBoard extends JComponent {
	
	private String champion;
	private String lastWinner;
	
	public ScoreBoard() {
		super();
		setPreferredSize(new Dimension(400, 120));
		champion = "-----------";
		lastWinner = "-----------";
	}
	
	@Override
	public void paintComponent(Graphics g) {
		
		// Type cast g to Grahpics2D
		Graphics g2D = (Graphics2D) g;
		
		g2D.setColor(Color.YELLOW);
		g2D.fillRect(0, 0, 400, 40);
		g2D.setColor(Color.BLACK);
		g2D.drawString("Champion", 10, 15);
		g2D.drawString(champion, 200, 10);
		
		
		
	}
	
	// TODO: add getters and setters

}
