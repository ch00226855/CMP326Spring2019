import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<String>();
		
		// Add three names to the array list
		names.add("Adam");
		names.add("Eva");
		names.add("Clare");
		
		// print the first name
		System.out.println("The first name is: " + names.get(0));
		
		// print the size of the array list
		System.out.println("Total number of names: " + names.size());
		
		// Change the second name to "Bob"
		names.set(1, "Bob");
		System.out.println("The new second name is: " + names.get(1));
		
		// Remove the second element
		names.remove(1);
		System.out.println("The new size of the array list: " + names.size());

	}

}
