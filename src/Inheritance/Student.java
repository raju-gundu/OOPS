package Inheritance;

public class Student extends User {
    String batchName;
    void takeTest(){
        System.out.println("Take Test");
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.userName="Raju";
        s.login("student");
        s.takeTest();
        System.out.println(8%4);
    }
}
