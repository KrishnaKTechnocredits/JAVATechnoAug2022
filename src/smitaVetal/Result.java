package smitaVetal;

class Result{
	
	void processResult(int score){
		if(score>=50 && score<=100){
			System.out.println("You have cleared the exam and your score is " +score);
				if(score>=90 && score<=100){
					System.out.println("A+ very good job");
				}
				else if(score>=80 && score<=89){
					System.out.println("Grade A Good Job");
				}
				else if(score>=70 && score<=79){
				System.out.println("Grade B+ You are improving");
				}
				else if(score>=60 && score<=69){
					System.out.println("Grade C+ Keep reading");
				}
				else if(score>=50 && score<=59){
					System.out.println("Grade C You can do better");
				}			}
		else if(score>=0 && score <=49)
			{
			System.out.println("Failed as obtained marks are "+score+" work harder");
			}
		else
			System.out.println(score + " Is Invalid Score Entered");
	}	
	public static void main(String[]args){
		Result result = new Result();
		result.processResult(50);
		result.processResult(10);
		result.processResult(0);
		result.processResult(102);
		result.processResult(80);
		result.processResult(99);
		result.processResult(78);
		result.processResult(5);
	}
}