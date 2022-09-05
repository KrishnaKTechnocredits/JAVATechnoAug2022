// MCQ QUESTION
package akankshaVyas.basicExamples;
class Example2{
	
	int num1 = 3;
	static int num2=4;
	int num3 = 2;
	static int num4;
	
	void processData(){
		num4=num1 + num2+ num3;
		num1++;
		num2++;
		num3++;
	}
	
	
	
	void display(){
		//System.out.println(accName);
		System.out.println(num4);
	}
	public static void main(String[] args){
		Example2 example1 = new Example2();
		example1.processData();
		example1.processData();
		example1.processData();
		//example1.processData1();
		example1.display();
	}
}