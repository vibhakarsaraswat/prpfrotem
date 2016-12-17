package com.company;

public class Main {

    public static void main(String[] args) {

        // Since obj1 and obj2 are only used once,
        // so instead of passing the OBJECT and then calling the functions,
        // provided the function definition itself.
        Thread t1 = new Thread(() -> {
            for(int i = 1; i <= 5; i++) {
                System.out.println("1 - Hi");
                try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
            }
        });
        t1.start();
        try { Thread.sleep(20); } catch(Exception e) { e.printStackTrace(); }

        Thread t2 = new Thread(() -> {
            for(int i = 1; i <= 5; i++) {
                System.out.println("2 - Hello");
                try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
            }
        });
        t2.start();
        try { Thread.sleep(20); } catch(Exception e) { e.printStackTrace(); }
    }
}