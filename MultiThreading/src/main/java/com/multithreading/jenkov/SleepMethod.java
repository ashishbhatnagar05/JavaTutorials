package com.multithreading.jenkov;

public class SleepMethod {
  public static void main(String[] args) {
    System.out.println(Thread.currentThread().getName());
    for (int i = 0; i < 10; i++) {
      new Thread(Integer.toString(i)) {
        public void run() {
          System.out.println("Thread: " + getName() + " running");
          try {
            // once thread 1 starts running, it will go to sleep, relinquish cpu and come back to
            // runnable after given time. It doesnt releases the lock
            if (Thread.currentThread().getName().equals("1")) {
              System.out.println("Thread: " + getName() + " going to sleep");
              Thread.sleep(3000);
              System.out.println("Thread: " + getName() + " has awaken");
            }
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        }
      }.start();
    }
  }
}
