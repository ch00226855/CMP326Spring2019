import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Game extends JFrame implements ActionListener{
	
	private static final int NUM_ROWS = 6;
	private static final int NUM_COLUMNS = 7;
	private static final Color colorEmpty = Color.LIGHT_GRAY;
	private static final Color colorPlayer1 = Color.YELLOW;
	private static final Color colorPlayer2 = Color.GREEN;
	
	private int currentPlayer; // either 1 or 2.
	
//	private JButton button1;
	private JButton[] buttons = new JButton[NUM_COLUMNS];
	
//	private JLabel label00;
	private JLabel[][] gameBoard = new JLabel[NUM_ROWS][NUM_COLUMNS];
	
	private ScoreBoard scoreBoard;
	
	public Game() {
		
		currentPlayer = 1;
		
//		button1 = new JButton("0");
		for(int i=0; i<NUM_COLUMNS; i++) {
			buttons[i] = new JButton("" + i); // formally: String.format("%d", i)
			buttons[i].addActionListener(this);
		}
		
//		label00 = new JLabel("00");
//		label00.setOpaque(true);
//		label00.setBackground(colorEmpty);
//		label00.setPreferredSize(new Dimension(50, 20));
//		label00.setHorizontalAlignment(JLabel.CENTER);
		for(int row=0; row<NUM_ROWS; row++) {
			for(int col=0; col<NUM_COLUMNS; col++) {
				gameBoard[row][col] = new JLabel("" + row + col);
				gameBoard[row][col].setOpaque(true);
				gameBoard[row][col].setBackground(colorEmpty);
				gameBoard[row][col].setPreferredSize(new Dimension(50, 20));
				gameBoard[row][col].setHorizontalAlignment(JLabel.CENTER);
			}
		}
		
		scoreBoard = new ScoreBoard();
		
		setLayout(new GridBagLayout());
		
		GridBagConstraints constraints;		
//		constraints = new GridBagConstraints();
//		constraints.gridx = 0;
//		constraints.gridy = 0;
//		constraints.insets = new Insets(3, 3, 3, 3);
//		add(button1, constraints);
		for (int i=0; i<NUM_COLUMNS; i++) {
			constraints = new GridBagConstraints();
			constraints.gridx = i;
			constraints.gridy = 0;
			constraints.insets = new Insets(3, 3, 3, 3);
			add(buttons[i], constraints);
		}
		
//		constraints = new GridBagConstraints();
//		constraints.gridx = 0;
//		constraints.gridy = 1;
//		constraints.insets = new Insets(3, 3, 3, 3);
//		add(label00, constraints);		
		for(int row=0; row<NUM_ROWS; row++) {
			for(int col=0; col<NUM_COLUMNS; col++) {
				constraints = new GridBagConstraints();
				constraints.gridx = col;
				constraints.gridy = row + 1; //because there is already a row of buttons
				constraints.insets = new Insets(3, 3, 3, 3);
				add(gameBoard[row][col], constraints);
				
			}
		}
		
		constraints = new GridBagConstraints();
		constraints.gridx = 0;
		constraints.gridy = 8;
		constraints.gridwidth = NUM_COLUMNS;
		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.insets = new Insets(3, 3, 3, 3);
		add(scoreBoard, constraints);			
		
	}
	
	private void addPiece(int col) {
		// find out the row index of the empty.
		for(int row=NUM_ROWS-1; row>=0; row--) {
			// check if the slot on this row is empty
			if(gameBoard[row][col].getBackground() == colorEmpty) {
				// change the color to the color of current player.
				if(currentPlayer == 1) {
					gameBoard[row][col].setBackground(colorPlayer1);
					currentPlayer =2;
					break;
				} else {
					gameBoard[row][col].setBackground(colorPlayer2);
					currentPlayer = 1;
					break;
				}
			}
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// find out which button is clicked
		JButton sourceButton = (JButton) e.getSource();
		
		// add one more piece to that column
//		if(sourceButton == button1) {
//			addPiece(1);
//		}
		for(int i=0; i<NUM_COLUMNS; i++) {
			if(sourceButton == buttons[i]) {
				addPiece(i);
			}
		}
		
		// TODO: check if there is a winner
		
		
		// use repaint() to update the board
		repaint();
	}
	
	public static void main(String[] args) {
		
		Game window = new Game();
		
		window.setTitle("Connect Four");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
//		window.setSize(500, 500);
		window.pack();
		window.setVisible(true);
		
	}

}
