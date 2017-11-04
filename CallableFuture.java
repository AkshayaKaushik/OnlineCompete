package com.java.core.Multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author admin
 *
 *This class is an example of implementing Callable and Future in JAVA.
 *These interface and class are use when you require a response whenever a Thread gets 
 *terminated. So basically by that response you can keep track of the progress of Threads.
 *Like :- whenever you implement call() method for threads on the basis of return of responses you can 
 *keep track of threads and in case if any thread do not return a response then you can particularly 
 *trace the specific thread who didn't sent the response and you can look for an issue. 
 */
public class CallableFuture {
public static void main(String[] args) {
	Cunt other =new Cunt();
	
	FutureTask ft=new FutureTask(other);
	Thread t=new Thread(ft);
	t.start();
	try {
		System.out.println(ft.get());
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ExecutionException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
	
}
class Cunt implements Callable{

	public Object call() throws Exception {
		System.out.println(Thread.currentThread().getName());
		return "The callable implemented class gets called.";
	}}