package com.hackerrank.practice;

public class ProducerConsumerTest {
	private static Object globalLock = new Object();
	public static void main(String[] args) {
		CubbyHole c = new CubbyHole();
		Producer p1 = new Producer(c, 1);
		Consumer c1 = new Consumer(c, 1);
		p1.start();
		c1.start();
	}
}

class CubbyHole {
	private Object lock = new Object();
	
	private int contents;
	private boolean available = false;

	public CubbyHole(Object lock) {
		this.lock = lock;
	}
	
	public CubbyHole() {
		
	}
	
	public int get() {
		synchronized(lock) {
			if (!available) {
				try {
					lock.wait();
				} catch (InterruptedException e) {
				}
			}
			available = false;
			lock.notifyAll();
			return contents;
		}
	}

	public void put(int value) {
		synchronized(lock) {
			if (available) {
				try {
					lock.wait();
				} catch (InterruptedException e) {
				}
			}
			contents = value;
			available = true;
			lock.notifyAll();
		}
	}
}

class Consumer extends Thread {
	private CubbyHole cubbyhole;
	private int number;
	
	public Consumer(CubbyHole c, int number) {
		cubbyhole = c;
		this.number = number;
	}

	public void run() {
		int value = 0;
		//for (int i = 0; i < 10; i++) {
		while(true) {
			value = cubbyhole.get();
			System.out.println("Consumer #" + this.number + " got: " + value);
		}
		//}
	}
}

class Producer extends Thread {
	private CubbyHole cubbyhole;
	private int number;
	
	public Producer(CubbyHole c, int number) {
		cubbyhole = c;
		this.number = number;
	}


	public void run() {
		int i = 0;
		//for (int i = 0; i < 10; i++) {
		while(true) {
			cubbyhole.put(++i);
			System.out.println("Producer #" + this.number + " put: " + i);
			try {
				sleep((int) (java.lang.Math.random() * 100));
			} catch (InterruptedException e) {
			}
		}
	}
}