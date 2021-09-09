package javaLearn._8;

public class NewThread4 implements Runnable{
    String name;
    Thread thread;

    NewThread4(String threadName){
        name = threadName;
        thread = new Thread(this, name);
        System.out.println("Новый поток: " + thread);
        thread.start();
    }

    @Override
    public void run() {
        try {
            for (int i=5; i>0;i--){
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println(name + " прерван.");
        }
        System.out.println(name + " завершен.");
    }
}
 class DemoJoin{
     public static void main(String[] args) {
         NewThread4 ob1 = new NewThread4("One");
         NewThread4 ob2 = new NewThread4("Two");
         NewThread4 ob3 = new NewThread4("Three");
         NewThread4 ob4 = new NewThread4("Four");

         System.out.println("Поток One запущен: " + ob1.thread.isAlive());
         System.out.println("Поток Two запущен: " + ob2.thread.isAlive());
         System.out.println("Поток Three запущен: " + ob3.thread.isAlive());
         System.out.println("Поток Four запущен: " + ob4.thread.isAlive());

         try {
             System.out.println("Ожидание завершение потоков.");
             ob1.thread.join();
             ob2.thread.join();
             ob3.thread.join();
             ob4.thread.join();
         }catch (InterruptedException e){
             System.out.println("Главный поток прерван");
         }
         System.out.println("Поток One запущен: " + ob1.thread.isAlive());
         System.out.println("Поток Two запущен: " + ob2.thread.isAlive());
         System.out.println("Поток Three запущен: " + ob3.thread.isAlive());
         System.out.println("Поток Four запущен: " + ob4.thread.isAlive());
         System.out.println("Главный поток завершен.");
     }
 }