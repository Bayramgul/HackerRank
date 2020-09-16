package oca;

public class Q_17 {
	int x, y;
	public Q_17(int x, int y) {
		initialize(x, y);
	}
	public void initialize(int x, int y) {
		this.x = x * x;
		this.y = y * y;
	}
	public static void main(String[] args) {
		int x = 3, y =5;
		Q_17 objTest = new Q_17(x, y);
		System.out.println(x + " " + y); // prints the local variables
//		System.out.println(objTest.x+" "+ objTest.y);
	}
	}
	//What is the result?
	//A.	Compilation fails.
	//B.	3 5
	//C.	0 0
	//D.	9 25


