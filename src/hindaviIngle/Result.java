package hindaviIngle;
class Result{
	void processResult(int score){
		if(score>0 && score<=49)
			System.out.println("Failed as obtained mark is"+score+", work harder");
		else if(score>=50 && score<=100){
				System.out.println("Student could clear exam");
			if(score>=90 && score<=100){
				System.out.println("A+, very good job");
			}else if(score>=80 && score<=89){
				System.out.println("A, good job");
			}else if(score>=70 && score<=79){
				System.out.println("B+, you are improving nicely");
			}else if(score>=60 && score<=69){
				System.out.println("C+, keep reading");
			}else if(score>=50 && score<=59){
				System.out.println("C, you can do better");
			}else if(score>=50 && score<=100){
				System.out.println("Student could clear exam");
			}
		}else{
			System.out.println("Invalid range");}
	}
	public static void main(String[] args){
		Result result=new Result();
		result.processResult(35);
		result.processResult(95);
		result.processResult(85);
		result.processResult(65);
		result.processResult(55);
		result.processResult(101);
}
}