/*



public class progrProgramming Test - 1 : 28th Aug'2022

On User defined range, print first 3 numbers which are divible by 3 and 7.
input : 20 to 100
output : 21
         42
         63
Note : Use for loop*/
package deepakBorse;

public class ProgrammingTest1 {
	
	void processData(int startR, int endR) {
		int index=0, count1=0;
		for(index=startR;index<=endR;index++)
		{
			if(index%3==0 && index%7==0) {
				System.out.println(index);
				count1++;
			}	
			if(count1==3)
				break;
		}
		
	}

	public static void main(String[] args) {
		ProgrammingTest1 ProgrammingTest1=new ProgrammingTest1();
		
		ProgrammingTest1.processData(20, 100);

	}

}
