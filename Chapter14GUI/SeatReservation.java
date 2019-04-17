import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SeatReservation extends JFrame implements ActionListener{
	
	private JLabel seatNumLabel;
	private JLabel firstNameLabel;
	private JLabel lastNameLabel;
	private JLabel amountPaidLabel;
	private JTextField seatNumField;
	private JTextField firstNameField;
	private JTextField lastNameField;
	private JTextField amountPaidField;
	
	private Object[][] tableVals;
	private String[] tableHeaders = {"Seat Number", "First Name", "Last Name", "Amount Paid"};
	private JTable table;
	
	private JButton reserveButton;
	private JButton quitButton;
	
	public SeatReservation() {
		
		// create all components
		seatNumLabel = new JLabel("Seat Number:");
		firstNameLabel = new JLabel("First Name:");
		lastNameLabel = new JLabel("Last Name:");
		amountPaidLabel = new JLabel("Amount Paid:");
		
		seatNumField = new JTextField(15);
		seatNumField.setEditable(true); // optional
		firstNameField = new JTextField(15);
		lastNameField = new JTextField(15);
		amountPaidField = new JTextField(15);
		
		tableVals = new Object[5][4];
		table = new JTable(tableVals, tableHeaders);
		table.setEnabled(false); // disable directly editing the table
		table.getTableHeader().setReorderingAllowed(false); // disable dragging columns
		
		reserveButton = new JButton("Reserve");
		reserveButton.addActionListener(this);
		quitButton = new JButton("Quit");
		quitButton.addActionListener(this);
		
		// add all components to the frame using GridBagLayout
		setLayout(new GridBagLayout());
		
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.gridx = 0;
		constraints.gridy = 2;
		constraints.insets = new Insets(10, 10, 10, 10);
		add(seatNumLabel, constraints);
		
		constraints = new GridBagConstraints();
		constraints.gridx = 0;
		constraints.gridy = 3;
		constraints.insets = new Insets(10, 10, 10, 10);
		add(seatNumField, constraints);
		
		constraints = new GridBagConstraints();
		constraints.gridx = 1;
		constraints.gridy = 2;
		constraints.insets = new Insets(10, 10, 10, 10);
		add(firstNameLabel, constraints);
		
		constraints = new GridBagConstraints();
		constraints.gridx = 1;
		constraints.gridy = 3;
		constraints.insets = new Insets(10, 10, 10, 10);
		add(firstNameField, constraints);
		
		constraints = new GridBagConstraints();
		constraints.gridx = 2;
		constraints.gridy = 2;
		constraints.insets = new Insets(10, 10, 10, 10);
		add(lastNameLabel, constraints);
		
		constraints = new GridBagConstraints();
		constraints.gridx = 2;
		constraints.gridy = 3;
		constraints.insets = new Insets(10, 10, 10, 10);
		add(lastNameField, constraints);
		
		constraints = new GridBagConstraints();
		constraints.gridx = 3;
		constraints.gridy = 2;
		constraints.insets = new Insets(10, 10, 10, 10);
		add(amountPaidLabel, constraints);
		
		constraints = new GridBagConstraints();
		constraints.gridx = 3;
		constraints.gridy = 3;
		constraints.insets = new Insets(10, 10, 10, 10);
		add(amountPaidField, constraints);
		
		constraints = new GridBagConstraints();
		constraints.gridx = 0;
		constraints.gridy = 0;
		constraints.gridwidth = 4;
		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.insets = new Insets(10, 10, 10, 10);
		add(table.getTableHeader(), constraints);
		
		constraints = new GridBagConstraints();
		constraints.gridx = 0;
		constraints.gridy = 1;
		constraints.gridwidth = 4;
		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.insets = new Insets(10, 10, 10, 10);
		add(table, constraints);
		
		constraints = new GridBagConstraints();
		constraints.gridx = 4;
		constraints.gridy = 3;
		constraints.insets = new Insets(10, 10, 10, 10);
		add(reserveButton, constraints);
		
		constraints = new GridBagConstraints();
		constraints.gridx = 5;
		constraints.gridy = 3;
		constraints.insets = new Insets(10, 10, 10, 10);
		add(quitButton, constraints);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if ((JButton) e.getSource() == reserveButton) {
			// get the information entered by user
			int seatNum;
			String firstName;
			String lastName;
			double amountPaid;
			
			seatNum = Integer.parseInt(seatNumField.getText());
			firstName = firstNameField.getText();
			lastName = lastNameField.getText();
			amountPaid = Double.parseDouble(amountPaidField.getText());
			
//			System.out.print(seatNum + " " + firstName + " " + lastName + " " + amountPaid);
			
			// display the information on the table
			table.setValueAt(seatNum, seatNum, 0);
			table.setValueAt(firstName, seatNum, 1);
			table.setValueAt(lastName, seatNum, 2);
			table.setValueAt(amountPaid, seatNum, 3);
		}
	}
	
	

	public static void main(String[] args) {
		
		SeatReservation window = new SeatReservation();
		
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		window.pack();
		
		window.setVisible(true);
		

	}

}
