package oca;

public class Q_177 {
public void fly() {
	System.out.println("Fly");

}
public static void main(String[] args) {
	Q_177  b = new Peacock ();
	Peacock p = (Peacock) b;
	p.fly();
	p.dance();
}
}
class Peacock extends Q_177{
	public void dance() {
		System.out.println("Dance");
	}
}