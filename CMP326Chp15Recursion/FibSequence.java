import java.util.ArrayList;

public class FibSequence {
	
//	int[] sequence = new int[100]; // will impose a max length, preventing sequence of longer length
	private static ArrayList<Integer> sequence = new ArrayList<Integer>();
	
	public static void fibSequence(int length) {
		
		if (length == 1) {// base case 1: length = 1
			sequence.add(0);
		} else if (length == 2) {// base case 2: length = 2
			sequence.add(0);
			sequence.add(1);
		} else { // general case:
			//  use fibSequence(length - 1) to generate Fibonacci sequence of 1 less length
			fibSequence(length - 1);
			// add the last two values of the sequence
			int lastNum = sequence.get(sequence.size() - 1);
			int secondToLastNum = sequence.get(sequence.size() - 2);
			int sum = lastNum + secondToLastNum;
			
			
			// append the sum to the sequence
			sequence.add(sum);
		}
		
	}
	
	public static void main(String[] args) {
		
		fibSequence(30);
		
		for (int i=0; i<sequence.size(); i++) {
			System.out.println(sequence.get(i));
		}
		
	}

}
