
public class CompanyDemo {

	public static void main(String[] args) {
		
		// To create a company, we need a boss, and an array of employees
		
		Person boss = new Person("Mark", 1985, 160.0, 'm');
		boss.printDetails();
		
		Employee alice = new Employee("Alice", 1990, 130.0, 'f', "Manager", 150000.0, false);
//		alice.printDetails();
//		alice.printDetailsInOneLine();
		System.out.println(alice.getID());

		Employee bob = new Employee("Bob", 1995, 150.0, 'm', "Programmer", 100000.0, true);
//		bob.printDetails();
//		bob.printDetailsInOneLine();
		System.out.println(bob.getID());
		
		Employee clare = new Employee("Clare", 1991, 140.0, 'f', "HR", 100000.0, false);
//		clare.printDetails();
//		clare.printDetailsInOneLine();
		System.out.println(clare.getID());
		
		// alice2 is the same person as alice
		Employee alice2 = new Employee("Alice", 1990, 130.0, 'f', "Manager", 150000.0, false);
		System.out.println("Compare alice with alice2:");
		System.out.println(alice.equals(alice2));
		// Construct the company
		Employee[] employees = {alice, bob, clare}; 
		
		Company facebook = new Company("Facebook", boss, employees, 1000.0);
//		facebook.printDetails();
		
		// Simulate the operations
//		facebook.operateForAWeek(100000.0);
//		
//		facebook.operateForAWeek(-80000.0);
//		
//		bob.setIsOnVacation(false);  // Bob came back from vacation
//		clare.setIsOnVacation(true);  // Clare went on vacation
//		
//		facebook.operateForAWeek(0.0);
//		
//		facebook.operateForAWeek(0.0);
//		
//		facebook.operateForAWeek(-10000.0);
		
		System.out.println("Convert alice to a String:");
		System.out.println(alice.toString());
		System.out.println(alice);
		System.out.println(bob);
		System.out.println(clare);
	}

}
