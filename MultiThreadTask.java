import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class thread10 implements Runnable{
	
	private int x;
	private int y;

	public thread10(int i,int j) {
		// TODO Auto-generated constructor stub
		this.x = i;
		this.y = j;
	}

	@Override
	public synchronized void run() {
		// TODO Auto-generated method stub
			System.out.println(x+ " "+y);
	
	}
	
}
public class MultiThreadTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExecutorService executor = Executors.newFixedThreadPool(5);
		
		for(int i=1;i<10;i=i+2) {
			thread10 t = new thread10(i,i+1);
			executor.execute(t);
		}
		
		executor.shutdown();
	}

}
