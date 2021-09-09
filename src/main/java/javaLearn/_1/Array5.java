package javaLearn._1;

public class Array5 {
    public static void main(String[] args) {
        int a[] = {2,4,6};
        for (int i =0; i<a.length; i++){
           String str = "a[" + i + "] = " + a[i];
            System.out.println(str);
        }
        for (int n: a){
            System.out.println(n);
        }
    }
}
