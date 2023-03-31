interface Greeting {
    String getGreetings(String name);
}

class A implements Greeting {
    public String getGreetings(String name) {
        return "Hi " + name;
    }
}

class B implements Greeting {
    public String getGreetings(String name) {
        return "Hola " + name;
    }

    public static String me() {
        return "shishir";
    }
}

class C implements Greeting {
    public String getGreetings(String name) {
        return "おはyいよ" + name;
    }
}

public class Main {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();
        C obj3 = new C();

        System.out.println(obj1.getGreetings("shishir"));
        System.out.println(obj2.getGreetings("shishir"));
        System.out.println(obj3.getGreetings("shishir"));
        System.out.println(obj2.me());
    }
}
