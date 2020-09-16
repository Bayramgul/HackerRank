package oca;

public class Q_74 {
	public static void main(String[] args) {
		C2 obj1=new C1();
		I obj2=new C1();
		
//		C2 s=obj2;	// obj2 I yi referans almis I nin C2 ile baglantisi yok C2 I yi referans alan objeyi alamaz.
//		I t=obj1;	// obj1 C2 yi referans almis I nin C2 ile baglantisi yok I C2 yi referans alan objeyi alamaz.
		
//		t.displayI();
//		s.displayC2();
	}
}

class C2 {
	public void displayC2() {
		System.out.println("C2");
	}

	
}
interface I{
	public void displayI(); 
}

class C1 extends C2 implements I{
	public void displayI() {
		System.out.println("C1");
	}
}
//what is the result?
//answer:
//Compilation fails.


