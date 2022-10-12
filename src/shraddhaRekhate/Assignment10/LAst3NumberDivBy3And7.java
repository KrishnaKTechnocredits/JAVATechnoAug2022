package shraddhaRekhate.Assignment10;
//Find the last 3 numbers divisible by 3 and 7.
//
//Input : 10 to 200
//Output : 189
//              168
//              147   

public class LAst3NumberDivBy3And7 {
   void last3NumDivisiBy3and7(int input1,int input2) {
	   int count=0;
	   System.out.println("LAst 3 number divisible by 3 and 7 are:");
	   for(int index=input2;index>=input1;index--) {
		   if(index%3==0 && index%7==0) {
			   System.out.println(+index);
			   count++;
		   }
		   if(count==3) {
			   break;
		   }
	   }
   }
   
   public static void main(String[] args) {
	   LAst3NumberDivBy3And7 lAst3NumberDivBy3And7=new LAst3NumberDivBy3And7();
	   lAst3NumberDivBy3And7.last3NumDivisiBy3and7(10, 200);
}
}
