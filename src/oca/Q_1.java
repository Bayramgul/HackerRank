package oca;

public class Q_1 {
public static void main(String[] args) {
	int x=1;
int y=1;

//x++ returns the value of x and then increments
//++y increments the value of y and then returns y
	if(x++<++y) {
		System.out.print("Hello ");
	}else {
		System.out.print("Welcome ");
	}
	
	System.out.println("Log "+ x+":"+y);
//System.out.println(x++);
//System.out.println(x);
//System.out.println(++y);
//System.out.println(y);
}

	
}
