public class StringCompareEmp {
    public static void main(String[] args) {
        String str = "Hello World";
        String anotheString = "hello world";
        Object objStr = str;

        System.out.println(str.compareTo(anotheString));
        System.out.println(str.compareToIgnoreCase(anotheString));
        System.out.println(str.compareTo(objStr.toString()));
    }
}
