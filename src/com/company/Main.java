package com.company;

public class Main {

    public static void main(String[] args) {
        // Creating Object 'obj1' of Runnable Interface
        // and providing Implementation of the ANONYMOUS Class at the same time
        Runnable obj1 = new Runnable() {
            public void run() {
                for(int i = 1; i <= 5; i++) {
                    System.out.println("1 - Hi");
                    try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
                }
            }
        };

        // Creating Object 'obj2' of Runnable Interface
        // and providing Implementation of the ANONYMOUS Class at the same time
        Runnable obj2 = new Runnable() {
            public void run() {
                for(int i = 1; i <= 5; i++) {
                    System.out.println("2 - Hello");
                    try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
                }
            }
        };

        Thread t1 = new Thread(obj1);
        t1.start();
        try { Thread.sleep(20); } catch(Exception e) { e.printStackTrace(); }

        Thread t2 = new Thread(obj2);
        t2.start();
        try { Thread.sleep(20); } catch(Exception e) { e.printStackTrace(); }
    }
}