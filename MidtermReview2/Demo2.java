
public class Demo2 {

	public static void main(String[] args) {
		
		try {
		Creature c1 = new Creature("angel", 100, 15);
		
		Creature c2 = new Creature("demon", 80, 20);
		
//		Creature c3 = new Creature("strange animal", -20, -10);
//		
//		System.out.println("c3 stats: " + c3.getHitPoints() + 
//				 " " + c3.getAttackDamage());
		
		} catch (Exception e) {
			System.out.println("Oops!");
			System.out.println(e.getMessage());// print error message
			e.printStackTrace(); // print the location where error occurs
		} finally { // will be executed in both normal case and exceptional case
			System.out.println("Creatures created.");
		}
		
		try {
			Monster m1 = new Monster("orc", 100, 30, "axe");
			Monster m2 = new Monster("werewolf", 80, 80, "claws");
			
			m1.attack(m2);
			System.out.println("HP: " + m1.getHitPoints() + " vs. "
							+ m2.getHitPoints());
			m2.attack(m1);
			System.out.println("HP: " + m1.getHitPoints() + " vs. "
					+ m2.getHitPoints());	
			m1.attack(m2);
			System.out.println("HP: " + m1.getHitPoints() + " vs. "
					+ m2.getHitPoints());
			m2.attack(m1);
			System.out.println("HP: " + m1.getHitPoints() + " vs. "
					+ m2.getHitPoints());
//			m1.attack(m2); // the orc should not be able to attack
			m2.attack(m1); // the orc cannot take any more hit
		} catch (MonsterAlreadyDeadException e) {
			System.out.println("This exception happens when"
					+ " a dead monster is trying to attack another monster"
					);
		} catch (AttackingDeadMonsterException e) {
			System.out.println("Exception occurs when a dead monster is"
					+ " being attcked");
		}
		
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		System.out.println("THE END");


	}

}
