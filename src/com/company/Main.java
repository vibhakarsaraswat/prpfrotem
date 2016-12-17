package com.company;

public class Main {

    public static void main(String[] args) {
        // Creating Object 'obj1' of Runnable Interface
        // and providing Implementation of the ANONYMOUS Class at the same time
        // And since Runnable is a Functional Interface, we can implement Lambda expression below
        Runnable obj1 = () -> {
            for(int i = 1; i <= 5; i++) {
                System.out.println("1 - Hi");
                try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
            }
        };

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