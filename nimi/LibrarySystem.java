import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Library {
    private Queue<String> studentQueue;
    private Queue<String> teacherQueue;
    private Lock lock;
    private Condition studentCondition;
    private Condition teacherCondition;

    public Library() {
        studentQueue = new LinkedList<>();
        teacherQueue = new LinkedList<>();
        lock = new ReentrantLock();
        studentCondition = lock.newCondition();
        teacherCondition = lock.newCondition();
    }

    public void enter(String personType, String personName) {
        lock.lock();
        try {
            if (personType.equals("student")) {
                studentQueue.add(personName);
                System.out.println(personName + " (student) entered the library and joined the student queue.");
            } else if (personType.equals("teacher")) {
                teacherQueue.add(personName);
                System.out.println(personName + " (teacher) entered the library and joined the teacher queue.");
            }
            processQueue();
        } finally {
            lock.unlock();
        }
    }

    private void processQueue() {
        while (!studentQueue.isEmpty() || !teacherQueue.isEmpty()) {
            if (!teacherQueue.isEmpty()) {
                System.out.println(teacherQueue.peek() + " (teacher) is being served.");
                teacherQueue.poll();
            } else if (!studentQueue.isEmpty()) {
                System.out.println(studentQueue.peek() + " (student) is being served.");
                studentQueue.poll();
            }
            // Wait for 1 second to simulate processing time
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Person extends Thread {
    private String name;
    private String type;
    private Library library;

    public Person(String name, String type, Library library) {
        this.name = name;
        this.type = type;
        this.library = library;
    }

    @Override
    public void run() {
        library.enter(type, name);
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Library library = new Library();

        Person student1 = new Person("Alice", "student", library);
        Person teacher1 = new Person("Bob", "teacher", library);
        Person teacher2 = new Person("Charlie", "teacher", library);
        Person student2 = new Person("David", "student", library);

        student1.start();
        teacher1.start();
        teacher2.start();
        student2.start();
    }
}
