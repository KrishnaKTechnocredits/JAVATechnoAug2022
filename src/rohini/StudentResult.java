package rohini;
//Assignment 5
class StudentResult{
	
	void processResult(int score){
		if(score >=0 && score <=49){
			System.out.println("Failed, as Marks obtained are: "+score+", Work Harder");
		}
		else if(score >=50 && score <=100){
			System.out.println("\n"+score+" Student could clear exam");
			if(score >=90 && score <=100){
				System.out.println("A+, very good job");
			}
			else if(score >=80 && score <=89){
				System.out.println("A, good job");
			}
			else if(score >=70 && score <=79){
				System.out.println("B+, you are improving");
			}
			else if(score >=60 && score <=69){
				System.out.println("C+, keep reading");
			}
			else if(score >=50 && score <=59){
				System.out.println("C, you can do better");
			}
		}
		else
		{
			System.out.println("\nStudent Marks are: "+score+", Invalid Range");
		}
	}
	
	public static void main(String[] args){
		StudentResult studentResult = new StudentResult();
		studentResult.processResult(36);
		studentResult.processResult(95);
		studentResult.processResult(84);
		studentResult.processResult(71);
		studentResult.processResult(66);
		studentResult.processResult(53);
		studentResult.processResult(-50);
	}	
}