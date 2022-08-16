import java.util.Iterator;
import java.util.Stack;

public class QueueTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Integer> stk = new Stack<Integer>();
		Stack<Integer> stk1 = new Stack<Integer>();
		
		stk.add(45);
		stk.add(46);
		stk.add(47);
		stk.add(48);
		stk.add(49);
		stk.add(50);
		
		for(Integer i:stk) {
			stk1.add(i);
		}
		
		System.out.println("Before Removing");
		for(Integer i:stk) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("Removed Elements are :");
		
		stk.remove(3);
		stk.remove(2);
		
		Iterator<Integer> itr = stk1.iterator();
		while(itr.hasNext()) {
			Integer num = itr.next();
			if(!stk.contains(num)) {		
				System.out.println(num);
			}
		}
		
		System.out.println("After Removing");
		for(Integer i:stk) {
			System.out.print(i+" ");
		}
		
	}

}
