package com.company;

public class Main {

    public static void main(String[] args) throws Exception {

        // Since obj1 and obj2 are only used once,
        // so instead of passing the OBJECT and then calling the functions,
        // provided the function definition itself.
        Thread t1 = new Thread(() -> {
            System.out.println("\nPriority of the current Thread is: " + Thread.currentThread().getPriority());
            for(int i = 1; i <= 5; i++) {
                // We can also print the Priority of the Current Thread
                System.out.println("1 - Hi");
                try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
            }
        },"Thread Hi");

        Thread t2 = new Thread(() -> {
            for(int i = 1; i <= 5; i++) {
                System.out.println("2 - Hello");
                try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
            }
        },"Thread Hello");

        // Thread Priority Ranges between 1 to 10, where in
        // 10 is Maximum-Priority, 5 is Normal-Priority and 1 is Minimum-Priority
        // By default each Thread gets Normal Priority i.e. 5
        System.out.println("Priority for Thread t1 is: " + t1.getPriority());
        System.out.println("Prioritt for Thread t2 is: " + t2.getPriority());

        // We can change the Thread Priority by directly providing the Priority value
        t1.setPriority(1);
        t2.setPriority(10);

        System.out.println("Now Priority for Thread t1 is: " + t1.getPriority());
        System.out.println("Now Prioritt for Thread t2 is: " + t2.getPriority());

        // We can also change/set the Thread Priority by using inbuilt constant values i.e.
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        System.out.println("Priority is changed again and now for Thread t1 priority is: " + t1.getPriority());
        System.out.println("Priority is changed again and now for Thread t2 priority is: " + t2.getPriority());

        t1.start();
        try { Thread.sleep(20); } catch(Exception e) { e.printStackTrace(); }

        t2.start();
        try { Thread.sleep(20); } catch(Exception e) { e.printStackTrace(); }


        // Join is a method which Waits for this thread to die.
        t1.join();
        t2.join();

        System.out.println("Bye Threads");
    }
}
