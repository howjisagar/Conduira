import java.util.HashSet;
import java.util.Set;

public class HashSetTask3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> set = new HashSet<Integer>();
		
		set.add(12);
		set.add(23);
		set.add(12);
		set.add(23);
		set.add(13);
		set.add(14);
		
		for(Integer i : set) {
			System.out.println(i);
		}
			
		

	}

}
