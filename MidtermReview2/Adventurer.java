public abstract class Adventurer{
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHitPoints() {
		return hitPoints;
	}

	public void setHitPoints(int hitPoints) {
		this.hitPoints = hitPoints;
	}

	public int getAttackDamage() {
		return attackDamage;
	}

	public void setAttackDamage(int attackDamage) {
		this.attackDamage = attackDamage;
	}

	private String name;
	private int hitPoints;
	private int attackDamage;
	
	public Adventurer(String name, int hitPoints, int attackDamage) {
		this.name = name;
		this.hitPoints = hitPoints;
		this.attackDamage = attackDamage;
	}
	
	public abstract void specialAttack(Creature creature);

}