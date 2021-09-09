package javaLearn._2;

public class Ex_01 {
    private String name;
    private String idNum;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdNum(){
        return idNum;
    }
    public void setIdNum(String idNum){
        this.idNum = idNum;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

    class Run{
        public static void main(String[] args) {
            Ex_01 ex_01 = new Ex_01();
            ex_01.setAge(56);
            ex_01.setIdNum("1234V");
            ex_01.setName("Vovchick");

            System.out.println("Name: " + ex_01.getName() + ", age: " + ex_01.getAge() + ", idNum: " + ex_01.getIdNum());
        }
    }