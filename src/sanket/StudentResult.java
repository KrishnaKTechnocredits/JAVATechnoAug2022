package sanket;

class StudentResult{
	
	void processResult(int mark){
		
		if(mark>=0 && mark<=49)
			System.out.println("Failed as obtain marks is "+mark+", work harder.");
		else if(mark>=50 && mark<=100)
		{
			System.out.println("Student score is "+mark+" and Student cleared exam.");
			if(mark>=90 && mark<=100)
					System.out.println("Student grade is A+, very good job.");
			else if(mark>=80 && mark<=89)
					System.out.println("Student grade is A, good job.");		
			else if(mark>=70 && mark<=79)
					System.out.println("Student grade is B+, you are improving.");		
			else if(mark>=60 && mark<=69)
					System.out.println(" Student grade is C+, keep reading.");
							
			else if(mark>=50 && mark<=59)
					System.out.println("Student grade is C, you can do better.");
		}				
			else
				System.out.println("Invalid Score.");
	}
	
	public static void main(String[] args){
		StudentResult studentResult1 = new StudentResult();
		studentResult1.processResult(34);
		studentResult1.processResult(99);
		studentResult1.processResult(101);
		studentResult1.processResult(-3);
		studentResult1.processResult(75);
	}	
}
