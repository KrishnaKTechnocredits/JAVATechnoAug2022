package sohail.if_else_program;

class StudentGrade{
	void processResult(int marks){
		if (marks>=50 && marks<=100){
		System.out.println("Student cleared Exam");
		}
			if (marks>=50 && marks<=59){
			System.out.println("You can do better");
			}
				else if (marks>=60 && marks<=69){
					System.out.println("Keep Reading");	
				}
				else if (marks>=70 && marks<=79){
					System.out.println("You are Improving");
				}				
				else if (marks>=80 && marks<=89){
					System.out.println("Good Job");
				}
				else if (marks>=90 && marks<=100){
					System.out.println("Very good Job");
				}
				else if (marks<=49) {
			        System.out.println("Failed as obtained mark is "+marks+", work harder");
				}
		else{
		System.out.println("Invalid");
		}		
	}	
	public static void main(String [] args){
		StudentGrade studentgrade=new StudentGrade();
		studentgrade.processResult(66);
}
}