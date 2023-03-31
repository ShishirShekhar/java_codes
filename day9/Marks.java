import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int n = sc.nextInt();

        double[] arr = new double[n];
        double sum = 0, per = 0;

        System.out.println("Enter the marks of subjects:");
        for(int i=0; i<n; i++) {
            double num = sc.nextDouble();
            arr[i] = num;
        }

        for(int i=0; i<n; i++) {
            sum += arr[i];
        }
        per = sum / n;

        System.out.println("Total sum: " + sum);
        System.out.println("Total percentage: " + per);
    }
}
