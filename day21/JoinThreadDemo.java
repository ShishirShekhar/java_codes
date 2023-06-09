class Counter implements Runnable {
    private String name;

    public Counter(String name) {
        this.name = name;
    }

    public void run() {
        for(int i=1; i<=5; i++) {
            System.out.println(name + " count: " + i);
        }
    }
}


public class JoinThreadDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Counter("Spain"));
        Thread t2 = new Thread(new Counter("UAE"));

        System.out.println("t1 before start t1.isAlive(): " + t1.isAlive());
        System.out.println("t2 before start t2.isAlive(): " + t2.isAlive());

        t1.start();
        t2.start();

        System.out.println("Started t1 and t2 thread");
        System.out.println("t1 after start t1.isAlive(): " + t1.isAlive());

        // t2.join();
        System.out.println("t2 after start t2.isAlive(): " + t2.isAlive());
    }
}
