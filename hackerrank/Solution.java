import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine().substring(0, 3);
        String s2 = sc.nextLine();

        int n1 = s1.length();
        int n2 = s2.length();

        if (n1 < 3 || n2 < 3) {
            System.out.println("ERROR");
            sc.close();
            return;
        }

        StringBuilder re = new StringBuilder();
        for(int i=0; i<n1; i++) {
            re.append(s1.charAt(n1-1-i));
        }
        if (s2.contains(re.toString())) {
            System.out.println("GREAT");
        } else {
            System.out.println("TRY NEXT TIME");
        }

        sc.close();
    }
}

