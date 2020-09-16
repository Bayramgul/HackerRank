package oca;

public class Q_13 {
	public static void main(String[] args) {
//		Vehicle y = new Car(20);
//		System.out.println(y);
	}
	class Vehicle{
		int x;
		Vehicle(){
			this(10);			// line n1
		}
		Vehicle(int x){
			this.x= x;
		}
	}
	public class Car extends Vehicle{
		int y;
		public Car(){
			super(10);		// line n2
		}
		public Car(int y){
			super(y); 
			this.y =y;
		}
		public String toString() {
			return super.x + ":" + this.y;
		}
	}

}
