
public class TwoDimArray {
	
	public static void main(String[] args) {
		
		// Create a two-dimensional array containing:
		
		//  1   2   3   4
		//  5   6   7   8
		//  9   10  11  12
		
		// Method 1:
		int[][] table1 = new int[3][4];  // allocates memory for array
		// assign the first row
		table1[0][0] = 1;
		table1[0][1] = 2;
		table1[0][2] = 3;
		table1[0][3] = 4;
		
		// assign the second row
		table1[1][0] = 5;
		table1[1][1] = 6;
		table1[1][2] = 7;
		table1[1][3] = 8;
		
		// assign the third row
		table1[2][0] = 9;
		table1[2][1] = 10;
		table1[2][2] = 11;
		table1[2][3] = 12;
		
		// Method 2:
		int[][] table2 = { 
				{1, 2,  3,  4},  
				{5, 6,  7,  8},   
				{9, 10, 11, 12} 
			};
		
		// Print the value on the second row , third column
		System.out.println("Value on row 2, column 3: " + table1[1][2]);
		System.out.println("Value on row 2, column 3: " + table2[1][2]);
		
		// to print values of the third row:
		System.out.println("Printing values of the third row...");
		for(int i=0; i<4; i++) {
			System.out.print(table1[2][i] + " ");
		}
		
		// Print the entire table
		System.out.println("Now let's print out all values...");
		for (int j=0; j<table1.length; j++) { // j refers to the row index
			for (int i=0; i<table1[0].length; i++) {// i refers to the column index
				System.out.print(table1[j][i] + " ");
			}
			System.out.println("");
		}
		
		// Find the number of rows
		System.out.println("The number of rows is the length of the 2D array:");
		System.out.println("Number of rows: " + table2.length);
		
		// Find the number of columns
		System.out.println("The number of columns is the length of a particular row:");
		System.out.println("Number of columns: " + table2[0].length);
		
	}

}
