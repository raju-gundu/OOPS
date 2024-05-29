package pkg1;

public class Client {

    public static void main(String[] args) {
        Student student = new Student(24,"Raju",90.0,"SCET");
        System.out.println(student.psp+" "+student.name+" "+student.universityName);
        Student student1 = new Student(student);
        System.out.println(student1.psp+" "+student1.name+" "+student1.universityName);
        Student student2 = student;
        System.out.println(student2.psp+" "+student2.name+" "+student2.universityName);
        student.psp=20.0;
        System.out.println(student.psp+" "+student1.psp+" "+student2.psp);


    }
}
