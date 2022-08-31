package anujaD;

class Weekdaysexample{

		void weekdays(int day){
			if(day >= 1 && day <= 5)
				System.out.println("It is a weekday");
			else if(day >=6 && day <=7)
				System.out.println("It is a Weekend");
			else
				System.out.println("Invalid Index");
				
		}
				public static void main(String[] args){
					Weekdaysexample  weekDaysexample1 = new Weekdaysexample();
					weekDaysexample1.weekdays(4);
					weekDaysexample1.weekdays(6);
					weekDaysexample1.weekdays(8);
				}

}
