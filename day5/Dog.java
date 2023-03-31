class Animal1 {
    protected void display() {
        System.out.println("I am an animal");
    }
}

public class Dog extends Animal1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.display();
    }
}
