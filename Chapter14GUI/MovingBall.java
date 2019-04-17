import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MovingBall extends JComponent 
		implements ActionListener{
	
	private int x;
	private int y;
	private int width;
	private int height;
	private int speedX;
	private int speedY;
	
	private int x2;
	private int y2;
	private int speedX2;
	private int speedY2;
	
	public MovingBall() {
		x = 100;
		y = 200;
		width = 40;
		height = 40;
		speedX = 2;
		speedY = 2;
		
		// initial position of the second ball
		x2 = 700;
		y2 = 500;
		speedX2 = -3;
		speedY2 = 1;
	}
	
	public void paintComponent(Graphics g) {
		
		g.setColor(Color.ORANGE);
		g.fillOval(x, y, width, height);
		
		// draw the four boundaries
		g.setColor(Color.PINK);
		// upper boundary
		g.drawLine(0, 0, 800, 0);
		// left boundary
		g.drawLine(0, 0, 0, 600);
		// lower boundary
		g.drawLine(0, 600, 800, 600);
		// right boundadry
		g.drawLine(800, 600, 800, 0);
		
		// draw the second ball
		g.setColor(Color.DARK_GRAY);
		g.fillOval(x2, y2, width, height);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		// if the ball is touching the lower boundary
		// negate speedY
		if (y + height >= 600) {
			speedY = -speedY;
		}
		
		// if the ball hits the upper boundary
		// negate speedY
		if (y <= 0) {
			speedY = -speedY;
		}
		
		// left and right wall: negate speedX
		if(x <= 0 || x + width >= 800) {
			speedX = -speedX;
		}
		
		x += speedX;
		y += speedY;
		
		// if the ball is touching the lower boundary
		// negate speedY
		if (y2 + height >= 600) {
			speedY2 = -speedY2;
		}
		
		// if the ball hits the upper boundary
		// negate speedY
		if (y2 <= 0) {
			speedY2 = -speedY2;
		}
		
		// left and right wall: negate speedX
		if(x2 <= 0 || x2 + width >= 800) {
			speedX2 = -speedX2;
		}
		
		x2 += speedX2;
		y2 += speedY2;
		
		repaint();
		
	}
	
	

}
