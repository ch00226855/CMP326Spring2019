import javax.swing.JFrame;

//import java.awt.*;
//import javax.swing.*;

public class HelloWorldGUI {

	public static void main(String[] args) {
		
		JFrame window = new JFrame();
		
		window.setSize(800, 600);
		window.setResizable(false);
		window.setTitle("Hello World");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//		TwoRectangles component1 = new TwoRectangles();
//		window.add(component1);
		
		HistogramComponent component2 = new HistogramComponent();
		window.add(component2);
		
		
		window.setVisible(true);
		}

}
