package oca;

public class Question_1 {

	public static String maskcc(String creditCard) {
		String x="XXXX-XXXX-XXXX-";
		StringBuilder sb=new StringBuilder(x);
		return sb.append(creditCard, 15,19).toString();//sb.append will add/concatenate
//		return x+creditCard.substring(15);
	}

	public static void main(String[] args) {

//		1. You are developing a banking module. You have developed a class named ccMask that has a maskcc method. Given the code fragment:
//			 You must ensure that the maskcc method returns a string that hides all digits of the credit card number except the four last digits (and the hyphens that separate each group of four digits).
////			Which two code fragments should you use at line n1, independently, to achieve this requirement? (Choose two.)
//		
System.out.println(maskcc("1234-5678-9101-1121"));
		
		
//		String str = "abcdefg";
//		StringBuilder sb=new StringBuilder();
//		sb.append(str);
//		sb.append(sb.substring(1,3));
//		System.out.println(sb);
//		
	}

}
