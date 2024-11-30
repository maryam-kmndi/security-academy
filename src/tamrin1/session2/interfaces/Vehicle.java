package tamrin1.session2.interfaces;

//All methods are abstract and can not be implemented but it is still worthy as a type
public interface Vehicle {
	// all are the abstract methods.
    void changeGear(int a);
    void speedUp(int a);
    void applyBrakes(int a);
    void printStates();
}

//	we can have default implementations in interfaces -> "default"
//	    default void sound() {
//			System.out.println("Wooof");
//		}
