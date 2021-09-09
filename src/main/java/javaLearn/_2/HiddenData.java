package javaLearn._2;

public class HiddenData {
    public static void main(String[] args) {
        DayWeek dayWeek = new DayWeek();
        int day;
        String sDay;
        day = dayWeek.getValue();
        sDay = dayWeek.getName();

        System.out.println("Day = " + day);
        System.out.println("sDay = " + sDay);

        dayWeek.setValue(3);

        day = dayWeek.getValue();
        sDay = dayWeek.getName();

        System.out.println("Day = " + day);
        System.out.println("sDay = " + sDay);
    }
}
