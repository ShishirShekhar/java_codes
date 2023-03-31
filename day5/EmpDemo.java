class Emp {
    public static double salary;
    public static String name = "Shishir";
}

public class EmpDemo {
    public static void main(String[] args) {
        Emp.salary = 100000;
        System.out.println(Emp.name + "'s average salary: " + Emp.salary);
    }
}
