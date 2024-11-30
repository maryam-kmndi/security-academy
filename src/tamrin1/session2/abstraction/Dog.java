package tamrin1.session2.abstraction;

public class Dog extends Animal{
	//We have to implement abstract methods
	@Override
	public void animalSound() {
		System.out.println("The dog says: bark bark");
	}

}
