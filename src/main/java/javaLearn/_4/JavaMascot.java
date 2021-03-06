package javaLearn._4;

public abstract class JavaMascot {
    public abstract void executeAction();
}
class Duke extends JavaMascot{

    @Override
    public void executeAction() {
        System.out.println("Punch!");
    }
}
class Juggy extends JavaMascot{

    @Override
    public void executeAction() {
        System.out.println("Fly!");
    }
}
class JavaMascotTest{
    public static void main(String[] args) {
        JavaMascot dukeMascot = new Duke();
        JavaMascot juggyMascot = new Juggy();
        dukeMascot.executeAction();
        juggyMascot.executeAction();
    }
}