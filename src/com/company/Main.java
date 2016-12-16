package com.company;

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

class Hej extends Thread {
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

class Hello extends Thread {
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
        Hello obj3 = new Hello();

        obj1.start();
        try { Thread.sleep(8); } catch(Exception e) {}
        obj2.start();
        try { Thread.sleep(8); } catch(Exception e) {}
        obj3.start();
        try { Thread.sleep(8); } catch(Exception e) {}
    }
}

