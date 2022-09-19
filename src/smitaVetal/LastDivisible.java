package smitaVetal;
public class LastDivisible {
	
	void divisibleByThreeAndSeven(int start,int end) {
		int count=0;
		for (int index=end;index>=start;index--) {
			if(index%3==0 && index%7==0) {
				System.out.println(index);
				count= count+1;
				if(count>2)
				break;
			}
		}
	}
	public static void main(String[] args) {
		new LastDivisible().divisibleByThreeAndSeven(10,100);
	}
}
