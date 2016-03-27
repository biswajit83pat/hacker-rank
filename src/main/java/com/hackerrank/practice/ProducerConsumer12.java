package com.hackerrank.practice;

public class ProducerConsumer12 {

    private Object lock = new Object();
    private Object lock1 = new Object();
    int i;
    
	 public Thread producer=new Thread(new Runnable() {
            @Override
            public void run() {

                for (i = 1; i < 10; i++) {
                    System.out.println("producer put :"+i);
                    synchronized (lock) {

                        try {

                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        synchronized (lock1) {
                            lock1.notify();


                        }
                    }
                }

            }
        });


        public Thread consumer = new Thread(new Runnable() {
            @Override
            public void run() {

                for (int j= 1; j < 10; j++) {
                    System.out.println("Consumer get :" + i);
                    synchronized (lock) {

                        lock.notify();
                    }

                    synchronized (lock1) {
                        try {

                            lock1.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }

            }
        });



	 public static void main(String[] args) {
	        ProducerConsumer12 pro = new ProducerConsumer12(); 
	        pro.producer.start();
	        pro.consumer.start();
	}
}
