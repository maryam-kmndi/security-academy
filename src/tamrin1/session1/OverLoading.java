package tamrin1.session1;

public class OverLoading {
	
	//Overloading: 2 methods with same name but different parameters.
	//(different in type or number)
	
	public static void main(String[] args) {
		System.out.println( max(32,18) );
		System.out.println( max(90.9,21.0) );
	}
	
	public static int max(int num1, int num2) {
		int	result;
		
		if (num1>num2)
			result=num1;
		else
			result=num2;
		return result;
	}
	
	public static double max(double num1, double num2) {
		double	result;
		
		if (num1>num2)
			result=num1;
		else
			result=num2;
		return result;
	}
}
