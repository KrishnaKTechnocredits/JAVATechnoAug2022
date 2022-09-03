package technocredits.staticnonstatic;
class Test2{
	
	int count; //0
	static int individualCount; // 0
	
	void processData(){
		count++;
		individualCount = individualCount++ + count++;
	}
	
	static void creditAmt(){
		//debitAmt(); // CE
		Test2 test2 = new Test2();
		test2.debitAmt();
	}
	
	void debitAmt(){
		printSummary();
	}
	
	static void printSummary(){
		Test2 test2 = new Test2();
		System.out.println(test2.count + individualCount); //CE
	}
}

// variable --> access
// method --> call
