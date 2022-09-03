//print no divisible by 7 , 13 and both , range 1 to 100
package shridharKumbhar;

class LoopEx4{
	
	void processDivision(){
		for (int num =1 ; num<=100 ; num++ ){
			if (num %7 == 0  && num % 13 == 0 ){
				System.out.println(" "+num + " Num is divisible by both 7 & 13 ");
			}else if (num %7 == 0){
				System.out.println(" "+ num + " Num is divisible by 7");
			}else if (num %13 == 0){
				System.out.println(" "+num + " Num is divisible by 13");
			}
		}
	}
	
	public static void main (String [] a){
		LoopEx4 loopEx4 = new LoopEx4();
		loopEx4.processDivision();
	}
}