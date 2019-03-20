
public class MonsterTeam {
	
	private Monster[] monsters;
	private int numMonsters;
	
	// In the constructor, create an empty array of length 10
	public MonsterTeam() {
		monsters = new Monster[10];
		numMonsters = 0;
	}
	
	public void addMonster(Monster mon) {
		if(numMonsters == monsters.length) {
			System.out.println("This team is already full!");
			return;
		}
		monsters[numMonsters] = mon;
		numMonsters++;
	}
	
	public void printMonsterInfo() {
		for(int i=0; i<numMonsters; i++) {
			System.out.println(monsters[i].getName() + " " +
						monsters[i].getHitPoints() + " " + 
						monsters[i].getAttackDamage());
		}
	}

}
