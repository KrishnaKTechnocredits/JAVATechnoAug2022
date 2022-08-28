package saroj;
class Result{

	void processResult(int score){
		if(score>=0 && score<=49)
			System.out.println("Failed as obtained mark is " +score+",Work harder");
		else if(score>=50 && score<=100){
			System.out.println("Student could clear exam " +score);
		if(score>=90 && score<=100)
			System.out.println("A+, very good job " +score);
		else if(score>=80 && score<=89)
			System.out.println("A, good job " +score);
		else if(score>=70 && score<=79)
			System.out.println("B+, you are improving " +score);
		else if(score>=60 && score<=69)
			System.out.println("C+, keep reading " +score);
		else if(score>=50 && score<=59)
			System.out.println("C+, keep reading " +score);
		}else
			System.out.println("Invalid " +score);
	}
		
	public static void main(String[] args){
		Result result = new Result();
		result.processResult(33);
		result.processResult(81);
		result.processResult(-33);
		result.processResult(56);
		result.processResult(79);
		result.processResult(110);
	}
}