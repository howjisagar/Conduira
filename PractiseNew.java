import java.util.*;
public class PractiseNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		String[] str = new String[n];
		for(int i=0;i<n;i++) {
			str[i]=sc.next();			
		}
		List<String> slist = Arrays.asList(str);
		long res = slist.stream().filter(x -> x.length()>3).count();
		System.out.println(res);
	}

}
