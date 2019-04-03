import java.awt.*; // import everything from java.awt library
import javax.swing.*; // import everything from javax.swing

public class MyHouse {
	
	public static void main(String[] args) {
		
		JFrame window = new JFrame();
		
		window.setSize(800, 600);// the size of the window
		window.setLocation(50, 50);// set the location of the upper left corner
		window.setTitle("My House");// set the title of the window
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// tell the program to close when user
															// closes the window
		
		// determine the layout of multiple components
		window.setLayout(new GridBagLayout());
		
		// set up the layout grid
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.gridx = 0;
		constraints.gridy = 0;
				
		// add the JComponents
		DrawHouse house = new DrawHouse();
		house.setPreferredSize(new Dimension(600, 500));
		window.add(house, constraints);	
		
		constraints.gridx = 0;
		constraints.gridy = 1;
		
		// add existing java graphical components
		JTextField field1 = new JTextField();
		field1.setText("Today is Wednesday");
		window.add(field1, constraints);
		
		window.pack();
		
		window.setVisible(true); // make the window visible
		
	}
	
	

}
