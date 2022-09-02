package aditiIngle;
class Index{
	
	void dayIndex(int a){
		if(a==1)
			System.out.println("Monday");
		else if (a==2)
			System.out.println("Tuesday");
		else if (a==3)
			System.out.println("Wednesday");
		else if (a==4)
			System.out.println("Thursday");
		else if (a==5)
			System.out.println("Friday");
		else if (a==6)
			System.out.println("Saturday");
		else if (a==7)
			System.out.println("Sunday");
		else
			System.out.println("Invalid Day Index");			
	}
	void weekIndex(int b){
		if(b>=1 && b<=5)
			System.out.println("It's a Weekday");
		else if(b==6 || b==7)
			System.out.println("It's a Weekend");
		else
			System.out.println("Invalid Week Index");
	}
	void monthIndex(int c){
		if (c>=1 && c<=3)
			System.out.println("FY2022 Q1");
		else if(c>=4 && c<=6)
			System.out.println("FY2022 Q2");
		else if(c>=7 && c<=9)
			System.out.println("FY2022 Q3");
		else if(c>=10 && c<=12)
			System.out.println("FY2022 Q4");
		else
			System.out.println("Invalid Month Index");
	}
	public static void main(String[] args){
		Index index = new Index();
		index.dayIndex(1);
		index.dayIndex(2);
		index.dayIndex(7);
		index.dayIndex(-3);
		index.dayIndex(13);
		System.out.println("\n");
		index.weekIndex(1);
		index.weekIndex(2);
		index.weekIndex(6);
		index.weekIndex(-3);
		System.out.println("\n");
		index.monthIndex(5);
		index.monthIndex(10);
		index.monthIndex(13);
	}
}