package javaLearn._7;

public class ThrowsDemo {
    static void throwOne() throws IllegalAccessException {
        System.out.println("В теле метода throwOnr().");
        throw new IllegalAccessException("demonstration");
    }

    public static void main(String[] args) {
        try {
            throwOne();
        } catch (IllegalAccessException e) {
            System.out.println("Перехвачено исключение: " + e);
        }
    }
}
