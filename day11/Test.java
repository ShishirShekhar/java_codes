import java.util.Scanner;

enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}

class Test {
    Day day;

    public Test(Day day) {
        this.day = day;
    }

    public void determineDay(int key) {
        switch (key) {
            case 1:
                day = Day.SUNDAY;
                System.out.println("The day is " + day);
                break;
            case 2:
                day = Day.MONDAY;
                System.out.println("The day is " + day);
                break;
            case 3:
                day = Day.TUESDAY;
                System.out.println("The day is " + day);
                break;
            case 4:
                day = Day.WEDNESDAY;
                System.out.println("The day is " + day);
                break;
            case 5:
                day = Day.THURSDAY;
                System.out.println("The day is " + day);
                break;
            case 6:
                day = Day.FRIDAY;
                System.out.println("The day is " + day);
                break;
            case 7:
                day = Day.SATURDAY;
                System.out.println("The day is " + day);
                break;
            default:
                System.out.println("Invalid input. Please enter a number between 1 and 7.");
                break;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number between 1 and 7: ");
        int key = input.nextInt();

        Test test = new Test(null);
        test.determineDay(key);
    }
}
