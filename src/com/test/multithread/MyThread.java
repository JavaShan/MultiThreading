/**
 * 
 */
package com.test.multithread;

/**
 * @author shanmugam
 *
 */
public class MyThread implements Runnable {

	Thread t;
	String wordBuilder;
	SentenceGenerator generator;
	
	public MyThread(String threadName) {
		// TODO Auto-generated constructor stub
		t = new Thread(this, threadName);
		generator = new SentenceGenerator();
		t.start();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub

		// System.out.println(t.getName());
		formwordandcount(t.getName());

	}

	public void formwordandcount(String tName) {

		System.out.println(generator.getWordBasedonthread(tName));

	}

}
