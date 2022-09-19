package manjiri.assignments;
class ExamResult{

	void processResult(int score){
		
		if (score >= 0 && score<=49){
			System.out.println("Failed as obtained mark is "+score+" ,work harder");
		}
		else if(score >=50 && score <=100){
			System.out.println("Student could clear exam");
			
			if (score >= 90 && score <= 100){
				
				System.out.println("Grade is: A+, very good job!!");				
			}else if (score >= 80 && score <= 89){
				
				System.out.println("Grade is: A, good job!!");	
			}else if (score >= 70 && score <= 79){
				
				System.out.println("Grade is: B+, you are improving!!");	
			}else if (score >= 60 && score <= 69){
				
				System.out.println("Grade is: C+, keep reading!!");
			}else if (score >= 50 && score <= 59){
				
				System.out.println("Grade is: C, you can do better!!");
			}
		}else{
			System.out.println("Invalid Range");
		}
	}
	
	public static void main(String[] args){
		
		ExamResult examResult = new ExamResult();
		examResult.processResult(40);
		examResult.processResult(89);
		examResult.processResult(50);
		examResult.processResult(-1000);
		examResult.processResult(101);	
	}
}


