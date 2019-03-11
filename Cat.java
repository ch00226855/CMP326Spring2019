
public class Cat extends Animal implements LivingCreature{
	
	private String catSound;
	
	public Cat(String name, String catSound) {
		super(name);
		this.catSound = catSound;
	}

	@Override
	public void speak() {
		
		System.out.println(catSound);
	}

	@Override
	public void speak(int num) {
		
		for(int i=0; i<num; i++) {
			System.out.println(catSound);
		}
	}
	
	

}
