package shivaniLikhia;
class Index{
	void dayIndex(int day){
		if(day >=1 && day <=5)
			System.out.println("The given day is Week day");
		else if(day == 6 || day == 7)
			System.out.println("The given day is Weekend");
		else
			System.out.println("Invalid Input");
	}
	
	void monthIndex(int month){
		if(month>=1 && month<=3)
			System.out.println("The given month is Q1");
		else if(month>4 && month<=6)
			System.out.println("The given month is Q2");
		else if(month>=7 && month<=9)
			System.out.println("The given month is Q3");
		else if(month>=10 && month<=12)
			System.out.println("The given month is Q4");
		else
			System.out.println("Invalid input");
	}
	
	public static void main(String[] args){
		Index index = new Index();
		index.dayIndex(4);
		index.dayIndex(6);
		index.monthIndex(12);
		index.monthIndex(5);
		index.monthIndex(2);
	}
} 