package hemanshi;
class StudentResult{
	
	void processResult(int score){
			if(score>=0 && score<=49)
				System.out.println("Failed as obtained mark is: "+score+", need work hard");
	        else if(score>=50 && score<=100){
		        System.out.println("Student could clear exam");
	            if(score>=90 && score<=100)
		            System.out.println("Score: "+score+", A+, very good");
	            else if(score>=80 && score<=89)
		            System.out.println("Score: "+score+", A, good");
	            else if(score>=70 && score<=79)
		            System.out.println("Score: "+score+", B+, keep growing");
	            else if(score>=60 && score<=69)
		            System.out.println("Score: "+score+", c+, need more work");
	            else if(score>=50 && score<=59)
		            System.out.println("Score: "+score+", c, can do better");
	            }
	    else
		     System.out.println("score Invalid.");
	    
    }
	
	public static void main(String[] args){
	 StudentResult studentresult = new StudentResult();
	 studentresult.processResult(45);
	 studentresult.processResult(51);
	 studentresult.processResult(65);
	 studentresult.processResult(70);
	 studentresult.processResult(88);
	 studentresult.processResult(96);
	 studentresult.processResult(0);
	 studentresult.processResult(-10);
	 studentresult.processResult(200);
	}
		
}