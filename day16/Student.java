public class Student {
    private int roll;
    private int age;
    private String name;

    public Student(String name, int age, int roll) {
        this.roll = roll;
        this.name = name;
        this.age = age;
    }

    public Student(Student student) {
        this.roll = student.roll;
        this.name = student.name;
        this.age = student.age;
    }
}
