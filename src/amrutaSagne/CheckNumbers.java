package amrutaSagne;

public class CheckNumbers {

	void first3Num(int start, int end){
		int count = 0;
		System.out.println("first 3 numbers are ");
			for (int i = 20; i <= 100; i++){
					if (i%3==0 && i%7 ==0){
						count++;
						System.out.println( i);
						if (count==3)
							break;
					}
			}
			
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckNumbers Checknumbers = new CheckNumbers();
		Checknumbers.first3Num(20,100);
	}

}
