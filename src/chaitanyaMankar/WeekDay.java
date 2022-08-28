package chaitanyaMankar;
class WeekDay
{
	void dayIndex(int dayIndex)
		{
			if(dayIndex >= 1 && dayIndex <= 5 )
				{
					System.out.println("It is a Weekday");
				}
			else if(dayIndex >=6 && dayIndex <=7)
				{
					System.out.println("It is a Weekend");
				}
			else
				{
					System.out.println("Invalid Day Index Entry");
				}
		}
	void dayMonth(int dayIndex)
		{
			if(dayIndex == 1)
				{
					System.out.println("Day is Monday");
				}
			else if(dayIndex == 2)
				{
					System.out.println("Day is Tuesday");
				}
			else if(dayIndex == 7)
				{
					System.out.println("Day is Sunday");
				}
			else if(dayIndex == -3)
				{
					System.out.println("Invalid Day Entry");
				}
			else
				{
					System.out.println("Invalid Day Entry");
				}
		}
	void quarter(int dayIndex)
		{
			if (dayIndex == 1)
			{
				System.out.println("First Quarter : FY2022 Q1");
			}
			else if (dayIndex == 2)
			{
				System.out.println("Second Quarter : FY2022 Q2");
			}
			else if (dayIndex == 3)
			{
				System.out.println("Third Quarter : FY2022 Q3");
			}
			else if(dayIndex == 4)
			{
				System.out.println("Fourth Quarter : FY2022 Q4");
			}
			else
			{
				System.out.println("Invalid Quarter Entry");
			}	
		}
	public static void main(String[] args)
		{
			WeekDay weekday = new WeekDay();
			weekday.dayIndex(1);
			weekday.dayMonth(2);
			weekday.quarter(3);
		}
}
