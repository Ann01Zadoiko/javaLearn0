package javaLearn._6;

public interface IntStack {
    void push(int item);
    int pop();
}

class FixedStack implements IntStack{
    private int [] stack;
    private int tos;

    FixedStack(int size){
        stack = new int[size];
        tos = -1;
    }

    @Override
    public void push(int item) {
        if (tos==stack.length-1)
            System.out.println("The stack is full");
        else
            stack[++tos] = item;
    }

    @Override
    public int pop() {
        if (tos < 0){
            System.out.println("The stack isn't load");
            return 0;
        }
        else return stack[tos--];
    }
}

class IFTest{
    public static void main(String[] args) {
        FixedStack fixedStack1 = new FixedStack(5);
        FixedStack fixedStack2 = new FixedStack(8);

        for (int i = 0; i < 5; i++) {
            fixedStack1.push(i);}
        for (int i = 0; i < 8; i++) {
            fixedStack2.push(i);
        }

        System.out.println("The stack in fixedStack1:");
        for (int i = 0; i < 5; i++) {
            System.out.println(fixedStack1.pop());
        }

        System.out.println("The stack in fixedStack2:");
        for (int i = 0; i < 8; i++) {
            System.out.println(fixedStack2.pop());
        }
    }
}

class DynStack implements IntStack{
    private int [] stack;
    private int tos;

    DynStack(int size){
        stack = new int [size];
        tos = -1;
    }

    @Override
    public void push(int item) {
        if (tos==stack.length-1){
            int temp[] = new int [stack.length*2];
            for (int i = 0; i < stack.length; i++) {
                temp[i] = stack[i];
                stack = temp;
                stack[++tos] = item;
            }
        }
        else stack[++tos] = item;
    }

    @Override
    public int pop() {
        if (tos <0) {
            System.out.println("The stacl isn't full");
            return 0;
        }
        else return stack[tos--];
    }
}

class IFTest2{
    public static void main(String[] args) {
        DynStack dynStack1 = new DynStack(5);
        DynStack dynStack2 = new DynStack(8);

        for (int i = 0; i < 5; i++) {
            dynStack1.push(i);
        }
        for (int i = 0; i < 8; i++) {
            dynStack2.push(i);
        }

        System.out.println("The stack in dynStack1:");
        for (int i = 0; i < 5; i++) {
            System.out.println(dynStack1.pop());
        }

        System.out.println("The stack in dynStack2:");
        for (int i = 0; i < 8; i++) {
            System.out.println(dynStack2.pop());
        }
    }
}