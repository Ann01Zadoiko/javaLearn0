package javaLearn._7;

public class ThrowDemo {
    static void demoproc(){
        try {
            throw new NullPointerException("demonstration");
        }catch (NullPointerException e){
            System.out.println("Исключение перехвачено в теле " + "метода demoproc().");
            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            demoproc();
        }catch (NullPointerException e){
            System.out.println("Повторный перехват: " + e);
        }
    }
}
