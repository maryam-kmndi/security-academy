package tamrin1.session1;

import java.util.Arrays;

public class Basic {

	public static void main(String[] args) {
		
		//print
		System.out.print("Hello");	//do not insert new line 
		System.out.println(" World!");	//insert new line
		System.out.println(3+3);	//math operation
		System.out.println("Maryam " + "Kmndi");	//Concatenation
		
		//primitive types
			//Integer
			byte b = 127; //1Byte (-128,127)
			short s = 3452;	//2Byte (-32_768,32_767)
			int intNum = 12000000; //4Byte (9digit)
			long l = 17000l; //8Byte (18digit)
						
			//Floating point
			float f = 12.4f;	//4Byte(6,7digit after.)
			double d = 12.43445d;	//8Byte(15digit after.)
			float sicentificNumber = 35e3f;	//e equals poser of 10 -> 35000.0
			
			boolean bool = true;	//1bit (T/F)
			
			char ch = 'a';	//2Byte
			char chEng = '\u0054';	//T(uniCode)
			char chFars = '\u0633';	//س
			char chSymb = '\u260E';	//phone icon

			int a, c; //multi initilization
			a = 5;	//assignment
		
		//Type casting
			//widening
			int m = 5;
			double n = m; //cast to larger type automatically
			//Narrowing
			double p = 12.34d;
			int q = (int) p; //cast to smaller type manually
			
		//Operators
			int a1=10, b1=12, c1=8, d1=1;
	    	double myVal = (a1 + (b1 - d1))-((c1 * d1) / b1);
	    	int remained = 3420  % 10;
	    	
	    //operators And Assignment
	    	int count = 2340;
	    	count /= 10; //Same as: count=count/10
	    	
	    //Increment & Decrement
	    	int x = 3;
	    	int y = x++; // y = 3, x = 4
	    	int z = ++y; // z = 4, y = 4
	    	
	    //Comparison operators
	    	boolean comp1 = 100 >= 10;
	    	boolean com2 = 300 == 34;
	    	boolean com3 = 30 != 40;
	    	
	    //Boolean operators
	    	boolean a2 = true;
	    	boolean b2 = false;
	    	boolean c2 = false;    	
	    	boolean d2 = (a2 && b2) || !c2;
	    	int x2 = 5;	//0101
	    	x2 ^= 3;	//3 = 0011 -> 0101 ^ 0011 = 0110 = 6
	    	
	    //Shift
	    	int shiftN = 5;	//0000 0101
	    	int rightShift = shiftN >> 3; //0000 0010 -> 0000 0001 -> 0000 0000 = 0 (>> equals to /2)
	    	int leftShift = shiftN << 3; //0000 1010 -> 0001 0100 -> 0010 1000 = 40 (<< equals to *2)
	    	
	    //String (sequence of chars in between ""
	    	String name = "Mary";
	    	int namelength = name.length();
	    	name = name.toUpperCase();
	    	name = name.toLowerCase();
	    	int founded = name.indexOf("r");
	    	String fName = "Km";
	    	String fullName1 = name + fName;
	    	String fullName2 = name.concat(fName);
	    	
	    // +
	    	int num1 = 2, num2 = 5;
	    	int res = num1 + num2;	//Add numbers
	    	
	    	String one = "one", two = " two";
	    	String res2 = one + two;	//concat strings 
	    	
	    	int num3 = 3;
	    	String three = "three";
	    	System.out.println(num3 + three);	//concat
	    	
	    //Escape sequences
	    	System.out.println("\nEscape sequences");	//new line
	        System.out.println( "Hello\tWorld!"); //tab
	        System.out.println( "Hello \" World!"); //special chars
	        System.out.println( "Hello \\ World!"); //special chars
	        
	    //Math
	       int max = Math.max(120, 30);
	       int min = Math.min(120, 30);
	       double radical = Math.sqrt(81);
	       int rand = (int) Math.random();	//random number 0 to 1 (converted to int)
	       int rand2 = (int) (Math.random()*101);	//random number 0 to 100 (converted to int)
	       double power = Math.pow(2, 6);
	      
	    //If 
	       	int number = 12;
	        if (number % 2 == 0 && number % 3 == 0) {
	            System.out.println(number + " is divisible by 2 AND 3");
	        }else if (number % 3 == 0) {
	            System.out.println(number + " is just divisible by 3");
			}else if (number % 2 == 0) {
	            System.out.println(number + " is just divisible by 2");
			}else {
	        	System.out.println(number + " can not be divisible by 2 AND 3");
	        }
	        
	        System.out.println((number % 2 == 0) ? "Even" : "Odd");	//Ternary operator
	
	    //Switch
	        String theName = "Mary";
			switch (theName) {
			case "Alireza", "Roham":
				System.out.println("Welcome Men");
				break;
			case "Arefeh":
				System.out.println("Welcome Women");
				break;
			default:
				System.out.println("Who are you ?!");
				break;
			}	
			
			switch (theName) {
			case "Alireza", "Roham" -> System.out.println("Welcome Men");
			case "Arefeh" -> System.out.println("Welcome Women");
			default -> System.out.println("Who are you ?!");
			}	//Switch with arrow and no brakes
	
			String testNumber = switch (6) {
			case 1, 3, 5:
				yield "Odd number";
			case 2, 4, 6:
				yield "Even number";
			default:
				yield "Do not support";
			};
			System.out.println(testNumber);	//Using switch for initialing
	
			
		//For
			for (int i = 0; i < 3; i++){	 
			  System.out.println("Welcome to Java!"); 
			}	//Simple for-loop
			
			for (int i = 0; i < 10; i++) {
				if (i == 4) {
					break;
				}
				System.out.println(i);
			}	//jump out of loop
				
			System.out.println("******************");
				
			for (int i = 0; i < 10; i++) {
				if (i == 4) {
					continue;
				}
				System.out.println(i);
			}	//jump to next iteration
			
			
		//While
			int count1 = 0;
			while (count1 <= 2){
				  System.out.println("Welcome to Java! for " + count1);
				  count1++;
				}
			
			do {
				System.out.println("Hi");
			} while (count1 < 0);	//at least run once
		
			
		//Array
			int[] list1 = {1, 2, 3, 5, 7};
			String[] list2 = {"Ali", "Reza", "Amir"};
			
			for (int i = 0; i < list1.length; i++) {
				System.out.println("At index: " + i + ", The list item is: " + list1[i]);
			}	//To read an array with it's index
			
			for (String string : list2) {
				System.out.print(string +"\t");
			}	//To read an array (without index)
			
			System.out.print("\nUsing Array to String\t");
			System.out.println(Arrays.toString(list1));	//To read an array
			
		//Invoke method
			int maximum = maximum(5,8);
	}
		//Method (access-modifier	return-value-type	method-name (param1,param2 ,...) )
			public static int maximum (int n1, int n2) {
				int result;
				if (n1 >= n2) {
					result = n1;
				} else {
					result = n2;
				}
				return result;
			}	
			//if method does not "return" any thing set it to "void"
			
}



