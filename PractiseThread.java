
class Mythread extends Thread{
	Mythread(String name){
		super(name);
	}
	@Override
	public void run() {
		System.out.println("Thread is running.");
	}
}
public class PractiseThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mythread t = new Mythread("Thread 1");
		System.out.println("Current Thread is :"+t.getName());
		t.start();
		
	}

}
