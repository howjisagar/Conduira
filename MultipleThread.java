class thread1 extends Thread{
	
	public void run() {
		System.out.println("Hello All");
	}
	
}

class thread2 extends Thread{
	
	public void run() {
		System.out.println("Hello All");
	}
	
}

class thread3 extends Thread{
	
	public void run() {
		System.out.println("Hello All");
	}
	
}

class thread4 extends Thread{
	
	public void run() {
		System.out.println("Hello All");
	}
	
}

class thread5 extends Thread{
	
	public void run() {
		System.out.println("Hello All");
	}
	
}
public class MultipleThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new thread1();
		Thread t2 = new thread2();
		Thread t3 = new thread3();
		Thread t4 = new thread4();
		Thread t5 = new thread5();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();

	}

}
