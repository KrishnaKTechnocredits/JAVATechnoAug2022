package ankitaBarwad;

class Result{
	
	void processResult(int score){
		if(score >= 0 && score <= 49){
			System.out.println("Failed as obtained mark is "+ score +", work harder." + "\n");
		} 
		else if(score >= 50 && score <= 100){
			System.out.println("Score = " + score + ", Student cleared the exam.");
			if(score >= 90 && score <= 100){
				System.out.println("A+, very good job" + "\n");
			}
			else if(score >= 80 && score <= 89){
				System.out.println("A, good job" + "\n");
			}
			else if(score >= 70 && score <= 79){
				System.out.println("B+, you are improving" + "\n");
			}
			else if(score >= 60 && score <= 69){
				System.out.println("C+, keep reading" + "\n");
			}
			else if(score >= 50 && score <= 59){
				System.out.println("C, you can do better" + "\n");
			}		
		}
		else{
			System.out.println("Score = " + score + ",Enter valid score between 0 to 100." + "\n");
		}
	}
	
	public static void main(String[] args){
		Result result = new Result();
		result.processResult(36);
		result.processResult(50);
		result.processResult(-30);
		result.processResult(100);
		result.processResult(49);
	}
}