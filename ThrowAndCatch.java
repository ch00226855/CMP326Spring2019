
public class ThrowAndCatch {

	public static void main(String[] args) {
		int a = 100;
		int b = 0;
		try {
			System.out.println("a / b = " + divide(a, b));
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("a / b cannot be computed.");
			e.printStackTrace();
		}
		
		System.out.println("This is the end of the program");

	}
	
	public static int divide(int a, int b) throws Exception{
		if (b != 0) {
			return a / b;
		} else {
			throw new Exception("Cannot divide by 0!");
		}
	}

	
//	public static int divide(int a, int b) {
//		int answer;
//		
//		try {
//			answer = a / b;
//		} catch (Exception e) {
//			System.out.println("Something is wrong.");
//			answer = -1;
//		}
//		return answer;
//	}
	

}
