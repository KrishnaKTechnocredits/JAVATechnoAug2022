package rohanNaik;

class Grade{
	
	void processResult(int score){
		if(score>=0 && score<=49)
			System.out.println("Failed as obtained mark is "+score+", work harder");
		else if(score>=50 && score<=100)
		{
			System.out.println("Student could clear exam");
			if(score>=90 && score<=100)
				System.out.println("A+, very good job");
			else if(score>=80 && score<=89)
				System.out.println("A, good job");
			else if(score>=70 && score<=79)
				System.out.println("B+, you are improving");
			else if(score>=60 && score<=69)
				System.out.println("C+, keep reading");
			else if(score>=50 && score<=59)
				System.out.println("C, you can do better");
		}
		else
			System.out.println("Invalid score");
	}
	
	public static void main(String[] args){
		Grade grade = new Grade();
		grade.processResult(19);
		grade.processResult(55);
		grade.processResult(69);
		grade.processResult(70);
		grade.processResult(85);
		grade.processResult(100);	
		grade.processResult(101);	
		grade.processResult(-23);			
	}
	
}