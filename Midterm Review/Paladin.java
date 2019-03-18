
public class Paladin extends Adventurer implements Healable{
	
	public Paladin(String name, int hitPoints, int attackDamage) {
		super(name, hitPoints, attackDamage);
	}
	
	@Override
	public void specialAttack(Creature creature) {
		System.out.println("Paladin " + super.getName() + " casts spell Retribution " + 
						"towards " + creature.getName());
		creature.setHitPoints(creature.getHitPoints() - super.getAttackDamage() - 20);
	}
	
	@Override
	public void heal() {// a paladin heals 50 points each time
		System.out.println("Paladin " + super.getName() + " heals for 50 points.");
		super.setHitPoints(super.getHitPoints() + 50);
	}

}
