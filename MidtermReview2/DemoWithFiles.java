import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class DemoWithFiles {

	public static void main(String[] args) {
		
		// Create a monster with information from MonsterInfo.txt
		FileInputStream file = null; //declaration is seperated from initailization
		Scanner scnr = null;
		
		try {
			file = new FileInputStream("MonsterInfo.txt");
			scnr = new Scanner(file);
			
			String monsterName = scnr.nextLine();
			int monsterHitPoints = scnr.nextInt();
			scnr.nextLine(); // waste the newLine character before the next integer
			int monsterAttackDamage = scnr.nextInt();
			scnr.nextLine(); // waste the newLine character
			String monsterWeapon = scnr.nextLine();
			
			Monster m1 = new Monster(monsterName, monsterHitPoints, monsterAttackDamage, monsterWeapon);
			
			System.out.println(m1.getName() + " " + m1.getHitPoints() + " " 
					 	+ m1.getAttackDamage());
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//close the scanner
			scnr.close();
			//close the file stream
			try {
				file.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
		// Write something to a file.
		FileOutputStream file2 = null;
		PrintWriter pw = null;
		try {
			Creature c1 = new Creature("elf", 60, 10);
			
			file2 = new FileOutputStream("CreatureInfo.txt");
			pw = new PrintWriter(file2);
			
			pw.println("Creature name: " + c1.getName());
			pw.println("Creature hit points: " + c1.getHitPoints());
			pw.println("Creature attack damage: " + c1.getAttackDamage());
			
			pw.flush();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pw.close();
			
			try {
				file2.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
	}

}
