
public class Monster extends Creature {
	
	private String weapon;
	
	// constructor:
	public Monster(String name, int hitPoints, int attackDamage,
					String weapon) {
		super(name, hitPoints, attackDamage);
		this.weapon = weapon;
	}
	
	// a new method:
	public void attack(Creature creature) {
		System.out.println(super.getName() + " attacks " +
							creature.getName() + " with its " + weapon);
		creature.setHitPoints(creature.getHitPoints() - super.getAttackDamage());
	}
	
	// override the toString method
	@Override
	public String toString() {
		String str = super.toString();
		str = str + String.format(" | Weapon: %10s", weapon);
		return str;
	}

}
