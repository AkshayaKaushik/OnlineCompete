import java.util.concurrent.Semaphore;
/*
 * in this example the use of synchronization block or method is not there
 * but still thread get execute one by one because at a time only one thread is allowed to get the 
 * permit to access the shared resource sem object.
*/
public class SemaphoreDemo {
	private static final Semaphore sem=new Semaphore(1);
private static final First f=new First(sem); 
	public static void main(String[] args) {
	Thread t1=new Thread(f);
	Thread t2=new Thread(f);
	t1.start();
	t2.start();
}
}
class First implements Runnable{
	Semaphore sem;
	public First(Semaphore sem) {
		this.sem=sem;
	}
	public  void run() {
		try {
			sem.acquire();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println("Thread Name "+Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
			System.out.println(sem.toString());
			sem.release();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Current Thread ID "+Thread.currentThread().getId());
	}
}