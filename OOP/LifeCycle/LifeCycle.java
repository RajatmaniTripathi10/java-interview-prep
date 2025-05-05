class MyThread implements Runnable {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Count : " + i);
            try {
                // Simulating some work with sleep
                System.out.println(Thread.currentThread().getName() + " is going to sleep");
                Thread.sleep(1000); // Timed Waiting state
                System.out.println(Thread.currentThread().getName() + " woke up");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        synchronized (MyThread.class) {
            System.out.println(Thread.currentThread().getName() + " has entered the synchronized block.");
            // Simulating some work inside the synchronized block
            try {
                Thread.sleep(1000); // Timed Waiting state
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " is leaving the synchronized block.");
        }
    }

    public static void main(String[] args) {
        MyThread myRunnable = new MyThread();
        
        // Creating threads
        Thread thread1 = new Thread(myRunnable, "Thread-1");
        Thread thread2 = new Thread(myRunnable, "Thread-2");

        System.out.println(thread1.getName() + " is in New state.");
        System.out.println(thread2.getName() + " is in New state.");

        // Starting threads
        thread1.start(); // Moves to Runnable state
        thread2.start(); // Moves to Runnable state

        // Wait for both threads to finish
        try {
            thread1.join(); // Main thread will wait for thread1 to finish
            thread2.join(); // Main thread will wait for thread2 to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread has finished execution.");
    }
}