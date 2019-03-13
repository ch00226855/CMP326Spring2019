import java.io.FileInputStream;
import java.util.Scanner;

public class AverageScore {

	public static void main(String[] args) {
		
		FileInputStream file = null;
		Scanner scnr = null;
		
		try {
			file = new FileInputStream("Scores.txt");
			scnr = new Scanner(file);
			
			int currentScore;
			int sum = 0;
			int numScores = 0;
			
			while(scnr.hasNextInt()) {
				currentScore = scnr.nextInt();
				sum += currentScore;
				numScores++;
			}
			
			System.out.println("The average score is: " + ((double)sum / numScores));
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {// will be executed no matter there is an exception or not.
			try {
				file.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			scnr.close();
			System.out.println("Program completed.");
		}

	}

}
