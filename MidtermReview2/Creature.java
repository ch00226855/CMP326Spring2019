public class Creature {
	
	// add a unique ID to each creature
	private static int counter = 0; // every time we create a new creature, increment counter,
									// and use counter as the ID of the creature.
	private int creatureID;
	
	private String name;
	private int hitPoints;
	private int attackDamage;
	
	private void generateID() {
		counter++;
		creatureID = counter;
	}
	
	public Creature(String name) {
		this.name = name;
		hitPoints = 100;
		attackDamage = 20;
//		counter++;
//		creatureID = counter;
		generateID();
	}
	
	// an overloaded constructor with String name, int hitPoints, 
	// int attackDamage
	public Creature (String name, int hitPoints, int attackDamage)
			throws Exception {
		this.name=name;
		
		// A clumsy way of exception handling
		if(hitPoints < 0) {
			System.out.println("Cannot use negative hitPoints -"
					+ "Assigning default value...");
		} else {
			this.hitPoints=hitPoints;
		}
		
		// Proper exception handling
		if(attackDamage < 0) {
			throw new Exception("Negative attack damage occured");
		} else {
			this.attackDamage=attackDamage;
		}
		// add an ID to the creature:
//		counter++;
//		creatureID = counter;
		generateID();
	}
	
	public static int getCounter() {
		return counter;
	}

	public static void setCounter(int counter) {
		Creature.counter = counter;
	}

	public int getCreatureID() {
		return creatureID;
	}

	public void setCreatureID(int creatureID) {
		this.creatureID = creatureID;
	}

	// getters
	public String getName() {
		return this.name;
	}

	public int getHitPoints() {
		return hitPoints;
	}

	public int getAttackDamage() {
		return attackDamage;
	}
	
	//setters
	public void setName(String name) {
		this.name = name;
	}

	public void setHitPoints(int hitPoints) {
		this.hitPoints = hitPoints;
	}

	public void setAttackDamage(int attackDamage) {
		this.attackDamage = attackDamage;
	}
	
	// override toString() class
	@Override
	public String toString() {
//		return name + hitPoints + attackDamage;
		// add a nice format to the string
		// "Name: (name) | Hit Points: (hitPoints) | Attack Damage: (attackDamage)"
		return String.format("Name: %10s | Hit Points: %4d | Attack Damage: %3d", name, 
				hitPoints, attackDamage);
	}
	
	// override equals method: two creatures are equal if they have the same attributes
	@Override
	public boolean equals(Object obj) {
		boolean answer = false;
		if (obj instanceof Creature) {// check if the input object is from the same class
			Creature objCreature = (Creature) obj; // change the obj to a creature
			
			// check if the attributes are the same
			if(this.name.equals(objCreature.getName())) {
				if(this.hitPoints == objCreature.getHitPoints()) {
					if(this.attackDamage == objCreature.getAttackDamage()) {
						answer = true;
					}
				}
			}
		}
		return answer;
	}
}