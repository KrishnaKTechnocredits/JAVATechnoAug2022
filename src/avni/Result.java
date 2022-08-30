class Result{

	void processResult(int scoore){
		if(scoore>=0 && scoore<=49)
			System.out.println("Failed as obtained mark "+scoore+"work harder");
		else if(scoore>=50 && scoore<=100){
			System.out.println("student could cler exam");
			if(scoore>=90 && scoore<=100)
				System.out.println("A++,very good job");
			else if(scoore>=80 && scoore<=89)
				System.out.println("A,good job");
			else if(scoore>=70 && scoore<=79)
				System.out.println("B+, you are improving");
			else if(scoore>=50 && scoore<=59)
				System.out.println("C, you can do better");
				}
		else
			System.out.println("invalid scoore");
	}
	
	public static void main(String[] args){
	Result result = new Result();
	result.processResult(99);
	result.processResult(87);
	result.processResult(75);
	result.processResult(55);
	result.processResult(44);
	result.processResult(111);
	}
}