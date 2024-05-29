package pkg1;

public class Student {
    private int age;
    String name;
    protected double psp;
    public String universityName;

    public Student(int nAge, String nName, double nPsp, String nUniversityName) {
        age=nAge;
        name=nName;
        psp=nPsp;
        universityName=nUniversityName;
    }
    public Student(Student student){
        age=student.age;
        psp=student.psp;
        name=student.name;
        universityName=student.universityName;
    }
}
