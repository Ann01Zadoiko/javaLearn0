package javaLearn._6;

import java.util.Random;

public interface ShareConstants {
    int NO = 0;
    int YES = 1;
    int MAYBE = 2;
    int LATER = 3;
    int SOON = 4;
    int NEVER =5;
}

class Question implements ShareConstants{
    Random random = new Random();
    int ask(){
        int prob = (int)(100*random.nextDouble());
        if (prob < 30) return NO;
        else if (prob <60) return YES;
        else if (prob < 75) return LATER;
        else if (prob <98) return SOON;
        else return NEVER;
    }
}

class AskMe implements ShareConstants{
    static void answer(int result){
        switch (result){
            case NO:
                System.out.println("no");
                break;
            case YES:
                System.out.println("yes");
                break;
            case MAYBE:
                System.out.println("maybe");
                break;
            case LATER:
                System.out.println("later");
                break;
            case SOON:
                System.out.println("soon");
                break;
            case NEVER:
                System.out.println("never");
                break;
        }
    }

    public static void main(String[] args) {
        Question question = new Question();

        answer(question.ask());
        answer(question.ask());
        answer(question.ask());
        answer(question.ask());
        answer(question.ask());
        answer(question.ask());
    }
}