public class Triangle {
    public static void main(String[] args) {
        int n = 5;

        for(int i=0; i<=n; i++) {
            for(int j=0; j<i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        for(int i=0; i<n; i++) {
            for (int j=0; j<=n-i; j++) {
                System.out.print(" ");
            }

            for(int j=0; j<i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        for(int i=0; i<=n; i++) {
            for (int j=0; j<n-i; j++) {
                System.out.print(" ");
            }

            for(int j=0; j<i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

        for(int i=0; i<n; i++) {
            for (int j=0; j<i; j++) {
                System.out.print(" ");
            }

            for(int j=n; j>i; j--) {
                System.out.print(" *");
            }
            System.out.println("");
        }

        int k=1;
        for(int i=0; i<n; i++) {
            for(int j=0; j<i; j++) {
                System.out.print(k++ + " ");
            }
            System.out.println("");
        }

        k=1;
        System.out.println("");

        for(int i=0; i<n; i++) {
            for(int j=n; j>i; j--) {
                System.out.print(k++ + "   ");
            }
            System.out.println("");
        }
    }
}
