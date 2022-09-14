//Class to print day of week , weekend/weekday , Quarter of the year based on input number provided

package mohiniA.basic;
class Index{
		
	void weekDay( int day){
		if (day == 1)
			System.out.println("The day is Monday ");
		else if (day == 2)
			System.out.println("The day is Tuesday ");
		else if (day == 3)
			System.out.println("The day is Wedensday ");
		else if (day == 4)
			System.out.println("The day is Thursday ");
		else if (day == 5)
			System.out.println("The day is Friday ");
		else if (day == 6)
			System.out.println("The day is Saturday ");
		else if (day == 7)
			System.out.println("The day is Sunday ");
		else
			System.out.println("Invalid Input "); 
	}

		void weekEnd (int day){
			if (day >= 1 && day <=5)
				System.out.println("It's a weekday  ");
			else if (day ==6 || day ==7 )
				System.out.println("Cheers ... It's a weekend ");
			else
				System.out.println("Invalid Input ");
		}
		
		void quarterYear(int month){
			if (month >= 1 && month <=3)
				System.out.println("It's a First Quarter of the Year ");
			else if (month >= 4 && month <=6)
				System.out.println("It's a Second Quarter of the Year ");
			else if (month >= 7 && month <=9)
				System.out.println("It's a Third Quarter of the Year ");
			else if (month >= 9 && month <=12)
				System.out.println("It's a Fourth Quarter of the Year ");
			else
				System.out.println("Invalid Input ");
		}
		
		public static void main(String[] args){
			Index index1= new Index();
			index1.weekDay(5);
			index1.weekDay(3);
			index1.weekDay(-3);
			index1.weekEnd(10);
			index1.weekEnd(6);
			index1.weekEnd(0);
			index1.quarterYear(6);
			index1.quarterYear(100);
			index1.quarterYear(12);						
		}
}