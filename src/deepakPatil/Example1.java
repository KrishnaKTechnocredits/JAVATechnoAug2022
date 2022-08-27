package deepakPatil;

class Example1 {

	int x = 10;
	int y = 20;

	void processData() {
		x = x + 10;
		y = y + 10;
	}

	void display() {
		System.out.println("Sum is " + x + y);
		System.out.println(x + y + " is my answer");
		System.out.println("Sum is " + (x + y));
	}

	public static void main(String[] args) {
		Example1 example1 = new Example1();
		example1.processData();
		example1.display();
	}

}