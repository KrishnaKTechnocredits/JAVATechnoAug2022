package monikaDwivedi;
class Result
{	
	void processResult(int marksObtained){
	if(marksObtained >= 90  && marksObtained <= 100){
		System.out.println("marksObtained:- "+ marksObtained);
		System.out.println("A+ Very good");
	}else if(marksObtained >= 80 && marksObtained <= 89){
		System.out.println("marksObtained:- "+ marksObtained);
		System.out.println("A, good job");
	}else if(marksObtained >= 70 && marksObtained <= 79){
		System.out.println("marksObtained:- "+ marksObtained);
		System.out.println("B+,you are improving");
	}else if(marksObtained >= 60 && marksObtained <= 69){
		System.out.println("marksObtained:- "+ marksObtained);
		System.out.println("C+, keep reading");
	}else if(marksObtained >= 50 && marksObtained <= 59){
		System.out.println("marksObtained:- "+ marksObtained);
		System.out.println("C, you can do better");
	}else if(marksObtained >= 0 && marksObtained <= 49){
		System.out.println("Marks Obtained:- "+ marksObtained);
		System.out.println("Failed, study hard");
	}	
}
	
	public static void main(String args[]){
		Result result = new Result();
		result.processResult(98);
	}
}