
public class DemoWithArrays {

	public static void main(String[] args) {
		
		try {
			Creature c1 = new Creature("angel", 100, 20);
			Monster m1 = new Monster("orc", 100, 30, "axe");
			Monster m2 = new Monster("werewolf", 80, 50, "claws");
			
			// put all three creatures in one array
			Creature[] ary = new Creature[3];
			ary[0] = c1;
			ary[1] = m1;
			ary[2] = m2;
			
			// print stats of those creatures
			for(int i=0; i<ary.length; i++) {
				System.out.println(ary[i].getName() + " " +
								ary[i].getHitPoints() + " " +
								ary[i].getAttackDamage());
			}
			
			// Put orc and werewolf to a monster team
			System.out.println("Creating a team of monsters...");
			MonsterTeam team1 = new MonsterTeam();
			team1.addMonster(m1);
			team1.addMonster(m2);
			team1.addMonster(m1);
			team1.addMonster(m1);
			team1.addMonster(m1);
			team1.addMonster(m1);
			team1.addMonster(m1);
			team1.addMonster(m1);
			team1.addMonster(m1);
			team1.addMonster(m1);
			team1.addMonster(m1);
			team1.printMonsterInfo();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
