// print no divisible by 9 bet 1 to 50 in reverse order
package shridharKumbhar;

class DivisibleBy9{
	
	void divisbleBy9bet50_1(){
		int count=0;
		for (int n=50 ; n >=1 ; n--){
			if(n%9==0){
				count++;
				System.out.println(count+" No divisible by 9 bet 1 to 50 "+ n);
			}
		}
	}
	
	public static void main(String[] arg){
		DivisibleBy9 divisibleby9 = new DivisibleBy9();
		divisibleby9.divisbleBy9bet50_1();
	} 
}