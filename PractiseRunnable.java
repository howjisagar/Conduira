
class Mythread1 implements Runnable{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread is running.");
	}
	
}
public class PractiseRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r = new Mythread1();
		Thread t = new Thread(r);
		System.out.println(t.getName());
		t.start();
	}
}
