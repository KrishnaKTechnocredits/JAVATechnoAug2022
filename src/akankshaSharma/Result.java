package akankshaSharma;
class Result{
	void processResult(int score){
		if(score >=0 && score<=49)
			System.out.println("Failed as obtained mark is " + score);
		else if(score>=50 && score<=100)
			System.out.println("Student could clear exam");
			if (score>=90 && score<=100)
				System.out.println("A+ , very Good Job");
			if(score>=80 && score<=89)
				System.out.println("A, Good Job");
			if(score>=70 && score<=79)
				System.out.println("B+, You are Improving");
			if(score>=60 && score<=69)
				System.out.println("C+, keep Reading");
			if(score>=50 && score<=59)
				System.out.println("C, You can do better");
		else if(score<0 && score >100)
			System.out.println("Invalid Input");
	}
	
	public static void main(String[] args){
		Result result =new Result();
		result.processResult(49);
		result.processResult(99);
		result.processResult(89);	
		result.processResult(79);
		result.processResult(69);
		result.processResult(59);
		result.processResult(-9);
	}
}