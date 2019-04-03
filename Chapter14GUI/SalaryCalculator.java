import java.awt.*;
import javax.swing.*;

public class SalaryCalculator {

	public static void main(String[] args) {
		
		JFrame window = new JFrame();
		window.setTitle("Salary Calculator");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Create a java label saying "Hourly wage"
		JLabel label1 = new JLabel("Hourly wage");
		
		JLabel label2 = new JLabel("Yearly salary");
		
		JTextField field1 = new JTextField(15);
		int hourlyWage = 20;
		field1.setText("" + hourlyWage);
		
		JTextField field2 = new JTextField(15);
//		field2.setText("0");
		// calculate yearly salary = hourly wage * 40 * 50

		int yearlySalary = hourlyWage * 40 * 50;
		field2.setText("" + yearlySalary);
		field2.setEditable(false);
		
		// put the components in a grid
		window.setLayout(new GridBagLayout());
		
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.gridx = 0;
		constraints.gridy = 0;
		constraints.insets = new Insets(20, 10, 10, 10);
		window.add(label1, constraints);
		
		constraints.gridx = 1;
		constraints.gridy = 0;
		constraints.insets = new Insets(20, 10, 10, 10);
		window.add(field1, constraints);
		
		constraints.gridx = 0;
		constraints.gridy = 1;
		constraints.insets = new Insets(20, 10, 10, 10);
		window.add(label2, constraints);
		
		constraints.gridx = 1;
		constraints.gridy = 1;
		constraints.insets = new Insets(20, 10, 10, 10);
		window.add(field2, constraints);
		
		window.pack(); // adjust the windows size to its contents
		
		
		window.setVisible(true);
		

	}

}
