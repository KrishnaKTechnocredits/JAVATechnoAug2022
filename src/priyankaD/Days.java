package priyankaD;

class Days{

     void processData(int x){
	 if (x==1)
	 System.out.println("Monday");
	 
	 else if(x==2)
	 System.out.println("Tuesday");
	 
	 else if(x==3)
	 System.out.println("Wednesday");
	 
	 else if(x==4)
	 System.out.println("Thursday");
	 
	 else if(x==5)
	 System.out.println("Friday");
	 
	 else if(x==6)
	 System.out.println("Saturday");
	 
	 else if(x==7)
	 System.out.println("Sunday");
	 
	 else
	 System.out.println("Invalid");
	 }
	 public static void main (String[]args)
	 {
	 Days days1=new Days();
	 days1.processData(1);
	 days1.processData(2);
	 days1.processData(3);
	 days1.processData(4);
	 days1.processData(5);
	 days1.processData(6);
	 days1.processData(7);
	 days1.processData(8);
	 }
	 
	 
}