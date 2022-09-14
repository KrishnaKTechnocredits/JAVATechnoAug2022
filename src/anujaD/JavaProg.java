package anujaD;

public class JavaProg {
	
	int num1=6;
	static int num2=10;
	
	public static void main(String[] args) {
		JavaProg javaprog1 = new JavaProg();
		JavaProg javaprog2 = new JavaProg();
		javaprog1.num1=15;
		javaprog1.num2=17;
		javaprog2.num1=22;
		javaprog2.num2=28;
		
		System.out.println(javaprog1.num1++ +" " + ++javaprog2.num2);
		
	}
		
	}
	
