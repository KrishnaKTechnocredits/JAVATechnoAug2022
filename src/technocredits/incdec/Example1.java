package technocredits.incdec;

public class Example1 {
	
	// 5%2 -> 1
	// 2 % 5 -> 2
	
	void display() {
		/*
		 * int num = 5; num++; System.out.println(num);
		 */
		int num = 5;
		++num;
		System.out.println(++num);
		
	}
	//logical OR first condition true don't compare second
	//logical AND first condition false don't compare second
	
	void processData() {
		int x = 10; // 11
		int y = 20; // 19
		
		if(x++<15 && y--<15) {
			System.out.println("Hi");
		}
		
		System.out.println(x); // 11
		System.out.println(y); // 19
	}
	
	void processData10() {
		int x = 19; // 18 // 17 // 16
		int y = --x; // 18 // 17 // 16
		
		System.out.println(x-- + --y + --y + --x);
		//                 18 + 17 + 16 + 16 // 67
	}
	
	void processData9() {
		int x = 10; // 10 // 11 //12 //13 //14 //15 //16 // 17
		int y = x++ + 10; // 20 //19 //18 //17 //16 //15 // 14
		
		while(++x < --y) {
			if(x++<--y) {
				x++;
				y--;
			}
		}
		System.out.println(x);
		System.out.println(y);
	}
	
	void processData7() {
		int num1 = 10; // 11 // 12 //13 // 14 //15 //16 //17
		int num2 = 20; // 19 // 18 // 17 // 16 //15
		
		for(;num1++<num2--;num1++,num2--) {
			if(num1<num2)
				num1++;
		}
		System.out.println(num1);
		System.out.println(num2);
	}
	
	
	void processData6() {
		int num1 = 10; // 11 //12 // 13 // 14 //15 //16 //17 //18
		int num2 = 20; // 19 // 18 // 17 // 16
		for(;num1<num2;num1++,num2--) {
			if(num1<num2)
				num1++;
		}
		System.out.println(num1);
		System.out.println(num2);
	}
	
	
	void processData5() {
		int count = 1; // 2 // 3 // 4 //5 //6 // 7
		for(int index=1;index<=50;index++) {
			if(index%2==0) {
				System.out.println(index + ":" + count++); // 2 : 2 // 4 : 5
			}
			
			if(count++ >5) {
				break;
			}
		}
		System.out.println("---------------------" + count);
	}
	
	void processData4() {
		int x = 10; // 
		int y = x + 10; // 20
		int z = y++ + x++; //30 
		      
		
		int ans = x++ + ++y + ++z;
		System.out.println(x); //12
		System.out.println(y); //22 
		System.out.println(z);// 31 // 30
		System.out.println(ans); // 64 // 65 //62
	}
	
	
	void processData3() {
		int x = 10; // 11 // 12
		int y = x; // 10 // 11
		y = y++ + x++ + ++x;
		y = 10 + 10 + 12;
		
		System.out.println(y);// 31// 32 //33 //34
		System.out.println(x); // 12 
	}
	
	void processData2() {
		int x = 10; // 11 //12
		int y = x++ + ++x ; //  10 + 12
		System.out.println(y);// 22
		System.out.println(x); //12  
	}
	
	void processData1() {
		int x = 10; // 11 // 12
		int y = x++ + x++; // ++x
		System.out.println(y); //21
		System.out.println(x); // 12  
	}
	
	public static void main(String[] args) {
		new Example1().processData();
	}
}
