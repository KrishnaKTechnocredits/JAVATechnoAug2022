package technocredits.abstractdemo;

public interface Manager extends Admin,SrAdmin{
	int id = 123;
	abstract void m1(String name);
	String m2(boolean flag);
}
