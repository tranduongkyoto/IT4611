package com.example;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ThreadedWorkerWithoutSync extends Thread {

    private final ResourceExploiter rExp;
    
    @Override
    public void run() {
        for (int i = 0; i < 1000; ++i) {
            rExp.exploit();
        }
    }
}
