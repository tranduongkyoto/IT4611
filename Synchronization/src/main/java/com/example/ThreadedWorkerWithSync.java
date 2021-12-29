package com.example;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ThreadedWorkerWithSync extends Thread {
    
    private final ResourceExploiter rExp;
    
    @Override
    public void run() {
        synchronized (rExp) {
            for (int i = 0; i < 1000; ++i) {
                rExp.exploit();
            }
        }
    }
}
