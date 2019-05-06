import java.util.Arrays;

public class Homework7_1 {
	
	// 7.1 Fibonacci numbers
	// fib(0) = 0
	// fib(1) = 1
	// for any other n, fib(n) = fib(n-1) + fib(n-2)
	public static int fib(int n) {
		
		// base cases:
//		if (n == 0) {
//			return 0;
//		} else if (n == 1) {
//			return 1;
//		} 
		
		if (n <= 1) {
			return n;
		}
		else {// general case
			return fib(n-1) + fib(n-2);
		}
		
	}
	
	public static int getPowerOfXtoN(int xBase, int nExp) {
		
		// base case:
		if (nExp == 0) {
			return 1;
		} else {// general case
			// x^n = x^(n-1) * x
			return getPowerOfXtoN(xBase, nExp-1) * xBase;
		}
		
	}
	
	
	public static int binarySearch(String target, String[] words) {
		
		// base cases: a list with 0/1 word
		if (words.length == 0) {
			return -1;
		}
		
		if (words.length == 1) {
			if(target.equals(words[0])) {
				return 0;
			} else {
				return -1;
			}
		}
		
		// general case
		// 1) find the middle word
		String middleWord = words[words.length / 2];
		int comparison = target.compareTo(middleWord);
		if (comparison == 0) {
			return words.length / 2;
		} else if(comparison < 0) {// this mean target word may only exists
									// in the first half of the array
			String[] firstHalf = Arrays.copyOfRange(words, 0, words.length/2);
			return binarySearch(target, firstHalf);
			
		} else if(comparison > 0) {
			String[] secondHalf = // continues to the next line
			Arrays.copyOfRange(words, words.length/2 + 1, words.length);
			
			int newIndex = binarySearch(target, secondHalf);
			if(newIndex == -1) {
				return newIndex;
			} else {
				return newIndex + words.length/2 + 1;
			}
		}
		// dummy return statement
		return -1;
		
	}
	
	public static void main(String[] args) {
		
		// test fib(): print the first 10 Fibonacci numbers
		for(int i=0; i<10; i++) {
			System.out.println(fib(i));
		}
		
		// test power method: print the first 10 powers of 2
		System.out.println("-------------------------------");
		for(int i=0; i<10; i++) {
			System.out.println(getPowerOfXtoN(2, i));
		}
		
		// test binarySearch:
		
		System.out.println("-------------------------------");
		String[] words = {"ABCDE", "Friday", "Monday", "Tuesday", "Unknown", "Vbox", "What"};
		String target = "Monday";
		System.out.println("Binary search for \"Monday\": " +
						binarySearch(target, words));
		target = "Week";
		System.out.println("Binary search for \"Week\": " +
						binarySearch(target, words));
		target = "Tuesday";
		System.out.println("Binary search for \"Tuesday\": " + 
						binarySearch(target, words));
		target = "What";
		System.out.println("Binary search for \"What\": " + 
						binarySearch(target, words));
		
	}

}
