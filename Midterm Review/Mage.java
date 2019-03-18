
public class Mage extends Adventurer implements Healable {
	
	public Mage(String name, int hitPoints, int attackDamage) {
		super(name, hitPoints, attackDamage);
	}

	@Override
	public void specialAttack(Creature creature) {
		
		System.out.println("Mage " + super.getName() + " casts a fire ball towards "
				+ creature.getName());
		creature.setHitPoints(creature.getHitPoints() - super.getAttackDamage() * 2);
		
	}
	
	@Override
	public void heal() {// a mage can heal 10 points each time
		super.setHitPoints(super.getHitPoints() + 10);
		System.out.println(super.getName() + " gets healed for 10 points.");
	}
	
	

}
