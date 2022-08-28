


package gauravSahu;

class Processresult{
	
	void marks(int score){
		System.out.println("Score obtained by student " + score);
		if(score>=0 && score<=100){
			if(score>=0 && score<=49){
				System.out.println("Failed as obtained mark " + score + "#work harder");
			}else if(score>=90 && score<=100){
				System.out.println("Grade is A+ #very good job");
			}else if(score>=80 && score<=89){
				System.out.println("A good job");
			}else if(score>=70 && score<=79){
				System.out.println("Grade is B+ #you are improving");
			}else if(score>=60 && score<=69){
				System.out.println("Grade is C+ #keep reading");
			}else if(score>=50 && score<=59){
				System.out.println("Grade is C #you can do better");
			}
		}else{
			System.out.println("Invalid score");
		}
	}
	
	
	public static void main (String [] args){
		Processresult processresult =  new Processresult();
		processresult.marks(40);
		processresult.marks(100);
		processresult.marks(150);
		processresult.marks(50);
		processresult.marks(40);
		processresult.marks(55);
		processresult.marks(65);
		processresult.marks(78);
		processresult.marks(130);
	}
}