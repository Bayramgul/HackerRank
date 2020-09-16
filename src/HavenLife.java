//import java.util.List;
//
//public class HavenLife {
//
//	// Java program to find min operation 
//	
//		/* Function to print minimum operation required 
//		to make all elements of an array equal */
//		static void printMinOp(List <Integer> list) 
//		{ 
//			int arraySum, largest; 
//			arraySum = 0; 
//			largest = list.get(0); 
//			for (int i = 0; i < list.size() ; i ++) 
//			{ 
//				/* If current element is smaller than 
//				update smallest */
//				if (list.get(i) > largest) {
//					largest = list.get(i);	
//				}
//				while(list.get(i)!=largest) {
//						list.get(i)+=list.get(i);
//					}
//
//			} 
//
////			int minOperation = arraySum - arr_size * smallest; 
//
//			/* Print min operation required */
////			System.out.println("Minimum Operation = " + 
////								minOperation); 
//
//		} 
//
//		/* Driver program to test above functions */
//		public static void main (String[] args) 
//		{ 
//			int arr[] = {5, 6, 2, 4, 3}; 
//			printMinOp(arr); 
//		} 
//	} 
//
//	
//
