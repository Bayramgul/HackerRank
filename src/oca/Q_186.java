package oca;

public class Q_186 {
	
protected void display(int x) {
	System.out.println("Parent "+ x);
	
}
public static void main(String[] args) {
	S2 sobj = new S2(); 
	sobj.display(10, 100);
}
}
class S2 extends Q_186 {
	public void display(int x, int y) { //x=10,y=100
		this.display(x); // Child 10
		display(y);   // Child 100
		super.display(y);  // Parent 100
	}
	protected void display(int x) {
		System.out.println("Child "+ x);
		
	}
	
}
