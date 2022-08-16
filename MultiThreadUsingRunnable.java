class Newthread1 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Hello India");
	}
	
}
class Newthread2 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Hello India");
	}
	
}
class Newthread3 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Hello India");
	}
	
}
class Newthread4 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Hello India");
	}
	
}
class Newthread5 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Hello India");
	}
	
}
public class MultiThreadUsingRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r1 = new Newthread1();
		Runnable r2 = new Newthread2();
		Runnable r3 = new Newthread3();
		Runnable r4 = new Newthread4();
		Runnable r5 = new Newthread5();
		Thread a = new Thread(r1);
		Thread b = new Thread(r2);
		Thread c = new Thread(r3);
		Thread d = new Thread(r4);
		Thread e = new Thread(r5);
		
		a.start();
		b.start();
		c.start();
		d.start();
		e.start();
		

	}

}
