

public class SyncroniztionDemo extends Thread{
/*
 * here obj object will act as the common shared resource 
 * between the threads s and y. Because of that we can achieve synchronization.
 * and this object will be passed from the calling class if the same object is created in the Sync 
 * class in that case when threads get started the class will get re instantiate and then the object obj will become 
 * individually accessible to both threads . Hence,it will not be treated as shared resource leads to no synchronization. 
*/	
private final static Sync s=new Sync();
public static void main(String[] args) {
	Thread t1=new Thread(s);
	Thread t2=new Thread(s);
	t1.start();
	t2.start();
}
}
class Sync implements Runnable{

	public synchronized void  run() {
		System.out.println("Thread name "+Thread.currentThread().getName());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	System.out.println("Thread info "+Thread.currentThread().getId());	
		
	}}
	
	class SecondTemp extends Thread{
	public synchronized void display() {
		System.out.println("Thread name "+Thread.currentThread().getName());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	System.out.println("Thread info "+currentThread().getId());	
	}
}