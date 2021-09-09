package javaLearn._6;

public interface Callback {
    void callback(int param);
}

class Client implements Callback{

    @Override
    public void callback(int param) {
        System.out.println("The method callback(), " + "calling with value " + param);
    }

    void nonIfaceMeth(){
        System.out.println("In classes, implementing interfaces," + " can define other members.");
    }
}

class AnotherClient implements Callback{

    @Override
    public void callback(int param) {
        System.out.println("Another option for the method callback()");
        System.out.println("param in square equal " + (param*param));
    }
}

class TestInface{
    public static void main(String[] args) {
        Callback callback = new Client();
        callback.callback(42);
        AnotherClient anotherClient = new AnotherClient();
        callback = anotherClient;
        callback.callback(42);
    }
}