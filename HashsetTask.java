import java.util.HashSet;

public class HashsetTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> hashSet = new HashSet<Integer>();
		
		hashSet.add(12);
		hashSet.add(23);
		hashSet.add(89);
		hashSet.add(10);
		hashSet.add(40);
		
		if(hashSet.contains(23)) {
			System.out.println("Yes");
		}
		hashSet.remove(23);
		System.out.println(hashSet);
		
	}
}
