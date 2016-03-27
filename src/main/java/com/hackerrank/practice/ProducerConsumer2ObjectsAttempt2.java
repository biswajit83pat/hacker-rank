package com.hackerrank.practice;

import java.util.concurrent.TimeUnit;

public class ProducerConsumer2ObjectsAttempt2 {

	
	public ProducerConsumer2ObjectsAttempt2() {
	}
	
	public static void main(String[] args) throws InterruptedException {
		Shared3 sharedObj = new Shared3();
		ProducerThird producer = new ProducerThird(sharedObj);
		ConsumerThird consumer = new ConsumerThird(sharedObj);
		
		Thread pro = new Thread(producer);
		Thread con = new Thread(consumer);
		
		pro.start();
		con.start();

	}
}

class Shared3 {
	private Object prod = new Object();
	private Object cons = new Object();
	private volatile int token = 0;
	
	public void produce() throws InterruptedException {
		System.out.println("@[Producer] Produced.");
		synchronized (prod) {
			try{
				prod.wait();
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
			synchronized (cons) {
				//System.out.println("[Producer] Waiting for Consumer to consume..");
				cons.notify();
			}
		}
		
	}
	
	public void consume() throws InterruptedException {
		System.out.println("[Consumer] Consumed.");
		synchronized (prod) {
			prod.notify();
			synchronized (cons) {
				try{
					cons.wait();
				} catch(InterruptedException e) {
					e.printStackTrace();
				}
				//System.out.println("[Consumer] Consumed.");
			}
		}
		
	}
	
}

	
	class ProducerThird extends Thread {

		private Shared3 sharedObj;
		
		public ProducerThird(Shared3 sharedObj) {
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
	
	class ConsumerThird extends Thread {

		private Shared3 sharedObj;
		
		public ConsumerThird(Shared3 sharedObj) {
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
	

