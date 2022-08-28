package apurvaBabel;

class Result{

	void processResult(int score){
		
		if (score >=50 && score <=100){
			System.out.println("Marks obtained are " + score + " ,Student could clear exam.");
			if (score >=90 && score <=100){
				System.out.println("Grade A+,very good job.");
			}else if (score >=80 && score<=89){
				System.out.println("Grade A,good job.");
			}else if (score >=70 && score <=79){
				System.out.println("Grade B+,you are improving.");
			}else if (score >=60 && score <=69){
				System.out.println("Grade C+,keep reading.");
			}else if (score >=50 && score <=59){
				System.out.println("Grade C,you can do better.");
			}
		}
		else if (score >=0 && score <=49){
			System.out.println("Failed as obtained marks are " +score+ ",work harder.");
		}else{
			System.out.println(score + " Invalid score.");
		}	
	}
	
	public static void main(String[] args){
		Result result = new Result();
		result.processResult(25);
		result.processResult(93);
		result.processResult(89);
		result.processResult(110);
		result.processResult(74);
		result.processResult(61);
		result.processResult(50);
		result.processResult(-5);
	}
}