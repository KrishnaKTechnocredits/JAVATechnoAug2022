package priyankaD;

class StudentMarks
{

 void processResult(int marks){
     if (marks>0 && marks<49)
	 System.out.println("Your marks are"  +marks+  ". You are Failed.");
	 
	 else if (marks>=50 && marks<=100)
	 System.out.println("Your marks are"  +marks+  ". You are Passed.");
	 
	 { if(marks>90 && marks<=100)
		System.out.println(" ---Your grade is A+ ");
		
		else if(marks>80 && marks<=90)
		System.out.println(" ---Your grade is A ");
		
		else if(marks>70 && marks<=80)
		System.out.println(" ---Your grade is B+ ");
		
		else if (marks>60 && marks<=70)
		System.out.println(" ---Your grade is B ");
		
		else if (marks>=50 && marks<=60)
		System.out.println(" ---Your grade is C ");
	 }	
	}
	public static void main(String[]args)
	 {
	 StudentMarks studentMarks1=new StudentMarks();
	 studentMarks1.processResult(40);
	 studentMarks1.processResult(50);
	 studentMarks1.processResult(74);
	 studentMarks1.processResult(91);
	 studentMarks1.processResult(87);
	 studentMarks1.processResult(63);
	 studentMarks1.processResult(36);
	 studentMarks1.processResult(72);
	 studentMarks1.processResult(28);
	 studentMarks1.processResult(95);
	 
	 }
}