package javaLearn._2;

public class DayWeek {
    private int value;
    DayWeek(){
        value = 1;
    }
    public int getValue(){
        return value;
    }
    public void setValue(int value){
        if ((value>=1)&&(value<=7))
            this.value = value;
    }
    public String getName(){
        String day = "Monday";
        switch (value){
            case 2: day = "Tuesday"; break;
            case 3: day = "Wensday"; break;
            case 4: day = "Thursday"; break;
            case 5: day = "Friday"; break;
            case 6: day = "Suturday"; break;
            case 7: day = "Sunday"; break;
        }
        return day;
    }
}
