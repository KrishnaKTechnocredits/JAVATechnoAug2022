//Printing is it a week day or weekend by Day Ind
package harshadaJagtap;
class Day{
	void processData(int dayInd){
		if (dayInd>=1 && dayInd<=5)
			System.out.println("Week Days");
		else if (dayInd>=6 && dayInd<=7)
			System.out.println("Weekend");
		else
			System.out.println("Invalid Day Index");
	}
	public static void main (String[]args){
		Day day=new Day();
		day.processData(2);
		day.processData(-3);
		day.processData(6);
	}
}