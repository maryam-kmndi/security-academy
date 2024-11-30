package tamrin1.session2.generic;

public class GenericBoxMain {

	public static void main(String[] args) {
		// Creating a Box for Integer
		//primitive types are not Object -> use "Integer" object which is java.lang class
        GenericBox<Integer> integerBox = new GenericBox<>(123);
        System.out.println("Integer Box contains: " + integerBox.getItem());

        // Creating a Box for String
        GenericBox<String> stringBox = new GenericBox<>("Hello Generics");
        System.out.println("String Box contains: " + stringBox.getItem());

        // Creating a Box for Double
        GenericBox<Double> doubleBox = new GenericBox<>(45.67);
        System.out.println("Double Box contains: " + doubleBox.getItem());

        // Changing the item in the string box
        stringBox.setItem("Updated String");
        System.out.println("Updated String Box contains: " + stringBox.getItem());
        
	}

}

//	we could limit types
//	public static <T extends Shape> int calculateArea(T shapes) {...} 
//	it just accept classes which extends of Shape (interface or abstract class)


