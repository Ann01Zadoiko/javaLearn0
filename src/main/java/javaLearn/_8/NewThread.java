package javaLearn._8;

public class NewThread implements Runnable{
    Thread thread;

    NewThread(){
        thread = new Thread(this,"Демостративный поток");
        System.out.println("Жочерний поток создан: " + thread);
        thread.start();
    }

    @Override
    public void run() {
        for (int i = 5; i > 0; i--) {
            System.out.println("Дочерний поток: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Дочерний поток прерван.");
            }
        }
        System.out.println("Дочерний поток завершен.");
    }
}

class ThreadDemo{
    public static void main(String[] args) {
        new NewThread();

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Главный поток: " + i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println("Главный поток прерван");
        }
        System.out.println("Главный поток завершен.");
    }
}
