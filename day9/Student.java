import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of student: ");
        int nStd = sc.nextInt();

        System.out.print("Enter the number of subjects: ");
        int nSub = sc.nextInt();

        int[][] marks = new int[nStd][nSub];

        for(int i=0; i<nStd; i++) {
            System.out.println("\nEnter marks of student " + (i+1));
            for(int j=0; j<nSub; j++) {
                System.out.print("Sub" + (j+1) + ": ");
                int num = sc.nextInt();
                marks[i][j] = num;
            }
        }

        for(int i=0; i<nStd; i++) {
            int per = 0;
            for(int j=0; j<nSub; j++) {
                per += marks[i][j];
            }

            per /= nSub ;
            System.out.println("Grade of Student" + (i+1) + ": " + grade(per));
        }
    }

    public static char grade(int per) {
        if (per >= 90) {
            return 'A';
        } else if (per >= 80) {
            return 'B';
        } else if (per >= 70) {
            return 'C';
        } else if (per >= 60) {
            return 'D';
        } else if (per >= 50) {
            return 'E';
        } else {
            return 'F';
        }
    }
}
