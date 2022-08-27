package nehaniG;

class Result{

    void processData(int score)
	{
		if (score >=0 && score <=49)
			 System.out.println("Failed as obtained mark is "+score+", work harder");
		
		else if(score>=50 && score<=100){
			 System.out.println("Student could clear exam");
			 if(score>=90 && score<=100)
				 System.out.println("A++,very good job");
			 else if(score>=80 && score<=89)
				 System.out.println("A+,good job");
			 else if(score>=70 && score<=79)
				 System.out.println("B+,you are improving");
			 else if(score>=60 && score<=69)
				 System.out.println("C+,keep reading");
			 else if(score>=50 && score<=50)
				 System.out.println("C, you can do better");
		}else
		System.out.println("Invalid");
	
    }
	
	public static void main(String[] args){
		
		Result result = new Result();
		result.processData(3);
		result.processData(105);
		result.processData(92);
		result.processData(86);
		result.processData(77);
		result.processData(62);
		result.processData(50);
	}
	
}
		
	
				 
				 
			
   