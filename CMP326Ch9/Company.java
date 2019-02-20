public class Company {

	private String companyName;
	private Person boss;
	private Employee[] employees;
	private double companyAccount;

	public Company(String companyName, Person boss, Employee[] employees, double companyAccount){
		this.companyName = companyName;
		this.boss = boss;
		this.employees = employees;
		this.companyAccount = companyAccount;
	}

	public void operateForAWeek(double revenue){
		// add revenue to company account
		companyAccount += revenue;
		// substract employee salaries from company account
		for (int i=0; i<employees.length; i++){
			if (!employees[i].getIsOnVacation()){
				companyAccount -= employees[i].getWeeklySalary();	
			}
		}
		// assert if company is financially healthy
		if (companyAccount < 0.0){
			System.out.println(companyName + " is broke.");
		} else if (companyAccount < 10000.0){
			System.out.println("There are less than $10000.0 in company account. Do something!");
		} else {
			System.out.println(companyName + " is in good shape. Money in account: " + companyAccount);
		}
	}

	public void printDetails(){
		System.out.printf("Company: %17s | Account: %10.2f\n", companyName, companyAccount);
		boss.printDetails();
		for (int i=0; i<employees.length; i++){
			employees[i].printDetails();
		}
	}

}