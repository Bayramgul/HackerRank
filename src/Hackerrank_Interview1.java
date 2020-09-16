import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Hackerrank_Interview1 {

	public static int countPairs(List<Integer> numbers, int k) {

		Set<Integer> value = new HashSet<Integer>();
		int counter = 0;
		for (int i : numbers) {
			value.add(i);
		}
		for (int i : value) {
			if (value.contains(i + k)) {
				++counter;
			}
		}
		return counter;
	}

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();

		// adding elements to arraylist
		numbers.add(0, 1);
		numbers.add(1, 2);
		numbers.add(2, 5);
		numbers.add(3, 6);
		numbers.add(4, 9);
		System.out.println(numbers);

//		numbers= {1,2,5,6,9,10};
		System.out.println(countPairs(numbers, 2));

	}

}
