
public class HavenLife_ {

	/*
	 * ALL Given an integer, if the number is prime, return 1. Otherwise find its
	 * smallest divisor greater than 1.
	 */
	public static int isPrime(int given) {
		if (given > 1) {
			for (int i = 2; i < given; i++) {
				if (given % i == 0) {
					return i;
					
				}
			}

		}
			return 1;
		
	}
public static void main(String[] args) {
	System.out.println(isPrime(3));
}
}
