package mohiniA;
class ScoreResult{

	void processResult(int score){
		if (score >= 0 && score<=49)
			System.out.println("Failed as obtained mark is "+score+", work harder");
		else if(score >= 50 && score<=100){
				System.out.println("Student clould clear the Exam");
					if (score >= 90 && score<=100)
						System.out.println("A+ , very good job in scoring "+score+" marks");
					
					else if (score >= 80 && score<=89)
						System.out.println("A , good job in scoring "+score+" marks");
					
					else if (score >= 70 && score<=79)
						System.out.println("B+ , you are improving with score : " +score);
					
					else if (score >= 60 && score<=69)
						System.out.println("C+ keep reading ,score is :"+score);
					
					else if (score >= 50 && score<=59)
						System.out.println("C You can do better , score is :"+score);
		}			
		else 
		System.out.println("Invalid score as : " +score);
	}

	public static void main(String[] args){
		
		ScoreResult score = new ScoreResult();
		score.processResult(99);
		score.processResult(50);
		score.processResult(-5);
		score.processResult(60);
		score.processResult(30);
		score.processResult(77);
		score.processResult(89);
		score.processResult(52);	
		score.processResult(130);
	}
}

