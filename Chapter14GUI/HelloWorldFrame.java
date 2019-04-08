import java.awt.*;
import javax.swing.*;

public class HelloWorldFrame extends JFrame {
	
	// draw things in the constructor
	public HelloWorldFrame() {
		
		HistogramComponent component2 = new HistogramComponent();
		this.add(component2);
		
	}
	
	public static void main(String[] args) {
		
		HelloWorldFrame window = new HelloWorldFrame();
		
		window.setSize(800, 600);
		window.setResizable(false);
		window.setTitle("Hello World");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		window.setVisible(true);
	}

}
