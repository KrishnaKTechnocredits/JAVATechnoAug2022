package amolMule;

public class FirstSumFifty {

	int count = 0;
	int sum = 0;
	void processData(int num) {
		while (sum < num) {
			sum = sum + count;
			if(sum>=num)
			break;
			count++;
		}
		System.out.println("Total numbers required to meet sum: "+ count);
		System.out.println("Final sum: "+sum);
	}

	public static void main(String[] args) {
		FirstSumFifty fifty = new FirstSumFifty();
		fifty.processData(50);
	}
}
