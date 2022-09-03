package aditiIngle;
class Result{
	void processResult(int score){
		if(score>=50 && score<=100)
		{
			System.out.println("Student could clear exam");
			if(score>=90 && score<=100){
				System.out.println("A+, very good job");
			}
			if(score>=80 && score<=89){
				System.out.println("A, good job");
			}
			if(score>=70 && score<=79){
				System.out.println("B+, you are improving");
			}
			if(score>=60 && score<=69){
				System.out.println("C+, keep reading");
			}
			if(score>=50 && score<=59){
				System.out.println("C, you can do better");
			}
		}
		else if(score>=0 && score<=49){
			System.out.println("Failed as obtained mark is "+score+", work harder");
		}
		else{
			System.out.println("Invalid score");
		}
	}
	public static void main(String[] args){
		Result result = new Result();
		result.processResult(35);
		result.processResult(79);
		result.processResult(50);
		result.processResult(-70);
	}
}