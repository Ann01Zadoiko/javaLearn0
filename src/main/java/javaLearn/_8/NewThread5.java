package javaLearn._8;

public class NewThread5 implements Runnable{
    String name;
    Thread thread;
    boolean suspendFlag;

    public NewThread5(String name) {
        this.name = name;
        thread = new Thread(this, name);
        System.out.println("Новый поток: " + thread);
        suspendFlag = false;
        thread.start();
    }


    @Override
    public void run() {
        try {
            for (int i = 15; i>0;i--){
                System.out.println(name + ": " + i);
                Thread.sleep(200);
                synchronized (this){
                    while (suspendFlag){
                        wait();
                    }
                }
            }
        }catch (InterruptedException e){
            System.out.println(name + " прерван.");
        }
        System.out.println(name + " завершен.");
    }

    synchronized void mySuspend(){
        suspendFlag = true;
    }

    synchronized void meResume(){
        suspendFlag = false;
        notify();
    }
}

class SuspendResume{
    public static void main(String[] args) {
        NewThread5 ob1 = new NewThread5("One");
        NewThread5 ob2 = new NewThread5("Two");

        try {
            Thread.sleep(1000);
            ob1.mySuspend();
            System.out.println("Приостановка потока One");
            Thread.sleep(1000);
            ob1.meResume();
            System.out.println("Возобновление потока One");
            ob2.mySuspend();
            System.out.println("Приостановка потока Two");
            Thread.sleep(1000);
            ob2.meResume();
            System.out.println("Возобновление потока Two");
        }catch (InterruptedException e){
            System.out.println("Главный поток прерван");
        }

        try {
            System.out.println("Ожидание завершение потоков.");
            ob1.thread.join();
            ob2.thread.join();
        }catch (InterruptedException e){
            System.out.println("Главный поток прерван");
        }
        System.out.println("Главный поток завершен");
    }
}