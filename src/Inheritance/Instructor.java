package Inheritance;

public class Instructor extends Student {
    void takeClass(){
        System.out.println("Inside takeClass");
    }

    public static void main(String[] args) {
        Instructor i = new Instructor();
        i.login("Instructor");
        i.takeTest();
        i.takeClass();
    }
}
