package anujaD;

class Example4{
	
	int x = 10;
	int y = 20;
	
		void processData(){
			int z = x + y;
			x= x+10;
			y= y+10;
		}
		void display(){
			System.out.println("sum is "  + x+y);
			System.out.println(x+y + " is my answer");
			System.out.println("sum is " + (x+y));
		}
		
		public static void main(String[] a){
				Example4 example4 = new Example4();
				example4.processData();
				example4.display();
				
		}
	
}
