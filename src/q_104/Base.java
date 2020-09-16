package q_104;

import oca.Question_33;

public class Base {
	public void test() {
		System.out.println("Base");
		Question_33 a=new Question_33();
		
		
	}
	public static void main(String[] args) {
		Base b1= new DerivedB();
		Base b2= new DerivedA();
		Base b3= new DerivedB();
		Base b4=b3; //
		b1=(Base)b2;
	
		b1.test();
		b4.test();
		
	}
	
}
class DerivedA extends Base{
	public void test() {
		System.out.println("DerivedA");
	}
	
}
class DerivedB extends DerivedA{
	public void test() {
		System.out.println("DerivedB");
	}
}