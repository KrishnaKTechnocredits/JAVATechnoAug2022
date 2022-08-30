package niveditaGavade;
class ProcessResult{
	
	void parameter(int score){
		if (score>=0 && score<=49){
			System.out.println("Failed as obtained mark is " + score + " work harder");
		}	
		else if(score>=50 && score<=100){
			System.out.println("Student could clear exam");
		}
		if(score>=90 && score<=100){
			System.out.println("A+,Very good job");
		}
		else if(score>=80 && score<=89){
			System.out.println("A,Good job");
		}
		else if(score>=70 && score<=79){
			System.out.println("B+,you are improving");
		}
		else if(score>=60 && score<=69){
			System.out.println("C+,Keep reading");
		}
		else if(score>=50 && score<=59){
			System.out.println("C,you can do better");
		}
		else{
			System.out.println("Invalid");
		}
	}
	public static void main (String[] args){
		ProcessResult processResult= new ProcessResult();
		processResult.parameter(36);
		processResult.parameter(100);
		processResult.parameter(60);
		processResult.parameter(89);
		processResult.parameter(57);
		processResult.parameter(72);
	}
	
}