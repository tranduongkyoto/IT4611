package com.example;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ThreadedWorkerWithLock extends Thread {
    
    private ResourceExploiterWithLock rExp;
    
    @Override
    public void run() {
        for (int i = 0; i < 1000; ++i) {
            rExp.exploit();
        }
    }
}
