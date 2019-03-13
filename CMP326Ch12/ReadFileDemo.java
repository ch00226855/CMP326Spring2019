import java.io.FileInputStream;
import java.util.Scanner;

public class ReadFileDemo {

	public static void main(String[] args) {
		
		// To read a file, use:
		// 1) FileInputStream
		// 2) Scanner
		
		FileInputStream file = null;
		Scanner scnr = null;
		
		try {
			file = new FileInputStream("Student scores.txt");
			scnr = new Scanner(file);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		// To read a file, use the next***() of Scanner
//		String line = scnr.nextLine();
//		System.out.println(line);
//		
//		line = scnr.nextLine();
//		System.out.println(line);
		String line;
		while(scnr.hasNextLine()) {
			line = scnr.nextLine();
			System.out.println(line);
		}
		
		try {
			file.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		scnr.close();

	}

}
