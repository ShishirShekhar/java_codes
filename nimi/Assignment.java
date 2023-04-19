public class Assignment {

    // shared table to place the two things
    static String[] table = new String[2];

    // boolean flags to keep track of the availability of pen, paper, and question
    // paper
    static boolean hasPen = false;
    static boolean hasPaper = false;
    static boolean hasQuestionPaper = false;

    public static void main(String[] args) {

        // create the teacher thread and start it
        Thread teacher = new Thread(new Teacher());
        teacher.start();

        // create the three student threads and start them
        Thread student1 = new Thread(new Student("Pen"));
        student1.start();

        Thread student2 = new Thread(new Student("Paper"));
        student2.start();

        Thread student3 = new Thread(new Student("Question Paper"));
        student3.start();
    }
}

// teacher class
class Teacher implements Runnable {

    // possible combinations of two things that can be placed on the table
    static String[][] combinations = { { "Pen", "Paper" }, { "Pen", "Question Paper" }, { "Paper", "Question Paper" } };

    @Override
    public void run() {
        while (true) {
            synchronized (Assignment.table) {
                // pick a random combination of two things to place on the table
                int index = (int) (Math.random() * 3);
                Assignment.table[0] = Teacher.combinations[index][0];
                Assignment.table[1] = Teacher.combinations[index][1];
                System.out.println(
                        "Teacher placed " + Assignment.table[0] + " and " + Assignment.table[1] + " on the table");
                Assignment.table.notifyAll();
            }
            try {
                // wait for a student to complete the assignment
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// student class
class Student implements Runnable {

    String has;

    public Student(String has) {
        this.has = has;
        if (has.equals("Pen")) {
            Assignment.hasPen = true;
        } else if (has.equals("Paper")) {
            Assignment.hasPaper = true;
        } else if (has.equals("Question Paper")) {
            Assignment.hasQuestionPaper = true;
        }
    }

    @Override
    public void run() {
        while (true) {
            synchronized (Assignment.table) {
                try {
                    // wait until two things are placed on the table
                    while (Assignment.table[0] == null || Assignment.table[1] == null) {
                        Assignment.table.wait();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                // check if the student has the third complementary thing
                if (has.equals(Assignment.table[0])) {
                    System.out.println("Student with " + has + " completed the assignment");
                    Assignment.table[0] = null;
                } else if (has.equals(Assignment.table[1])) {
                    System.out.println("Student with " + has + " completed the assignment");
                    Assignment.table[1] = null;
                } else {
                    // if not, wait for the next round
                    try {
                        Assignment.table.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                Assignment.table.notifyAll();
            }
            try {
                // wait for the teacher to place two things on the table again
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
