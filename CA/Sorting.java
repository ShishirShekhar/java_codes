import java.util.Scanner;

public class Sorting {
    public static void Sort(int[] arr, int n) {
        for(int i=0; i<n; i++) {
            for(int j=0; j<n-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[4][5];

        for(int i=0; i<4; i++) {
            for(int j=0; j<5; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("");
        for(int i=0; i<4; i++) {
            for(int j=0; j<5; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }

        for(int i=0; i<4; i++) {
            Sort(arr[i], 5);
        }


        System.out.println("");
        for(int i=0; i<4; i++) {
            for(int j=0; j<5; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
