package tamrin1.session3.function;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaFunctions {

	public static void main(String[] args) {
		
		//Function types
		
			//1.function, call with "apply"
		
				//To define function
				Function<String, String> upper1 = new Function<String, String>() {
					
					@Override
					public String apply(String t) {
						return t.toUpperCase();
					}
				};
				
				//To call
				String t1 = upper1.apply("abc");
				
				//To define using syntactic sugar
				Function<String, String> upper2 = t -> {return t.toUpperCase();};
				Function<String, String> upper3 = t -> t.toUpperCase();
				Function<String, String> upper4 = String :: toUpperCase;	//method reference
				
				String t2 = upper2.apply("abc");
				String t3 = upper3.apply("abc");
				String t4 = upper4.apply("abc");
		
			//2.consumer: take a parameter, no output, call with "accept"
				Consumer<String> print = t -> System.out.println(t);
				print.accept("abc");
				
			//3.BiFunctoin: take 2 parameters return one, call with "apply"
				BiFunction<String, String, String> concat = (t, u) -> t + " " + u;
				String t5 = concat.apply("hello", "world");
	
			//4.Predicate: take a parameter and return T/F, , call with "test"
				Predicate<String> hasSign = t -> t.contains("@");
				Boolean t6 = hasSign.test("mary&gmail.com");
				
	}

}
