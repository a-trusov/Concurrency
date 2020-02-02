package ru.papont.guziv.part1;

public class Main {
    public static void main(String[] args) {
        new MyThread().start();
        new MyThread().start();
        new MyThread().start();


        MyThread myThread = new MyThread();
        myThread.start();
//        myThread.run();

        System.out.println(Thread.currentThread().getName());

        MyRunnable myRunnable = new MyRunnable();
        Thread thread2 = new Thread(myRunnable);
        thread2.start();
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 400; i++) {
            System.out.println("Thread name is - " + Thread.currentThread().getName() + " i = " + i);

        }
//        throw new RuntimeException();
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());

    }
}
