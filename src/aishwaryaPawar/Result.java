package aishwaryaPawar;

class Result{
	
	void processResult(int marks){
		if (marks>=0 && marks<=49){
			System.out.println("Failed as obtained mark is "+marks+",work harder");
		}
		if(marks>=50 && marks<=100){
			System.out.println("Student could clear exam");
			if(marks>=90 && marks<=100){
				System.out.println("A+, very good job");
			}else if(marks>=80 && marks<=89){
				System.out.println("A, good job");
			}else if(marks>=70 && marks<=79){
				System.out.println("B+, you are improving");
			}else if(marks>=60 && marks<=69){
				System.out.println("C+, keep reading");
			}else if(marks>=50 && marks<=59){
				System.out.println("C, you can do better");
			}
		}else{
			System.out.println("Invalid");
		}
		
	}
		
		public static void main(String[] arg){
			Result result=new Result();
			result.processResult(50);
			result.processResult(101);
			result.processResult(89);
			
		}
}	
	