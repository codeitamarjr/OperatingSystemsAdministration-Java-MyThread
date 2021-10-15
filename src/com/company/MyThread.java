package com.company;

import java.lang.reflect.Constructor;

public class MyThread {
    public static void thread() {
        System.out.println("Start the threads");
        MyThread1 firstThread = new MyThread1("I am thread one!", 5000); //executed each 5 sec
        MyThread1 secondThread = new MyThread1("I am thread two!", 10000); //executed each 10 sec
        MyThread1 thirdThread = new MyThread1("I am thread three!", 1000); //executed each 1 sec

        new Thread(firstThread).start();
        new Thread(secondThread).start();
        new Thread(thirdThread).start();

    }
}

class MyThread1 implements Runnable {
    private String message;
    private int time;

    MyThread1(String message, int time) {
        this.message = message;
        this.time = time;
    }

    public void run() {
        for (; ; ) {
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                return;
            }
            System.out.println("Thread name " + message + " executed each " + time / 1000 + " seconds");
        }
    }
}



