import java.util.Scanner;

enum Student {
    Radha(90),
    Seetha(62),
    Ram(50);

    private final int marks;

    Student(int marks) {
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }
}

public class Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        Student student = Student.valueOf(name);
        System.out.println(student.getMarks());
    }
}
