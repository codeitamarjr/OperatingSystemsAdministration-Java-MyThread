package com.company;

import java.lang.reflect.Constructor;

public class MyThread {
    public static void thread() {
        System.out.println("test");
    }
}

class MyThread1 implements Runnable {

    MyThread1() {
        //Constructor
    }

    public void run() {
        for (; ; ) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                return;
            }
            System.out.println("Thread1");
        }
    }
}



