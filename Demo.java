
public class Demo {

	public static void main(String[] args) {

		Person jack = new Person();
//		jack.speak();
//		jack.speak(5);
		
		Animal cat = new Animal("Cat");
		// cat.speak(); // cannot ask an animal to speak.
		
		// One cannot create an object from an interface
		// LivingCreature something = new LivingCreature();
		
		Dog chihuahua = new Dog("Chihuahua", "Bark");
//		chihuahua.speak(5);
		
		Cat leopard = new Cat("Leopard", "Roar");
//		leopard.speak(3);
		
		LivingCreature[] speakers = new LivingCreature[3];
		speakers[0] = chihuahua;
		speakers[1] = leopard;
		speakers[2] = jack;
		
		for(int i=0; i<speakers.length; i++) {
			speakers[i].speak();
		}
		
	}

}
