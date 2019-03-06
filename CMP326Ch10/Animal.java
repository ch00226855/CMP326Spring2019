
public class Animal {
	
	private String name;
	private int birthYear;
	private double weight;
	private char gender;
	
	public Animal() {
		this.name = "";
		this.birthYear = 1900;
		this.weight = 0.0;
		this.gender = 'u';
	}
	
	public Animal(String name, int birthYear, double weight, char gender) {
		this.name = name;
		this.birthYear = birthYear;
		if (weight >= 0.0) { // the weight value is valid
			this.weight = weight;
		} else { // invalid weight value
			this.weight = -1.0;
		}
		if (gender == 'f' || gender == 'u' || gender == 'm') {
			this.gender = gender;
		} else {
			this.gender = 'u';
		}
	}
	
	public int calculateAge( int currentYear) {
	
		if (currentYear< birthYear) {
			return -1; 
		}
		else {
			return currentYear- birthYear;
		}
	}
	
	public boolean isMale() {
//		if(gender == 'm') {
//			return true;
//		}else {
//			return false;
//		}
		return (gender == 'm');
	}
	
	public boolean isFemale() {
		return gender == 'f';
	}
	
	// formatted string: "Name: %20s | Year of Birth: %4d | Weight: %10.2f | Gender: %c\n"
	public void printDetails() {
		System.out.printf("Name: %20s | Year of Birth: %4d | Weight: %10.2f | Gender: %c\n", 
				name, birthYear, weight, gender);
	}
	
	public void gainWeight() {
		this.weight++;
	}
	
	
	public void gainWeight(double weight) {
		
		if ( this.weight + weight < 0) {
			this.weight = 0.0;
		} else {
			this.weight = this.weight + weight;	
		}
	}
	
	public void loseWeight() {
		if (this.weight - 1.0 < 0) {
			this.weight = 0.0;
		} else {
			this.weight -= 1.0;
		}
	}
	
	public void loseWeight(double weight) {
		if(this.weight -weight <0) {
			this.weight=0.0;
		} else {
			this.weight -= weight;
		}
	}
	
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		if (weight < 0.0) {
			this.weight = -1.0;
		} else {
			this.weight = weight;
		}
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		if (gender == 'f' || gender == 'm' || gender == 'u') {
			this.gender = gender;
		} else {
			this.gender = 'u';
		}
	}
	
	

}
