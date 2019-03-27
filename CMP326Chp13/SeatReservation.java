import java.util.ArrayList;

public class SeatReservation {

	public static void main(String[] args) {
		
		// Create an arraylist
		ArrayList<Seat> allSeats = new ArrayList<Seat>();
		
		// Add 5 seats
		allSeats.add(new Seat("", "", 0.0));
		allSeats.add(new Seat("", "", 0.0));
		allSeats.add(new Seat("", "", 0.0));
		allSeats.add(new Seat("", "", 0.0));
		allSeats.add(new Seat("", "", 0.0));
		
		// Print out the size of allSeats
		System.out.println("size: " + allSeats.size());
		
		// Suppose Adam Singer reserved seat index 3. Suppose he paid 5.99
		allSeats.get(3).setFirstName("Adam");
		allSeats.get(3).setLastName("Singer");
		allSeats.get(3).setAmountPaid(5.99);
		
		// Suppose Luis Rodriguez reserve seat index 1. Suppose he paid 6.99.
		allSeats.get(1).setFirstName("Luis");
		allSeats.get(1).setLastName("Rodriguez");
		allSeats.get(1).setAmountPaid(6.99);
		
		// Loop through allSeat and print out all the info
		Seat currentSeat;
		for(int i=0; i<allSeats.size(); i++) {
			currentSeat = allSeats.get(i);
			System.out.println(currentSeat.getFirstName() + " " +
						currentSeat.getLastName() + " " + 
						currentSeat.getAmountPaid());
		}

	}

}
