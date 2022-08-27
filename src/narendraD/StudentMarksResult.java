package narendraD;

class StudentMarksResult {
	
	void processResult(int score) {
		
		if(score>=0 && score<=49)
		{
			System.out.println("\n"+"Failed as obtained mark is "+score+". Need to work hard" );
		}
		else if (score>=50 && score<=100)
		{
			System.out.println("\n"+"Score is "+score+": Student could clear exam" );
			
			if(score>=90 && score<=100)
			{
				System.out.println("Score is "+score+": A+ Grade. Very good job" );
			}
			else if(score>=80 && score<=89)
			{
				System.out.println("Score is "+score+": A Grade. Good job" );
			}
			else if(score>=70 && score<=79)
			{
				System.out.println("Score is "+score+": B+ Grade. You are improving" );
			}
			else if(score>=60 && score<=69)
			{
				System.out.println("Score is "+score+": C+ Grade. Keep Reading" );
			}
			else if(score>=50 && score<=59)
			{
				System.out.println("Score is "+score+": C Grade. You can do better" );
			}
		}
		else
		{
			System.out.println("\n"+"Inavlid Score" );
		}
	}
	
	public static void main(String[] args) {
		StudentMarksResult studentmarksresult = new StudentMarksResult();
		studentmarksresult.processResult(49);
		studentmarksresult.processResult(59);
		studentmarksresult.processResult(69);
		studentmarksresult.processResult(79);
		studentmarksresult.processResult(89);
		studentmarksresult.processResult(99);
		studentmarksresult.processResult(120);
		
	}
}