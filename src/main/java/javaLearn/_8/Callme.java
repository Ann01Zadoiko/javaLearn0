package javaLearn._8;

public class Callme {
    synchronized void call(String msg){
        System.out.println("[" + msg);
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            System.out.println("Прервано");
        }
        System.out.println("]");
    }
}

class Caller implements Runnable{
    String msg;
    Callme target;
    Thread thread;

    public Caller(Callme target, String msg){
        this.target = target;
        this.msg = msg;
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        synchronized(target){
            target.call(msg);
        }
    }
}

class Synch {
    public static void main(String[] args) {
        Callme target = new Callme();
        Caller ob1 = new Caller(target,"Welcome");
        Caller ob2 = new Caller(target,"in synchronized");
        Caller ob3 = new Caller(target,"world!");

        try {
            ob1.thread.join();
            ob2.thread.join();
            ob3.thread.join();
        }catch (InterruptedException e){
            System.out.println("Прервано");
        }
    }
}
