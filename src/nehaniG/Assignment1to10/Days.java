package nehaniG.Assignment1to10;

class Days
{
   int day=1; 
   void weekdays(int day)
   {
	   if(day >= 1 && day <=5)
	   {
		   System.out.println("It's Weekday");
	   }
	   else if(day == 6 || day == 7)
	   {
		    System.out.println("It's Weekend");
	   }
	   else 
	   {
		    System.out.println("Invalid Day Index Entry");
       }
	   
    }
    public static void main(String[] args)
	{
		   Days days = new Days();
		   days.weekdays(1);
		   days.weekdays(2);
		   days.weekdays(6);
		   days.weekdays(-3);
	}
	   
}
		 