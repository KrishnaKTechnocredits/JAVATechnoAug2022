package priyankaD.Assignment6_10;

class FYP2022
{
     void processData(int x)
	 {
	   if (x>=1 && x<=3)
	   System.out.println("It is Q1");
	   
	   else if (x==4 || x==5 || x==6)
	   System.out.println("It is Q2");
	   
	   else if (x>=7 && x<=9)
	   System.out.println("It is Q3");
	   
	   else if (x==10 || x==11 || x==12)
	   System.out.println("It is Q4");
	   
	   else
	   System.out.println("Invalid");
	 }
	 public static void main (String[]args)
	 {
	 FYP2022 fyp1= new FYP2022();
	 fyp1.processData(2);
	 fyp1.processData(6);
	 fyp1.processData(8);
	 fyp1.processData(10);
	 fyp1.processData(15);
	 }
}