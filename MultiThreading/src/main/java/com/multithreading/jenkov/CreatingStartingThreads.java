package com.multithreading.jenkov;

public class CreatingStartingThreads {

  private static class MyThread extends Thread {

    @Override
    public void run() {
      Thread.currentThread().setName("Thread1");
      System.out.println(Thread.currentThread().getName());
    }
  }

  private static class MyRunnable implements Runnable {

    @Override
    public void run() {
      Thread.currentThread().setName("Thread2");
      System.out.println(Thread.currentThread().getName());
    }
  }

  public static void main(String[] args) {
    // 1
    Thread thread1 = new MyThread();
    thread1.start();

    // 2
    Thread thread2 = new Thread(new MyRunnable());
    thread2.start();

    // 3
    new Thread(
            () -> {
              Thread.currentThread().setName("Thread3");
              System.out.println(Thread.currentThread().getName());
            })
        .start();

    System.out.println(Thread.currentThread().getName());
  }
}
