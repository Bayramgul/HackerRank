package oca;

import oca.Q_13.Car;
import oca.Q_13.Vehicle;

public class Q_11 {

	public static void main(String[] args) {
		String[] strs = {"A", "B"};
		int idx = 0;
		for (String s : strs) {
			strs[idx].concat(" element " + idx);
			idx++;		
			// idx is incremented in the loop but nothing is affected outside of the loop	
			// there is no syso nothing is printed from this loop
		}
//		System.out.println(strs.length);
		for (idx = 0; idx < strs.length; idx++) {
			System.out.println(strs[idx]);
		}

		
	}

}
