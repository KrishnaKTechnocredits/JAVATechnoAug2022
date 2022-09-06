package sohail.if_else_program;

class Index{
	void weekDay(int day){
		if(day==1){
			System.out.println("Monday");
		}
		else if (day==2){
			System.out.println("Tuesday");
		}
		else if (day==7){
			System.out.println("Sunday");
		}
		else {
			System.out.println("Invalid Index");
		}
	}
	public static void main (String [] args){
		Index index=new Index();
		index.weekDay(3);
	}
}