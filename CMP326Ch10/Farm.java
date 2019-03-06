
public class Farm {
	
	private Animal[] animals;
	private String farmName;
	private int numAnimals;
	
	public Farm() {
		animals = new Animal[10];
		farmName = "";
		numAnimals = 0;
	}
	
	public Farm(String farmName) {
		animals = new Animal[10];
		this.farmName = farmName;
		numAnimals = 0;
	}
	
	public Farm(int maxAnimals) {
		if (maxAnimals < 0) {
			maxAnimals = 0;
		} 
		
		animals = new Animal[maxAnimals];
		farmName = "";
		numAnimals = 0;
	}
	
	public Farm(String farmName, int maxAnimals) {
		if (maxAnimals < 0) {
			maxAnimals = 0;
		}
		
		animals = new Animal[maxAnimals];
		this.farmName = farmName;
		numAnimals = 0;
	}
	
	private void resizeAnimalArray() {
		Animal[] newAnimals = new Animal[2 * this.animals.length];
		for(int i=0; i<this.numAnimals; i++) {
			newAnimals[i] = this.animals[i];
		}
		this.animals = newAnimals;
	}
	
	public void addAnimal(Animal a) {
		if (numAnimals == animals.length) {
			resizeAnimalArray();
		}
		animals[numAnimals] = a;
		numAnimals++;
	}
	
	public Animal getAnimal(int index){
//		if(Animal[index]= null) {
		if (index < 0 || index >= numAnimals) {
			return null;
		}else {
			return animals[index];
		}
	}
	
	public Animal getFirstAnimal() {
		if(numAnimals == 0) {
			return null;
		} else {
			return animals[0];
		}
	}
	
	public Animal getLastAnimal() {
		if(numAnimals == 0) {
			return null;
		}
		return animals[numAnimals - 1];
	}
	
	public Animal removeAnimal(int index) {
		if (index < 0 || index >= numAnimals) {
			return null;
		}
		
		Animal removedAnimal = animals[index];
		
		for(int i=index; i<=numAnimals-2; i++) {
			animals[i] = animals[i+1];
		}
		numAnimals--;
		
		
		return removedAnimal;
		
	}
	
	public void removeAllAnimals() {
		for(int i =0; i < this.numAnimals; i++) {
			animals[i] = null;
		}
		numAnimals = 0;
	}
	

	public String getFarmName() {
		return farmName;
	}

	public void setFarmName(String farmName) {
		this.farmName = farmName;
	}

	public Animal[] getAnimals() {
		return animals;
	}

	public int getNumAnimals() {
		return numAnimals;
	}

}










