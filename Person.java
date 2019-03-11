
public class Person implements LivingCreature{
	
	public void speak() {
		System.out.println("Blah");
	}
	
	public void speak(int num) {
		for(int i=0; i<num; i++) {
			System.out.println("Blah");
		}
	}

}
