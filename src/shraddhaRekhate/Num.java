package shraddhaRekhate;

public class Num {
	void findRequiredNumbers(int targetNum){
		int count=0;
		int sum=0;
		int num=1;
		while(sum<targetNum){
			sum=sum+num;
			num++;
			count++;
		}
		System.out.println(count);
    }
	
	public static void main(String[] args){
		Num num=new Num();
		num.findRequiredNumbers(50);
	}

}
