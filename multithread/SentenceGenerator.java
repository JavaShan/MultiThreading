/**
 * 
 */
package com.test.multithread;

/**
 * @author shanmugam
 *
 */
public class SentenceGenerator {

	public SentenceGenerator() {
		// TODO Auto-generated constructor stub
	}

	protected String getWordBasedonthread(String name) {

		String revertBack = null;
		switch (name) {
		case "Thread-One":
			revertBack = "This ";
			break;
		case "Thread-Two":
			revertBack = "is ";
			break;
		case "Thread-Three":
			revertBack = "mutithreading ";
			break;
		case "Thread-four":
			revertBack = "executed by ";
			break;
		case "Thread-five":
			revertBack = "same order, hwo  ";
			break;

		case "Thread-six":
			revertBack = "it is created...";
			break;

		default:
			break;
		}
		return revertBack;
	}
}
