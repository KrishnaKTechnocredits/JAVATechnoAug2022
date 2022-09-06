package anujaD;

class processResult{
	
			void result(int marks){
				
				if(marks >=0 && marks <=49)
					System.out.println("Score is  " + marks + " Failed");
				
				else if (marks >=50 && marks <= 100){
					System.out.println("Student sould clear exam  " + marks);
				
					if (marks >=90 && marks <= 100){
						System.out.println("Grade A+ , Very Good Job");
				
					}else if (marks >=80 && marks <= 89){
					System.out.println("Grade A , Good Job");
				
					}else if (marks >=70 && marks <= 79){
					System.out.println("Grade B+ , you are improving");
				
					}else if (marks >=60 && marks <= 69){
						System.out.println("Grade B , Keep reading");
					}else if (marks >=50 && marks <= 59){
					System.out.println("Grade c , you can do better");
					}
				}else{
					System.out.println("Invalid Range");}
				
			}
			public static void main(String[] args){
						processResult processresult = new processResult();
						processresult.result(42);
						System.out.println("");
						processresult.result(93);
						System.out.println("");
						processresult.result(82);
						System.out.println("");
						processresult.result(75);
						System.out.println("");
						processresult.result(61);
						System.out.println("");
						processresult.result(54);
						System.out.println("");
						processresult.result(110);
						
						
					}
					
}