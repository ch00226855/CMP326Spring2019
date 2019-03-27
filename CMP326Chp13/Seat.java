
public class Seat {
	
	private String firstName;
	private String lastName;
	private double amountPaid;
	
	public Seat(String firstName, String lastName, double amountPaid) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.amountPaid = amountPaid;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getAmountPaid() {
		return amountPaid;
	}

	public void setAmountPaid(double amountPaid) {
		this.amountPaid = amountPaid;
	}
	
	

}
