public class Array3 {
    public static void main(String[] args) {
        int a[] = {1, 8, 3};
        int b[] = a.clone();

        b[0]++;

        System.out.println("Contents of a[]");
        for(int i=0; i<a.length; i++) {
            System.out.println(a[i] + "");
        }

        System.out.println("\nContents of b[]");
        for(int i=0; i<b.length; i++) {
            System.out.println(b[i] + "");
        }
    }
}
