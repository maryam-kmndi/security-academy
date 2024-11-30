package tamrin1.session2.abstraction;

public class Main {

	public static void main(String[] args) {
//		Animal a = new Animal();	//we can not new Abstract classes (can not instantiate)
		Dog d = new Dog();
		Pig p = new Pig();
		d.sleep();	//It goes to Animal class bc implemented there
		d.animalSound();	//It goes to Dog class bc implemented there
		p.sleep();
		p.animalSound();
		

	}

}
