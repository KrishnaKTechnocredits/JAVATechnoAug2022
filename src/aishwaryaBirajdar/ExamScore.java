package aishwaryaBirajdar;

class ExamScore{
	
	void processResult(int score)
	{
		if(score<=49){
			System.out.println("Failed as obtained mark is "+score+", work harder");
		}else if(score>=50 && score<=100){
			System.out.println("Student could clear exam...!!!");
			if(score>=90 && score<=100){
				System.out.println("A+, very good job...!!!");
			}else if(score>=80 && score<=89){
				System.out.println("A, good job...!!!");
			}else if(score>=70 && score<=79){
				System.out.println("B+, you are improving...!!!");
			}else if(score>=60 && score<=69){
				System.out.println("C+, Keep reading...!!!");
			}else if(score>=50 && score<=59){
				System.out.println("C, you can do better...!!!");
			}else{
				System.out.println("Invalid Score");
			}
		}
	}
		
	public static void main(String[] args){
		ExamScore examscore = new ExamScore();
		examscore.processResult(75);
		System.out.println("");
		examscore.processResult(10);
		System.out.println("");
		examscore.processResult(98);
		System.out.println("");
		examscore.processResult(55);
		System.out.println("");
		examscore.processResult(81);
	}
}