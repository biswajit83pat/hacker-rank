package com.hackerrank.practice;

import java.util.concurrent.TimeUnit;

public class ProducerConsumer {

	private final static int SIZE = 10;
	private Integer[] array = new Integer[SIZE];
	
	public ProducerConsumer() {
		//Initialize array of Integers.
		/*for(int i = 0; i <SIZE; i++) {
			array = null;
		}*/
	}
	
	public static void main(String[] args) {
		Integer[] arrayInt = new Integer[SIZE];
		Producer producer = new ProducerConsumer().new Producer(arrayInt);
		Consumer consumer = new ProducerConsumer().new Consumer(arrayInt);
		
		Thread pro = new Thread(producer);
		Thread con = new Thread(consumer);
		
		con.start();
		pro.start();

	}
	
	class Producer implements Runnable {

		private Integer[] sharedArr;
		private volatile int counter;
		
		public Producer(Integer[] sharedArr) {
			counter = 0;
			this.sharedArr = sharedArr;
		}
		
		@Override
		public void run() {
			produce();
		}
		
		public void produce() {
			synchronized (sharedArr) {
				for(int i = 0; i <SIZE; i++) {
					if(sharedArr[i] == null) {
						sharedArr[i] = new Integer(++counter);
						System.out.println("[Producer] Produced value : " + counter + " in index : " + i);
						sharedArr.notifyAll();
					}
				}
			}
		}
		
	}
	
	class Consumer implements Runnable {

		private Integer[] sharedArr;
		
		public Consumer(Integer[] sharedArr) {
			this.sharedArr = sharedArr;
		}
		
		@Override
		public void run() {
			try {
				//TimeUnit.SECONDS.sleep(3);//Sleep for 3 seconds to give a headstart
				consume();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		public void consume() throws InterruptedException {
			synchronized (sharedArr) {
				for(int i = 0; i <SIZE; i++) {
					if(sharedArr[i] != null) {
						System.out.println("[Consumer] Consumed value : " + sharedArr[i] + " in index : " + i);
						sharedArr[i] = null;
					} else {
						System.out.println("[Consumer] WAITING for producer to produce!");
						i--;//for the first element that may be missed
						sharedArr.wait();
					}
				}
			}
		}
		
	}
	
}
