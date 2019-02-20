public class Employee extends Person {

	private String position;
	private double annualSalary;
	private boolean isOnVacation;

	public Employee(String name, int birthYear, double weight, char gender,
					String position, double annualSalary, boolean isOnVacation){
		super(name, birthYear, weight, gender);
		this.position = position;
		this.annualSalary = annualSalary;
		this.isOnVacation = isOnVacation;
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




}