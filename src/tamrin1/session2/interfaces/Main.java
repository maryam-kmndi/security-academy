package tamrin1.session2.interfaces;

//Motorcycle & Bicycle are to different implementation of one class which is called "Polymorphism"
public class Main {
	
	public static void main(String[] args) {
		Motorcycle m = new Motorcycle();
		 m.changeGear(3);
		 m.speedUp(40);
	     m.applyBrakes(5);
	     m.printStates();
	     
	    Bicycle b = new Bicycle();
	     b.changeGear(1);
		 b.speedUp(4);
	     b.applyBrakes(2);
	     b.printStates();
	
	     //Dynamic Binding:
	        //During compilation, the compiler has no idea as to which print has to be called since the compiler 
	        //goes only by referencing variable not by the type of object, and therefore the binding would be 
	        //delayed to runtime
	     Vehicle v = new Bicycle();
	     v.changeGear(2);
	     v.speedUp(2);
	     v.applyBrakes(1);
	     v.printStates();
	     
	     if (v instanceof Bicycle) {
			System.out.println("v is bicycle");
		}else {
			System.out.println("v is not bicycle");
		}
	     
	     
	}

}
