
public class CountDownTimer {
	
	public static void countDown(int a) {
		
		if (a != 1) {
			// Do this if a is not 1
			System.out.println(a);
			countDown(a-1);
		} else {
			// Do this if a is 1
			System.out.println(1);
			System.out.println("Go!");
		}
	}
	
	public static void countDown2(int a) {
		if (a == 0) {// base case
			System.out.println("GO!");
		} else {
			System.out.println(a);
			countDown2(a-1);
		}
	}

	public static void main(String[] args) {
		
//		countDown(5);
		countDown2(1000);

	}

}
