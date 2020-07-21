package oca;

public class Question_2 {

}

class Message {
	String msg = "Happy New Year!";

	public void print() {
		System.out.println(msg);
	}
}

class Test {
	public static void change(Message m) {
		m = new Message();
		m.msg = "Happy Holidays!";
	}

	public static void main(String[] args) {
		Message obj = new Message();
		obj.print();
		change(obj);
		obj.print();
	}
}