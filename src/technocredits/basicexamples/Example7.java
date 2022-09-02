package technocredits.basicexamples;

class Example7{
	int x;
	void processData(int num){
		if(num > 10 && num <=20){
			System.out.println("GM");
		}
		else{
			System.out.println("GF");
		}
	}
	
	public static void main(String[] args){
		Example7 example7 = new Example7();
		example7.processData(300);
	}
}