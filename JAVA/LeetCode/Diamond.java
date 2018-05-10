package leetCode;

interface A{
	void func1();
}

abstract class B{
	abstract void func1();	
//	void func1(){System.out.println("i am in class B");}
}

interface C{
	void func1();
}


public class Diamond implements A,C {
	public static void main(String args[]) {
		System.out.println("Something is wrong here");
	}
	
	public void func1() {
		// TODO Auto-generated method stub
		
	}
}
