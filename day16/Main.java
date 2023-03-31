class Student {
    private String name, email;
    private int id;

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getId() {
        return id;
    }
}

class Employee extends Student {
    private int salary;

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }
}

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee();

        emp.setName("Shishir");
        emp.setEmail("sspdav02@gmail.com");
        emp.setId(123123);
        emp.setSalary(10000);

        System.out.println(emp.getName());
        System.out.println(emp.getEmail());
        System.out.println(emp.getId());
        System.out.println(emp.getSalary());

    }
}
