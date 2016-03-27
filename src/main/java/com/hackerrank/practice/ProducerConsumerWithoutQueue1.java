package com.hackerrank.practice;

import java.util.concurrent.TimeUnit;

public class ProducerConsumerWithoutQueue1 {

	private volatile boolean available = false;
	//private Object lock = new Object();
	
	public ProducerConsumerWithoutQueue1() {
	}
	
	public static void main(String[] args) {
		Perform sharedObj = new Perform();
		ProducerFirst producer = new ProducerFirst(sharedObj);
		ConsumerFirst consumer = new ConsumerFirst(sharedObj);
		
		Thread pro = new Thread(producer);
		Thread con = new Thread(consumer);
		
		pro.start();
		con.start();

	}
}

class Perform {
	private Object lock = new Object();
	private boolean available = false;
	
	public void produce() throws InterruptedException {
		synchronized (lock) {
			//while (true) {
				/*if (available) {
					System.out.println("[Producer] Waiting for Consumer to consume...");
					// lock.wait();
					lock.notifyAll();
					lock.wait();
				} else {
					System.out.println("[Producer] Produced...");
					available = true;
					lock.wait();
					lock.notifyAll();
					// lock.notifyAll();
				}*/
				
				if(available) {
					System.out.println("[Producer] Waiting...");
					lock.wait();
				}
				
				System.out.println("[Producer] Produced...");
				available = true;
				lock.notify();
				
				
				/*if(available) {
					System.out.println("[Producer] Waiting to be consumed...");
					lock.wait();
				} else {
					System.out.println("[Producer] Produced...");
					available = true;
					lock.notify();
				}*/
			//}
		}
	}
	
	public void consume() throws InterruptedException {
		synchronized (lock) {
			//while (true) {
				/*if (available) {
					System.out.println("[Consumer] Consumed from Producer.");
					available = false;
					// lock.notifyAll();
					lock.wait();
				} else {
					System.out.println("[Consumer] Waiting for Producer to produce");
					// lock.wait();
					lock.notifyAll();
				}*/
				
				if(!available) {
					System.out.println("[Consumer] Waiting...");
					lock.wait();
				}
				
				System.out.println("[Consumer] Consumed...");
				available = false;
				lock.notify();
				
				/*if(available) {
					System.out.println("[Consumer] Consumed from Producer.");
					available = false;
					lock.wait();
				} else {
					System.out.println("[Consumer] Waiting for Producer to produce");
					lock.notify();
				}*/
			//}
		}
	}
	
}

	
	class ProducerFirst extends Thread {

		private Perform sharedObj;
		
		public ProducerFirst(Perform sharedObj) {
			this.sharedObj = sharedObj;
		}
		
		@Override
		public void run() {
			try {
				while(true) {
					sharedObj.produce();
					sleep((int) (java.lang.Math.random() * 100));
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}
	
	class ConsumerFirst extends Thread {

		private Perform sharedObj;
		
		public ConsumerFirst(Perform sharedObj) {
			this.sharedObj = sharedObj;
		}
		
		@Override
		public void run() {
			try {
				//Wait
				//TimeUnit.SECONDS.sleep(3);
				while(true) {
					sharedObj.consume();
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	

