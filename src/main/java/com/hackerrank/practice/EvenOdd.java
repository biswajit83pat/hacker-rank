package com.hackerrank.practice;

public class EvenOdd {

	private Sequencer sequencer;
	
	public EvenOdd(Sequencer sequencer) {
		this.sequencer = sequencer;
	}
	
	public static void main(String[] args) throws InterruptedException {
		Sequencer sequencer = new Sequencer();
		EvenOdd evenOdd = new EvenOdd(sequencer);
		evenOdd.even.setName("Even");
		evenOdd.odd.setName("Odd");
		evenOdd.even.start();
		Thread.sleep(3000);
		evenOdd.odd.start();
		
		evenOdd.even.join();
		evenOdd.odd.join();
		
	}
	
	public Thread even = new Thread() {
		@Override
		public void run() {
			for(int i = 0; i < 10; i++) {
				if(i%2 == 0) {
					System.out.println("[EVEN] " + sequencer.generateNum2());
				}
			}
		}
	};
	
	public Thread odd = new Thread() {
		@Override
		public void run() {
			for(int i = 0; i < 10; i++) {
				if(i%2 == 1) {
					System.out.println("[ODD] " + sequencer.generateNum1());
				}
			}
		}
	};
	
}

class Sequencer {
	
	Object lock = new Object();
	
	private volatile int first = 0;
	private volatile int second = 0;
	
	public int generateNum1() {
		synchronized(lock) {
			try {
				lock.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			lock.notify();
			return ++first;
		}
	}
	
	public int generateNum2() {
		synchronized (lock) {
			lock.notify();
			try {
				lock.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			return ++second;
		}
	}
	
}
