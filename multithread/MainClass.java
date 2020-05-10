/**
 * 
 */
package com.test.multithread;

/**
 * @author shanmugam
 *
 */
public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String args[]) {

		System.out.println("-------Threads started-----");
		MyThread tOne = new MyThread("Thread-One");
		MyThread tTwo = new MyThread("Thread-Two");
		MyThread tThree = new MyThread("Thread-Three");
		MyThread tFour = new MyThread("Thread-four");
		MyThread tFive = new MyThread("Thread-five");
		MyThread tSix = new MyThread("Thread-six");
		
		tOne.t.setPriority(10);
		tTwo.t.setPriority(8);
		tThree.t.setPriority(6);
		tFour.t.setPriority(4);
		tFive.t.setPriority(3);
		tSix.t.setPriority(2);
		
		try {
			
			tOne.t.join();
			tTwo.t.join();
			tThree.t.join();
			tFour.t.join();
			tFive.t.join();
			tSix.t.join();

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
     
		System.out.println("-------Threads Exited-----");
	}
}
