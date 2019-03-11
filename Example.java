import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Enter integer a:");
		int a = scnr.nextInt();
		
		System.out.println("Enter integer b:");
		int b = scnr.nextInt();
		
		System.out.println("a + b = " + (a + b));
		
//		try {
//			System.out.println("a / b = " + (a / b));
//		} catch (Exception e) {
//			System.out.println("Something went wrong during division.");
//		}
		
		int[] ary = new int[2];
		ary[0] = a;
		ary[1] = b;
		
		try {
			System.out.println("ary[2] is: " + ary[2]);
		} catch (Exception e) {
			System.out.println("ary[2] does not exist.");
		}
		
		System.out.println("a * b = " + (a * b));
		
		

	}

}
