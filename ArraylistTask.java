import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(12);
		list.add(45);
		list.add(89);
		list.add(78);
		list.add(10);
		
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()) {
			Integer i = itr.next();
			System.out.println(i);
		}

	}

}
