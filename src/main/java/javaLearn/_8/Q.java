package javaLearn._8;

public class Q {
    int n;
    boolean valueSet = false;

    synchronized int get(){
        while(!valueSet)
            try {
                wait();
            }catch (InterruptedException e){
                System.out.println("Исключение типа " + "InterruptedException перехвачено");
            }
        System.out.println("Получено: "  + n);
            notify();
        return n;
    }

    synchronized void put(int n){
        while (valueSet)
            try {
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            this.n = n;
            valueSet = true;
        System.out.println("Отправлено: " + n);
        notify();
    }
}

class Producer implements Runnable{
    Q q;

    Producer(Q q){
        this.q = q;
        new Thread(this,"Поставщик").start();
    }

    @Override
    public void run() {
        int i=0;
        while(true){
            q.put(i++);
        }
    }
}

class Consumer implements Runnable{
    Q q;

    Consumer(Q q){
        this.q = q;
        new Thread(this,"Потребитель").start();
    }

    @Override
    public void run() {
        while (true){
            q.get();
        }
    }
}

class PC {
    public static void main(String[] args) {
        Q q = new Q();
        new Producer(q);
        new Consumer(q);

        System.out.println("Для остановки нажмите Ctrl + F2.");
    }
}