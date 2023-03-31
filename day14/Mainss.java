public class Mainss {
    public static void main(String[] args) {
        String first = "Java";
        System.out.println("First String: " + first);

        String second = "Programming";
        System.out.println("Second String: " + second);

        String joinedString = first.concat(second);
        System.out.println("Joined String: " + joinedString);

        System.out.println(first.length());
        System.out.println(second.length());
        System.out.println(first.equals(second));
        System.out.println(first == second);
    }
}
