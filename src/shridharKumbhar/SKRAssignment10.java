//User defined range , print first 3 numbers wg=hich are divisible by 3 and 7.
package shridharKumbhar;

public class SKRAssignment10 {
	
	void divisionBy3and7(int num1 , int num2) {
		
		int count =0;
		for(int index=num1; index<=num2; index++)
			if (index%3==0 && index%7==0) {
				System.out.println(index);
				count = count + 1 ;
				if (count == 3)
					break;
			}
	}
	
	public static void main(String[] args) {
		new SKRAssignment10().divisionBy3and7(-43, 150);
	}

}
