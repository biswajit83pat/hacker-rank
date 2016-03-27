package com.hackerrank.practice;

import java.util.concurrent.TimeUnit;

public class ProducerConsumer2ObjectsAttempt1 {

	
	public ProducerConsumer2ObjectsAttempt1() {
	}
	
	public static void main(String[] args) {
		Shared sharedObj = new Shared();
		ProducerSecond producer = new ProducerSecond(sharedObj);
		ConsumerSecond consumer = new ConsumerSecond(sharedObj);
		
		Thread pro = new Thread(producer);
		Thread con = new Thread(consumer);
		
		pro.start();
		con.start();

	}
}

class Shared {
	private Object prod = new Object();
	private Object cons = new Object();
	private volatile int token = 0;
	
	public void produce() throws InterruptedException {
		synchronized (prod) {
			System.out.println("[Producer] Produced.");
			prod.notify();
		}
		
		synchronized (cons) {
			System.out.println("[Producer] Waiting for Consumer to consume..");
			cons.wait();
		}
	}
	
	public void consume() throws InterruptedException {
		synchronized (prod) {
			System.out.println("[Consumer] Waiting for Producer to produce..");
			prod.wait();
		}
		
		synchronized (cons) {
			System.out.println("[Consumer] Consumed.");
			cons.notify();
		}
	}
	
}

	
	class ProducerSecond extends Thread {

		private Shared sharedObj;
		
		public ProducerSecond(Shared sharedObj) {
			this.sharedObj = sharedObj;
		}
		
		@Override
		public void run() {
			try {
				sleep(2000);
				while(true) {
					sharedObj.produce();
					sleep((int) (java.lang.Math.random() * 100));
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}
	
	class ConsumerSecond extends Thread {

		private Shared sharedObj;
		
		public ConsumerSecond(Shared sharedObj) {
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
	

