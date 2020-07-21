import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int s1=0;
            int s2=0;
            for(int j=1;j<=n;j+=2) {
            	s1+=a+j*b;
            }
            for(int k=1;k<=n;k*=2) {
            	s2=a+k*b;
            }
            
        }
        in.close();
	}

}
