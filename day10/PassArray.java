import java.util.Scanner;

class Array {
    public void fillArray(int[] arr, int n) {
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public void printArray(int[] arr, int n) {
        for(int i=0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

public class PassArray {
    public static void main(String[] args) {
        int n = 4;
        int[] arr = new int[n];

        Array list = new Array();

        list.fillArray(arr, n);
        list.printArray(arr, n);
    }


}
