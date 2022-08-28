package nikitaPhase;
class ScoreResult{
	
	void processResult(int score){
		if (score >= 0 && score<=49){
			System.out.println("Fail "+score+",work harder");
		}
		else if (score >=50 && score <=100){
			System.out.println("Student should clear the exam");
			
			if (score >=89 && score <=101)
				System.out.println("A+ , very good in scoring "+score+" marks");
		    if (score >=80 && score <=89)
				System.out.println("A , good "+score+" marks");
			else if (score >=70 && score <=79)
				System.out.println("B+ , you are improving with marks " +score);
			else if (score >=60 && score <=69)
				System.out.println("C+ keep reading , "+score);
			else if (score >=50 && score <=59)
				System.out.println("C you can do better ,  "+score);
		}
		else
			System.out.println("Invalid score as : " +score);
	}
	
	public static void main(String args []){
		ScoreResult scoreResult = new ScoreResult();
		scoreResult.processResult(48);
		scoreResult.processResult(50);
		scoreResult.processResult(80);
		scoreResult.processResult(74);
		scoreResult.processResult(62);
		scoreResult.processResult(51);
		scoreResult.processResult(120);
	}
}
		
			
				