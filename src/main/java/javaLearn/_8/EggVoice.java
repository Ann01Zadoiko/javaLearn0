package javaLearn._8;

public class EggVoice extends Thread{

    @Override
    public void run(){
        for (int i = 0; i < 5; i++) {
            try {
                sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("Egg!");
        }
    }
}

class ChickenVoice {
    static EggVoice eggVoice;

    public static void main(String[] args) {
        eggVoice = new EggVoice();
        System.out.println("Спор начат");
        eggVoice.start();

        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("Chicken!");
        }

        if (eggVoice.isAlive()){
            try {
                eggVoice.join();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("Первым появилось яйцо!");
        } else {
            System.out.println("Первым появилась курица!");
        }
        System.out.println("Спор закончен!");
    }
}