import javax.swing.JFrame;
import javax.swing.Timer;

public class AnimationWindow {

	public static void main(String[] args) {
		
		JFrame window = new JFrame();
		
		window.setSize(800, 600);
		window.setTitle("Moving Ball");
		window.setResizable(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MovingBall ball = new MovingBall();
		window.add(ball);
		
		Timer timer = new Timer(30, ball);
		timer.start();
		
		window.setVisible(true);

	}

}
