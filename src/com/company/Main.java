package com.company;

// Implementing THREAD using Thread class
class Hi extends Thread {
    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println("1 - Hi");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Hej implements Runnable {
    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println("2 - Hej");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Hello implements Runnable {
    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println("3 - Hello");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Main {

    public static void main(String[] args) {
        Hi obj1 = new Hi();
        Hej obj2 = new Hej();
        /* intead of writing 'Hello obj3', we can also write 'Runnable obj3'
          because Create the "Reference of an Interface" and "create the Object of the class".
         */
        Runnable obj3 = new Hello();

        obj1.start();
        try { Thread.sleep(20); } catch(Exception e) { e.printStackTrace(); }

        // Creating a new Thread object i.e. t1
        // so that we can pass the Object of Runnable class i.e. obj2
        // so that whenever 't1.start()' is called, it should execute 'run()' methood of Hej class.
        Thread t1 = new Thread(obj2);
        t1.start();
        try { Thread.sleep(20); } catch(Exception e) { e.printStackTrace(); }

        Thread t2 = new Thread(obj3);
        t2.start();
        try { Thread.sleep(20); } catch(Exception e) { e.printStackTrace(); }

    }
}