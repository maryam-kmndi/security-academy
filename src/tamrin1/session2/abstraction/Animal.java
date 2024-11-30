package tamrin1.session2.abstraction;

//Abstract classes have some methods which has not body or implementation logic.
public abstract class Animal {
	
	public void sleep() {
		System.out.println("Zzz");
	}
	//Abstract methods should be specify using "abstract" keyword
	public abstract void animalSound();
}
