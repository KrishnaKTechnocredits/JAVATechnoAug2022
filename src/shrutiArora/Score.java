package shrutiArora;
public class Score {
	void processResult(int score){
			if(score>=0 && score <50)
				System.out.println("Failed as obtained mark is " + score +", work harder");
				
			else if(score>=50 && score <=100){
				System.out.println("Student could clear exam");
				
				if(score>=90 && score <=100)
					System.out.println("A+, very good job");
				else if(score>=80 && score <90)
					System.out.println( "A, good job");
				else if(score>=70 && score <80)
					System.out.println( "B+, you are improving");	
				else if(score>=60 && score <70)
					System.out.println( "C+, keep reading");
				else
					System.out.println( "C, you can do better");					
				}		
			else
				System.out.println("Invalid Marks");
		} 

		public static void main(String[] args){
		    Score score = new Score();
		    System.out.println("************************************GradeProgram*****************************************");
		    score.processResult(49);
			score.processResult(106);
			score.processResult(75);
			score.processResult(95);
			score.processResult(85);
		}
}