import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Maps_hackerrank {

	public static void main(String []argh)
	{
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		in.nextLine();
        Map<String, Integer> phonebook=new LinkedHashMap<>();
           Set<Entry<String,Integer>> entries= phonebook.entrySet();
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
            
			int phone=in.nextInt();
            phonebook.put(name, phone);
			in.nextLine();
            
		}
		while(in.hasNext())
		{
			String s=in.nextLine();
			if(!phonebook.containsValue(phonebook.get(s))){
		          System.out.println("Not found");
		            }else{
		              System.out.println(s+"= "+ phonebook.get(s));  
		            }
			
		}
	}
}

