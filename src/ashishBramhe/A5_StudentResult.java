package ashishBramhe;

class StudentResult{
	
	void processResult(int score){
		if(score >=50 && score <=100){
			System.out.println(" Student could clear the exam");
			if(score >= 90 && score <= 100)
				System.out.println("Score : " + score + " A+, very good job");
			else if(score >= 80 && score < 90)
				System.out.println("Score : " + score + " A, good job");
			else if(score >= 70 && score < 80)
				System.out.println("Score : " + score + " B+, you are improving");
			else if(score >= 60 && score < 70)
				System.out.println("Score : " + score + " C+, keep reading");
			else if(score >= 50 && score < 60)
				System.out.println("Score : " + score + " C, you can do better");
		}
		else if(score >= 0 && score < 50)
			System.out.println("Failed as obtained mark is "+score+", work harder");
		else
			System.out.println("Score : " + score + " ,Invalid score");
	}
	
	public static void main(String args[]){
		StudentResult studentResult = new StudentResult();
		studentResult.processResult(36);
		studentResult.processResult(96);
		studentResult.processResult(86);
		studentResult.processResult(70);
		studentResult.processResult(69);
		studentResult.processResult(54);
		studentResult.processResult(-51);
	}
}