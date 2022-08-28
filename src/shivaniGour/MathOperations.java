package shivaniGour;
class MathOperations{
	 void evenNum(int startrange, int endrange){
		 int autonum =0;
		 for(int i=startrange;i<=endrange;i++){
			 if(i%2==0){
				 autonum++;
				 System.out.println(autonum+" Even no.: "+i);
			 }
		 }
		 autonum=0;
		 System.out.println("\n");
	 }
	 
	 void div1(int startrange1, int endrange1){
		 for(int i=startrange1;i<=endrange1;i++){
			 if(i%5==0){
				 System.out.println("No. divisible by 5: "+i);
			 }
		 } 
		 System.out.println("\n");
	 }
	 
	 void div2(int startrange2, int endrange2){
		 for(int i=startrange2;i<=endrange2;i++){
			 if(i%5==0 && i%3==0){
				 System.out.println("No. divisible by 5 and 3: "+i);
			 }
		 }
		 System.out.println("\n");
	 }
	 
	 void div3(int startrange3, int endrange3){
		 for(int i=startrange3;i<=endrange3;i++){
			 if(i%13==0 || i%7==0){
				 if(i%7==0)
					 System.out.println(i+" is divisible by 7");
				 if(i%13==0)
					 System.out.println(i+" is divisible by 13");
			 }
		 } 
	 }
	
	void div4(int startrange4, int endrange4){
		int sum=0;
		 for(int i=startrange4;i<=endrange4;i++){
			 sum=sum+i;
		 }
		 System.out.println("\nSum of numbers in range "+startrange4+"-"+endrange4+": "+sum);
	}
	
	void div5(int startrange5, int endrange5){
		int sumodd =0;
		int sumeven=0;
		 for(int i=startrange5;i<=endrange5;i++){
			 if(i%2!=0){
				 sumodd=sumodd+i;  
			 }
			 if(i%2==0){
				 sumeven=sumeven+i;  
			 } 
		 }
		 System.out.println("\nSum of odd numbers: "+sumodd);
		 System.out.println("Sum of even numbers: "+sumeven);
		 if(sumeven>sumodd){
			 System.out.println("Difference of sum of odd and even numbers is: "+(sumeven-sumodd));	 
		 }else{
			 System.out.println("Difference of sum of odd and even numbers is: "+(sumodd-sumeven));
		 }	
		 System.out.println("\n");		 
	}
	
	void oddNumRev(int startrange6, int endrange6){
		System.out.println("Reverse order of Odd numbers is:");
		 for(int i=endrange6;i>=startrange6;i--){
			 if(i%2!=0){
				 System.out.println(+i);
			 }
		 }
	 }
	
	 public static void main (String[] args){
		 MathOperations mathop = new MathOperations();
		 mathop.evenNum(5,15);
		 mathop.div1(10,20);
		 mathop.div2(15,30);
		 mathop.div3(5,40);
		 mathop.div4(1,5);
		 mathop.div5(3,9);
		 mathop.oddNumRev(10,20);
		 
	 }
}

