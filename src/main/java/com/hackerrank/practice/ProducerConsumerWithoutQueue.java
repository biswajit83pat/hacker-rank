package com.hackerrank.practice;

import java.util.concurrent.TimeUnit;

public class ProducerConsumerWithoutQueue {

	private volatile boolean available = false;
	//private Object lock = new Object();
	
	public ProducerConsumerWithoutQueue() {
	}
	
	public static void main(String[] args) {
		Operation sharedObj = new Operation();
		Producer1 producer = new Producer1(sharedObj);
		Consumer1 consumer = new Consumer1(sharedObj);
		
		Thread pro = new Thread(producer);
		Thread con = new Thread(consumer);
		
		pro.start();
		con.start();

	}
}

class Operation {
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
				
				while(available) {
					System.out.println("[Producer] Waiting...");
					lock.wait();
				}
				
				System.out.println("[Producer] Produced...");
				available = true;
				
				
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
				
				while(!available) {
					System.out.println("[Consumer] Waiting...");
					lock.wait();
				}
				
				System.out.println("[Consumer] Consumed...");
				available = false;
				
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

	
	class Producer1 extends Thread {

		private Operation sharedObj;
		
		public Producer1(Operation sharedObj) {
			this.sharedObj = sharedObj;
		}
		
		public Producer1() {
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
	
	class Consumer1 extends Thread {

		private Operation sharedObj;
		
		public Consumer1(Operation sharedObj) {
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
	

