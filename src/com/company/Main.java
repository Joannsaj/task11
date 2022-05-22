package com.company;


class myThread implements Runnable{
    Thread thread;

    myThread(String name){
        thread = new Thread(this, name);
    }
    public static myThread createAndStart(String name){
        myThread myThreadd = new myThread(name);
        myThreadd.thread.start();
        return myThreadd;
    }
    @Override
    public void run() {
        System.out.println(thread.getName());
        try {
            for (int count=0; count<10; count++){
                Thread.sleep(100);
                System.out.println(thread.getName() +" is executed, the counter value:" + count);
            }
        }catch (InterruptedException e){
            System.out.println(thread.getName() + "has been interrupted");
        }
        System.out.println(thread.getName() + "finishes running");
    }
}
public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("The main thread starts running");
        myThread myThread1 = myThread.createAndStart("Child thread 1");
        myThread myThread2 = myThread.createAndStart("Child thread 2");
        myThread myThread3 = myThread.createAndStart("Child thread 3");
            try{
                myThread1.thread.join();
                myThread2.thread.join();
                myThread3.thread.join();
            }catch (InterruptedException e){
                System.out.println("The main thread has been terminated.");
            }
        System.out.println("tHe main thread is exiting");
    }
}
