package priyankaD.Assignment1_5;

class DayIndex
{

    void processData(int x){
	
	if (x>=1 && x<=5){
	System.out.println("It is a Weekday");
	}
	else if(x==6 || x==7){
	System.out.println("It is a weekend day");
	}
	else 
	System.out.println("invalid");
	
	}
	public static void main(String[]args){
	DayIndex dayindex1=new DayIndex();
	dayindex1.processData(4);
	dayindex1.processData(7);
	dayindex1.processData(3);
	dayindex1.processData(8);
	}
	
}