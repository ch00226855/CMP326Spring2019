public class Person{
	
	protected String name; // protected fields are visible to Person and Employee
	protected int birthYear;
	protected double weight;
	protected char gender;

	public Person(String name, int birthYear, double weight, char gender){
		this.name = name;
		this.birthYear = birthYear;

		if (weight > 0.0){
			this.weight = weight;
		} else {
			this.weight = 0.0;
		}

		if (gender == 'f' || gender == 'm' || gender == 'u'){
			this.gender = gender;
		} else { // 'u' for unknown
			this.gender = 'u';
		}
	}

	public boolean isMale(){
		return (gender == 'm');
	}

	public void printDetails(){
		System.out.printf("Name: %20s | Year of Birth: %4d | Weight: %10.2f | Gender: %c\n", name, birthYear, weight, gender);
	}

}