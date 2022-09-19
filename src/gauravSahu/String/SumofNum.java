package gauravSahu.String;

public class SumofNum {
	
	int sumnum(int startnum, int endnum) {
		int sum = 0;
		for(int num = startnum; num<=endnum; num++) {
			sum += num;
			System.out.println(num);
		}
		System.out.println(sum);
		return sum;
	}
	
	boolean isprimenum(int num) {
		boolean flag= true;
		for(int index = 2; index<=num/2;index++) {
			if(num % index == 0) {
				flag=false;
				break;
			}
		}
		return flag;
	}
	
	public static void main(String[] args) {
		SumofNum n1 = new SumofNum();
		int num = n1.sumnum(10, 20);
		System.out.println(num);
		boolean flag1=n1.isprimenum(num);
		if (flag1)
		System.out.println(num + " Prime");
		else 
		System.out.println(num+ " Not prime");
	}
}
