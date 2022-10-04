/*Assignment 10: Last 3 numbers between given range divisible by 3 and 7*/

package sanket;

public class ForLoopEx4 {
	
	void divisibleby37(int startIndex, int endIndex){
		
		System.out.println("Last 3 numbers between "+startIndex+" and "+endIndex+"  divisible by 3 and 7 are : ");
		int count = 0;
		for (int index = endIndex; index >=startIndex; index--){
			
			if (index%3==0 && index%7==0){
				count++;
				System.out.println(index);
					if (count==3)
					break;
				}
		}	
	}
	
	public static void main (String[] args){
		ForLoopEx4 forLoopEx4 = new ForLoopEx4();
		forLoopEx4.divisibleby37(10,200);
	}
}