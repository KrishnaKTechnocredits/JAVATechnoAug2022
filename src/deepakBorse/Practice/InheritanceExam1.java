package deepakBorse.Practice;

public class InheritanceExam1 {

	public static void main(String[] args) {
		ABC abc=new XYZ();
		System.out.println(abc.m1());

	}

}
class ABC{
	int b=5;
	int m1() {
		return b;
	}
}

class XYZ extends ABC{
	int b;
}
