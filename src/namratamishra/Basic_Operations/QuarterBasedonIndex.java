/*Find Quater based on month index.
Month index is 1 or 2 or 3 -> FY2022 Q1 */

package namratamishra.Basic_Operations;
import java.util.*;

public class QuarterBasedonIndex {

void getQuarterBasedonIndex(int monthIndex) 
{

	if(monthIndex==1 || monthIndex==2 ||monthIndex==3)
		System.out.println(monthIndex+":......>FY2022 Q1");
	else if(monthIndex==4 || monthIndex==5 ||monthIndex==6)
		System.out.println(monthIndex+":......>FY2022 Q2");
	else if(monthIndex==7 || monthIndex==8 ||monthIndex==9)
		System.out.println(monthIndex+":......>FY2022 Q3");
	else if(monthIndex==10 || monthIndex==11 ||monthIndex==11)
		System.out.println(monthIndex+":......>FY2022 Q2");
	else
		System.out.println(monthIndex+":......>Invalid Index");	
}
public static void main(String[] args)
{
	QuarterBasedonIndex wdorwe=new QuarterBasedonIndex();
	Scanner sc=new Scanner(System.in);
	System.out.println(" Enter Month Index");
	int a=sc.nextInt();
	wdorwe.getQuarterBasedonIndex(a);
	sc.close();
	
}
}

