// mcq test 2 
package akankshaVyas.basicExamples;
public class Example1{
	
	int x = 1;
	int y=2;
	
	void processData(){
		x=x+1;
	}
	
	void processData1(){
		y=y * 2;
	}
	
	void display(){
		//System.out.println(accName);
		System.out.println(x + y);
	}
	public static void main(String[] args){
		Example1 example1 = new Example1();
		example1.processData();
		example1.processData();
		example1.processData1();
		example1.processData1();
		example1.display();
	}
}