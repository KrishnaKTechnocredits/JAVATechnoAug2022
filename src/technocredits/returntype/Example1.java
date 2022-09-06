package technocredits.returntype;

public class Example1 {
	
	int getSumOfNumInRange(int startNum, int endNum) {
		int sum = 0;
		for(int num = startNum; num<=endNum ; num++) {
			sum += num; // sum = sum + num;
		}
		System.out.println(sum);
		return sum;
	}
	
	boolean isPrimeNum(int num) {
		boolean isPrimeFlag = true;
		for(int index=2;index<=num/2;index++) {
			if(num%index==0) {
				isPrimeFlag = false;
				break;
			}
		}
		System.out.println("Techno");
		return isPrimeFlag;	
	}
	
	String processData(int rno) {
		if(rno == 1)
			return "Maulik";
		else
			return "Technocredits";
	}
	
	
	String processData1(int rno) {
		String name = "";
		if(rno == 1)
			name = "Maulik";
		else
			name = "Technocredits";
		
		return name;
	}
	
	String processData2(int rno) {
		if(rno == 1)
			return "Maulik";
		else if(rno ==2)
			return "Technocredits";
		
		return "Krishna";
	}
	
	public static void main(String[] args) {
		Example1 example1 = new Example1();
		int num = example1.getSumOfNumInRange(10, 100);
		boolean flag = example1.isPrimeNum(num);
		if(flag)
			System.out.println(num + " is prime, I will add it DB");
		else
			System.out.println(num + " is not prime, we can't consider number");
	}
}
