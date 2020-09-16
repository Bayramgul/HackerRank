package oca;

public class Q_35 {
	public static void main(String[] args) {
		String opt = "true";
		switch (opt) { // switch does not work with  long, double, float and boolean 
		case "true":
			System.out.print("True");
			break;
		default:
			System.out.println("***");
		}
		System.out.print("Done");
	}
}

//Which modification enables the code fragment to print TrueDone?
//A.	Replace line 5 With String opt = "true";Replace line 7 with case "true":
//B.	Replace line 5 with boolean opt = l;Replace line 7 with case 1:
//C.	At line 9, remove the break statement.
//D.	Remove the default section.

