public class Employee extends Person {
	
	// create a counter to generate employee ID
	private static int counter=0;

	private String position;
	private double annualSalary;
	private boolean isOnVacation;
	
	private int employeeID;

	public Employee(String name, int birthYear, double weight, char gender,
					String position, double annualSalary, boolean isOnVacation){
		super(name, birthYear, weight, gender);
		this.position = position;
		this.annualSalary = annualSalary;
		this.isOnVacation = isOnVacation;
		
		employeeID = counter;
		counter++;
	}
	
	public int getID() {
		return employeeID;
	}


	public double getWeeklySalary(){
		return annualSalary / 52.0;
	}

	public boolean getIsOnVacation(){
		return isOnVacation;
	}

	public void setIsOnVacation(boolean isOnVacation){
		this.isOnVacation = isOnVacation;
	}
	
	@Override
	public void printDetails() {
		super.printDetails();  // use the printDetails() from Person class
		System.out.printf("    Position: %20s | Annual Salary: %10.2f | On Vacation? %b\n", 
				position, annualSalary, isOnVacation);
	}
	
	public void printDetailsInOneLine() {
		System.out.println(name + birthYear + weight + gender + position + annualSalary + isOnVacation);
	}
	
	// Implement an equals() method
	public boolean equals(Employee otherEmployee) {
		if (this.name.equals(otherEmployee.name) &&
				this.gender == otherEmployee.gender &&
				(this.weight - otherEmployee.weight) < 0.0001 &&
				this.birthYear == otherEmployee.birthYear &&
				this.position.equals(otherEmployee.position) &&
				(this.annualSalary - otherEmployee.annualSalary) < 0.0001 &&
				this.isOnVacation == otherEmployee.isOnVacation) {
			return true;
		} else {
			return false;
		}
	}
	
	// Implement our own toString method
	@Override
	public String toString() {
		return "I am " + name + ", and I am a " + position + ".";
	}




}