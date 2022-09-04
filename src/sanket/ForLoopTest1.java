/*Test 1 on for loop*/

package sanket;

public class ForLoopTest1 {
	
	void divisibleby37(int startIndex, int endIndex){
		
		System.out.println("First 3 numbers between "+startIndex+" and "+endIndex+" divisible by 3 and 7 are : ");
		int count = 0;
		for (int index = startIndex; index <=endIndex; index++){
			
			if (index%3==0 && index%7==0){
				count++;
				System.out.println(index);
					if (count==3)
					break;
				}
		}	
	}
	
	public static void main (String[] args){
		ForLoopTest1 forLoopTest1 = new ForLoopTest1();
		forLoopTest1.divisibleby37(20,100);
	}
}