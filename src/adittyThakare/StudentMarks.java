package adittyThakare;

class StudentMarks{
	
	void processResult(int score){
		if(score>=0 && score<=49){
			System.out.println("Failed, as obtained marks are "+score+", work harder");
		}
		else if(score>=50 && score<=100){
			System.out.println("Student could clear exam.");
			if(score>=90 && score<=100)
				System.out.println("A+, very good job.");
			else if(score>=80 && score<=89)	
				System.out.println("A, good job.");
			else if(score>=70 && score<=79)	
				System.out.println("B+, you are improving.");
			else if(score>=60 && score<=69)	
				System.out.println("C+, keep reading.");	
			else if(score>=50 && score<=59)	
				System.out.println("C, you can do better.");	
		}
		else
			System.out.println("Invalid!!");
	}
	
	public static void main(String[] args){
		
		StudentMarks studentmarks = new StudentMarks();
		studentmarks.processResult(85);
		System.out.println("");
		studentmarks.processResult(66);
		System.out.println("");
		studentmarks.processResult(48);
		System.out.println("");
		studentmarks.processResult(120);
	}
}	
		
		
		