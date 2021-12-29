package com.example;

public class Main {
    
    public static void main(String[] args) throws InterruptedException {
        ResourceExploiterWithLock resource = new ResourceExploiterWithLock(0);
        Thread worker1 = new ThreadedWorkerWithLock(resource);
        Thread worker2 = new ThreadedWorkerWithLock(resource);
        Thread worker3 = new ThreadedWorkerWithLock(resource);
        
        worker1.start();
        worker2.start();
        worker3.start();
        
        worker1.join();
        worker2.join();
        worker3.join();
    
        System.out.println(resource.getRsc());
    }
}
