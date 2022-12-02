package com.kamiltalowski;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        /*Multithreading=
        * Process of execution multiple threads simultaneously. Helps maximum utilization  of CPU
        * Threads are independent, they dont't affect the execution of other threads. An exception in one thread
        * will not interrupt other threads
        * useful for serving multiple clients, multiplayer games, or other mutually independent tasks*/

        // Create subclass of Thread
        MyThread thread1= new MyThread();
        //Second way of creating thread, by creating subclass implementing interface Runnable and passing it as a argument
        //to constructor of Thread class, better way cuz Runnable can extends another class
        MyRunnable runnable1= new MyRunnable();
        Thread thread2= new Thread(runnable1);

        /*thread1.setDaemon(true);
        thread2.setDaemon(true);*/

        thread1.start();
        //thread1.join(3000); //calling thread (ex. main) wait until the specified thread die or for x milliseconds
        thread2.start();

        // System.out.println(1/0);


    }
}
