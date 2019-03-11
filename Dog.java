
public class Dog extends Animal implements LivingCreature{
	
	private String dogSound;
	
	public Dog(String name, String dogSound) {
		super(name);
		this.dogSound = dogSound;
	}

	@Override
	public void speak() {
		
		System.out.println(dogSound);
	}

	@Override
	public void speak(int num) {
		for(int i=0; i<num; i++) {
			System.out.println(dogSound);
		}
		
		
	}


	
	
	

}
