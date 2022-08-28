package shivaniLikhia;
class Weekday{
	void weekdays(int day){
		if(day==1)
			System.out.println("The given day is Monday");
		else if(day==2)
			System.out.println("The given day is Tuesday");
		else if(day==3)
			System.out.println("The given day is Wednesday");
		else if(day==4)
			System.out.println("The given day is Thursday");
		else if(day==5)
			System.out.println("The given day is Friday");
		else if(day==6)
			System.out.println("The given day is Saturday");
		else if(day==7)
			System.out.println("The given day is Sunday");
		else 
			System.out.println("Invalid Input");
	}
	
	public static void main(String[] args){
		Weekday weekday = new Weekday();
		weekday.weekdays(2);
		weekday.weekdays(7);
		weekday.weekdays(10);
	}
}