package vibhaS;
class StudentResult{
	
	void processData(int score){
		if(score>=0 && score<=49){
			System.out.println("Failed as obtained marks is "+score+",work harder");
		}else if(score>=50 && score<=100){
			System.out.println("Student clear exam marks is => "+score);
			if(score>=90 && score<=100){
				System.out.println("A+,very good job ");
			}else if(score>=80 && score<=89){
				System.out.println("A,good job");
			}else if(score>=70 && score<=79){
				System.out.println("B+,you are improving");
			}else if(score>=60 && score<=69){
				System.out.println("c+,keep reading");
			}else if(score>=50 && score<=59){
				System.out.println("c,you can do better");
			}
		}else{
			System.out.println("Student marks are "+score+" Invalid Range ");
		}
	}
	
	public static void main(String[] args){
		StudentResult studentResult=new StudentResult();
		studentResult.processData(36);
		System.out.println("");
		studentResult.processData(76);
		System.out.println("");
		studentResult.processData(-89);
		System.out.println("");
		studentResult.processData(69);
	}
}