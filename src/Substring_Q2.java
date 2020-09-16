import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Substring_Q2 {

	public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        Scanner scan=new Scanner(System.in);
        // s=scan.next();
        // k=scan.nextInt();
        SortedSet <String> tSet=new TreeSet<String> ();
       for(int i=0; i<s.length()-k; i++ ){
         tSet.add(s.substring(i,i+k));
        
       }
        smallest=tSet.first();
        largest=tSet.last();
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String A=scan.next();
        /* Enter your code here. Print output to STDOUT. */
        String [] arr= A.split("");
        String reversed="";
        for(int i=arr.length-1;i>=0; i--){
         reversed= reversed + arr[i];
        }
        System.out.println(reversed);
        if(A.equals(reversed)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
       ///////////////////////////////////
        String s = scan.next();
        String d=scan.next();
        int a=s.length();
        int b= d.length();
        int sum=a + b;
        ///////////////////////////
        int n=scan.nextInt();
        int[] x = new int[n];
        for(int j=0; j<x.length;j++){
            x[j]=10;
        }
        System.out.println(sum);
//        Array [] String s1=s.split("");
        if(s.compareTo(d)>0){
             System.out.println("Yes");
        }else{
             System.out.println("No");
        }
        System.out.println(s.substring(0,1).toUpperCase().concat(s.substring(1,a))+" " +
                d.substring(0,1).toUpperCase().concat(d.substring(1,b)));
        s=s.toUpperCase();
      
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }

}
