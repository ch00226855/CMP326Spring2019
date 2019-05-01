import java.util.Scanner;

public class BinarySearch {
	
	private static Scanner scnr = new Scanner(System.in);
	
	public static void takeAGuess(int min, int max) {
		
		// find the middle value of the range; this will be the guess
		int guess = (min + max) / 2;
		
		// ask the user if the guess is too low, too high or correct
		System.out.println("Is the number " + guess + "?");
		System.out.println("Let me know if it is too low (l), too high (h), or correct (c):");
		char userResponse = scnr.next().charAt(0);
		
		// depending on user response:
		//   if correct, print "Nice!" and stop.
		//   if too high, invoke takeAGuess() with the lower half of the range.
		//   if too low, invoke takeAGuess() with the upper half of the range.
		switch(userResponse) {
		
		case 'c':
			System.out.print("Nice!");
			break;
			
		case 'l':
			takeAGuess(guess, max);
			break;
			
		case 'h':
			takeAGuess(min, guess);
			break;
			
		default: // optional
			System.out.println("Invalid response!");
			takeAGuess(min, max);
		}
		
	}

	public static void main(String[] args) {
		
		System.out.println("Choose a number between 1 and 1000.");
		
		takeAGuess(1, 1000);

	}

}
