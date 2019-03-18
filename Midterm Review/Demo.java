
public class Demo {

	public static void main(String[] args) {
		
		Creature c1 = new Creature("orc");
		
		Creature c2 = new Creature("goblin", 70, 30);
		
		System.out.println(c1.getName() + " " + c1.getHitPoints() + " " +
							c1.getAttackDamage());
		System.out.println(c2.getName() + " " + c2.getHitPoints() + " " +
							c2.getAttackDamage());
		
		c1.setName("angry orc");
		c1.setAttackDamage(40);
		System.out.println(c1.getName() + " " + c1.getHitPoints() + " " +
				c1.getAttackDamage());		
		
		System.out.println("using overriden toString() method...");
		System.out.println(c1.toString());
		System.out.println(c2); // java will automatically invode toString()

		Creature c3 = new Creature("goblin", 70, 30);
		System.out.println("Check if c2 equals to c2: " + c2.equals(c3));
		
		System.out.println("Show the creature IDs...");
		System.out.println(c1.getCreatureID()); // this ID should be 1
		System.out.println(c2.getCreatureID()); // this ID should be 2
		System.out.println(c3.getCreatureID()); // this ID should be 3
		
		System.out.println("Create a monster and ask it to attack the goblin...");
		Monster m1 = new Monster("Demon", 200, 15, "Giant Axe");
		m1.attack(c2);
		System.out.println("Now goblin has HP: " + c2.getHitPoints());
		
		System.out.println("Invocation of toString() on monster...");
		System.out.println(m1);
		
		System.out.println("We cannot instantiate from the abstract" +
							"Adventurer class...");
//		Adventurer a1 = new Adventurer("John", 100, 20);
		
		Mage mage1 = new Mage("Harry", 50, 40);
		mage1.specialAttack(m1);
		System.out.println("Now demon has HP: " + m1.getHitPoints());
		
		System.out.println("Let a paladin hit a demon to death...");
		Paladin pal1 = new Paladin("LightBringer", 200, 30);
		while(m1.getHitPoints() > 0 ) {
			pal1.specialAttack(m1);
			System.out.println(m1);
		}
		
	}
	
	
	
	
	
	
	
	
	

}
