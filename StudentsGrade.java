package ir.isc.exercise;

public class StudentsGrade {
	static int score[] = {100, 90, 75, 80, 100, 60, 53, 15};
	
	public static void main(String[] args) {
		
		//find best score
		 int bestScore = score[0]; 
	        for (int i = 1; i < score.length; i++) 
	            if (score[i] > bestScore) 
	            	bestScore = score[i];
	        System.out.println("best score is: "+bestScore);
	    //assign grade
	     for (int i = 0; i < score.length; i++) {
	    	 String grade = switch (score[i]/10) {
	    		case 10,9 -> "A";
	    		case 8 -> "B";
	    		case 7 -> "C";
	    		case 6 -> "D";
	    		default -> "F";
	    		};
	    		System.out.println("Student " + i + " score is " + score[i] + " and grade is " + grade);
	     }
	
	}
	
}
