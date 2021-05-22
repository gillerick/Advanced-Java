package com.company.threads_and_locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Chopstick {
    private final Lock lock;

    public Chopstick(){
        lock = new ReentrantLock();
    }

    public void pickUp(){
        lock.lock();
    }

    public void putDown(){
        lock.unlock();
    }

}

class Philosopher extends Thread{
    private int bites = 10;
    private Chopstick left, right;

    public Philosopher(Chopstick left, Chopstick right){
        this.left = left;
        this.right = right;
    }

    public void eat(){
        pickUp();
        chew();
        putDown();
    }

    private void chew() {
    }

    private void putDown() {
        right.putDown();
        left.putDown();
    }

    private void pickUp() {
        left.pickUp();
        right.pickUp();
    }

    public void run(){
        for(int i = 0; i < bites; i ++){
            eat();
        }
    }
}


