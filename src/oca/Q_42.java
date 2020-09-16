package oca;

public class Q_42 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("A");
		sb.append("A");
		sb.append("A");
		sb.append("A");
		System.out.println("before delete: " + sb);
		
		sb.delete(0, sb.length());  
		
		System.out.println("after delete: " + sb);

	}
}
