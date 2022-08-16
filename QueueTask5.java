import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueTask5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue<Integer> q = new PriorityQueue<Integer>();
		PriorityQueue<Integer> p = new PriorityQueue<Integer>();
		
		q.add(56);
		q.add(57);
		q.add(58);
		q.add(59);
		q.add(60);
		q.add(61);
		
		for(Integer i : q) {
			p.add(i);
		}
		
		System.out.println("Before Removing");
		for(Integer i : q) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("Removed Elements are :");
		
		q.remove(59);
		q.remove(60);
		
		Iterator<Integer> itr = p.iterator();
		while(itr.hasNext()) {
			Integer num = itr.next();
			if(!q.contains(num)) {		
				System.out.println(num);
			}
		}
		
		System.out.println("After Removing");
		for(Integer i : q) {
			System.out.print(i+" ");
		}
		
		
	}

}
